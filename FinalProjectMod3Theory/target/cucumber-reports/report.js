$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BackButton.feature");
formatter.feature({
  "name": "Back button on product detailed page.",
  "description": "  User should be navigated to store page when click the back button on any product detailed page.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Back button Functionality on product detailed page.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@desktop"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to store page.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userNavigatesToStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on first product link.",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userClickOnFirstProductLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to product detailed page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userShouldBeNavigatedToProductDetailedPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "back button is displayed.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.backButtonIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the back button.",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userClickTheBackButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated back to store page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userShouldBeNavigatedBackToStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});