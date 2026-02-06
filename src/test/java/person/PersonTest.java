package person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest 
{
	Person p1;
	Person p2;
	Person p3;
	Person p4;

	@BeforeEach
	void setUp() throws Exception 
	{
		p1 = new Person("Joe","Montana",16);
		p2 = new Person("Tom","Brady", 17);
		p3 = new Person("George","Pickens",23);
		p4 = new Person("Michelle","Obama",41);
	}

	@Test
	void testToString() 
	{
		assertEquals("Person: Joe Montana, 16", p1.toString());
	}
	
	@Test
	void testPerson()
	{
		assertThrows(UnderAgeException.class,
				()->{
					p1.makePerson(p2);
				});
		assertThrows(UnderAgeException.class,
				()->{
					p3.makePerson(p1);
				});
		try {
			Person child = p3.makePerson(p4);
			assertEquals(p3.getFirst_name(),child.getFirst_name());
			assertEquals(p4.getLast_name(),child.getLast_name());
			assertEquals(0,child.getAge());
		} catch (UnderAgeException e) {
			e.printStackTrace();
			fail("threw exception");
		}
		
		
	}

}
