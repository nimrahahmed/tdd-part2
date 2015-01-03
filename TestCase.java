
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tddpart2;


import java.lang.reflect.Method;

public class TestCase {
	public String name;
	public TestResult result;

	public TestCase(String name) {
		this.name = name;
	}

	public void setUp() {
	}
	public void tearDown() {
	}


	public void run(TestResult result) throws Exception {
		result = new TestResult();
		result.testStart();
		setUp();
		Method method = this.getClass().getMethod(name);
		try{
			method.invoke(this);
		}catch(Exception e){
			result.testFail();

			e.printStackTrace();
		}
		tearDown();
		//return result;
	}
	
	
	
}