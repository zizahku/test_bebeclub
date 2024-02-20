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
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(7)

WebUI.click(findTestObject('iFrame'))

WebUI.click(findTestObject('Footer/Tim Ahli'))

WebUI.verifyTextPresent('Tim Ahli', false)

WebUI.click(findTestObject('Tim Ahli Landing Page/Nama dr. Rita Ramayulis, DCN, M.Kes'))

'Navigated to Homepage Bebeclub'
WebUI.verifyElementClickable(findTestObject('Tim Ahli detail page/Kepala Tim Ahli Landing Page/Breadcrumb Beranda'))

WebUI.verifyElementClickable(findTestObject('Tim Ahli detail page/Kepala Tim Ahli Landing Page/Breacrumb Tim Ahli'))

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

List<TestObject> testObjects = [
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Dokter Ahli Gizi'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text dr. Rita Ramayulis, DCN, M.Kes'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Hyperlink Profil Profesional'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Profile Summary'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Pendidikan'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Tahun Pendidikan'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Nama University'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Jurusan Pendidikan'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Pengalaman'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Tahun Jabatan'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Jabatan'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Tempat Kerja'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Artikel Lain'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Text Title Article'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Hyperlink Tim Penulis'),
	findTestObject('Object Repository/Tim Ahli detail page/dr Rita/Hyperlink dr. Rita Ramayulis, DCN, M.Kes')
	]

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
List<TestObject> expectedFontInfo = [
	['14px', 'rgba(0, 0, 0, 1)'],
	['18px', 'rgba(47, 45, 150, 1)'],
	['14px', 'rgba(0, 0, 139, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['12px', 'rgba(0, 0, 0, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['14px', 'rgba(0, 0, 0, 1)'],
	['12px', 'rgba(0, 0, 0, 1)'],
	['26px', 'rgba(47, 45, 150, 1)'],
	['24px', 'rgba(0, 0, 0, 1)'],
	['12px', 'rgba(47, 45, 150, 1)'],
	['12px', 'rgba(47, 45, 150, 1)']
	
	]

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
//	
// Assertion loop
for (int i = 0; i < fontInfoList.size(); i++) {
    List<TestObject> expectedValues = expectedFontInfo[i]

    // Font size assertion
    assert ((fontInfoList[i])['fontSize']) == (expectedValues[0])

    // Font color assertion
    assert ((fontInfoList[i])['fontColor']) == (expectedValues[1])
}