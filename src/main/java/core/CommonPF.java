package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPF {

	static WebDriver driver;

	public static void open(String url) {
		
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		
		PageFactory.initElements(driver, CommonPF.class);
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
	
	public static void quite() {
		driver.quit();
	}
	
    public static boolean isPresentPF(WebElement element) {
//    	if (element.getTagName() != null) return true; else return false;
        try {element.getTagName(); return true;}
        		catch (NoSuchElementException e) {return false;}
    }
    
    public static boolean isVisiblePF(WebElement element) {
    	if (element.getTagName() != null && element.isDisplayed()) return true; else return false;
//        try {element.getTagName(); return true;}
//        		catch (NoSuchElementException e) {return false;}
        }


public static void pageValidationPF(String test_case, WebElement element) {
	System.out.println(test_case +	(isPresentPF(element) ? "Exists" : "Not exist")); 
	System.out.println(test_case +	(isVisiblePF(element) ? "Visible" : "Not visible"));
}
										
	@FindBy(id="id_quotes") @CacheLookup static WebElement pf_el_01;						// signup
	
	@FindBy(id="id_current_location") @CacheLookup static WebElement pf_el_02;				// signup
	@FindBy(id="id_weather_icon") @CacheLookup static WebElement pf_el_03;					// signup
	@FindBy(id="id_temperature") @CacheLookup static WebElement pf_el_04;					// signup
	@FindBy(id="id_f_title") @CacheLookup static WebElement pf_el_05;						// signup & confirmation

	@FindBy(id="id_f_label_fn") @CacheLookup static WebElement pf_el_06; 					// signup & confirmation
	
	@FindBy(id="id_fname") @CacheLookup static WebElement pf_el_07;							// signup & confirmation
					
	@FindBy(id="id_f_label_ln") @CacheLookup static WebElement pf_el_08;					// signup & confirmation
	@FindBy(id="id_lname") @CacheLookup static WebElement pf_el_09;							// signup & confirmation

	@FindBy(id="id_f_label_ea") @CacheLookup static WebElement pf_el_10;					// signup & confirmation
	@FindBy(id="id_email") @CacheLookup static WebElement pf_el_11;							// signup & confirmation

	@FindBy(id="id_f_label_pn") @CacheLookup static WebElement pf_el_12;					// signup & confirmation
	@FindBy(id="id_phone") @CacheLookup static WebElement pf_el_13;							// signup & confirmation

	@FindBy(id="id_rb_label_g") @CacheLookup static WebElement pf_el_14;					// signup & confirmation

	@FindBy(id="id_rb_label_m") @CacheLookup static WebElement pf_el_15;					// signup
	@FindBy(id="id_gender_male") @CacheLookup static WebElement pf_el_16;					// signup

	@FindBy(id="id_rb_label_f") @CacheLookup static WebElement pf_el_17;					// signup
	@FindBy(id="id_gender_female") @CacheLookup static WebElement pf_el_18;					// signup

	@FindBy(id="id_f_label_s") @CacheLookup static WebElement pf_el_19;						// signup & confirmation
	@FindBy(id="id_state") @CacheLookup static WebElement pf_el_20;							// signup & confirmation
	@FindBy(xpath="//*[@id='id_state']/option[6]") @CacheLookup static WebElement pf_el_21;	// signup

	@FindBy(id="id_cb_label_t") @CacheLookup static WebElement pf_el_22;					// signup & confirmation
	@FindBy(id="id_terms") @CacheLookup static WebElement pf_el_23;							// signup & confirmation

	@FindBy(id="id_img_facebook") @CacheLookup static WebElement pf_el_24;					// signup
	@FindBy(id="id_img_twitter") @CacheLookup static WebElement pf_el_25;					// signup
	@FindBy(id="id_img_flickr") @CacheLookup static WebElement pf_el_26;					// signup
	@FindBy(id="id_img_youtube") @CacheLookup static WebElement pf_el_27;					// signup

	@FindBy(id="id_reset_button") @CacheLookup static WebElement pf_el_28;					// signup
	@FindBy(id="id_submit_button") @CacheLookup static WebElement pf_el_29;					// signup

	@FindBy(id="timestamp") @CacheLookup static WebElement pf_el_30;						// signup
	@FindBy(id="copyright") @CacheLookup static WebElement pf_el_31;						// signup & confirmation
	@FindBy(id="os_browser") @CacheLookup static WebElement pf_el_32;						// signup

	@FindBy(id="ErrorLine") @CacheLookup static WebElement pf_el_33;						// signup
	@FindBy(id="fname_error") @CacheLookup static WebElement pf_el_34;						// signup
	@FindBy(id="lname_error") @CacheLookup static WebElement pf_el_35;						// signup
	@FindBy(id="email_error") @CacheLookup static WebElement pf_el_36;						// signup
	@FindBy(id="phone_error") @CacheLookup static WebElement pf_el_37;						// signup
	
	@FindBy(xpath="//*[@id='fname_error']/img") @CacheLookup static WebElement pf_el_38;	// signup
	@FindBy(xpath="//*[@id='lname_error']/img") @CacheLookup static WebElement pf_el_39;	// signup
	@FindBy(xpath="//*[@id='email_error']/img") @CacheLookup static WebElement pf_el_40;	// signup
	@FindBy(xpath="//*[@id='phone_error']/img") @CacheLookup static WebElement pf_el_41;	// signup
	
	@FindBy(id="id_gender") @CacheLookup static WebElement pf_el_42;						//confirmation
	@FindBy(id="id_back_button") @CacheLookup static WebElement pf_el_43;					//confirmation
	
}
