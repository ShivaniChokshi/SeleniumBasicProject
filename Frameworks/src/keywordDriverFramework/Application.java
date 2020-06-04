package keywordDriverFramework;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

	@Test
	public void InvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("C:\\SHIVANI\\Selenium Java Practice\\Excel for Framework parameter values\\NewtoursTestData.xlsx", "Sheet2");

		for(int i=1;i<data.length;i++) {
			switch(data[i][3]) {// this means switch the case based on ith row and 4th column which is keyword column
			case "openBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":
				Methods.maxBrowser();
				break;
			case "impWait":
				Methods.impWait();
				break;
			case "navigateToApp":
				Methods.navigateToAUT(data[i][6]); //Here we will pass the value of url from excel. Value is already in ith row and 6th column
				break;
			case "enterUserID":
				Methods.enterUserID(data[i][5], data[i][6]);
				break;
			case "enterPassword":
				Methods.enterPassword(data[i][5], data[i][6]);
				break;
			case "clickBtn":
				Methods.clickButton(data[i][4], data[i][5]);
				break;
			case "verifyErrMsg":
				String actualMsg = Methods.getErrorMessage(data[i][5]);
				String expMsg = data[i][6];
				Assert.assertEquals(actualMsg, expMsg);
				break;
			case "closeAUT":
				Methods.closeApplication();
				break;
				

			}

		}

	}

}
