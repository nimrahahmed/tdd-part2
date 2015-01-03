package tddpart2;

import java.lang.reflect.InvocationTargetException;

public class TestCaseTest extends TestCase{
	
	TestCaseTest(String name) {
		super(name);
	}

	 public void testRunning() {
		WasRun testRunning = new WasRun("testMethod");
		System.out.println(testRunning.wasRun);
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
		System.out.println(testRunning.wasRun);
	 }
	
}
