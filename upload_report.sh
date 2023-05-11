#args 1: Environment, 2: Suite, 3: Scope
if [ -d "./Reports" ]; then
    cd Reports
    find . -name '* *' -execdir bash -c 'mv -- "$1" "${1// /_}"' bash {} \;
    export REPORT=$(ls ../Report*)
    export RND=$((RANDOM % 1000))
    export REPORT=$REPORT$RND
    echo Report:$REPORT
    export FECHA=$(echo $REPORT | sed 's/Report_//g')
    echo Fecha:$FECHA
    year=${FECHA:0:4}
    month=${FECHA:4:2}
    day=${FECHA:6:2}
    hour=${FECHA:9:2}
    minute=${FECHA:11:2}
    second=${FECHA:13:2}
    millis=${FECHA:15:3}
    fecha_formateada="$day/$month/$year $hour:$minute:$second.$millis"
    cp -R ../target/cucumber-html-reports/ ./$REPORT
    az login --service-principal --username 2bb51008-b63b-4d0f-9013-90b0a8b5284d --password w1h8Q~QW92pAVe3WOg7_-d24ELNefiMn5~IMYbkS --tenant 7c500d2f-8be9-45dc-9517-f2ca6618b4ce
    az storage blob download --no-progress --account-name rebornstorage --account-key NjEoYhHjoQD4MPclYrA/rhLJnyycVnfvbdP4V0EzJAbVdtV4O6Ez4fgZqI98Re9wMNF/Xa6BuNWF+AStpMPceg== --container-name '$web' --name index.html --file index.html
    export RESULT=$(cat ./$REPORT/overview-features.html | grep -A 20 "<tfoot" | grep -m 2 -A 2 "<tr>" | tail -1 | sed 's/<[^>]*>//g' | awk '{printf "%.2f\n", $1}')
    sed -i'' -e'' "s#</tbody>#\r\n\t\t\t\t<tr><td>${fecha_formateada}</td><td>$1</td><td>$2</td><td>$3</td><td class="color-scale"><a href="/${REPORT}/overview-features.html">$RESULT%</a></td></tr></tbody>#g" index.html
    cat index.html
    az storage blob upload-batch --no-progress --overwrite --account-name rebornstorage -s ./ -d '$web'
    curl --location 'https://hooks.slack.com/services/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' --header 'Content-type: application/json' --data '{"text":"@here The automated test on '"$1"' was triggered. Pls check its result on following link https://rebornstorage.z13.web.core.windows.net/'"$REPORT"'/cucumber-html-reports/overview-features.html "}'
fi
exit 0
