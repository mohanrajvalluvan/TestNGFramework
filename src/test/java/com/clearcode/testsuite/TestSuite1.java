package com.clearcode.testsuite;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.DashboardPage;
import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.ProductPage;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{

	@Test(dataProvider="addProduct",dataProviderClass=LoginData.class)
	public void addProduct(String desc,String productname,String metatabtitle,String model,String price,String Category,String qty,String discountprice,String rewardpoint) {
		wdu.type(HomePage.username_ip, "admin");
		wdu.type(HomePage.pwd_ip, "admin@123");
		wdu.submit(HomePage.pwd_ip);
		
		wdu.click(DashboardPage.category_click);
		wdu.click(DashboardPage.product_click);
		
		wdu.click(ProductPage.addnew_btn);
		wdu.type(ProductPage.productname_ip, productname); //"Brown T shirt"
		wdu.type(ProductPage.metatagtitle_ip, metatabtitle);//"T shirt"
		
		wdu.click(ProductPage.data_tab);
		wdu.type(ProductPage.model_ip, model); //"RTS-012"
		wdu.type(ProductPage.price_ip, price); //"1500"
		wdu.type(ProductPage.qty_ip, qty); //"3"
		
		wdu.click(ProductPage.links_tab);
		wdu.click(ProductPage.categories_click);
		wdu.click(ProductPage.categories_select);
		
		wdu.click(ProductPage.discount_tab);
		wdu.click(ProductPage.adddiscount_btn);
		wdu.type(ProductPage.discountqty_ip, qty);//"3"
		wdu.type(ProductPage.discountprice_ip, discountprice);//"800"
		
		Date dt= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
		wdu.type(ProductPage.datestart_ip, sdf.format(dt));
		
		
		Date dt1= new Date();
		int intday = dt1.getDate();
		int inttomdate = intday+1;
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
		
		wdu.type(ProductPage.dateend_ip, sdf1.format(dt1)+"-"+inttomdate);
		
		
		wdu.click(ProductPage.rewardpoints_tab);
		wdu.type(ProductPage.rewardpoint_ip, rewardpoint);//"4"
		wdu.submit(ProductPage.rewardpoint_ip);
		
		wdu.assertContains(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"), "Success: You have modified products!");
		
					
				
	}
	
	@Test(dataProvider="addProduct2",dataProviderClass=LoginData.class)
	public void addProduct2(String desc,String productname,String metatabtitle,String model,String price,String Category,String qty,String discountprice,String rewardpoint) {
		wdu.type(HomePage.username_ip, "admin");
		wdu.type(HomePage.pwd_ip, "admin@123");
		wdu.submit(HomePage.pwd_ip);
		
		wdu.click(DashboardPage.category_click);
		wdu.click(DashboardPage.product_click);
		
		wdu.click(ProductPage.addnew_btn);
		wdu.type(ProductPage.productname_ip, productname); //"Brown T shirt"
		wdu.type(ProductPage.metatagtitle_ip, metatabtitle);//"T shirt"
		
		wdu.click(ProductPage.data_tab);
		wdu.type(ProductPage.model_ip, model); //"RTS-012"
		wdu.type(ProductPage.price_ip, price); //"1500"
		wdu.type(ProductPage.qty_ip, qty); //"3"
		
		wdu.click(ProductPage.links_tab);
		wdu.click(ProductPage.categories_click);
		wdu.click(ProductPage.categories_select);
		
		wdu.click(ProductPage.discount_tab);
		wdu.click(ProductPage.adddiscount_btn);
		wdu.type(ProductPage.discountqty_ip, qty);//"3"
		wdu.type(ProductPage.discountprice_ip, discountprice);//"800"
		
		Date dt= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
		wdu.type(ProductPage.datestart_ip, sdf.format(dt));
		
		
		Date dt1= new Date();
		int intday = dt1.getDate();
		int inttomdate = intday+1;
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
		
		wdu.type(ProductPage.dateend_ip, sdf1.format(dt1)+"-"+inttomdate);
		
		
		wdu.click(ProductPage.rewardpoints_tab);
		wdu.type(ProductPage.rewardpoint_ip, rewardpoint);//"4"
		wdu.submit(ProductPage.rewardpoint_ip);
		
		wdu.assertContains(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"), "Warning: Please check the form carefully for errors!");
		
	
			
				
	}
	
	
	
	
}