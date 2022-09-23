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

public class TestCaseObject extends TestCaseBasePageObject {
	
	private TestObject selectSizes
	private TestObject btnAddToCart
	private TestObject btnAddQty
	private TestObject btnCheckout
	private TestObject btnSelectCart
	private TestObject btnDeleteCart
	private TestObject scrollElementProduct
	private TestObject btnXCart
	
	public TestObject selectSizes(size){
		selectSizes = createTestObjectByXpath("selectSizes", "//*/text()[normalize-space(.)='${size}']/parent::*")
	}
	
	public TestObject btnAddToCart(Jumlah){
		btnAddToCart = createTestObjectByXpath("btnAddToCarts", "//div[${Jumlah}]/button")
	}
	
	public TestObject btnAddQty(qty){
		btnAddQty = createTestObjectByXpath("btnAddQty", "//div[${qty}]/div[2]/div/button[2]")
	}
	
	public TestObject btnCheckout(){
		btnCheckout = createTestObjectByXpath("btnCheckout", "//*/text()[normalize-space(.)='Checkout']/parent::*")
	}
	
	public TestObject btnSelectCart(){
		btnSelectCart = createTestObjectByXpath("btnSelectCart", "//div[@id='root']/div/div/button/div")
	}
	
	public TestObject btnDeleteCart(){
		btnDeleteCart = createTestObjectByXpath("btnDeleteCart", "//div[2]/div/button")
	}
	
	public TestObject scrollElementProduct(Jumlah){
		scrollElementProduct = createTestObjectByXpath("scrollElementProduct", "//div[@id='root']/div/main/main/div/div[${Jumlah}]/div[2]")
	}
	
	public TestObject btnXCart(){
		btnXCart = createTestObjectByXpath("btnXCart", "//button[(text() = 'X' or . = 'X')]")
	}
	
	
}
