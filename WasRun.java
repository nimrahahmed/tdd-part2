package tddpart2;

public class WasRun extends TestCase{
	public boolean wasRun;
	boolean wasSetUp;	    		

	public WasRun(String name) {
		super(name);
		this.wasRun = false;
		this.wasSetUp = true;
		
	}
	public boolean wasSetUp() {
		return this.wasSetUp;
	}

	public void setUp(){ 
		this.wasRun = false;
		this.wasSetUp = true;
	}
	
	public void testMethod(){
		this.wasRun=true;
	}

}


