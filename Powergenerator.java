
public class Powergenerator {
	public Powergenerator() 	{
		exponent = 1;
		aFactor = 0;
		for (int i=0; i <=11;i ++){
			System.out.println(exponent);
			exponent = exponent *10;
		}	
	}
	public void powerGenerator() {
		aFactor = 10;
	}
	public long nextPower() {
		long nextPower = aFactor ^ exponent;
		return nextPower;
	}
	private long exponent;
	private int aFactor;	
}
