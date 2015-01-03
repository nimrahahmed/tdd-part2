package tddpart2;

public class WasRun extends TestCase{
	public boolean wasRun;
	boolean wasSetUp;	    		

	public WasRun(String name) {
		super(name);
		this.wasRun = false;

	}
	public boolean wasSetUp() {
		return this.wasSetUp;
	}

	public void setUp() {
		this.wasSetUp = true;
	}
	
	public void testMethod(){
		this.wasRun=true;
	}

}


