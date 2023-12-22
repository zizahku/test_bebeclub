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

String randomNum = generateRandomNumber()

WebUI.openBrowser(GlobalVariable.URL)

WebUI.click(findTestObject('Header/a_Register'))

WebUI.setText(findTestObject('Membership Registration/Nama Lengkap'), 'pake angka 123 satu dua diga')

String inputText = WebUI.getAttribute(findTestObject('Membership Registration/Nama Lengkap'), 'value')

// Define a regular expression to match only strings
String stringPattern = '^[a-zA-Z\\s]*$'

// Verify that the input contains only strings
WebUI.verifyMatch(inputText, stringPattern, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Membership Registration/Nomor Handphone'), randomNum)

WebUI.setEncryptedText(findTestObject('Membership Registration/Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.selectOptionByLabel(findTestObject('Membership Registration/Pilih Kondisi Ibu Saat Ini'), 'Sedang Hamil', false)

WebUI.selectOptionByLabel(findTestObject('Membership Registration/UsiaKehamilan'), '12 Minggu', false)

WebUI.check(findTestObject('Membership Registration/checkbox tnc'))

WebUI.delay(20)

WebUI.verifyElementNotClickable(findTestObject('Membership Registration/button_Kirim Kode OTP'))

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0899' + lastNineDigits

    return randomNumber
}

