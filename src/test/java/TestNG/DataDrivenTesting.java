package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	@DataProvider(name = "testData")
	public Object[][] dataProviderMethod(){
		Object[][] list= {
				{"Kajal","Test123",1},
				{"Ravi","Datatest",2},
				{"Parth","admin",3},
				{"Dhaval","admin",4},
				{"Kunj","admin",5}
		};
		return list;
	}
	@Test(dataProvider = "testData")
	public void testPost1(String username,String password,int rollnum) {
		
		System.out.println("UserName:"+username+" Password:"+password+" Roll number:"+rollnum);
	}

}
