import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/')

<<<<<<< HEAD:Scripts/Atlas Platform/OnBoard/Login/LoginWithRootAdmin/Script1577773673898.groovy
WebUI.setText(findTestObject('Object Repository/LoginPage/loginpageemailtxtbox'), 'jayakumar@totient.co.in')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/loginpaepasswordtxtbox'), 'dY75oODjl60xa8W7XdEt7g==')

WebUI.click(findTestObject('LoginPage/loginpageloginbtn'))
=======
WebUI.setText(findTestObject('Login_Page/Page_/input_Email Address_form-control'), Email)

WebUI.setText(findTestObject('Login_Page/Page_/input_Password_form-control'), Password)

WebUI.click(findTestObject('Login_Page/Page_/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/div_Enter Password'), 30)
>>>>>>> f52e67f5aa6e1df5d871f8eba4e074a3f9b3468a:Scripts/Atlas Platform/Platform Navigation/Login/InValid Pasword_Login/Script1577773922189.groovy

