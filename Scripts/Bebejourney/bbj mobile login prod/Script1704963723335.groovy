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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bebeclub.co.id/')

WebUI.click(findTestObject('Object Repository/bebe mobile/div_Register_icon-menu-mobile'))

WebUI.click(findTestObject('Object Repository/bebe mobile/iframe_Tim Ahli___st_preview_frame_bpn'))

WebUI.click(findTestObject('Object Repository/bebe mobile/span_Tools_down'))

WebUI.click(findTestObject('Object Repository/bebe mobile/a_Bebejourney'))

WebUI.click(findTestObject('Bebe Journey page/Banner click - Yuk, Cek di sini'))

WebUI.setText(findTestObject('Object Repository/bebe mobile/input_Nomor Handphone_username'), '085719131755')

WebUI.setEncryptedText(findTestObject('Object Repository/bebe mobile/input_Kata Sandi_password'), '8SQVv/p9jVRYfSV/eMGvjg==')