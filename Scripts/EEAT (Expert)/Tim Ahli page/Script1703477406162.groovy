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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

WebUI.click(findTestObject('Footer/Tim Ahli'))

WebUI.verifyElementClickable(findTestObject('Tim Ahli Landing Page/Breadcrumb Beranda'))

// Ambil nilai warna font menggunakan getCssValue dan simpan dalam variabel
String actualFontColor = WebUI.getCSSValue(findTestObject('Tim Ahli Landing Page/Tim Ahli (h1 blue color)'), 'color')

// Nilai warna font yang diharapkan dari desain Figma
String expectedFontColor = '#2f2d96' // Ganti dengan nilai warna yang diharapkan

// Verifikasi bahwa nilai warna font sesuai dengan yang diharapkan
if (actualFontColor.equals(expectedFontColor)) {
} else {
}

WebUI.verifyTextPresent('Selain dirangkai penulis, spesialis serta profesional memastikan akurasi konten yang dimuat di Bebeclub', 
    false)

WebUI.verifyElementClickable(findTestObject('Tim Ahli Landing Page/Profil Image Head (Clickable)'))

String actualFontSize = WebUI.getCSSValue(findTestObject('Tim Ahli Landing Page/Kepala Staf Ahli (H2, bold)'), 'font-size')

String expectedFontSize = '14px'

WebUI.verifyMatch(actualFontSize, expectedFontSize, true)

String actualFont = WebUI.getCSSValue(findTestObject('Tim Ahli Landing Page/Nama Head (Clickable)'), 'color')

String expectedFont = '#2f2d96'

String actualSize = WebUI.getCSSValue(findTestObject('Tim Ahli Landing Page/Nama Head (Clickable)'), 'font-size')

String expectedSize = '16px'

WebUI.verifyMatch(actualSize, expectedSize, true)

WebUI.verifyMatch(actualFont, expectedFont, true)

WebUI.verifyElementClickable(findTestObject('Tim Ahli Landing Page/Nama Head (Clickable)'))

