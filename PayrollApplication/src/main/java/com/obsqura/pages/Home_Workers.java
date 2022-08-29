package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Workers {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Workers']")
	private WebElement workerspage;
	
	@FindBy(name="WorkerSearch[first_name]")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='workersearch-last_name']")
	private WebElement lastname;
	
	@FindBy(name="WorkerSearch[postcode]")
	private WebElement postcode;
	
	@FindBy(name="WorkerSearch[ni_number]")
	private WebElement ni_number;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//h1[text()='Workers']")
	private WebElement workerTextHeading;
	
	@FindBy(xpath="//button[text='Reset']")
	private WebElement resetbuttonworker;
	
	@FindBy(xpath="//a[text()='Create Worker']")
	private WebElement createworkerbtn;
	
	@FindBy(xpath="//input[@name='Worker[first_name]']")
	private WebElement workerfirstname;
	
	@FindBy(xpath="//input[@name='worker-middle_name']")
	private WebElement workermiddlename;
	
	@FindBy(xpath="//input[@name='Worker[last_name]']")
	private WebElement workerlastname;
	
	@FindBy(xpath="//input[@id='worker-address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='worker-postcode']")
	private WebElement postcodecreateworker;
	
	@FindBy(xpath="//input[@id='worker-dob']")
	private WebElement dateofbirth;
	
	@FindBy(xpath="//input[@id='worker-phone']")
	private WebElement workerphone;
	
	@FindBy(xpath="//input[@name='Worker[ni_number]']")
	private WebElement ninumber1;
	
	@FindBy(xpath="//input[@id='worker-email']")
	private WebElement workerEmail;
	
	@FindBy(id="worker-country")
	private WebElement workercountry;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement workernextbtn;
	
	@FindBy(xpath="//a[text()='Bank Details']")
	private WebElement bankdetailsbtn;
	
	
	@FindBy(name="Worker[start_date]")
	private WebElement bankstartdate;
	
	@FindBy(id="worker-roll_no")
	private WebElement rollno;
	
	@FindBy(name="Worker[ac_name]")
	private WebElement accountname;
	
	@FindBy(name="Worker[bank_name]")
	private WebElement bankname;
	
	@FindBy(name="Worker[ac_no]")
	private WebElement accountno;
	
	@FindBy(name="Worker[sort_code]")
	private WebElement Sortcode;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveButton1;
	
	@FindBy(xpath="//select[@name='Worker[gender]']")
	private WebElement workergender;
	
	@FindBy(name="Worker[branch_id]")
	private WebElement workerbranch;
	
	@FindBy(id="worker-division_id")
	private WebElement workerdivision;
	
	@FindBy(id="worker-employment_type")
	private WebElement employmenttype;
	
	@FindBy(xpath="//*[@id='worker-payslip_method']")
	private WebElement payslipmethod;
	
	@FindBy(xpath="//select[@name='Worker[payment_method]']")
	private WebElement workerpaymentmethod;
	
	@FindBy(id="worker-ac_type")
	private WebElement accounttype;
	
	public Home_Workers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void workersPage()
	{
		workerspage.click();
	}
	public String workersPageHeading()
	{
		return workerspage.getText();
	}
	public void firstNameField(String firstName)
	{
		firstname.sendKeys(firstName);
	}
	public void lastNameField(String lastName)
	{
		lastname.sendKeys(lastName);
	}
	public void postCode(String Postcode)
	{
		postcode.sendKeys(Postcode);
	}
	public void postCode1(String Postcode)
	{
		postcodecreateworker.sendKeys(Postcode);
	}
	public void niNumber(String ninumber)
	{
		ni_number.sendKeys(ninumber);
	}
	public void searchButton()
	{
		searchbutton.click();
	}
	public String workerText()
	{
		return workerTextHeading.getText();
	}
	public void resetButtonWorker()
		{
			resetbuttonworker.click();
		}
	
	public void createWorkerbtn()
	{
		createworkerbtn.click();
	}
	public void firstNameWorker(String firstnme)
	{
		workerfirstname.sendKeys(firstnme);
	}
	public void middleNameWorker(String middlename)
	{
		workermiddlename.sendKeys(middlename);
	}
	public void lastNameWorker(String lastname)
	{
		workerlastname.sendKeys(lastname);
	}
	public void addressWorker(String address)
	{
		address1.sendKeys(address);
	}
	public void dateOBirth(String date)
	{
		dateofbirth.sendKeys(date);
	}
	public void workerPhone(String phoneno)
	{
		workerphone.sendKeys(phoneno);
	}
	public void ninumber2(String nino2)
	{
		ninumber1.sendKeys(nino2);
	}
	public void workeremail(String workermail)
	{
		workerEmail.sendKeys(workermail);
	}
	public void workercountry1(String Workercountry)
	{
		workercountry.clear();
		workercountry.sendKeys(Workercountry);
	}
	public void workerNextBtn()
	{
		workernextbtn.click();
	}
	public void BankDetailsBtn()
	{
		bankdetailsbtn.click();
	}
	public void bankStartDate(String date1)
	{
		bankstartdate.clear();
		bankstartdate.sendKeys(date1);
	}
	public void rollNo(String roll)
	{
		rollno.sendKeys(roll);
	}
	public void accountName(String acname)
	{
		accountname.sendKeys(acname);
	}
	public void bankName(String bnkname)
	{
		bankname.sendKeys(bnkname);
	}
	public void accountNo(String Accountno)
	{
		accountno.sendKeys(Accountno);
	}
	public void sortCode(String sortcode)
	{
		Sortcode.sendKeys(sortcode);
	}
	public void savebtn12()
	{
		SaveButton1.click();
	}
	/*public void dropDown6(String value6)
	{
		Select dropdownselect7=new Select(workertitle);
		dropdownselect7.selectByValue(value6);
	}*/
	public void dropDown7(String value7)
	{
		Select dropdownselect8=new Select(workergender);
		dropdownselect8.selectByValue(value7);
	}
	public void dropDown8(String value8)
	{
		Select dropdownselect9=new Select(workerbranch);
		dropdownselect9.selectByVisibleText(value8);
	}
	public void dropDown9(String value9)
	{
		Select dropdownselect10=new Select(workerdivision);
		dropdownselect10.selectByValue(value9);
	}
	public void dropDown10(String value10)
	{
		Select dropdownselect11=new Select(employmenttype);
		dropdownselect11.selectByValue(value10);
	}
	public void dropDown12(String value11)
	{
		Select dropdownselect12=new Select(payslipmethod);
		dropdownselect12.selectByValue(value11);
	}
	public void dropDown13(String value12)
	{
		Select dropdownselect13=new Select(workerpaymentmethod);
		dropdownselect13.selectByVisibleText(value12);
	}
	public void dropDown14(String value13)
	{
		Select dropdownselect14=new Select(accounttype);
		dropdownselect14.selectByValue(value13);
	}
	

}
