
package com.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.exceldataReader.ExcelReader;
import com.qa.exceldataReader.ExcelReaderbycolumnname;
import com.qa.pages.expenseReportFunctions;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;


public class ExpenseReportTestcases extends TestBase {
	TestUtil testUtil;
	ExcelReader reader;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	String file_path="C:\\Users\\Sindhuja\\Desktop\\Expensereportdata.xlsx";

	public void send_email() throws EmailException {
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("./Expense_report/ExpenseReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		// attachment.setDescription("Test Report");
		// attachment.setName("Bulk Email Invoices");
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("sindhuja.b@tvarana.com", "Sindhu@123"));
		email.setSSLOnConnect(true);
		email.addTo("sindhuja.b@tvarana.com", "Sindhu");
		email.setFrom("sindhuja.b@tvarana.com", "Sindhuja");
		email.setSubject("Expense report Validation Report");
		email.setMsg("Here is the report please find the attachment");
		email.attach(attachment);
		email.send();
	}

	@BeforeTest
	public void setExtent() {
		// specify location of the report
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Expense_report/ExpenseReport.html");
		htmlReporter.config().setDocumentTitle("Expense Report Automation Report"); // Tile of report
		htmlReporter.config().setReportName("Expense Report Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// Passing General information
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Sindhuja");
	}

	@AfterTest
	public void endReport() throws EmailException {
		extent.flush();
		send_email();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																					// report
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			// test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		// driver.quit();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		testUtil = new TestUtil();
		testUtil.setUp();
	}
	@DataProvider
	public Object[][] invalid_data() throws IOException {
		reader = new ExcelReader();
		return reader.readExcelData("C:\\Users\\Sindhuja\\Desktop\\Expensereportdata.xlsx", 1);
	}
	@Test(priority = 3)
	public void expense_validations() throws IOException, InterruptedException
	{
		test=extent.createTest("Expense Report Creation");
		ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
		String[] employeename=reader.excelReader(file_path, 0, "employee_name");
		String[] amount=reader.excelReader(file_path, 0, "amount");
		String[] currency=reader.excelReader(file_path, 0, "currency");
		String[] category=reader.excelReader(file_path, 0, "category");
		String[] quantity=reader.excelReader(file_path, 0, "quantity");
		String[] rate=reader.excelReader(file_path, 0, "rate");
		String[] testcase=reader.excelReader(file_path, 0, "testcase");
		String[] Department=reader.excelReader(file_path, 0, "Department");
		String[] Class=reader.excelReader(file_path, 0, "Class");
		String[] Location=reader.excelReader(file_path, 0, "Location");
		String[] Memo=reader.excelReader(file_path, 0, "Memo");
		String[] advance_to_apply=reader.excelReader(file_path, 0, "advance_to_apply");
		
		for(int i=0;i<employeename.length;i++)
		{

		expenseReportFunctions expense=new expenseReportFunctions();
		expense.expense_report_creation(employeename[i],amount[i],currency[i],category[i],quantity[i],rate[i],testcase[i],Department[i],Class[i],Location[i],Memo[i],advance_to_apply[i], test,extent);
		}

		
	}	
	@Test(priority = 2)
	public void form_test() throws InterruptedException, IOException
	{
		
			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String[] field=reader.excelReader(file_path, 2, "Field");
			String[] mandatory=reader.excelReader(file_path, 2, "Mandatory");
			String[] show=reader.excelReader(file_path, 2, "show");
			String[] display_type=reader.excelReader(file_path, 2, "display_type");
			test=extent.createTest("Custom Form changes Functionality Testing ");
			expenseReportFunctions expense=new expenseReportFunctions();
			expense.form_test(field, mandatory, show, display_type,test);
			
		

		
	}
	
	@Test(priority = 1)
	public void actions_testing() throws InterruptedException, IOException
	{
		ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
		String[] employeename=reader.excelReader(file_path, 1,"employee_name".trim());
		String[] amount=reader.excelReader(file_path, 1, "amount");
		String[] currency=reader.excelReader(file_path, 1, "currency");
		String[] category=reader.excelReader(file_path, 1, "category");
		String[] quantity=reader.excelReader(file_path, 1, "quantity");
		String[] rate=reader.excelReader(file_path, 1, "rate");
		String[] testcase=reader.excelReader(file_path, 1, "testcase");
		String[] Department=reader.excelReader(file_path, 1, "Department");
		String[] Class=reader.excelReader(file_path, 1, "Class");
		String[] Location=reader.excelReader(file_path, 1, "Location");
		String[] Memo=reader.excelReader(file_path, 1, "Memo");
		String[] advance_to_apply=reader.excelReader(file_path, 1, "advance_to_apply");
		for(int i=0;i<employeename.length;i++)
		{
			
		test=extent.createTest(testcase[i]);	
		expenseReportFunctions expense=new expenseReportFunctions();
		expense.general_info(employeename[i],amount[i],currency[i],category[i],quantity[i],rate[i],testcase[i],Department[i],Class[i],Location[i],Memo[i],advance_to_apply[i]);
		if(testcase[i].trim().equals("Make a copy Functionality testing"))
			{
			expense.make_copy(Memo[i],currency[i],category[i],quantity[i],rate[i],Department[i],Class[i],Location[i], test);
			}
			if(testcase[i].trim().equals("Copy Previous Functionality Testing"))
			{
				expense.copy_previous(Memo[i],currency[i],category[i],quantity[i],rate[i],Department[i],Class[i],Location[i],test);

			}
			if(testcase[i].trim().equals("Insert Functionality Testing"))
			{
				expense.insert(amount[i],currency[i],category[i],quantity[i],rate[i],testcase[i],Department[i],Class[i],Location[i],Memo[i],advance_to_apply[i],test);
			}
			if(testcase[i].trim().equals("Remove Functionality Testing"))
			{
				expense.remove(Memo[i],test);
			}
		
		

	}
	}
}
		
	
