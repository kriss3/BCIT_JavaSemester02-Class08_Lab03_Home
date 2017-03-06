package pl.kriss3.comp1451;

public abstract class AppleDevice 
{
	private String purpose;
	
	public AppleDevice(String purpose)
	{
		setPurpose(purpose);
	}
	
	//public methods
	public String getPurpose()
	{
		return this.purpose;
	}
	
	public void setPurpose(String value)
	{
		this.purpose = value == null || value.equals("") ? "Unknown" : value;
	}
	
	public abstract void printDetails();
}
