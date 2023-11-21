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

WebUI.mouseOver(findTestObject('Header/a_Tools'))

WebUI.click(findTestObject('Header/Dropdown Tools - Bebejourney'))

WebUI.click(findTestObject('Bebe Journey page/Banner click - Yuk, Cek di sini'))

WebUI.setText(findTestObject('Bebe Journey page/Form Nomor Handphone'), '085784018007')

WebUI.setEncryptedText(findTestObject('Bebe Journey page/Form Kata Sandi_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Bebe Journey page/Button Login'))

WebUI.verifyTextPresent('Selamat Datang', false)

WebUI.click(findTestObject('Bebe Journey page/close greeting popup'))

