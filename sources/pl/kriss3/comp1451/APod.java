package pl.kriss3.comp1451;

public class APod extends AppleDevice
{
	private int numberOfSongs;
	private double maxVolumeInDecibels;
	
	public APod(int numberOfSongs, double maxVolumeInDecibels)
	{
		super("music");
		setNumberOfSongs(numberOfSongs);
		setMaxVolumeInDecibels(maxVolumeInDecibels);
	}

	public int getNumberOfSongs() 
	{
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) 
	{
		this.numberOfSongs = numberOfSongs;
	}

	public double getMaxVolumeInDecibels() 
	{
		return maxVolumeInDecibels;
	}

	public void setMaxVolumeInDecibels(double maxVolumeInDecibels) 
	{
		this.maxVolumeInDecibels = maxVolumeInDecibels;
	}
	
	@Override
	public void printDetails()
	{
		super.getPurpose();
		System.out.println("APod details:\n" + "From Parent: " + super.getPurpose() + "\nNo of Songs: "  + this.numberOfSongs + "\nMax Volume in Decibels: " + this.maxVolumeInDecibels);
	}
	
	@Override
	public String toString()
	{
		super.toString();
		return String.format("Number of Songs: %s\n Max Volume: %s", numberOfSongs, maxVolumeInDecibels);
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(maxVolumeInDecibels);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfSongs;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof APod))
			return false;
		APod other = (APod) obj;
		if (Double.doubleToLongBits(maxVolumeInDecibels) != Double.doubleToLongBits(other.maxVolumeInDecibels))
			return false;
		if (numberOfSongs != other.numberOfSongs)
			return false;
		return true;
	}
}
