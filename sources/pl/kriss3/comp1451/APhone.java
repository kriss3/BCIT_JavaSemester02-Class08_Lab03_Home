package pl.kriss3.comp1451;

public class APhone extends AppleDevice
{
	private double minutesLeftInThePlan;
	private String carrier;
	
	
	public APhone(double minutesLeftInThePlan, String carrier) 
	{
		super("talking");
		setMinutesLeftInThePlan(minutesLeftInThePlan);
		setCarrier(carrier);
	}
	public double getMinutesLeftInThePlan() 
	{
		return minutesLeftInThePlan;
	}
	public void setMinutesLeftInThePlan(double minutesLeftInThePlan) 
	{
		this.minutesLeftInThePlan = minutesLeftInThePlan;
	}
	public String getCarrier() 
	{
		return carrier;
	}
	public void setCarrier(String carrier)
	{
		this.carrier = carrier;
	}
	
	@Override
	public void printDetails()
	{
		System.out.println("APhone details: \nFrom Parent: " + super.getPurpose() + "\nMinutes Left in Plan: "  + minutesLeftInThePlan + "\nCarrier: " + carrier);
	}
	
	@Override
	public String toString()
	{
		super.toString();
		return String.format("Minutes Left in Plan: %s\nCarrier: %s", minutesLeftInThePlan, carrier);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrier == null) ? 0 : carrier.hashCode());
		long temp;
		temp = Double.doubleToLongBits(minutesLeftInThePlan);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof APhone))
			return false;
		
		APhone other = (APhone) obj;
		if (carrier == null) 
		{
			if (other.carrier != null)
				return false;
		} 
		else if (!carrier.equals(other.carrier))
			return false;
		
		if (Double.doubleToLongBits(minutesLeftInThePlan) != Double.doubleToLongBits(other.minutesLeftInThePlan))
			return false;
		
		if (Math.abs(this.minutesLeftInThePlan - other.minutesLeftInThePlan) <= 10) {
			return true;
		 }
			 
		return true;
	}
	
	
	
}
