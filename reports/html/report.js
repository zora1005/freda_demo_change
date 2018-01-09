$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GlipEmailSignin.feature");
formatter.feature({
  "line": 1,
  "name": "glipemailsignin",
  "description": "",
  "id": "glipemailsignin",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sign In with email Account",
  "description": "\n/*Given User switch to correctly Env \"Glip\"*/",
  "id": "glipemailsignin;sign-in-with-email-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@p0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User has valid email and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User inputs email \"8882420001\" and Password \"Test!123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User can sign in app",
  "keyword": "Then "
});
formatter.match({
  "location": "GlipEmailSignin.userHasValidEmailAndPassword()"
});
formatter.result({
  "duration": 1763954873,
  "error_message": "cucumber.runtime.CucumberException: Error creating bean with name \u0027steps.GlipEmailSignin\u0027: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [steps.GlipEmailSignin]: Constructor threw exception; nested exception is java.lang.ExceptionInInitializerError\n\tat cucumber.runtime.java.spring.SpringFactory.getInstance(SpringFactory.java:182)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\nCaused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name \u0027steps.GlipEmailSignin\u0027: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [steps.GlipEmailSignin]: Constructor threw exception; nested exception is java.lang.ExceptionInInitializerError\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1105)\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1050)\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:510)\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482)\n\tat org.springframework.beans.factory.support.AbstractBeanFactory$2.getObject(AbstractBeanFactory.java:345)\n\tat cucumber.runtime.java.spring.GlueCodeScope.get(GlueCodeScope.java:15)\n\tat org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:340)\n\tat org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:220)\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:332)\n\tat cucumber.runtime.java.spring.SpringFactory.getInstance(SpringFactory.java:180)\n\t... 30 more\nCaused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [steps.GlipEmailSignin]: Constructor threw exception; nested exception is java.lang.ExceptionInInitializerError\n\tat org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:163)\n\tat org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:89)\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1098)\n\t... 40 more\nCaused by: java.lang.ExceptionInInitializerError\n\tat steps.GlipEmailSignin.\u003cinit\u003e(GlipEmailSignin.java:23)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\n\tat org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:147)\n\t... 42 more\nCaused by: org.openqa.selenium.SessionNotCreatedException: Unable to create new remote session. desired capabilities \u003d Capabilities [{app\u003d/Users/songjiali/Documents/intelliJ project/freda_demo_change/new Glip.app, newCommandTimeout\u003d30000, platformVersion\u003d10.2.1, platformName\u003diOS, udid\u003d46785E7F-F7AE-4E79-8719-2E12CAE127CA, deviceName\u003diPhone 6, autoAcceptAlerts\u003dTrue}], required capabilities \u003d Capabilities [{}]\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027xmna013.rcoffice.ringcentral.com\u0027, ip: \u002710.32.58.88\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00279.0.1\u0027\nDriver info: driver.version: IOSDriver\n\tat io.appium.java_client.remote.AppiumProtocolHandShake.lambda$1(AppiumProtocolHandShake.java:96)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:385)\n\tat io.appium.java_client.remote.AppiumProtocolHandShake.createSession(AppiumProtocolHandShake.java:96)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.doExecute(AppiumCommandExecutor.java:111)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:162)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:236)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:137)\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:38)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:88)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:112)\n\tat io.appium.java_client.ios.IOSDriver.\u003cinit\u003e(IOSDriver.java:78)\n\tat GlipiOS.drivers.iOSAppiumDriverManagement.\u003cinit\u003e(iOSAppiumDriverManagement.java:38)\n\tat GlipiOS.drivers.iOSAppiumDriverManagement.\u003cclinit\u003e(iOSAppiumDriverManagement.java:19)\n\t... 48 more\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "8882420001",
      "offset": 19
    },
    {
      "val": "Test!123",
      "offset": 45
    }
  ],
  "location": "GlipEmailSignin.userInputsEmailAndPassword(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GlipEmailSignin.userCanSignInApp()"
});
formatter.result({
  "status": "skipped"
});
});