package pl.kriss3.comp1451;

public class APhoneSeven extends APhone 
{
	private boolean hasHighRezCamera;
	private int gigabyteOfMemory;
	
	public APhoneSeven(double minutesLeftInThePlan, String carrier, boolean hasHighRezCamera, int gigabyteOfMemory) 
	{
		super(minutesLeftInThePlan, carrier);
		setHasHighRezCamera(hasHighRezCamera);
		setGigabyteOfMemory(gigabyteOfMemory);
	}

	public boolean isHasHighRezCamera() 
	{
		return hasHighRezCamera;
	}

	public void setHasHighRezCamera(boolean hasHighRezCamera) 
	{
		this.hasHighRezCamera = hasHighRezCamera;
	}

	public int getGigabyteOfMemory() 
	{
		return gigabyteOfMemory;
	}

	public void setGigabyteOfMemory(int gigabyteOfMemory) 
	{
		this.gigabyteOfMemory = gigabyteOfMemory;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + gigabyteOfMemory;
		result = prime * result + (hasHighRezCamera ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (!super.equals(obj))
			return false;
		
		if (!(obj instanceof APhoneSeven))
			return false;
		
		APhoneSeven other = (APhoneSeven) obj;
		if (gigabyteOfMemory != other.gigabyteOfMemory)
			return false;
		
		if (hasHighRezCamera != other.hasHighRezCamera)
			return false;
		
		if (hasHighRezCamera && (Math.abs(this.getMinutesLeftInThePlan() - other.getMinutesLeftInThePlan()) <= 10)) 
			return true;
		else
			return false;
	}
	
	@Override
	public void printDetails()
	{
		System.out.println("APhoneSeven details: \nFrom Parent: " + super.getPurpose() + "\nHas High Rez Camera "  + hasHighRezCamera + "\nAvailable Memory: " + gigabyteOfMemory);
	}
	
	@Override
	public String toString()
	{
		super.toString();		
		return String.format("Has High Resolution Cam: %s\nMemory Available: %d", hasHighRezCamera, gigabyteOfMemory);
	}
}
