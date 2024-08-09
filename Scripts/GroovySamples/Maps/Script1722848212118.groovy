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


def emptymap = [:]
println emptymap

def employee = [
	"name":"John",
	"age":40
	]
	
//println employee
//println employee.name
//println employee['name']
//println employee.get('age')
//println employee.getAt('age')

//println employee.size()

employee.put('city', 'Manila')
println employee
println employee.containsKey('city')
println employee.containsValue('Manila')

employee.remove('city')
println employee

def emp2 = employee.clone()
println emp2

employee.each {key,value ->
	println "$key : $value"
}

employee.eachWithIndex { key, value, i ->
	println "$i | $key : $value"
}

employee.eachWithIndex {entry, i ->
	println "$i | $entry.key : $entry.value"
}

empset = employee.entrySet()
empset.each {entry ->
	assert entry.key in ['name','age','city']
	assert entry.value in [40,'John']
}

employee.clear()
println employee
