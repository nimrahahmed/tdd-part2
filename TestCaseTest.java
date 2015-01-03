package tddpart2;


public class TestCaseTest extends TestCase{
	public WasRun test;
	public TestSuite suite;
	TestCaseTest(String name) {
		super(name);
	}
	public void setUp() {
	result = new TestResult();
	}

	public void testTemplateMethod() throws Exception {
		test = new WasRun("testMethod");
		test.run(result);
		assert test.log().equals("setUp testMethod tearDown ");
	}
	public void testResult() throws Exception {
		test = new WasRun("testMethod");
		test.run(result);
		assert result.summary().equals("1 run, 0 failed");
	}
	public void testFailedResult() throws Exception {
		test = new WasRun("testBrokenMethod");
		test.run(result);
		assert result.summary().equals("1 run, 1 failed");
	}
	public void testFailedResultFormatting() {
		result = new TestResult();
		result.testStart();
		result.testFail();
		assert result.summary().equals("1 run, 1 failed");
		}
	public void testSuite() throws Exception {
		suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(result);
		assert result.summary().equals("2 run, 1 failed");
		}
}
