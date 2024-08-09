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


//def fruits = ["Apples", "Oranges", "Grapes"]
//println fruits[1]
//println fruits.get(1)



def myList = [1,2,3,['A','B','Groovy'],4]
println myList[3][2]
println myList.get(3).get(2)
println myList[1..3]
println myList[4..2]

println myList.contains(4)
println myList[3].contains("Groovy")
println myList[3].size()

myList.add(10)
println myList

myList.add(2,22)
println myList

myList.remove(2)
println myList

myList = myList + [30,40]
println myList
myList = myList.plus([50,60])
println myList

myList = myList - [30,40]
println myList
myList = myList.minus([50,60])
println myList

println myList.pop()
println myList.removeLast()

println myList.intersect([1,2,3])
println myList.reverse()
println myList.sort()

myList.clear()
println myList
println myList.isEmpty()

def emptyList = []
println emptyList
println myList.isEmpty()



