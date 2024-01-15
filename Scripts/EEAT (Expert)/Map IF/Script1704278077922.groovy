import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
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
import com.kms.katalon.core.webui.keyword.builtin.VerifyTextPresentKeyword as VerifyTextPresentKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(7)

WebUI.click(findTestObject('iFrame'))

WebUI.click(findTestObject('Footer/Tim Ahli'))

WebUI.verifyTextPresent('Tim Ahli', false)

WebUI.verifyElementClickable(findTestObject('Tim Ahli Landing Page/Breadcrumb Beranda'))

List<TestObject> testObjects = [findTestObject('Object Repository/Tim Ahli Landing Page/Tim Ahli (h1 blue color)'), findTestObject(
        'Object Repository/Tim Ahli Landing Page/Short Description Below Title Tim Ahli'), findTestObject('Object Repository/Tim Ahli Landing Page/Kepala Staf Ahli (H2, bold)')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Nama Head (Clickable)'), findTestObject('Object Repository/Tim Ahli Landing Page/Tim Staf Ahli')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Proses Editorial Bebeclub'), findTestObject('Object Repository/Tim Ahli Landing Page/Proses editorial - Cara Bebeclub menyediakan')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Short Desc under proses editorial (accordion)'), findTestObject(
        'Object Repository/Tim Ahli Landing Page/button_Selengkapnya'), findTestObject('Object Repository/Tim Ahli Landing Page/Artikel Terbaru Blue H2')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Title Artikel Terbaru'), findTestObject('Object Repository/Tim Ahli Landing Page/Ditulis Oleh')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Tim Penulis'), findTestObject('Object Repository/Tim Ahli Landing Page/Nama Dr Irma Gustiana A, S.Psi., M.Psi., Psikolog., CPC')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Nama dr. Rita Ramayulis, DCN, M.Kes'), findTestObject('Object Repository/Tim Ahli Landing Page/Nama dr. Mikhael Yosia, DTMH, BMedSci, PGCert, MKK')
    , findTestObject('Object Repository/Tim Ahli Landing Page/Nama dr. Deva Putriane, Cht, CPHCT'), findTestObject('Object Repository/Tim Ahli Landing Page/Nama dr. Attila Dewanti, SpA (K)')]

// List<Map> untuk menyimpan informasi font untuk setiap elemen
List<TestObject> fontInfoList = []

// Mendapatkan informasi font dan menyimpannya dalam List<Map>
for (TestObject testObject : testObjects) {
    WebElement element = WebUI.findWebElement(testObject, 30)

    Map<String, String> fontInfo = [:]

    // Mendapatkan nilai fontSize dan menyimpannya dalam Map
    String fontSize = element.getCssValue('font-size')

    if (fontSize) {
        (fontInfo['fontSize']) = fontSize
    } else {
        (fontInfo['fontSize']) = 'Font size tidak tersedia'
    }
    
    // Mendapatkan nilai fontColor dan menyimpannya dalam Map
    String fontColor = element.getCssValue('color')

    if (fontColor) {
        (fontInfo['fontColor']) = fontColor
    } else {
        (fontInfo['fontColor']) = 'Font color tidak tersedia'
    }
    
    // Menambahkan Map ke dalam List
    fontInfoList.add(fontInfo)
}

// Expected values arrays
List<TestObject> expectedFontInfo = [['26px', 'rgba(47, 45, 150, 1)'], ['18px', 'rgba(0, 0, 0, 1)'], ['14px', 'rgba(0, 0, 0, 1)']
    , ['16px', 'rgba(47, 45, 150, 1)'], ['26px', 'rgba(47, 45, 150, 1)'], ['26px', 'rgba(47, 45, 150, 1)'], ['16px', 'rgba(0, 0, 0, 1)']
    , ['18px', 'rgba(0, 0, 0, 1)'], ['16px', 'rgba(47, 45, 150, 1)'], ['26px', 'rgba(47, 45, 150, 1)'], ['21px', 'rgba(0, 0, 0, 1)']
    , ['12px', 'rgba(79, 79, 79, 1)'], ['12px', 'rgba(47, 45, 150, 1)'], ['16px', 'rgba(47, 45, 150, 1)'], ['16px', 'rgba(47, 45, 150, 1)']
    , ['16px', 'rgba(47, 45, 150, 1)'], ['16px', 'rgba(47, 45, 150, 1)'], ['16px', 'rgba(47, 45, 150, 1)']]

//Print the size of fontInfoList to check if it's properly populated
//println("Size of fontInfoList: ${fontInfoList.size()}")
//// Print the font information for each element in fontInfoList
//for (int i = 0; i < fontInfoList.size(); i++) {
//	println("Font Info for Element ${i + 1}:")
//	println("   Font Size: ${fontInfoList[i]['fontSize']}")
//	println("   Font Color: ${fontInfoList[i]['fontColor']}")
//	println()
//}
// //Print the contents of expectedFontInfo to check if it's properly initialized
//println("Expected Font Info: ${expectedFontInfo}")
// Assertion loop
for (int i = 0; i < fontInfoList.size(); i++) {
    List<TestObject> expectedValues = expectedFontInfo[i]

    // Font size assertion
    assert ((fontInfoList[i])['fontSize']) == (expectedValues[0])

    // Font color assertion
    assert ((fontInfoList[i])['fontColor']) == (expectedValues[1])
}

WebUI.click(findTestObject('Tim Ahli Landing Page/Arrow Kanan card staff ahli'))

WebUI.click(findTestObject('Tim Ahli Landing Page/Arrow Kiri card staff ahli'))

WebUI.click(findTestObject('Tim Ahli Landing Page/button_Selengkapnya'))

WebUI.verifyTextPresent('Ibu dan si Kecil adalah prioritas utama Bebeclub. Semua artikel yang kami sajikan bertujuan untuk memberi informasi akurat serta membantu Ibu dalam menentukan pilihan terbaik terkait tumbuh kembang si Kecil.', 
    false)

WebUI.click(findTestObject('Tim Ahli Landing Page/button_Selengkapnya'))

WebUI.click(findTestObject('Tim Ahli Landing Page/Arrow Kanan Artikel Terbaru'))

WebUI.click(findTestObject('Tim Ahli Landing Page/Arrow Kiri Artikel Terbaru'))

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

