import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testcases2 extends parameter2{

	
 @BeforeTest
	 
	 public void BeforeTest() throws InterruptedException {
	  //  driver.get(login);
		driver.get(TheWebSiteURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 price1=driver.findElement(By.xpath("//*[@id=\"old-price-1556-widget-product-grid\"]")).getText();
		 price2=driver.findElement(By.xpath("//*[@id=\"old-price-1812-widget-product-grid\"]")).getText();
		 price3=driver.findElement(By.xpath("//*[@id=\"old-price-694-widget-product-grid\"]")).getText();
		 price4=driver.findElement(By.xpath("//*[@id=\"old-price-158-widget-product-grid\"]")).getText();
		 price5=driver.findElement(By.xpath("//*[@id=\"old-price-6-widget-product-grid\"]")).getText();
			
		
	 }
 
 

@Test(description="number 1" , priority = 1)
	public void SignUp() throws InterruptedException {
	 driver.get(create);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 
		 WebElement FirstName =driver.findElement(By.id("firstname"));
		 FirstName.sendKeys(firstName[RandomIndex]);
		 WebElement LastName =driver.findElement(By.id("lastname"));
		 LastName.sendKeys(lastName[RandomIndex]);
		 
		 
		 WebElement Email =driver.findElement(By.id("email_address"));
		 Email.sendKeys(Emailuser+EmailIndex+EmailComplete);
		 Emaillogin= Emailuser+EmailIndex+EmailComplete;
		 
		 WebElement password =driver.findElement(By.id("password"));
		 password.sendKeys( passwordLab);
		 
		 WebElement ConfirmPassword=driver.findElement(By.id("password-confirmation"));
		
		 
		 ConfirmPassword.sendKeys(passwordLab);
		 Thread.sleep(3000);
	
		 
		 WebElement ButtonAcount =driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
		 ButtonAcount.click();
		 Thread.sleep(2000);
		 driver.get(signOut);
			
	}


@Test(description="number 2" , priority = 2)
public void Login() {
	Emaillogin="user85@gamail.com";
//	WebElement loginPage=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
//	loginPage.click();
	driver.get(loginPage);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	 
	 WebElement Email =driver.findElement(By.name("login[username]"));
	 Email.sendKeys(Emaillogin);
	 
	 WebElement password =driver.findElement(By.name("login[password]"));
	 password.sendKeys( passwordLab);
	 
	 WebElement buttLogin=driver.findElement(By.id("send2"));
	 buttLogin.click();
}



@Test(description="number 3" , priority = 3)
public void AddItems() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String Item_Pages[]= {"https://magento.softwaretestingboard.com/radiant-tee.html",
			"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
			"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			"https://magento.softwaretestingboard.com/hero-hoodie.html",
			"https://magento.softwaretestingboard.com/fusion-backpack.html",
			"https://magento.softwaretestingboard.com/push-it-messenger-bag.html",
			  };
	
for(int i=0;i<Item_Pages.length;i++) {
		driver.get(Item_Pages[i]);
		
	if(driver.getCurrentUrl().contains("radiant")) {
		
	WebElement sizeBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
	List<WebElement >sizes=sizeBox.findElements(By.tagName("div"));
	int sizeIndex=rand.nextInt(0,sizes.size());
	sizes.get(sizeIndex).click();
	
	WebElement colorBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
	List<WebElement >colors=colorBox.findElements(By.tagName("div"));
	int colorIndex=rand.nextInt(0,colors.size());
	sizes.get(colorIndex).click();
	
	Thread.sleep(3000);
	WebElement qty=driver.findElement(By.id("qty"));
	qty.clear();
	qty.sendKeys(radiantNum1String);
	 Thread.sleep(3000);
	 
	 WebElement Add_To_cart=driver.findElement(By.id("product-addtocart-button"));
	 Add_To_cart.click();
		
	Thread.sleep(5000);
	}
	 else if(driver.getCurrentUrl().contains("breathet")) {
		 

		 WebElement sizeBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
			List<WebElement >sizes=sizeBox.findElements(By.tagName("div"));
			int sizeIndex=rand.nextInt(0,sizes.size());
			sizes.get(sizeIndex).click();
			
			Thread.sleep(3000);
			WebElement colorBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
			List<WebElement >colors=colorBox.findElements(By.tagName("div"));
			int colorIndex=rand.nextInt(0,colors.size());
			sizes.get(colorIndex).click();
			
			Thread.sleep(3000);
			WebElement qty=driver.findElement(By.id("qty"));
			qty.clear();
			qty.sendKeys(breatheNumSrting);
			 Thread.sleep(3000);
			 
			 WebElement Add_To_cart=driver.findElement(By.id("product-addtocart-button"));
			 Add_To_cart.click();
				
			Thread.sleep(5000);
		 
	 }
     else if(driver.getCurrentUrl().contains("argus")) {
    	 
    	 WebElement sizeBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
    		List<WebElement >sizes=sizeBox.findElements(By.tagName("div"));
    		int sizeIndex=rand.nextInt(0,sizes.size());
    		sizes.get(sizeIndex).click();
    		
    		Thread.sleep(3000);
    		WebElement colorBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
    		List<WebElement >colors=colorBox.findElements(By.tagName("div"));
    		int colorIndex=rand.nextInt(0,colors.size());
    		sizes.get(colorIndex).click();
    		
    		Thread.sleep(3000);
    		WebElement qty=driver.findElement(By.id("qty"));
    		qty.clear();
    		qty.sendKeys(argusNumString);
    		 Thread.sleep(3000);
    		 
    		 WebElement Add_To_cart=driver.findElement(By.id("product-addtocart-button"));
    		 Add_To_cart.click();
    			
    		Thread.sleep(5000);
		 
	 }
     else if(driver.getCurrentUrl().contains("hero")) {
    	 
    	 WebElement sizeBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
    		List<WebElement >sizes=sizeBox.findElements(By.tagName("div"));
    		int sizeIndex=rand.nextInt(0,sizes.size());
    		sizes.get(sizeIndex).click();
    		
    		Thread.sleep(3000);
    		WebElement colorBox=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
    		List<WebElement >colors=colorBox.findElements(By.tagName("div"));
    		int colorIndex=rand.nextInt(0,colors.size());
    		sizes.get(colorIndex).click();
    		
    		Thread.sleep(3000);
    		WebElement qty=driver.findElement(By.id("qty"));
    		qty.clear();
    		qty.sendKeys(heroNumString);
    		 Thread.sleep(3000);
    		 
    		 WebElement Add_To_cart=driver.findElement(By.id("product-addtocart-button"));
    		 Add_To_cart.click();
    			
    		Thread.sleep(5000);
	 
     }
		
     else if(driver.getCurrentUrl().contains("fusion")) {
    		
    		Thread.sleep(3000);
    		WebElement qty=driver.findElement(By.id("qty"));
    		qty.clear();
    		qty.sendKeys("1");
    		 Thread.sleep(3000);
    		 
    		 WebElement Add_To_cart=driver.findElement(By.id("product-addtocart-button"));
    		 Add_To_cart.click();
    			
    		Thread.sleep(5000);
	 
     }
		
     else if(driver.getCurrentUrl().contains("push")) {
    	 
    	
    		WebElement qty=driver.findElement(By.id("qty"));
    		qty.clear();
    		qty.sendKeys(fusionNumString);
    		 Thread.sleep(3000);
    		 
    		 WebElement Add_To_cart=driver.findElement(By.id("product-addtocart-button"));
    		 Add_To_cart.click();
    			
    		Thread.sleep(5000);
	 
     }
	}
	 
}

@Test(description="number 4" , priority = 4)
public void CheckOutProcess() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement box=driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]"));
	box.click();
	Thread.sleep(3000);
	WebElement checkout=driver.findElement(By.id("top-cart-btn-checkout"));
	checkout.click();
}

