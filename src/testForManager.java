import static org.junit.Assert.*;

import org.junit.*;

import practice.Manager;

public class testForManager {

	@Test
	public void test() {
		fail("Not yet implemented");
		
		
	}
	
	public void testManager() {
		Manager<String,String> mannyManager = new Manager<>();
		mannyManager.checkLogin("gmail", "passWord");
		mannyManager.checkUser();
		mannyManager.setUserName("Manuel");
		mannyManager.fileCheckUser("yahoo", "passWord");
		
	}

}
