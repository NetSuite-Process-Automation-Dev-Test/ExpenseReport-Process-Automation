package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.util.TestBase;

public class expenseReportFunctions extends TestBase {
	@FindBy(xpath = "//div[@class='descr']")
	WebElement expense_confirm;
	@FindBy(xpath = "//input[@id='rate_formattedValue']")
	WebElement rates;
	@FindBy(xpath = "//input[@id='quantity_formattedValue']")
	WebElement quantitys;
	@FindBy(xpath = "//li[@data-title='Transactions']")
	WebElement Transactions;
	@FindBy(linkText = "Employees")
	WebElement Employees;
	@FindBy(linkText = "Enter Expense Reports")
	WebElement enter_expense_report;
	@FindBy(xpath = "//input[@name='inpt_customform']")
	WebElement form_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> form_list;
	@FindBy(xpath = "//img[@id='inpt_entity2_arrow']")
	WebElement employee_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> employee_list;
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Category']//preceding-sibling::td)+1]")
	List<WebElement> category_click;
	@FindBy(xpath = "//img[@id='inpt_category6_arrow']")
	WebElement category_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> category_select;
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Currency']//preceding-sibling::td)+1]")
	List<WebElement> currency_click;
	@FindBy(xpath = "//img[@id='inpt_currency7_arrow']")
	WebElement currency_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> currency_list;
	@FindBy(xpath = "//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//div[text()='Amount']//parent::td//preceding-sibling::*)+1]")
	List<WebElement> amount_click;
	@FindBy(xpath = "//input[@id='amount_formattedValue']")
	WebElement amount;
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement submit;
	@FindBy(xpath = "//td[@id='tdbody_approve']")
	WebElement approve;
	@FindBy(xpath = "//td[@id='tdbody_payment']")
	WebElement payment;
	@FindBy(xpath = "//div[@class='uir-record-id']")
	WebElement expense_id;
	@FindBy(xpath = "//div[@class='uir-record-status']")
	WebElement expense_status;
	@FindBy(xpath = "//div[@class='uir-record-id']")
	WebElement approve_id;
	@FindBy(xpath = "//div[@class='uir-record-status']")
	WebElement approve_status;
	@FindBy(xpath = "//img[@id='inpt_approvalstatus6_arrow']")
	WebElement approval_arrow1;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> approval_list1;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement submit_expense_payment;
	@FindBy(xpath = "//div[@class='uir-record-id']")
	WebElement expense_payment_id;
	@FindBy(xpath = "//div[@class='uir-record-status']")
	WebElement expense_payment_status;
	@FindBy(xpath = "//input[@id='accountingapproval_fs_inp']//following-sibling::img")
	WebElement accounting_approval;
	@FindBy(xpath = "//input[@id='memo']")
	WebElement before_memo;
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Memo']//preceding-sibling::td)+1]")
	List<WebElement> memo_line_click;
	@FindBy(xpath = "//span[@id='expense_memo_fs']//input")
	WebElement memo_line;
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Department']//preceding-sibling::td)+1]")
	WebElement department_click;
	@FindBy(xpath = "//img[@id='inpt_department8_arrow']")
	WebElement department_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> department_list;
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Location']//preceding-sibling::td)+1]")
	List<WebElement> location_click;
	@FindBy(xpath = "//span[@id='expense_location_fs']//following-sibling::img")
	WebElement location_arrow;
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Class']//preceding-sibling::td)+1]")
	List<WebElement> class_click;
	@FindBy(xpath = "//span[@id='expense_class_fs']//following-sibling::img")
	WebElement class_arrow;
	@FindBy(xpath = "//span[@id='memo_fs_lbl_uir_label']//following-sibling::span")
	WebElement memo_after;
	@FindBy(xpath = "//span[@id='custbodyadvance_reimburse_fs_lbl_uir_label']//following-sibling::span")
	WebElement advance_reimbusure;
	@FindBy(xpath = "//span[@id='amount_fs_lbl_uir_label']//following-sibling::span")
	WebElement total_reimbursement_amount;
	@FindBy(xpath = "//input[@id='advance_formattedValue']")
	WebElement advance_enter;
	@FindBy(xpath = "//input[@id='expense_addedit']")
	WebElement ok_button;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> disabled_dropdown;
	
	@FindBy(xpath = "//input[@id='expense_copy']")
	WebElement expense_copy;
	
