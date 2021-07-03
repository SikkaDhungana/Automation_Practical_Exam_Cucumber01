$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ToDoList_toBlue.feature");
formatter.feature({
  "line": 2,
  "name": "Background color change to sky blue Functionality",
  "description": "",
  "id": "background-color-change-to-sky-blue-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.before({
  "duration": 8338491300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 1379881700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "1 User should be able to click on Set SkyBlue Background button and the background color should change to sky blue",
  "description": "",
  "id": "background-color-change-to-sky-blue-functionality;1-user-should-be-able-to-click-on-set-skyblue-background-button-and-the-background-color-should-change-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on the SkyBlue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_click_on_the_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 108359500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 803326400,
  "status": "passed"
});
formatter.before({
  "duration": 5535051000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 581720400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "2 White Background Change",
  "description": "",
  "id": "background-color-change-to-sky-blue-functionality;2-white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on the set White Background button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 62465300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_the_set_White_Background_button()"
});
formatter.result({
  "duration": 83729100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 310219500,
  "status": "passed"
});
});