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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.click(findTestObject('Header/a_Register'))

WebUI.setText(findTestObject('Membership Registration/input_Nama Lengkap_full-name-form'), 'zizah')

WebUI.setText(findTestObject('Membership Registration/input__number-form'), '085784018007')

WebUI.setEncryptedText(findTestObject('Membership Registration/input_Password_pass-form'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.selectOptionByLabel(findTestObject('Membership Registration/select_Pilih Kondisi Ibu Saat Ini'), 'Sedang Hamil', false)

WebUI.selectOptionByLabel(findTestObject('Membership Registration/SelectUsiaKehamilan'), '12 Minggu', false)