@Test(description="number 5" , priority = 5)
public void Shipping_Address() throws InterruptedException {
	driver.get(checkoutPage);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement country_id=driver.findElement(By.name("country_id"));
	WebElement state=driver.findElement(By.name("region_id"));
	Select select1=new Select(country_id);
	Select select2=new Select(state);
	
	WebElement comany=driver.findElement(By.name("company"));
	WebElement street=driver.findElement(By.name("street[0]"));
	WebElement street1=driver.findElement(By.name("street[1]"));
	WebElement street2=driver.findElement(By.name("street[2]"));
	WebElement city=driver.findElement(By.name("city"));
	WebElement code=driver.findElement(By.name("postcode"));
	WebElement phone=driver.findElement(By.xpath("//*[@id=\"BR7M21D\"]"));
	WebElement radio=driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input"));
	
	comany.sendKeys("alraya");
	street.sendKeys("bin malek");
	city.sendKeys("aman");
	code.sendKeys("1234");
	Thread.sleep(5000);
	select1.selectByIndex(EmailIndex);
	select2.selectByIndex(EmailIndex);
	Thread.sleep(5000);
	phone.sendKeys("96656123445");
	radio.click();
	Thread.sleep(10000);
	
	WebElement next=driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
	next.click();
	Thread.sleep(5000);
	
	
}


 @Test(description="number 6" , priority = 6)
 public void confirm_the_price() {
	 
	
	 
	 String priceRString=price1.replace("$", "").replace(".", "");
	 int priceRToInteger=Integer.parseInt(priceRString);
	 int res1=priceRToInteger/100;
	 System.out.println(res1);
	 
	 String priceBString=price2.replace("$", "").replace(".", "");
	 int priceBToInteger=Integer.parseInt(priceBString);
	 int res2=priceBToInteger/100;
	 System.out.println(res2);
	 
	 
	 String priceAString=price3.replace("$", "").replace(".", "");
	 int priceAToInteger=Integer.parseInt(priceAString);
	 int res3=priceAToInteger/100;
	 System.out.println(res3);
	 
	 
	 String priceHString=price4.replace("$", "").replace(".", "");
	 int priceHToInteger=Integer.parseInt(priceHString);
	 int res4=priceHToInteger/100;
	 System.out.println(res4);
	 
	 String priceFString=price5.replace("$", "").replace(".", "");
	 int priceFToInteger=Integer.parseInt(priceFString);
	 int res5=priceFToInteger/100;
	 System.out.println(res5);
	 
	 
	int Expected=(res1*radiantNum1)+(res2*breatheNum)+(res3*argusNum)+(res4*heroNum)+(res5*fusionNum);
	System.out.println("  ");
	System.out.println(Expected);
	driver.get(checkoutPageNext);
	String priceAll=driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td/strong/span")).getText().replace("$", "").replace(".", "");
	 int priceAllToInt=Integer.parseInt(priceAll);
	 int Acual=priceAllToInt/100;
	 System.out.println(Acual);
	 MyAssert.assertEquals(Acual, Expected);
	 
		 	 }
 }