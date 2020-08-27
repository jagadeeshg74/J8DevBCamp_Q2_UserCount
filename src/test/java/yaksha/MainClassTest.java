
package yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class MainClassTest {

	
	@Test
	public void testInitialUserCount() throws IOException {
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),User.getCount()==0?"true":"false",TestUtils.businessTestFile);		
		
	}
	
	
	
	@Test
	public void testUserCount() throws IOException {
		
		
		User usr = new User("Ramesh","ramesh@gmail.com");
		//assertEquals(1 ,MainClass.getUser(usr));
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),User.getCount()==1?"true":"false",TestUtils.businessTestFile);
	
		
		
	}
	
	
	
	
}
