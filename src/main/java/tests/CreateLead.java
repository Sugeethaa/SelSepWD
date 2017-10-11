package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ReadExcel;
import wrapper.GenericWrappers;
import wrapper.LeaftapsWrappers;

public class CreateLead extends LeaftapsWrappers {

	// packagename.classname.methodname
	@Test(dataProvider = "fetchExcelData")
	public void createLead(String companyName, String firstName, String lastName) {

		clickByLink("CRM/SFA");

		clickByLink("Leads");

		clickByLink("Create Lead");

		enterById("createLeadForm_companyName", companyName);

		enterById("createLeadForm_firstName", firstName);

		enterById("createLeadForm_lastName", lastName);

	}

	@DataProvider(name = "create")
	public Object[][] getCreateLeadData() {
		Object[][] data = new Object[][] { { "TestLeaf", "Babu" }, { "CapGemini", "Anwar" } };

		return data;

	}

	@DataProvider(name = "lead")
	public Object[][] getLeadData() {
		Object[][] data = new Object[][] { { "TestLeaf", "Gopi", "J" }, { "CapGemini", "Anwar", "A" } };

		return data;

	}

	// Read the create lead from excel sheet
	@DataProvider(name = "fetchExcelData")
	public Object[][] getExcelData() throws InvalidFormatException, IOException {
		ReadExcel re = new ReadExcel();
		Object[][] data = re.readExcel("CreateLead");
		return data;
	}

}