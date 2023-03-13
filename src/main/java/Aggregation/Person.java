package Aggregation;

public class Person {
	
	private String name;
	private int age;
	
	private Address address;//Aggregation 
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setAdd(Address address)
	{
		this.address= address;
	}
    public Address getAddressAddress()
    {
    	return address;
    }
    public String getName()
    {
    	return name;
    }
    public int getAge()
    {
    	return age;
    }
    
    public static void main(String args[])
    {
    	Person p=new Person();
    	p.setName("Riya");
    	p.setAge(27);
    	
    	Address a = new Address();
    	a.setHousename("Arimattom");
    	a.setStreetname("Chennadu");
    	a.setZipcode(123456);
    	
    	p.setAdd(a);
    	
    	System.out.println("Name: "+p.getName()+" Age: "+p.getAge()+" Address: "+p.getAddressAddress().getHousename()+","+p.getAddressAddress().getStreetname()+","+p.getAddressAddress().getZipcode());
    	
    }
}
