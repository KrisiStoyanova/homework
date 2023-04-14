$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BackButton.feature");
formatter.feature({
  "name": "Back button on product detailed page.",
  "description": "  User should be navigated to store page when click the back button on any product detailed page.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Back button Functionality on product detailed page.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@viewport"
    }
  ]
});
formatter.step({
  "name": "user navigates to store page on \u003cwidth\u003e x \u003cheight\u003e viewport.",
  "keyword": "Given "
});
formatter.step({
  "name": "user click on first product link.",
  "keyword": "When "
});
formatter.step({
  "name": "user should be navigated to product detailed page.",
  "keyword": "Then "
});
formatter.step({
  "name": "back button is displayed.",
  "keyword": "And "
});
formatter.step({
  "name": "user click the back button.",
  "keyword": "When "
});
formatter.step({
  "name": "user should be navigated back to store page.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "width",
        "height"
      ]
    },
    {
      "cells": [
        "1366",
        "768"
      ]
    },
    {
      "cells": [
        "360",
        "640"
      ]
    },
    {
      "cells": [
        "768",
        "1024"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Back button Functionality on product detailed page.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@viewport"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to store page on 1366 x 768 viewport.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userNavigatesToStorePageOnWidthAndHeightViewport(java.lang.Integer,java.lang.Integer)"
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
formatter.scenario({
  "name": "Verify Back button Functionality on product detailed page.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@viewport"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to store page on 360 x 640 viewport.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userNavigatesToStorePageOnWidthAndHeightViewport(java.lang.Integer,java.lang.Integer)"
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
formatter.scenario({
  "name": "Verify Back button Functionality on product detailed page.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@viewport"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to store page on 768 x 1024 viewport.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BackButtonSteps.userNavigatesToStorePageOnWidthAndHeightViewport(java.lang.Integer,java.lang.Integer)"
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