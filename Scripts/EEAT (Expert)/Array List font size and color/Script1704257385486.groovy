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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser(GlobalVariable.URL)

WebUI.click(findTestObject('Footer/Tim Ahli'))

WebUI.verifyElementClickable(findTestObject('Tim Ahli Landing Page/Breadcrumb Beranda'))

def fontSizes = []

def fontColors = []

//get semua test object based on object repository
//List<TestObject> testObjects = findTestObject('Object Repository/Tim Ahli Landing Page')
List<TestObject> testObjects = [findTestObject('Object Repository/Tim Ahli Landing Page/Tim Ahli (h1 blue color)'), findTestObject(
        'Object Repository/Tim Ahli Landing Page/Kepala Staf Ahli (H2, bold)')]

for (TestObject testObject : testObjects) {
    WebElement element = WebUI.findWebElement(testObject, 30)

    def fontSize = element.getCssValue('font-size')

    fontSizes.add(fontSize)

    def fontColor = element.getCssValue('color')

    fontColors.add(fontColor)
}

// Print font sizes
println('Font Sizes:')

fontSizes.each({ 
        println(it)
    })

// Print font colors
println('Font Colors:')

fontColors.each({ 
        println(it)
    })

assert (fontSizes[0]).equals('26px')

assert (fontColors[0]).equals('rgba(47, 45, 150, 1)')

WebUI.verifyTextPresent('', false)

