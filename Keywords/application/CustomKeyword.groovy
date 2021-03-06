package application

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.text.SimpleDateFormat

import javax.imageio.ImageIO

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer

public class CustomKeyword {


	public static WebDriver driver = DriverFactory.getWebDriver();

	static FileWriter filewriter = new FileWriter("C:\\Users\\Dell\\Katalon Studio\\SampleTestProject\\TestData\\BrokenlinksWithStatus.txt");

	static BufferedWriter bw = new BufferedWriter(filewriter);

	/*@Keyword
	 public void getLogin(String userName, String password){
	 }*/

	@Keyword
	public static String randomPhoneNumberGenerator(){

		String phoneNo = null;

		String temp = RandomStringUtils.random(0, "12345678901234567890");

		String numbers = temp.substring(9, temp.length());

		phoneNo=9+numbers;

		println phoneNo;

		return phoneNo;
	}


	@Keyword
	public static String randomEmailIDGenerator(){

		String emailID = null;

		String tempemail =  RandomStringUtils.random(0,"abcdefghijklmnopqrstuvwxyz")

		String email = tempemail.substring(12, tempemail.length());

		return email+"@yopmail.com"
	}

	@Keyword
	public static String getTitle(){

		return driver.getTitle();
	}

	@Keyword
	public static List<WebElement> findElements(TestObject testObject){

		return WebUiCommonHelper.findWebElements(testObject, 20);
	}

	@Keyword
	public static WebElement findElement(TestObject testObject){

		return WebUiCommonHelper.findWebElement(testObject, 20);
	}



	@Keyword
	public static void takeScreenShot(){

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleformat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Screenshot screen =new AShot().takeScreenshot(driver);
		ImageIO.write(screen.getImage(), "PNG", new File("C:\\Users\\Dell\\Katalon Studio\\SampleTestProject\\ScreenShots\\"+simpleformat.format(calendar.getTime())));

		/*ImageDiffer imagediffer = new ImageDiffer();
		 ImageDiff imagediff = imagediffer.makeDiff(screen, screen)*/
	}




	@Keyword
	public static void isBrokenLinkchecker(URL url){

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();




		KeywordLogger log = new KeywordLogger();

		String message = null;

		Thread.sleep(300);

		try{
			//File file = new File("C:\\Users\\Dell\\Katalon Studio\\SampleTestProject\\TestData\\BrokenlinksWithStatus.txt");



			conn.connect();

			message = conn.getResponseMessage();
			println "--------------------------------------------------------------------------"
			println "The URL is : "+url+ " and the message is : "+message+" Status Code is : "+conn.getResponseCode();
			log.logInfo("The URL is : "+url+ " and the message is : "+message+" Status Code is : "+conn.getResponseCode());
			bw.write("The URL is : "+url+ " and the message is : "+message+" Status Code is : "+conn.getResponseCode());
			bw.newLine();
			bw.flush();


			println "--------------------------------------------------------------------------"
			conn.disconnect();
		}
		catch(Exception e){

			println e.getMessage();
		}

		bw.close();
	}
}
