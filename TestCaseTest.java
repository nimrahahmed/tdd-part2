package tddpart2;


public class TestCaseTest extends TestCase{
	public WasRun test;
	TestCaseTest(String name) {
		super(name);
	}

	public void testTemplateMethod() throws Exception {
		test = new WasRun("testMethod");
		test.run();
		assert test.log().equals("setUp testMethod tearDown ");
	}
	public void testResult() throws Exception {
		test = new WasRun("testMethod");
		test.run();
		assert result.summary().equals("1 run, 0 failed");
	}
	public void testFailedResult() throws Exception {
		test = new WasRun("testBrokenMethod");
		test.run();
		assert result.summary().equals("1 run, 1 failed");
	}
}
