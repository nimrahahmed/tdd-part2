package tddpart2;


public class ExcerciseTestPart2 {  

	public static void main(String[] args) throws Exception{
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.run();
		System.out.println(test.wasRun);
		new TestCaseTest("testRunning").run();

	}
}


