package tddpart2;

public class WasRun extends TestCase{
	public boolean wasRun;
	String log;

	public WasRun(String name) {
		super(name);
		this.wasRun = false;
	}

	public String log() {
		return this.log;
	}
	public void setUp(){ 
		this.log = "setUp";
	}

	public void testMethod(){
		this.log += "testMethod ";
	}

	public void tearDown() {
		this.log += "tearDown ";
	}

	public void testBrokenMethod() throws Exception {
		throw new Exception("Broken");
	}
}


