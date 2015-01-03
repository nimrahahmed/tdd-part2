package tddpart2;

import java.lang.reflect.InvocationTargetException;

public class TestCaseTest extends TestCase{
	
	TestCaseTest(String name) {
		super(name);
	}

	 public void testRunning() {
		WasRun testRunning = new WasRun("testMethod");
		//System.out.println(testRunning.wasRun);
		 assert testRunning.wasRun;

		try {
			testRunning.run();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		 assert testRunning.wasRun;
	 }
	 public void testSetUp() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		WasRun testSetup = new WasRun("testMethod");
		testSetup.run();
		assert testSetup.wasSetUp;
	 }
}
