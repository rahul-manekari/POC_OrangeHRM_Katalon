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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OrangeHRM_Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Delete/button_Admin_Minimize_Menu'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_name_search'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_name_search'), 'Abdul')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_First_option_select'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Search_employee'))

WebUI.scrollToPosition(100, 200)

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Delete/Select_First_record'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Delete/button_Delete Selected record'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Delete/button_Yes, Delete'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Employee_dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/a_Logout'))

WebUI.waitForAlert(2)

WebUI.closeBrowser()





















