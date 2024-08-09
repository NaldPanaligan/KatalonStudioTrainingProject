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

//	https://groovy-lang.org/semantics.html

//for(def i=1;i<=5;i++) {
//	println i
//}
//
//def j = 1
//for(j;j<=5;j++) {
//	println j
//}

//1.upto(5) { println "$it" }
//5.times { println "$it" }
//1.step(10,2) { println "$it" }

def map = ["name":"Groovy", "subject":"Automation"]
for (e in map) {
	print e.key+":"
	println e.value
}

def i=1
while (i<=5) {
	println i
	i++
}

//for (def counter : (1..5)) {
//    CustomKeywords.'MyKeywordsOne.hello'()
//
//    if (counter == 2) {
//        CustomKeywords.'MyKeywordsOne.helloUser'('2')
//    } else if (counter == 3) {
//        CustomKeywords.'MyKeywordsOne.helloUser'('3')
//    } else {
//        CustomKeywords.'MyKeywordsOne.helloUser'('not applicable')
//    }
//}

