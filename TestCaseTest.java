package tddpart2;

import java.lang.reflect.InvocationTargetException;

public class TestCaseTest extends TestCase{
	public WasRun test;
	TestCaseTest(String name) {
		super(name);
	}
	public void setUp() {
		test = new WasRun("testMethod");
	}
	public void testRunning() {
		try {
		setUp();
		test.run();
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
	assert test.wasRun;

	}
	public void testSetUp() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		setUp();
		test.run();
		assert test.wasSetUp;
	}
	
}
