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


def myClosure1 = { println "Hello World" }
def myClosure2 = { name -> println "My name is ${name}" }

def str = "name"
def myClosure3 = { name -> println "My ${str} is ${name}" }

myClosure1.call()
myClosure2.call("Nald")
myClosure3.call("Nald")

def myMethod(clos) {
	clos.call("Groovy")
}
myMethod(myClosure2)

def myClosure4 = {
	a, b, c ->
	return (a+b+c)
}
def res = myClosure4(10,20,30)
println "Result is ${res}"

def myList = [1,2,3,4,5]
println myList.find { item -> item==3 }
println myList.findAll { item -> item>3 }
println myList.any { item -> item>4 }
println myList.every { item -> item>4 }




