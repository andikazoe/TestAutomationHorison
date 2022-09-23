package com.horizon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TestCasePage {
	
	TestCaseObject testcase = new TestCaseObject()
	
	public void StartWeb() {
		WebUI.openBrowser(GlobalVariable.LINK_WEB)
		WebUI.maximizeWindow()
	}
	
	public void Search(Jumlah_Size, Pilih_Size1, Pilih_Size2, Pilih_Size3) {
		switch (Jumlah_Size) {
			case '1':
				WebUI.click(testcase.selectSizes(Pilih_Size1))
				break;
			case '2':
				WebUI.click(testcase.selectSizes(Pilih_Size1))
				WebUI.click(testcase.selectSizes(Pilih_Size2))
				break;
			case '3':
				WebUI.click(testcase.selectSizes(Pilih_Size1))
				WebUI.click(testcase.selectSizes(Pilih_Size2))
				WebUI.click(testcase.selectSizes(Pilih_Size3))
				break;
		}
	}
	
	public void CheckoutAddCart(Pilih_Product, Jumlah_Barang) {
		for (def prdNum = 1; prdNum <= Pilih_Product; prdNum++) {
			int finddatas = Integer.parseInt(Pilih_Product)
			if (prdNum == finddatas) {
				WebUI.scrollToElement(testcase.scrollElementProduct(prdNum), 0)
				WebUI.click(testcase.btnAddToCart(prdNum))
				AddBarang(prdNum, Jumlah_Barang)
				break
			} else {
				WebUI.scrollToElement(testcase.scrollElementProduct(prdNum), 0)
				WebUI.click(testcase.btnAddToCart(prdNum))
				AddBarang(prdNum, Jumlah_Barang)
				WebUI.click(testcase.btnXCart())
			}
		}
		WebUI.click(testcase.btnCheckout())
	}
	
	public void AddBarang(prdNum, Jumlah_Barang) {
		for (def qtyNum = 1; qtyNum <= Jumlah_Barang; qtyNum++) {
			int finddata = Integer.parseInt(Jumlah_Barang)
			if (qtyNum == finddata) {
				break
			} else {
				WebUI.scrollToElement(testcase.btnAddQty(prdNum), 0)
				WebUI.click(testcase.btnAddQty(prdNum))
			}
		}
	}
	
	public void CheckoutWithoutAddCart() {
		WebUI.click(testcase.btnSelectCart())
		WebUI.click(testcase.btnCheckout())
	}
	
	public void DeleteCart(Pilih_Product) {
		for (def prdNum = 1; prdNum <= Pilih_Product; prdNum++) {
			int finddatas = Integer.parseInt(Pilih_Product)
			if (prdNum == finddatas) {
				WebUI.scrollToElement(testcase.scrollElementProduct(prdNum), 0)
				WebUI.click(testcase.btnAddToCart(prdNum))
				WebUI.delay(3)
				WebUI.click(testcase.btnDeleteCart())
				break
			} else {
				WebUI.scrollToElement(testcase.scrollElementProduct(prdNum), 0)
				WebUI.click(testcase.btnAddToCart(prdNum))
				WebUI.delay(3)
				WebUI.click(testcase.btnDeleteCart())
				WebUI.click(testcase.btnXCart())
			}
		}
	}
	
}
