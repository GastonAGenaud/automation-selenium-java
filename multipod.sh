SCOPE=$3
OLDIFS=$IFS
IFS=' '
counter=1
PODNAME=$4
echo Environment:$1
echo Suite:$2
echo Scope:$SCOPE
echo Pod:$PODNAME
for pod in $SCOPE; do
  IFS=','
  PODSCOPE=''
  for module in $pod; do
    lit=" or "
    PODSCOPE=$([ -z "$PODSCOPE" ] && echo "$module" || echo "$PODSCOPE$lit$module")
  done
  PODNAME=$(echo $PODNAME | tr "[:upper:]" "[:lower:]")
  PODSCOPE=$(echo "'$PODSCOPE'" | sed 's/@@/@/g')
  PODSCOPE=$(echo "$PODSCOPE" | sed 's/\"//g')
  echo "podname:$PODNAME-$counter:$PODSCOPE"
  kubectl apply -f - <<EOF
    apiVersion: v1
    kind: Pod
    metadata:
      name: "$PODNAME-$counter"
    spec:
      restartPolicy: Never
      containers:
      - name: testing-container
        image: mmreborn.azurecr.io/automatedtest:latest
        command: ['bash', '-c', "mvn -e -ntp -f /test-automation/pom.xml clean test -Dcucumber.filter.tags=$PODSCOPE -Denv=$1 -Dsuite=$2; ./upload_report.sh $1 $2 \"$PODSCOPE\""]
        ports:
        - containerPort: 80
EOF
  counter=$((counter+1))
done
IFS=$OLDIFS
exit 0
