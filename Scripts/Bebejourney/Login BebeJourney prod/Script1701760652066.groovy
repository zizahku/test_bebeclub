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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Inspirasi Nutrisi Dan Stimulasi Anak T_ad3787/img_Beragam Fitur dari Expert_logo-tools ls_ab4f93'))

WebUI.click(findTestObject('Object Repository/Page_Bebe Journey - Tools Dukung Si Kecil T_272c89/a_Yuk, cek di sini'))

WebUI.setText(findTestObject('Object Repository/Page_Bebe Journey - Tools Dukung Si Kecil T_272c89/input_Nomor Handphone_username'), 
    '085719131755')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bebe Journey - Tools Dukung Si Kecil T_272c89/input_Kata Sandi_password'), 
    'p4y+y39Ir5Oy1MY8jPt0uQ==')   