	@FindBy(xpath = "//input[@id='expense_remove']")
	WebElement expense_remove;
	
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement expense_save_first;
	
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Rate']//preceding-sibling::td)+1]")
	List<WebElement> rate_click;
	
	@FindBy(xpath = "//table[@id='expense_splits']//tbody//tr[@id='expense_headerrow']//following-sibling::tr//td[count(//td[@data-label='Quantity']//preceding-sibling::td)+1]")
	List<WebElement> quantity_click;
	
	@FindBy(xpath = "//td[@id='SCREENlnk']")
	WebElement screen_fields_tab;
	
	@FindBy(xpath = "//span[@id='class_fs_lbl_uir_label']//label")
	WebElement class_mandatory;
	
	@FindBy(xpath = "//span[@id='location_fs_lbl']//label")
	WebElement location_mandatory;
	
	@FindBy(xpath = "//input[@name='inpt_department']")
	WebElement department_disable;
	
	

	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 100);

	public expenseReportFunctions() {
		PageFactory.initElements(driver, this);
	}

	public void navigate_To_Expense_Report(String form_name) throws InterruptedException {
		Actions action = new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Transactions));
		action.moveToElement(Transactions).build().perform();
		action.moveToElement(Employees).build().perform();
		enter_expense_report.click();
		if(isAlertPresent_()==true)
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		select_form(form_name);
	}

	public boolean isAlertPresent_() {
		try {
			Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
			if (a != null) {
				System.out.println("Alert is present");
				return true;
			} else {
				throw new Throwable();
			}
		} catch (Throwable e) {
			System.err.println("Alert isn't present!!");
			return false;
		}

	}
	
	public void payment(ExtentTest test, ExtentReports report) throws InterruptedException {
		test = report.createTest("Creating Bill Payment");
		payment.click();
		Thread.sleep(5000);
		submit_expense_payment.click();
		System.out.println("Payment" + " " + "" + expense_payment_id.getText() + " " + "is successfully created ");
		if (expense_confirm.getText().trim().equals("Transaction successfully Saved")) {
			test.pass("Payment" + " " + "" + expense_payment_id.getText() + " " + "is successfully created ");
		} else {
			test.fail("Payment is not created");
		}

	}

	public void expense_report_creation(String employeename, String amount2, String currency, String category,String quantity, String rate, String testcase, String department, String class1,	String location, String memo, String advance_to_apply,ExtentTest test,ExtentReports report) throws InterruptedException
	{
		ExtentTest test2=test.createNode("Expense Report for employee: " +employeename);
		String[] two_category = new String[2];
		for (int i = 0; i < two_category.length; i++) {
			two_category = category.split(",");
		}
		String[] two_currency = new String[2];
		for (int i = 0; i < two_currency.length; i++) {
			two_currency = currency.split(",");
		}
		String[] two_quantity = new String[2];
		for (int i = 0; i < two_quantity.length; i++) {
			two_quantity = quantity.split(",");
		}
		String[] two_rate = new String[2];
		for (int i = 0; i < two_rate.length; i++) {
			two_rate = rate.split(",");
		}
		String[] two_dept = new String[2];
		for (int i = 0; i < two_dept.length; i++) {
			two_dept = department.split(",");
		}
		String[] two_class = new String[2];
		for (int i = 0; i < two_class.length; i++) {
			two_class = class1.split(",");
		}
		String[] two_location = new String[2];
		for (int i = 0; i < two_location.length; i++) {
			two_location = location.split(",");
		}
		String[] two_memo = new String[2];
		for (int i = 0; i < two_memo.length; i++) {
			two_memo = memo.split(",");
		}
				boolean emp_flag=false;
				boolean category_flag=false;
				boolean currency_flag=false;
				boolean class_flag=false;
				boolean location_flag=false;
				boolean department_flag=false;
				navigate_To_Expense_Report("Standard Expense Report");
//				Thread.sleep(5000);
//				form_arrow.click();
//				form_list.get(1).click();
				employee_arrow.click();
				for (int j = 0; j < employee_list.size(); j++)
				{
					WebElement emp = employee_list.get(j);
					String text=emp.getText();
					if (emp.getText().equals(employeename.trim()))
					{
						emp.click();
						emp_flag=true;
						break;
						
					}
				}
				if(emp_flag)
				{
					accounting_approval.click();
					before_memo.click();
					String before_memo_value = before_memo.getAttribute("value");
					advance_enter.click();
					Actions action = new Actions(driver);
					action.doubleClick(advance_enter).build().perform();
					action.sendKeys(Keys.SPACE).build().perform();
					advance_enter.sendKeys(advance_to_apply.trim());
					JavascriptExecutor jsx = (JavascriptExecutor) driver;
					jsx.executeScript("window.scrollBy(0,1000)", "");
					Thread.sleep(5000);
					for (int k = 0; k < 2; k++) 
					{
						category_click.get(k).click();
						category_arrow.click();
						for (int i = 0; i < category_select.size(); i++) 
						{
							WebElement cat = category_select.get(i);
							if (cat.getText().equals(two_category[k].trim())) 
							{
								cat.click();
								category_flag=true;
								break;
							}
						
						}
					if(!category_flag)
					{
						test2.fail(two_category[k]+" category is not present in the list... Please provide category from the list");
						System.out.println( two_category[k]+" Category is not present in the list");
						break;
					}
					Thread.sleep(3000);
					action.sendKeys(Keys.TAB).build().perform();
					quantitys.sendKeys(two_quantity[k]);
					action.sendKeys(Keys.TAB).build().perform();
					rates.sendKeys(two_rate[k]);
					Thread.sleep(3000);
					action.sendKeys(Keys.TAB).build().perform();
					currency_arrow.click();
					for (int i = 0; i < currency_list.size(); i++) {
						WebElement cur = currency_list.get(i);
						if (cur.getText().equals(two_currency[k].trim())) {
							cur.click();
							currency_flag=true;
							break;
						}
					}
					if(!currency_flag)
					{
						test2.fail(two_currency[k]+" Currency is not present in the list .... Please provide Currency value from the list");
						System.out.println(two_currency[k]+" Currency is not present in the list");
						break;
					}
					Thread.sleep(4000);
					action.sendKeys(Keys.TAB).build().perform();
					action.sendKeys(Keys.TAB).build().perform();
					Thread.sleep(2000);
					amount.clear();
					int amount_f=Integer.parseInt(two_rate[k])*Integer.parseInt(two_quantity[k]);
					amount.sendKeys(String.valueOf(amount_f));
					action.sendKeys(Keys.TAB).build().perform();
					memo_line.sendKeys(two_memo[k].trim());
					Thread.sleep(3000);
					action.sendKeys(Keys.TAB).build().perform();
					department_arrow.click();
					for (int i = 0; i < department_list.size(); i++) {
						if (department_list.get(i).getText().trim().equals(two_dept[k].trim())) {
							department_list.get(i).click();
							department_flag=true;
							break;
						}
					}
					if(!department_flag)
					{
						test2.fail(two_dept[k]+" Department is not present in the list...Please Provide department value from the list");
						System.out.println(two_dept[k]+" department is not present in the list");
						break;
					}
					class_click.get(k).click();
					class_arrow.click();
					for (int i = 0; i < department_list.size(); i++) {
						if (department_list.get(i).getText().equals(two_class[k].trim())) {
							department_list.get(i).click();
							class_flag=true;
							break;
						}
					}
					if(!class_flag)
					{
						test2.fail(two_class[k]+" Class is not present in the list ...Please provide class value from the list");
						System.out.println(two_class[k]+ " class value is not present in the list");
						break;
					}
					location_click.get(k).click();
					location_arrow.click();
					for (int i = 0; i < department_list.size(); i++) {
						if (department_list.get(i).getText().equals(two_location[k].trim())) {
							department_list.get(i).click();
							location_flag=true;
							break;
						}
					}
					if(!location_flag)
					{
						test2.fail(two_location[k]+" Location is not present in the list .... Please provide Location Value from the list");
						System.out.println(two_location[k]+" location is not present in the list");
						break;
					}
					Thread.sleep(5000);
					if (k == 1)
						break;
					action.moveToElement(ok_button).build().perform();
					ok_button.click();
					
					
				}
					if(category_flag==true && currency_flag==true&& location_flag==true&&class_flag==true&&department_flag==true )
					{
					Thread.sleep(2000);
					action.moveToElement(submit).build().perform();
					submit.click();
					System.out.println("Expense report" + " " + "" + expense_id.getText() + " " + "is successfully created with"
							+ " " + expense_status.getText() + " " + "status");
					test2.pass("Expense report" + " " + "" + expense_id.getText() + " " + "is successfully created with"
							+ " " + expense_status.getText() + " " + "status");
					payment(test, report);
					}
					else
					{
						test2.fail("Expense Report is not created");
						System.out.println("Expense report is not created");
					}
				}
				else	
				{
					test2.fail("Expense Report is not created");
					test2.fail(employeename+" Employee is not present in the list...Please select employee value from the list");
					System.out.println("employee is not presnet in the list");
				}
			
		}
		public void general_info(String employeename, String amount2, String currency, String category, String quantity, String rate, String testcase, String department, String class1, String location, String memo, String advance_to_apply) throws InterruptedException
		{
			navigate_To_Expense_Report("Standard Expense Report");
			Thread.sleep(5000);
			employee_arrow.click();
			for (int j = 0; j < employee_list.size(); j++)
			{
				WebElement emp = employee_list.get(j);
				String text=emp.getText();
				if (emp.getText().equals(employeename.trim()))
				{
					emp.click();
					break;
					
				}
			}
			accounting_approval.click();
			before_memo.click();
			String before_memo_value = before_memo.getAttribute("value");
			advance_enter.click();
			Actions action = new Actions(driver);
			action.doubleClick(advance_enter).build().perform();
			action.sendKeys(Keys.SPACE).build().perform();
			advance_enter.sendKeys(advance_to_apply.trim());
			JavascriptExecutor jsx = (JavascriptExecutor) driver;
			jsx.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(5000);
			
				category_click.get(0).click();
				category_arrow.click();
				for (int i = 0; i < category_select.size(); i++) 
				{
					WebElement cat = category_select.get(i);
					if (cat.getText().equals(category.trim())) 
					{
						cat.click();
						break;
					}
				
				}
			Thread.sleep(5000);
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(3000);
			quantitys.sendKeys(quantity);
			action.sendKeys(Keys.TAB).build().perform();
			rates.sendKeys(rate);
			Thread.sleep(3000);
			action.sendKeys(Keys.TAB).build().perform();
			currency_arrow.click();
			for (int i = 0; i < currency_list.size(); i++) {
				WebElement cur = currency_list.get(i);
				if (cur.getText().equals(currency.trim())) {
					cur.click();
					break;
				}
			}
			Thread.sleep(4000);
			action.sendKeys(Keys.TAB).build().perform();
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(2000);
			amount.clear();
			int amount_f=Integer.parseInt(rate)*Integer.parseInt(quantity);
			amount.sendKeys(String.valueOf(amount_f));
			action.sendKeys(Keys.TAB).build().perform();
			memo_line.sendKeys(memo.trim());
			Thread.sleep(3000);
			action.sendKeys(Keys.TAB).build().perform();
			department_arrow.click();
			for (int i = 0; i < department_list.size(); i++) {
				if (department_list.get(i).getText().trim().equals(department.trim())) {
					department_list.get(i).click();
					break;
				}
			}
			class_click.get(0).click();
			class_arrow.click();
			for (int i = 0; i < department_list.size(); i++) {
				if (department_list.get(i).getText().equals(class1.trim())) {
					department_list.get(i).click();
					break;
				}
			}
			location_click.get(0).click();
			location_arrow.click();
			for (int i = 0; i < department_list.size(); i++) {
				if (department_list.get(i).getText().equals(location.trim())) {
					department_list.get(i).click();
					break;
				}
			}
			Thread.sleep(5000);
			action.moveToElement(ok_button).build().perform();
			ok_button.click();
			
	}
	public void make_copy(String memo, String currency, String category, String quantity, String rate, String department, String class1, String location,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='expense_splits']//td[contains(text(),'"+memo+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		parentTr.click();
		Thread.sleep(5000);
		expense_copy.click();
		Thread.sleep(5000);
		ok_button.click();
		String memo_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+memo+"')]")).getText();
		String currency_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+currency+"')]")).getText();
		String category_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+category+"')]")).getText();
