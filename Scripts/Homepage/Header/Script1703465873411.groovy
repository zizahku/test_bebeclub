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

WebUI.click(findTestObject('Header/Bebeclub logo'))

WebUI.click(findTestObject('Header/a_Tools'))

WebUI.verifyTextPresent('Tools', false)

WebUI.mouseOver(findTestObject('Header/a_Tools'))

WebUI.click(findTestObject('Header/Dropdwon Tummypedia'))

WebUI.verifyTextPresent('Tummypedia', false)

WebUI.mouseOver(findTestObject('Header/a_Tools'))

WebUI.click(findTestObject('Header/Dropdwon BebeStory'))

WebUI.verifyTextPresent('Bebestory', false)

WebUI.mouseOver(findTestObject('Header/a_Tools'))

WebUI.click(findTestObject('Header/Dropdown Tools - Bebejourney'))

WebUI.verifyTextPresent('Bebe Journey', false)

WebUI.mouseOver(findTestObject('Header/a_Tools'))

WebUI.click(findTestObject('Header/Dropdwon Allergy Checker'))

WebUI.verifyTextPresent('Allergy Checker', false)

WebUI.click(findTestObject('Header/a_Promo  Event'))

WebUI.verifyTextPresent('Promo & Event', false)

WebUI.click(findTestObject('Header/a_Members'))

WebUI.verifyTextPresent('Kenapa Memilih Bebeclub', false)

WebUI.mouseOver(findTestObject('Header/a_Members'))

WebUI.click(findTestObject('Header/dropdown Upload Struk'))

WebUI.verifyTextPresent('Upload Struk', false)

WebUI.click(findTestObject('Header/a_Produk'))

WebUI.mouseOver(findTestObject('Header/a_Produk'))

WebUI.click(findTestObject('Header/Dropdown Bebelac 3'))

WebUI.verifyTextPresent('Bebelac 3', false)

WebUI.mouseOver(findTestObject('Header/a_Produk'))

WebUI.click(findTestObject('Header/Dropdown Bebelac 4'))

WebUI.verifyTextPresent('Bebelac 4', false)

WebUI.mouseOver(findTestObject('Header/a_Produk'))

WebUI.click(findTestObject('Header/Dropdown Bebelac Gold'))

WebUI.verifyTextPresent('Bebelac Gold', false)

WebUI.mouseOver(findTestObject('Header/a_Produk'))

WebUI.click(findTestObject('Header/Dropdown Bebelac Gold Soya'))

WebUI.verifyTextPresent('Bebelac Gold Soya', false)

WebUI.setText(findTestObject('Header/Search bar'), 'anak')

WebUI.click(findTestObject('Header/search icon'))

WebUI.verifyTextPresent('Hasil Pencarian', false)

WebUI.click(findTestObject('Header/a_Login'))

WebUI.verifyTextPresent('Masuk Ke Akun Anda', false)

WebUI.click(findTestObject('Header/a_Register'))

WebUI.verifyTextPresent('Daftar', false)

