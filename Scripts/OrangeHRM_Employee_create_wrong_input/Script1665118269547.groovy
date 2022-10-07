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

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Add_Employee'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_firstName'), 'Rajan')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_middleName'), 'Sham')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_lastName'), 'Shankar')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_Employee Id'), '002')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Employee_Save'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_Employee_Other Id'), 'RSS202206')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_driver_license_number'), 'MH1420130221')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_License Expiry Date'), '3000-05-40')

WebUI.verifyElementNotVisible(findTestObject('Object Repository/OrangeHRM_Employee_Create/span_Should be a valid date in yyyy-mm-dd format'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_SSN Number'), 'MH2020202080')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_SIN Number'), 'MH8080808020')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Marital_status_Dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_Married'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Nationality_dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_Indian'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_Date of Birth'), '1996-10-11')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/label_Male_radiobutton'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/label_Female_radiobutton'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/label_Male_radiobutton'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Enter_Military Service'), '2015-2018')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/label_Smoker_checkbox_Yes'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Save_personal_details'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/a_Job'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Job_title_dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_QA Engineer'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Employee_status_dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_Full-Time Permanent'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Save_job_details'))

WebUI.waitForAlert(2)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Blood_type_dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_A'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Save_Custom_details'))

WebUI.waitForAlert(2)

WebUI.back()

WebUI.back()

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_name_search'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Employee_Create/input_Employee_name_search'), 'Abdul')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/div_First_option_select'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/button_Search_employee'))

WebUI.scrollToPosition(100, 200)

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/i_Employee_dropdown'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Employee_Create/a_Logout'))

WebUI.waitForAlert(2)

WebUI.closeBrowser()