//		String quantity_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+quantity+"')]")).getText();
//		String rate_vaalue=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+rate+"')]")).getText();
		String dep_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+department+"')]")).getText();
		String class_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+class1+"')]")).getText();
		String loc_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+location+"')]")).getText();

			
		if(memo_name.equals(memo)&&currency_name.equals(currency)&&category_name.equals(category)&&dep_name.equals(department)&&class_name.equals(class1)&&loc_name.equals(location))
		{
			test.pass("Make a copy is working");
			System.out.println("Make a copy is working");
		}
		else
		{
			test.fail("Make a copy is not working");
			System.out.println("Make a copy is not working");
		}	
		
	}

	public void copy_previous(String memo, String currency, String category, String quantity, String rate, String department, String class1, String location, ExtentTest test) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='expense_splits']//td[contains(text(),'"+memo+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		Thread.sleep(3000);
		expense_copy.click();
		Thread.sleep(5000);
		ok_button.click();
		String memo_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+memo+"')]")).getText();
		String currency_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+currency+"')]")).getText();
		String category_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+category+"')]")).getText();
//		String quantity_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+quantity+"')]")).getText();
//		String rate_vaalue=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+rate+"')]")).getText();
		String dep_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+department+"')]")).getText();
		String class_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+class1+"')]")).getText();
		String loc_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'expense_row_')]//td[contains(text(),'"+location+"')]")).getText();
		if(memo_name.equals(memo)&&currency_name.equals(currency)&&category_name.equals(category)&&dep_name.equals(department)&&class_name.equals(class1)&&loc_name.equals(location))
		{
			test.pass("Copy Previous Functionality is working");
			System.out.println("Copy previous is working");
		}
		else
		{
			test.fail("Copy Previous Functionality is not working");
			System.out.println("Copy previous is not working");
		}	
	}

	public void remove(String memo, ExtentTest test) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='expense_splits']//td[contains(text(),'"+memo+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		Thread.sleep(5000);
		parentTr.click();
		Thread.sleep(5000);
		expense_remove.click();
		Thread.sleep(2000);
		try
		{
		String item_name1=driver.findElement(By.xpath("//tr[@id='"+rowId+"' ]//td[contains(text(),'"+memo+"')]")).getText();
		test.fail("Expense is not removed ");
		}
		catch(Exception e)
		{
			test.pass("Expense is removed successfully");
		}
		
	}

	public void insert(String amount2, String currency, String category, String quantity, String rate, String testcase, String department, String class1, String location, String memo, String advance_to_apply, ExtentTest test) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='expense_splits']//td[contains(text(),'"+memo+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		Thread.sleep(5000);
		parentTr.click();
		Thread.sleep(5000);
	 	js.executeScript("window.scrollBy(0,150)", "");
	 	Thread.sleep(5000);
	 	driver.findElement(By.xpath("//input[@id='expense_insert']")).click();
	 	Thread.sleep(2000);
		WebElement lineItem2 = driver.findElement(By.xpath("//table[@id='expense_splits']//td[contains(text(),'"+memo+"')]"));
		WebElement parentTr1 = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem2);
		String rowId1 = parentTr1.getAttribute("id");
		driver.findElement(By.xpath("//tr[@id='"+rowId1+"']//preceding-sibling::tr[contains(@id,'expense_row_')]//td[count(//td[@data-label='Quantity']//preceding-sibling::td)]")).click();
		category_arrow.click();
		for (int i = 0; i < category_select.size(); i++) 
		{
			WebElement cat = category_select.get(i);
			if (cat.getText().equals(category.trim())) 
			{
				cat.click();
				break;
			}
		
		}
		Thread.sleep(3000);
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).build().perform();
		quantitys.sendKeys(quantity);
		action.sendKeys(Keys.TAB).build().perform();
		rates.sendKeys(rate);
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).build().perform();
		currency_arrow.click();
		for (int i = 0; i < currency_list.size(); i++) {
			WebElement cur = currency_list.get(i);
			if (cur.getText().equals(currency.trim())) {
				cur.click();
				break;
			}
		}
		Thread.sleep(4000);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		amount.clear();
		int amount_f=Integer.parseInt(rate)*Integer.parseInt(quantity);
		amount.sendKeys(String.valueOf(amount_f));
		action.sendKeys(Keys.TAB).build().perform();
		memo_line.sendKeys("Second Memo");
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).build().perform();
		department_arrow.click();
		for (int i = 0; i < department_list.size(); i++) {
			if (department_list.get(i).getText().trim().equals(department.trim())) {
				department_list.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//tr[@id='expense_row_2']//preceding-sibling::tr[contains(@id,'expense_row_')]//td[count(//td[@data-label='Location']//preceding-sibling::td)]")).click();
		class_arrow.click();
		for (int i = 0; i < department_list.size(); i++) {
			if (department_list.get(i).getText().equals(class1.trim())) {
				department_list.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//tr[@id='expense_row_2']//preceding-sibling::tr[contains(@id,'expense_row_')]//td[count(//td[@data-label='Customer']//preceding-sibling::td)]")).click();
		location_arrow.click();
		for (int i = 0; i < department_list.size(); i++) {
			if (department_list.get(i).getText().equals(location.trim())) {
				department_list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		action.moveToElement(ok_button).build().perform();
		ok_button.click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//tr[@id='expense_row_2']//preceding-sibling::tr[contains(@id,'expense_row_')]//td[count(//td[@data-label='Department']//preceding-sibling::td)]")).getText().trim().equals("Second Memo"))
		{
			test.pass("Insert Functionality is working");
	
		}
		else
		{
			test.fail("Insert Functionality is not working");
		}
		
		
	 	
	}
	public void select_form(String form_name) throws InterruptedException
	{
		form_arrow.click();
		Thread.sleep(3000);
		for(int i=0;i<form_list.size();i++)
		{
			if(form_list.get(i).getText().trim().equals(form_name))
			{
				form_list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		
	}
	public void form_test(String[] field, String[] mandatory, String[] show, String[] display_type,ExtentTest test ) throws InterruptedException
	{
		driver.navigate().to("https://tstdrv939178.app.netsuite.com/app/common/custom/custform.nl?id=138&nl=F&ft=TRANSACTION&tt=ExpRept&ol=F&e=T");
		String form_name=driver.findElement(By.xpath("//input[@id='formname']")).getAttribute("value").trim();
		screen_fields_tab.click();
		String class_text=null;
		Thread.sleep(2000);
		Thread.sleep(3000);
		
		for(int i=0;i<show.length;i++)
		{
			String row=driver.findElement(By.xpath("//table[@id='mainflds_splits']//input[contains(@value,'"+field[i]+"')]//parent::span//parent::td//parent::tr")).getAttribute("id").trim();
			String show_class_text=driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//span")).getAttribute("class").trim();
			String mandatory_clas_text=driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//span")).getAttribute("class").trim();
		if(show[i].equals("No"))
		{
			if(show_class_text.trim().equals("checkbox_ck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//span")).click();
			}
			
		}
		else
		{
			if(show_class_text.trim().equals("checkbox_unck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//span")).click();
			}
			
		}
		if(mandatory[i].equals("No"))
		{
			if(mandatory_clas_text.trim().equals("checkbox_ck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//span")).click();
			}
			
		}
		else
		{
			if(mandatory_clas_text.trim().equals("checkbox_unck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//span")).click();
			}
			
		}
		if(display_type[i].equals("Disabled"))
		{
			//jsx.executeScript("arguments[0].scrollIntoView(true);",row);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Check Box Default']//preceding-sibling::td)]//input")).click();
			for(int j=0;j<disabled_dropdown.size();j++)
			{
				if(disabled_dropdown.get(j).getText().equals("Disabled"))
				{
					disabled_dropdown.get(j).click();
					break;
				}
			}
			
		}	
		
		
		}
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		Thread.sleep(4000);
	    jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//td[@id='spn_secondarymultibutton_submitter']")).click();
	    if(isAlertPresent_()==true)
	    {
	    	Alert alert=driver.switchTo().alert();
	    	alert.accept();
	    }
	    Thread.sleep(8000);
	    navigate_To_Expense_Report("Customized Expense Report form for testing");
	    Thread.sleep(5000);
	   if (!before_memo.isDisplayed())
	   {
		   test.pass("Memo is not displaying in custom form");
	   }
	   else
	   {
		   test.fail("Memo is displaying in custom form");
	   }
	   if(!department_disable.isEnabled())
	   {
		   test.pass("Department is disabled");
	   }
	   else
	   {
		   test.fail("Department is not disabled");
	   }

	   if(location_mandatory.getText().trim().equals("*"))
	   {
		   test.pass("Location is displayed as mandatory field");
	   }
	   else
	   {
		   test.fail("Location is not displayed as mandatory field");
	   }
	   if(class_mandatory.getText().equals("*"))
	   {
		   test.pass("Class is displayed as mandatory field");
	   }
	   else
	   {
		   test.fail("Class is not displayed as mandatory field");
	   }
		
	}
		
		
	}
	


	



