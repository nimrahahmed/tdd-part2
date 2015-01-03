package tddpart2;

public class TestResult {
	private int count;
	public TestResult() {
	this.count = 0;
	}
	
	public void testStart() {
	this.count += 1;
	}
	
	public String summary() {
	return String.format("%d run, 0 failed", this.count);
	}
}
