package TestNG;


import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class DataDrivernTestingWithExcle {
	
	Properties p;
	
	public void LoadProperties() throws Exception{
		
		FileReader reader=new FileReader("Test.properties");
		p=new Properties();
		p.load(reader);
	}
	@BeforeClass
	public void testloading() {
		try {
			LoadProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider(name = "TestData")
	public Object[][] dataProviderMethod() {
		Object[][] testObjArray=null;
		try {
		String file=p.getProperty("excelpath");
		String sheetName=p.getProperty("sheetName");
		
	
			testObjArray=ExcelUtil.getTableArray(file, sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testObjArray;
	}
	@Test(dataProvider = "TestData")
	public void testData1(Object username,Object password) {
		System.out.println("UserName:"+username+" Password:"+password);
	}
}
