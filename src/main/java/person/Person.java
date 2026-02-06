package person;

public class Person 
{
	String first_name;
	String last_name;
	int age;
	
	public Person(String first_name, String last_name, int age) 
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: " + first_name + " " + last_name + ", " + age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if(this.age < 18 || that.age < 18)
		{
			throw new UnderAgeException();
		}
		//if(age < 18)
		//{
		//	throw new UnderAgeException();
		//}
		Person child = new Person(this.first_name,that.last_name,0);
		return child;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args)
	{
		Person p = new Person("Garrett","George",21);
		System.out.println("G " + p);
	}
}
