package pl.kriss3.comp1451;

public class APad extends AppleDevice
{
	private boolean hasCase;
	private String osVersion;
	
	public APad(boolean hasCase, String osVersion) 
	{
		super("learning");
		setHasCase(hasCase);
		setOsVersion(osVersion);
	}
	public boolean isHasCase() 
	{
		return hasCase;
	}
	public void setHasCase(boolean hasCase) 
	{
		this.hasCase = hasCase;
	}
	public String getOsVersion() 
	{
		return osVersion;
	}
	public void setOsVersion(String osVersion) 
	{
		this.osVersion = osVersion;
	}
	
	@Override
	public void printDetails()
	{
		super.getPurpose();
		System.out.println("APad details:\nFrom Parent: " + super.getPurpose() + "\nHas Case: "  + hasCase + "\nOS Version: " + osVersion);
	}
	
	@Override
	public String toString()
	{
		super.toString();
		return String.format("Has Case: %s\nOs Version: ", hasCase, osVersion);
	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasCase ? 1231 : 1237);
		result = prime * result + ((osVersion == null) ? 0 : osVersion.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof APad))
			return false;
		APad other = (APad) obj;
		
		if (osVersion == null) 
		{
			if (other.osVersion != null)
				return false;
		} else if (!osVersion.equals(other.osVersion))
			return false;
		return true;
	}
}
