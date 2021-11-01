package constructor.injection;

public class Address 
{
	String city;
	String state;
	String country;

	public Address(String city, String state, String country) 
	{
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
		@Override
		public String toString() 
		{
			// TODO Auto-generated method stub
			return "city is "+city +"\n"+"state is "+state+"\n country is "+country;
		}
	
}
