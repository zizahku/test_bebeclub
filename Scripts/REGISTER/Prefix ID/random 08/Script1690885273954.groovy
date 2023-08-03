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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bebeclub.eydendigital.co.id/membership/registration')

WebUI.setText(findTestObject('Page_Bebeclub - Membership Registration/input_Nama Depan_first-name-form'), 'azia')

WebUI.setText(findTestObject('Page_Bebeclub - Membership Registration/input_Nama Belakang_last-name-form'), 'prefix')

// Fungsi untuk menghasilkan nomor acak dengan kondisi tertentu
// Pilih digit-digital sisanya hingga mencapai panjang 10 karakter (total panjang 12 karakter)
// Mendapatkan angka acak dari 0 hingga 9
// Cek apakah nomor telepon memenuhi kondisi
// Jika nomor telepon memenuhi kondisi, keluar dari perulangan
// Memanggil fungsi untuk menghasilkan nomor telepon acak yang memenuhi kondisi
String randomPhoneNumber = generateRandomPhoneNumber()

println("Nomor telepon acak dengan kondisi: $randomPhoneNumber")

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
WebUI.setText(findTestObject('Page_Bebeclub - Membership Registration/input__number-form'), randomPhoneNumber)

WebUI.setEncryptedText(findTestObject('Page_Bebeclub - Membership Registration/input_Password_pass-form'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Page_Bebeclub - Membership Registration/input_Konfirmasi Password_konfirmasipass-form'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.selectOptionByLabel(findTestObject('Page_Bebeclub - Membership Registration/select_Pilih Kondisi Ibu Saat Ini'), 'Belum Hamil & Tidak Mempunyai Anak', 
    false //WebUI.getAlertText()
    )

WebUI.verifyTextPresent('tidak terdaftar', false //WebUI.click(findTestObject('Page_Bebeclub - Membership Registration/button_Kirim Kode OTP'))
    )

WebUI.verifyElementNotClickable(findTestObject('Page_Bebeclub - Membership Registration/button_Kirim Kode OTP'))

String generateRandomPhoneNumber() {
    def random = new Random()

    def phoneNumber = ''

    while (true) {
        phoneNumber = '08'

        while (phoneNumber.size() < 12) {
            def digit = random.nextInt(10)

            phoneNumber += digit
        }
        
        def excludedPrefixes = ['0811', '0812', '0813', '0821', '0822', '0823', '0852', '0853', '0814', '0815', '0816', '0855'
            , '0856', '0857', '0858', '0881', '0882', '0883', '0884', '0885', '0886', '0887', '0888', '0889', '0817', '0818'
            , '0819', '0859', '0877', '0878', '0831', '0832', '0833', '0838', '0895', '0896', '0897', '0898', '0899']

        def isExcludedPrefix = false

        for (String prefix : excludedPrefixes) {
            if (phoneNumber.startsWith(prefix)) {
                isExcludedPrefix = true

                break
            }
        }
        
        if (!(isExcludedPrefix)) {
            break
        }
    }
    
    return phoneNumber
}

