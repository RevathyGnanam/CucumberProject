package seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class XpathObjects {



	WebDriver driver;
	public XpathObjects(WebDriver driver){

		this.driver = driver;
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	//Login scenarios
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement loginButton;

	@FindBy(xpath="(//input[@placeholder ='Enter registered email'])[1]")
	WebElement emailTextBox;

	@FindBy(xpath="//input[@type='password']")
	WebElement passwordTextBox;

	@FindBy(xpath="(//button[@class='button is-primary'])[1]")
	WebElement submitButton;  

	@FindBy(xpath="//button[text()='Forgotten password?']")
	WebElement forgotButton;
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	WebElement signoutButton;
	
	

	//-------------------------------------------------------------------------
	
	//Edit page scenarios
	@FindBy(xpath="//input[@id='fullName']")
	WebElement fullnameTextBox;
	
	@FindBy(xpath="//input[@id='join']")
	WebElement appendnameTextBox;
	
	@FindBy(xpath="//input[@id='getMe']")
	WebElement getnameTextBox;
	
	@FindBy(xpath="//input[@id='clearMe']")
	WebElement clearnameTextBox;
	
	@FindBy(xpath="//input[@id='noEdit']")
	WebElement noEditnameTextBox;
	
	@FindBy(xpath="//input[@id='dontwrite']")
	WebElement dontwritenameTextBox;
	
	//---------------------------------------------------------------
	
	//Alert page scenarios
	@FindBy(xpath="//button[@id='accept']")
	WebElement simpleAlert;
	
	@FindBy(xpath="//button[@id='prompt']")
	WebElement promptAlert;
	
   //--------------------------------------------------------------------
	@FindBy(xpath="//input[@name='fname']")
	WebElement firstnametextbox;
	
	@FindBy(xpath="//input[@name='lname']")
	WebElement lastnametextbox;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailtextbox;
	
	//---------------------------------------------------------
	//DragandDrop
	@FindBy(xpath="//div[@id='draggable']")
	WebElement dragtextbox;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement droptextbox;
	
	//findelements 
	
	@FindBy(id="APjFqb")
	WebElement googletextbox;

	//windowhandlings single tab
	@FindBy(id="home")
	WebElement hometextbox;
	
	//windowhandlings multiple tab
	@FindBy(id="multi")
	WebElement homemultitextbox;
	
	//webtable
	@FindBy(id="simpletable")
	WebElement simpletableBox;
	
	//welcome text mesg
	@FindBy(xpath="//div[contains(text(),' Welcome Revathy ')]")
	WebElement welcometextmessage;

	
	
}
