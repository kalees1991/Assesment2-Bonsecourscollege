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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bonsecoursdindigul.edu.in/')

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_57e84e/a_Home'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_57e84e/a_Our Congregation'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_2e505b/a_Institution'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_a6eba0/a_Vission  Mission'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_2e505b/a_College Coat of Arms'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_2e505b/a_Best Practices'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Science College f_2e505b/a_Founder'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Sciece Coollege f_f4577d/a_Aboutus'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Sciece Coollege f_f4577d/a_President'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Sciece Coollege f_f4577d/a_President'))

WebUI.click(findTestObject('Object Repository/assessment2/Page_Bon Secours Arts and Sciece Coollege f_f4577d/a_President'))

WebUI.closeBrowser()

