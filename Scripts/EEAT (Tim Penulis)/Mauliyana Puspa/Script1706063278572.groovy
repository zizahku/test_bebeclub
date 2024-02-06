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

WebUI.click(findTestObject('Footer/Tim Penulis'))

WebUI.verifyTextPresent('Tim Penulis', false)

WebUI.click(findTestObject('Tim Penulis Artikel Bebeclub/Text Mauliyana Puspa Adityasari'))

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

List<TestObject> testObjects = [findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Breadcrumb Beranda')
    , findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Breadcrumb Tim Penulis')
    , findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Penulis'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Nama Mauliyana Puspa Adityasari'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Hyperlink Profil Profesional'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Profile Summary'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Pendidikan'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Tahun Pendidikan'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text University'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Jurusan'), findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Pengalaman')
    , findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Tahun'), findTestObject(
        'Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Jabatan'), findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Tempat Kerja') //findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Text Artikel Lainnya'),
    , findTestObject('Object Repository/Tim Penulis Artikel Bebeclub/1. Mauliyana Puspa Adityasari/Button Lihat Lebih Banyak')]

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
    
    //Get value text nya and store in Map
    String text = element.getText()

    if (text) {
        (fontInfo['text']) = text
    } else {
        (fontInfo['text']) = 'text tidak ada'
    }
    
    // Menambahkan Map ke dalam List
    fontInfoList.add(fontInfo)
}

// Expected values arrays
List<TestObject> expectedFontInfo = [['16px', 'rgba(0, 0, 0, 1)', 'Beranda'], ['16px', 'rgba(0, 0, 0, 1)', 'Tim Penulis']
    , ['14px', 'rgba(0, 0, 0, 1)', 'Penulis'], ['18px', 'rgba(47, 45, 150, 1)', 'Mauliyana Puspa Adityasari'], ['14px', 'rgba(0, 0, 139, 1)'
        , 'Profil Profesional >'], ['14px', 'rgba(0, 0, 0, 1)', 'Stay at home mom yang masih terus giat menulis konten mengenai parenting dan tumbuh kembang anak.']
    , ['14px', 'rgba(0, 0, 0, 1)', 'Pendidikan'], ['14px', 'rgba(0, 0, 0, 1)', '2013 - 2017'], ['14px', 'rgba(0, 0, 0, 1)'
        , 'Universitas Jendral Soedirman'], ['12px', 'rgba(0, 0, 0, 1)', 'Sarjana Ilmu Komunikasi'], ['14px', 'rgba(0, 0, 0, 1)'
        , 'Pengalaman'], ['14px', 'rgba(0, 0, 0, 1)', '2017 - 2018'], ['14px', 'rgba(0, 0, 0, 1)', 'Penulis Konten'], ['12px'
        , 'rgba(0, 0, 0, 1)', 'Kompas Gramedia Grup Majalah'] //	['26px', 'rgba(47, 45, 150, 1)', 'Artikel Lainnya dari'+
    , //		'Mauliyana Puspa Adityasari'],
    ['16px', 'rgba(0, 0, 0, 1)', 'Lihat Lebih Banyak']]

//Print the size of fontInfoList to check if it's properly populated
println("Size of fontInfoList: $fontInfoList.size()")

//Print the font information for each element in fontInfoList
for (int i = 0; i < fontInfoList.size(); i++) {
    println("Font Info for Element $(i + 1):")

    println("   Font Size: $fontInfoList[i][fontSize]")

    println("   Font Color: $fontInfoList[i][fontColor]")

    println("	Text: $fontInfoList[i][text]")
}

//Assertion
for (int i = 0; i < fontInfoList.size(); i++) {
    List<TestObject> expectedValues = expectedFontInfo[i]

    // Font size assertion
    assert ((fontInfoList[i])['fontSize']) == (expectedValues[0])

    // Font color assertion
    assert ((fontInfoList[i])['fontColor']) == (expectedValues[1])

    //Text
    assert ((fontInfoList[i])['text']) == (expectedValues[2])
}

