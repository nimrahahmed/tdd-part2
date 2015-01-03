package tddpart2;


public class ExcerciseTestPart2 {  

    public static void main(String[] args) throws Exception{
    	//	new TestCaseTest("testRunning").run();
    	//  new TestCaseTest("testSetUp").run();
    	//  new TestCaseTest("testTemplateMethod").run();
    	//  new TestCaseTest("testFailedResult").run();
    //	 new TestCaseTest("testFailedResultFormatting").run();
    	TestSuite suite = new TestSuite();
    	 TestResult result = new TestResult();
    	
    	 suite.add(new TestCaseTest("testTemplateMethod"));
    	 suite.add(new TestCaseTest("testResult"));
    	 suite.add(new TestCaseTest("testFailedResultFormatting"));
    	 suite.add(new TestCaseTest("testFailedResult"));
    	 suite.add(new TestCaseTest("testSuite"));
    	
    	 suite.run(result);
    	 System.out.println(result.summary());
    }
   
}
 

