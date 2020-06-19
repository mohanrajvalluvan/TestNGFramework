package com.clearcode.po;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

public class ProductPage {
	public static By addnew_btn = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a");
	public static By productname_ip = By.id("input-name1");
	public static By metatagtitle_ip = By.id("input-meta-title1");
	
	public static By data_tab = By.linkText("Data");
	public static By model_ip = By.id("input-model");
	public static By price_ip = By.id("input-price");
	public static By qty_ip = By.id("input-quantity");
	
	public static By links_tab = By.linkText("Links");
	public static By categories_click = By.id("input-category");
	public static By categories_select = By.linkText("11");
	
	public static By discount_tab = By.linkText("Discount");
	public static By adddiscount_btn = By.xpath("//*[@id=\"discount\"]/tfoot/tr/td[2]/button");
	public static By discountqty_ip = By.xpath("//*[@id=\"discount-row0\"]/td[2]/input");
	public static By discountprice_ip = By.xpath("//*[@id=\"discount-row0\"]/td[4]/input");
	public static By datestart_ip = By.xpath("//*[@id=\"discount-row0\"]/td[5]/div/input");
	public static By dateend_ip = By.xpath("//*[@id=\"discount-row0\"]/td[6]/div/input");
	
	public static By rewardpoints_tab = By.linkText("Reward Points");
	public static By rewardpoint_ip = By.id("input-points");
	

	
	
	
}
	
