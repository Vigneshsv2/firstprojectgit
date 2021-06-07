package com.auto.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.auto.base.TestBase;
import com.auto.page.autopractice;

public class WebexAutomation extends TestBase {

	@Test
	public void WebexAutomation() throws IOException {
	
		initialization();
		autopractice auto = new autopractice();

		//Assert.assertEquals(auto.registerUser(), true);
		auto.loginUser();
		Assert.assertEquals(auto.addProductToTheCart(3),true);
		Assert.assertEquals(auto.addProductToTheCart(1),true);
		Assert.assertEquals(auto.addProductToTheCart(2),true);
		Assert.assertEquals(auto.retriveandPrintthevalues(),true);
		Assert.assertEquals(auto.writeValuesinPricesheet(1, "1"),true);
		Assert.assertEquals(auto.removethirdproductandentertheremvalues(),true);
		Assert.assertEquals(auto.writeValuesinPricesheet(2, "2"),true);
		Assert.assertEquals(auto.editproductoneandwitethevalues(),true);
		Assert.assertEquals(auto.editfirstproductandentertheremvalues(),true);
		Assert.assertEquals(auto.writeValuesinPricesheet(3, "3"),true);
		Assert.assertEquals(auto.enterRegistrationvaluesinoutput(), true);
		Assert.assertEquals(auto.confirmOrder(), true);
	}
	
}
