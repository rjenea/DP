package factory;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Person p1 = PersonFactory.createPersonFromList();
		System.out.println("Using createPersonFromList() method: " + p1);
		
		List<Person> people = PersonFactory.createPeopleFromList();
		for(Person p : people) {
			System.out.println("Using createPeopleFromList() method: " + p);
		}
	}
}