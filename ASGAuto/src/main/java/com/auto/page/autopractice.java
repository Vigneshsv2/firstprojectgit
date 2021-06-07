package com.auto.page;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.base.TestBase;
import com.auto.helper.CommonMethods;

public class autopractice extends TestBase{

	CommonMethods generalMethods = new CommonMethods();
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	static WebElement signin_btn;
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	static WebElement createaccount_btn;
	@FindBy(xpath = "//input[@id='email_create']")
	static WebElement email_text;
	@FindBy(xpath = "//div[@id='uniform-id_gender1']")
	static WebElement gender1;
	@FindBy(xpath = "//div[@id='uniform-id_gender2']")
	static WebElement gender2;
	@FindBy(xpath = "//input[@id='customer_firstname']")
	static WebElement customer_firstname;
	@FindBy(xpath = "//input[@id='customer_lastname']")
	static WebElement customer_lastname;
	@FindBy(xpath = "//input[@id='passwd']")
	static WebElement customer_password;
	@FindBy(xpath = "//select[@id='days']")
	static WebElement customer_dob_day;
	@FindBy(xpath = "//select[@id='months']")
	static WebElement customer_dob_month;
	@FindBy(xpath = "//select[@id='years']")
	static WebElement customer_dob_year;
	@FindBy(xpath = "//input[@id='firstname']")
	static WebElement address_firstname;
	@FindBy(xpath = "//input[@id='lastname']")
	static WebElement address_lastname;
	@FindBy(xpath = "//input[@id='address1']")
	static WebElement address_address1;
	@FindBy(xpath = "//input[@id='city']")
	static WebElement address_city;
	@FindBy(xpath = "//select[@id='id_state']")
	static WebElement address_state;
	@FindBy(xpath = "//input[@id='postcode']")
	static WebElement address_zip;
	@FindBy(xpath = "//select[@id='id_country']")
	static WebElement address_country;
	@FindBy(xpath = "//input[@id='phone_mobile']")
	static WebElement address_phone;
	@FindBy(xpath = "//button[@id='submitAccount']")
	static WebElement register_button;
	@FindBy(xpath = "//a[@title='Log me out']")
	static WebElement signout_button;
	@FindBy(xpath = "//input[@id='search_query_top']")
	static WebElement searchtypebox;
	@FindBy(xpath = "//button[@name='submit_search']")
	static WebElement searchbutton;
	@FindBy(xpath = "//input[@id='quantity_wanted']")
	static WebElement qty_textbox;
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	static WebElement addtocart_btn;
	@FindBy(xpath = "//select[@id='group_1']")
	static WebElement size;
	@FindBy(xpath = "//span[@title='Continue shopping']")
	static WebElement continueshopping;
	@FindBy(xpath = "//input[@id='email']")
	static WebElement loginUsername;
	@FindBy(xpath = "//input[@id='passwd']")
	static WebElement loginPassword;
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	static WebElement signin_btn_login;
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	static WebElement view_shoppingcart;
	@FindBy(xpath = "(//p[@class='product-name'])[2]")
	static WebElement shoppingcart_productname1;
	@FindBy(xpath = "(//small[@class='cart_ref'])[1]")
	static WebElement shoppingcart_sku1;
	@FindBy(xpath = "(//small/a)[2]")
	static WebElement shoppingcart_colorsize1;
	@FindBy(xpath = "(//span[@class='price'])[6]")
	static WebElement shoppingcart_total1;
	@FindBy(xpath = "(//p[@class='product-name'])[3]")
	static WebElement shoppingcart_productname2;
	@FindBy(xpath = "(//small[@class='cart_ref'])[2]")
	static WebElement shoppingcart_sku2;
	@FindBy(xpath = "(//small/a)[3]")
	static WebElement shoppingcart_colorsize2;
	@FindBy(xpath = "(//span[@class='price'])[8]")
	static WebElement shoppingcart_total2;
	@FindBy(xpath = "(//p[@class='product-name'])[4]")
	static WebElement shoppingcart_productname3;
	@FindBy(xpath = "(//small[@class='cart_ref'])[3]")
	static WebElement shoppingcart_sku3;
	@FindBy(xpath = "(//small/a)[4]")
	static WebElement shoppingcart_colorsize3;
	@FindBy(xpath = "(//span[@class='price'])[11]")
	static WebElement shoppingcart_total3;
	@FindBy(xpath = "(//input[@class='cart_quantity_input form-control grey'])[1]")
	static WebElement shoppingcart_qty1;
	@FindBy(xpath = "(//input[@class='cart_quantity_input form-control grey'])[2]")
	static WebElement shoppingcart_qty2;
	@FindBy(xpath = "(//input[@class='cart_quantity_input form-control grey'])[3]")
	static WebElement shoppingcart_qty3;
	@FindBy(xpath = "//td[@id='total_product']")
	static WebElement shoppingcart_totalproducts;
	@FindBy(xpath = "//td[@id='total_shipping']")
	static WebElement shoppingcart_totalshipping;
	@FindBy(xpath = "//span[@id='total_price']")
	static WebElement shoppingcart_totalprice;
	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	static WebElement delete_thirdproduct;
	@FindBy(xpath = "(//input[@class='cart_quantity_input form-control grey'])[1]")
	static WebElement product1_qtytextbox;
	@FindBy(xpath = "//td[@id='cart_voucher']")
	static WebElement cartdescription_click;
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	static WebElement proceedtocheckout_btn;
	@FindBy(xpath = "(//li[@class='address_firstname address_lastname'])[1]")
	static WebElement address_firstlastname;
	@FindBy(xpath = "(//li[@class='address_address1 address_address2'])[1]")
	static WebElement address_deliveryaddress;
	@FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
	static WebElement address_citystatepostcode;
	@FindBy(xpath = "(//li[@class='address_country_name'])[1]")
	static WebElement address_countryname;
	@FindBy(xpath = "(//li[@class='address_phone_mobile'])[1]")
	static WebElement address_phonenumber;
	@FindBy(xpath = "//button[@name='processAddress']")
	static WebElement address_Proceedtocheckout;
	@FindBy(xpath = "//input[@id='cgv']")
	static WebElement iagree;
	@FindBy(xpath = "//button[@name='processCarrier']")
	static WebElement shipping_proceedtocheckout;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	static WebElement paybankbywire;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	static WebElement iconfirmmyorder;
	@FindBy(xpath = "//a[@title='View my customer account']")
	static WebElement viewmyaccount;
	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	static WebElement orderhistoryanddetails;
	@FindBy(xpath = "//a[@class='color-myaccount']")
	static WebElement orderreference;
	@FindBy(xpath = "//td[@class='history_date bold']")
	static WebElement orderdate;
	@FindBy(xpath = "//span[@class='price']")
	static WebElement confirmationamount;
	@FindBy(xpath = "//td[@class='history_method']")
	static WebElement paymentmethod;
	@FindBy(xpath = "//td[@class='history_state']/span")
	static WebElement status;
	
	
	public autopractice() {
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean loginApplication() {
	
		webDriver.get(prop.getProperty("webexurl"));
		generalMethods.wait(10);
		System.out.println("URL Launched successfully");
		return true;
	}
	
	public boolean loginUser() {
		signin_btn.click();
		generalMethods.wait(5);
		
		loginUsername.sendKeys("testingforasg@asg.com");
		loginPassword.sendKeys("9566#Vig");
		signin_btn_login.click();
		generalMethods.wait(5);
		
		return true;
	}
	
	public boolean registerUser() throws IOException {
		
		HashMap<String, String> map = generalMethods.readfromexcel_registration("Registration");
		
		for(Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "-->" + m.getValue());
		}
		
		signin_btn.click();
		generalMethods.wait(10);
		email_text.sendKeys(map.get("Email"));
		createaccount_btn.click();
		generalMethods.wait(10);
		
		
		if(map.get("Title").contains("Mr")) {
			gender1.click();
			generalMethods.wait(5);
		}else {
			gender2.click();
			generalMethods.wait(5);
		}
		
		customer_firstname.clear();
		customer_firstname.sendKeys(map.get("First Name"));
		customer_lastname.clear();
		customer_lastname.sendKeys(map.get("Last Name"));
		generalMethods.wait(5);
		customer_password.sendKeys(map.get("Password"));
		generalMethods.wait(5);
		generalMethods.selectvalueFromDropdown_Value(customer_dob_day, map.get("Date of Birth-Day").replace(".0", ""));
		//generalMethods.selectvalueFromDropdown_Value(customer_dob_month, map.get("Date of Birth-Month"));
		generalMethods.selectvalueFromDropdown_Text(customer_dob_month, map.get("Date of Birth-Month")+" ");
		generalMethods.selectvalueFromDropdown_Value(customer_dob_year, map.get("Date of Birth-Year").replace(".0", ""));
		
		address_firstname.clear();
		address_firstname.sendKeys(map.get("First Name"));
		address_lastname.clear();
		address_lastname.sendKeys(map.get("Last Name"));
		generalMethods.wait(5);
		address_address1.sendKeys(map.get("Address"));
		generalMethods.wait(5);
		
		address_city.sendKeys(map.get("City"));
		generalMethods.wait(5);
		
		//generalMethods.selectvalueFromDropdown_Value(address_state, map.get("State"));
		generalMethods.selectvalueFromDropdown_Text(address_state, map.get("State"));
		generalMethods.wait(5);
		
		address_zip.sendKeys(map.get("Zipcode").replace(".0", ""));
	//	generalMethods.selectvalueFromDropdown_Value(address_country, map.get("Country"));
		generalMethods.selectvalueFromDropdown_Text(address_country, map.get("Country"));
		generalMethods.wait(5);
		
		
		String ph[] = map.get("Mobile Phone").split("E");
		String phone = ph[0].replace(".", "");
		
		address_phone.sendKeys(phone);
		generalMethods.wait(5);
		
		register_button.click();
		generalMethods.wait(10);
		
		if(generalMethods.elementPresenceCheck(signout_button)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean addProductToTheCart(int productnumber) throws IOException {
		
		HashMap<String, String> map = generalMethods.readfromexcel_Product(productnumber);
		
		System.out.println(generalMethods.readfromexcel_Product(productnumber));
		
		searchtypebox.clear();
		searchtypebox.sendKeys(map.get("Product Name"));
		searchbutton.click();
		generalMethods.wait(3);
		
		webDriver.findElement(By.xpath("(//a[contains(text(),'"+map.get("Product Name")+"')])[2]")).click();
		
		qty_textbox.clear();
		qty_textbox.sendKeys(map.get("Qty").replace(".0", ""));
		
		//webDriver.findElement(By.xpath("//a[@name='"+map.get("Qty").replace(".0", "")+"']"));
		
		generalMethods.selectvalueFromDropdown_Text(size, map.get("Size"));
		
		addtocart_btn.click();
		generalMethods.wait(5);
		
		continueshopping.click();
		generalMethods.wait(5);
		
		return true;
	}
	
	
	public boolean retriveandPrintthevalues() {
		
		view_shoppingcart.click();
		generalMethods.wait(5);
		
		String productname1 = shoppingcart_productname1.getText();
		System.out.println(productname1);
		String sku11[] = shoppingcart_sku1.getText().split(":");
		String sku1 = sku11[1].replaceAll("\\s", "");
		System.out.println(sku1);
		String col1[] = shoppingcart_colorsize1.getText().split(",");
		String col11[] = col1[0].split(":");
		String color1 = col11[1].replaceAll("\\s", "");
		System.out.println(color1);
		String siz1[] = col1[1].split(":");
		String size1 = siz1[1].replaceAll("\\s", "");
		System.out.println(size1);
		String total1 = shoppingcart_total1.getText().replace("$", "");
		System.out.println(total1);
		String qty1 = shoppingcart_qty1.getAttribute("value");
		System.out.println(qty1);
		
		
		String prod1[] = {"1", productname1, color1, size1, sku1, qty1, total1};
		
		generalMethods.writeinexcel_multi("Product", 1, 7, prod1);
		
		String productname2 = shoppingcart_productname2.getText();
		System.out.println(productname2);
		String sku22[] = shoppingcart_sku2.getText().split(":");
		String sku2 = sku22[1].replaceAll("\\s", "");
		System.out.println(sku2);
		String col2[] = shoppingcart_colorsize2.getText().split(",");
		String col22[] = col2[0].split(":");
		String color2 = col22[1].replaceAll("\\s", "");
		System.out.println(color2);
		String siz2[] = col2[1].split(":");
		String size2 = siz2[1].replaceAll("\\s", "");
		System.out.println(size2);
		String total2 = shoppingcart_total2.getText().replace("$", "");
		System.out.println(total2);
		String qty2 = shoppingcart_qty2.getAttribute("value");
		System.out.println(qty2);
		
		
		String prod2[] = {"2", productname2, color2, size2, sku2, qty2, total2};
		generalMethods.writeinexcel_multi("Product", 2, 7, prod2);
		
		
		String productname3 = shoppingcart_productname3.getText();
		System.out.println(productname3);
		String sku33[] = shoppingcart_sku3.getText().split(":");
		String sku3 = sku33[1].replaceAll("\\s", "");
		System.out.println(sku3);
		String col3[] = shoppingcart_colorsize3.getText().split(",");
		String col33[] = col3[0].split(":");
		String color3 = col33[1].replaceAll("\\s", "");
		System.out.println(color3);
		String siz3[] = col3[1].split(":");
		String size3 = siz3[1].replaceAll("\\s", "");
		System.out.println(size3);
		String total3 = shoppingcart_total3.getText().replace("$", "");
		System.out.println(total3);
		String qty3 = shoppingcart_qty3.getAttribute("value");
		System.out.println(qty3);
		
		
		String prod3[] = {"3", productname3, color3, size3, sku3, qty3, total3};
		generalMethods.writeinexcel_multi("Product", 3, 7, prod3);
		
		return true;
	}
	
	public boolean writeValuesinPricesheet(int rownum, String value) {
		
		String totalproducts = shoppingcart_totalproducts.getText().replace("$", "");
		String totalshipping = shoppingcart_totalshipping.getText().replace("$", "");
		String totalprice = shoppingcart_totalprice.getText().replace("$", "");
		
		
		String price1[] = {value, totalproducts, totalshipping, totalprice};
		generalMethods.writeinexcel_multi("Price", rownum, 4, price1);
		
		return true;
	}
	
	public boolean removethirdproductandentertheremvalues() {
		
		delete_thirdproduct.click();
		generalMethods.wait(5);
		
		String productname1 = shoppingcart_productname1.getText();
		System.out.println(productname1);
		String sku11[] = shoppingcart_sku1.getText().split(":");
		String sku1 = sku11[1].replaceAll("\\s", "");
		System.out.println(sku1);
		String col1[] = shoppingcart_colorsize1.getText().split(",");
		String col11[] = col1[0].split(":");
		String color1 = col11[1].replaceAll("\\s", "");
		System.out.println(color1);
		String siz1[] = col1[1].split(":");
		String size1 = siz1[1].replaceAll("\\s", "");
		System.out.println(size1);
		String total1 = shoppingcart_total1.getText().replace("$", "");
		System.out.println(total1);
		String qty1 = shoppingcart_qty1.getAttribute("value");
		System.out.println(qty1);
		
		
		String prod4[] = {"4", productname1, color1, size1, sku1, qty1, total1};
		generalMethods.writeinexcel_multi("Product", 4, 7, prod4);
	   
		String productname2 = shoppingcart_productname2.getText();
		System.out.println(productname2);
		String sku22[] = shoppingcart_sku2.getText().split(":");
		String sku2 = sku22[1].replaceAll("\\s", "");
		System.out.println(sku2);
		String col2[] = shoppingcart_colorsize2.getText().split(",");
		String col22[] = col2[0].split(":");
		String color2 = col22[1].replaceAll("\\s", "");
		System.out.println(color2);
		String siz2[] = col2[1].split(":");
		String size2 = siz2[1].replaceAll("\\s", "");
		System.out.println(size2);
		String total2 = shoppingcart_total2.getText().replace("$", "");
		System.out.println(total2);
		String qty2 = shoppingcart_qty2.getAttribute("value");
		System.out.println(qty2);
		
		
		String prod5[] = {"5", productname2, color2, size2, sku2, qty2, total2};
		generalMethods.writeinexcel_multi("Product", 5, 7, prod4);
		
		return true;
	}
	
	public boolean editproductoneandwitethevalues() {
		
		product1_qtytextbox.clear();
		product1_qtytextbox.sendKeys("20");
		generalMethods.wait(5);
		cartdescription_click.click();
		return true;
	}
	
	public boolean editfirstproductandentertheremvalues() {
		
		generalMethods.wait(5);
		
		String productname1 = shoppingcart_productname1.getText();
		System.out.println(productname1);
		String sku11[] = shoppingcart_sku1.getText().split(":");
		String sku1 = sku11[1].replaceAll("\\s", "");
		System.out.println(sku1);
		String col1[] = shoppingcart_colorsize1.getText().split(",");
		String col11[] = col1[0].split(":");
		String color1 = col11[1].replaceAll("\\s", "");
		System.out.println(color1);
		String siz1[] = col1[1].split(":");
		String size1 = siz1[1].replaceAll("\\s", "");
		System.out.println(size1);
		String total1 = shoppingcart_total1.getText().replace("$", "");
		System.out.println(total1);
		String qty1 = shoppingcart_qty1.getAttribute("value");
		System.out.println(qty1);
		
		
		String prod6[] = {"6", productname1, color1, size1, sku1, qty1, total1};
		generalMethods.writeinexcel_multi("Product", 6, 7, prod6);
		
		
		String productname2 = shoppingcart_productname2.getText();
		System.out.println(productname2);
		String sku22[] = shoppingcart_sku2.getText().split(":");
		String sku2 = sku22[1].replaceAll("\\s", "");
		System.out.println(sku2);
		String col2[] = shoppingcart_colorsize2.getText().split(",");
		String col22[] = col2[0].split(":");
		String color2 = col22[1].replaceAll("\\s", "");
		System.out.println(color2);
		String siz2[] = col2[1].split(":");
		String size2 = siz2[1].replaceAll("\\s", "");
		System.out.println(size2);
		String total2 = shoppingcart_total2.getText().replace("$", "");
		System.out.println(total2);
		String qty2 = shoppingcart_qty2.getAttribute("value");
		System.out.println(qty2);
		
		
		String prod7[] = {"7", productname2, color2, size2, sku2, qty2, total2};
		generalMethods.writeinexcel_multi("Product", 6, 7, prod7);
		
		return true;
	}
	
	public boolean enterRegistrationvaluesinoutput() {
		
		proceedtocheckout_btn.click();
		generalMethods.wait(5);
		
		String name = address_firstlastname.getText();
		String[] firstlastname = name.split(" ");
		//int n = (firstlastname[0].length())/2;
		String firstname = firstlastname[0];
		System.out.println(firstname);
	//	int n1 = (firstlastname[1].length())/2;
		String lastname = firstlastname[1];
		System.out.println(lastname);
		String address1 = address_deliveryaddress.getText();
		System.out.println(address1);
		
		String citystatepostcode = address_citystatepostcode.getText();
		
		String[] csp = citystatepostcode.split(",");
		String city = csp[0];
		System.out.println(city);
		
		String sp = csp[1];
		String [] sp1 = sp.split(" ");
		String state = sp1[1];
		System.out.println(state);
		String zipcode = sp1[2];
		System.out.println(zipcode);
		
		String country = address_countryname.getText();
		System.out.println(country);
		String phonenumber = address_phonenumber.getText();
		System.out.println(phonenumber);
		
		String reg1[] = {"1", "First Name", firstname };
		generalMethods.writeinexcel_multi("Registration", 1, 3, reg1);
		
		String reg2[] = {"2", "Last Name", lastname };
		generalMethods.writeinexcel_multi("Registration", 2, 3, reg2);
		
		String reg3[] = {"3", "Address", address1 };
		generalMethods.writeinexcel_multi("Registration", 3, 3, reg3);
		
		String reg4[] = {"4", "City", city };
		generalMethods.writeinexcel_multi("Registration", 4, 3, reg4);
		
		String reg5[] = {"5", "State", state };
		generalMethods.writeinexcel_multi("Registration", 5, 3, reg5);
		
		String reg6[] = {"6", "Postal Code", zipcode };
		generalMethods.writeinexcel_multi("Registration", 6, 3, reg6);
		
		String reg7[] = {"7", "Country", country };
		generalMethods.writeinexcel_multi("Registration", 7, 3, reg7);
		
		String reg8[] = {"8", "Phone Number", phonenumber };
		generalMethods.writeinexcel_multi("Registration", 8, 3, reg8);
		
		return true;
	}
	
	
	public boolean confirmOrder() {
		
		address_Proceedtocheckout.click();
		generalMethods.wait(5);
		iagree.click();
		shipping_proceedtocheckout.click();
		generalMethods.wait(5);
		paybankbywire.click();
		generalMethods.wait(5);
		iconfirmmyorder.click();
		generalMethods.wait(5);
		
		viewmyaccount.click();
		generalMethods.wait(5);
		orderhistoryanddetails.click();
		generalMethods.wait(5);
		
		String orderref = orderreference.getText();
		String date = orderdate.getText();
		String confamount = confirmationamount.getText().replace("$", "");
		String paymntmeth = paymentmethod.getText();
		String stat = status.getText();
		
		String orderconf[] = {"1", confamount};
		generalMethods.writeinexcel_multi("Order Confirmation", 1, 2, orderconf);
		
		
		String orderhis1[] = {"1", "Order Reference", orderref};
		generalMethods.writeinexcel_multi("Order History", 1, 3, orderhis1);
		
		String orderhis2[] = {"2", "Date", date};
		generalMethods.writeinexcel_multi("Order History", 2, 3, orderhis2);
		
		
		String orderhis3[] = {"3", "Total Price", confamount};
		generalMethods.writeinexcel_multi("Order History", 3, 3, orderhis3);
		
		String orderhis4[] = {"4", "Payment", paymntmeth};
		generalMethods.writeinexcel_multi("Order History", 4, 3, orderhis4);
		
		String orderhis5[] = {"5", "Status", stat};
		generalMethods.writeinexcel_multi("Order History", 5, 3, orderhis5);
		
		webDriver.close();
		return true;
	}
	
}
