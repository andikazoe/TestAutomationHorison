import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.horizon.*
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

TestCasePage testcase = new TestCasePage()
testcase.StartWeb()
switch (Condition) {
	case 'Search Product':
		testcase.Search(Jumlah_Size, Pilih_Size1, Pilih_Size2, Pilih_Size3)
		break;
	case 'Checkout Add Cart':
		testcase.Search(Jumlah_Size, Pilih_Size1, Pilih_Size2, Pilih_Size3)
		testcase.CheckoutAddCart(Pilih_Product, Jumlah_Barang)
		break;
	case 'Checkout Without Add Cart':
		testcase.CheckoutWithoutAddCart()
		break;
	case 'Delete Product':
		testcase.Search(Jumlah_Size, Pilih_Size1, Pilih_Size2, Pilih_Size3)
		testcase.DeleteCart(Pilih_Product)
		break;
}
WebUI.delay(3)



