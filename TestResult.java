package tddpart2;

public class TestResult {
	private int count;
	private int errCount;
	
	public TestResult() {
	this.count = 0;
	this.errCount = 0;
	}
	
	public void testStart() {
	this.count += 1;
	}
	
	public void testFail() {
		this.errCount += 1;
		}

	public String summary() {
		return String.format("%d run, %d failed", this.count, this.errCount);	}
}
