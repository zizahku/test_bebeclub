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
import java.util.Random as Random

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bebeclub.eydendigital.co.id/membership/registration')

WebUI.click(findTestObject('Homepage/a_Register'))

WebUI.setText(findTestObject('Page_Bebeclub - Membership Registration/input_Nama Depan_first-name-form'), 'aziza')

WebUI.setText(findTestObject('Page_Bebeclub - Membership Registration/input_Nama Belakang_last-name-form'), 'prefix')

// Generate the last 9 digits randomly
// Combine the last nine digits with the prefix "0877"
// Isi field dalam form dengan angka acak
String randomNum = generateRandomNumber()

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
WebUI.setText(findTestObject('Page_Bebeclub - Membership Registration/input__number-form'), randomNum)

WebUI.setEncryptedText(findTestObject('Page_Bebeclub - Membership Registration/input_Password_pass-form'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Page_Bebeclub - Membership Registration/input_Konfirmasi Password_konfirmasipass-form'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.selectOptionByLabel(findTestObject('Page_Bebeclub - Membership Registration/select_Pilih Kondisi Ibu Saat Ini'), 'Belum Hamil & Tidak Mempunyai Anak', 
    false)

WebUI.click(findTestObject('Page_Bebeclub - Membership Registration/button_Kirim Kode OTP'))

WebUI.delay(4)

WebUI.verifyTextPresent('Berhasil', false)

WebUI.click(findTestObject('Page_Bebeclub - Membership Registration/img'))

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0884' + lastNineDigits

    return randomNumber
}

