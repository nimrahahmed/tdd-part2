package tddpart2;

public class WasRun extends TestCase{
	public boolean wasRun;
	boolean wasSetUp;	    		
	String log;
	public WasRun(String name) {
		super(name);
		this.wasRun = false;
		this.wasSetUp = true;
		
	}
	/*public boolean wasSetUp() {
		return this.wasSetUp;
	}
*/
	public String log() {
		 return this.log;
		}
	public void setUp(){ 
		
		this.log = "setUp";
	}
	
	public void testMethod(){
	//	this.wasRun=true;
		this.log += "testMethod ";}
	
	public void tearDown() {
		 this.log += "tearDown ";
		}


	
}


