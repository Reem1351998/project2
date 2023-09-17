import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class parameter2 {

	//WebDriver driver =new EdgeDriver();
	WebDriver driver =new ChromeDriver();
	Assertion MyAssert = new   Assertion();
	Random rand=new Random();

	int radiantNum1=4;
	String radiantNum1String="4";
	int breatheNum=2;
	String breatheNumSrting="2";
	int argusNum=4;
	String argusNumString="4";
	int heroNum=1;
	String heroNumString="1";
	int fusionNum=5;
	String fusionNumString="5";
	
	String price1;
	String price2;
	String price3;
	String price4;
	String price5;
	
	 String TheWebSiteURL ="https://magento.softwaretestingboard.com/";
	 String create="https://magento.softwaretestingboard.com/customer/account/create/";
	 String loginPage="https://magento.softwaretestingboard.com/customer/account/login/";
	 String signOut="https://magento.softwaretestingboard.com/customer/account/logout/";
	 String checkoutPage="https://magento.softwaretestingboard.com/checkout/#shipping";
	 String checkoutPageNext="https://magento.softwaretestingboard.com/checkout/#payment";
	 String firstName[]= {"reem","dana","amal","hala","eman","sara","maha"};
	 String lastName[]= {"mohamed","hani","ahmed","basem","warrad","abdelwahab","baraa"};
	 String passwordLab="ReeeM@20172782";
	 String Emailuser="user";
	 String EmailComplete="@gamail.com";
	 String Emaillogin;
	 
	 int RandomIndex=rand.nextInt(0,7);
	 int EmailIndex=rand.nextInt(0,100);
	 
	 
	 
	 
	 
}
