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

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles_Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'))

WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value1, 
    0)

WebUI.click(findTestObject('ROLES/Roles_page/Pagination/Back_navigation'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value2, 
    0)

not_run: WebUI.verifyElementNotClickable(findTestObject('ROLES/Roles_page/Pagination/Back_navigation'))

String no_page = WebUI.getText(findTestObject('ROLES/Roles_page/Pagination/label_of 10'))

int pages = no_page.substring(3)

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'pages')

not_run: WebUI.verifyElementNotClickable(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))

not_run: WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))

not_run: WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), '')

not_run: WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), '')

not_run: WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), '')

