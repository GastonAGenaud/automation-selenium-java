Feature: Production Browse Wants (Requests)

  @browseWants
Scenario: Browse by Seller, Category
Given I login with Gaston User in production products using cookies
And go to Browse Request
When select Accessories BBS
And select Body Jewelry & Stuff BBS
And select Bracelets & Stuff BBS
And select Earrings BBS
And select happy BBS
And select Rings BBS
And select Shoes BBS
Then I validate Filters BBS