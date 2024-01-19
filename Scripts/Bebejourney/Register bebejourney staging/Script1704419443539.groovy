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

// Generate the last 9 digits randomly
// Combine the last nine digits with the prefix "0877"
// Isi field dalam form dengan angka acak
String randomNum = generateRandomNumber()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bebeclub.eydendigital.co.id/')

WebUI.click(findTestObject('Object Repository/Homepage/img_tools_bebejourney'))

WebUI.click(findTestObject('Bebe Journey page/Banner click - Yuk, Cek di sini'))

//WebUI.click(findTestObject('Object Repository/Bebe Journey page/a_Bebejourney'))
WebUI.setText(findTestObject('Object Repository/Bebe Journey page/input_Nama Lengkap_full-name-form'), 'test sdk bbj')

WebUI.setText(findTestObject('Object Repository/Bebe Journey page/input__number-form'), randomNum)

WebUI.setEncryptedText(findTestObject('Object Repository/Bebe Journey page/input__pass-form'), '8SQVv/p9jVRYfSV/eMGvjg==')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Bebe Journey page/select_Pilih Kondisi Ibu Saat IniSedang Ham_b5f944'), 
//    'Pilih Kondisi Ibu Saat Ini', true)
//WebUI.selectOptionByValue(findTestObject('Object Repository/Bebe Journey page/select_Pilih Kondisi Ibu Saat IniSedang Ham_b5f944'), 
//    '10', true)
WebUI.click(findTestObject('Object Repository/Bebe Journey page/input_Kode Referal_syarat-form'))

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0851' + lastNineDigits

    return randomNumber
}

