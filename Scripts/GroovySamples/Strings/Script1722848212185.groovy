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


//	https://groovy-lang.org/syntax.html#all-strings

def name = "Nald Panaligan"

//println "My name is " + name
//println "My name is ".concat(name)
//println "My name is ${name}"
//
//def multiline = """ This is
//a multiline message """
//println multiline
//
//println name.length()
//println name[2]
//println name[-2]
//println name.indexOf('l')
//
//println name[0..2]
//println name[5..2]
//println name[1,3,5]
//
//println name.substring(5)
//println name.substring(1, 4)

//def str = "This is a groovy class"
//println str.split(" ")
//println str-("groovy")
//println str.replace("groovy", "gravy")
//println str.toUpperCase()
//println str.toLowerCase()
//println str.toList()
//println "Groovy " * 3
//
//println "Abc".equals("Abc")
//println "Abc".equalsIgnoreCase("abc")


def s3 = "My name is \"Nald\""
println s3
def s4 = /My name is "Nald"/
println s4
def s5 = /My name
is ${name}/
println s5


