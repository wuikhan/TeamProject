$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Salesforce login functionality",
  "description": "I want to use this feature file to test the login functionaility of our salesforce application.",
  "id": "test-salesforce-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 218524,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "login using valid credentials",
  "description": "",
  "id": "test-salesforce-login-functionality;login-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I go to salesforce home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter username as \"test.user@gmail.com.test\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password as \"Welcome\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I see the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_open_chrome_browser()"
});
formatter.result({
  "duration": 1849011681,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_go_to_salesforce_home_page()"
});
formatter.result({
  "duration": 607040599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test.user@gmail.com.test",
      "offset": 21
    }
  ],
  "location": "LoginTest.i_enter_username_as(String)"
});
formatter.result({
  "duration": 574100848,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 21
    }
  ],
  "location": "LoginTest.i_enter_password_as(String)"
});
formatter.result({
  "duration": 585226141,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_the_login_button()"
});
formatter.result({
  "duration": 311902792,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_see_the_dashboard()"
});
formatter.result({
  "duration": 60679864316,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#phHeaderLogoImage\"}\n  (Session info: chrome\u003d78.0.3904.108)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027waqass-mbp.lan\u0027, ip: \u0027fe80:0:0:0:14d3:424e:1425:e518%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.2\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: /var/folders/db/szdzfk_j3wn...}, goog:chromeOptions: {debuggerAddress: localhost:65459}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: fbfd2b30214dddb6b119b0157c01be16\n*** Element info: {Using\u003did, value\u003dphHeaderLogoImage}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefinition.LoginTest.i_see_the_dashboard(LoginTest.java:42)\n\tat ✽.Then I see the dashboard(feature/Login.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 957303346,
  "status": "passed"
});
});