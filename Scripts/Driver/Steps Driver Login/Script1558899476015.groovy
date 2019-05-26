import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Adding the Global Effect on the Apk location. So that it can pick the Location of your machine.
location = System.getenv('USERPROFILE')

String filePathDriverApp = location + '/git/SafeBoda-Automation-Framework/Apks/app-driver.apk'

Mobile.startApplication(filePathDriverApp, false)

Mobile.verifyElementVisible(findTestObject('Driver/Welcome Screen/Label_SafeBoda Driver'), 2)

Mobile.tap(findTestObject('Driver/Welcome Screen/Btn_Continue with Google'), 0)

Mobile.tap(findTestObject('Driver/Choose an Account Screen/Label_Email Account'), 2)

