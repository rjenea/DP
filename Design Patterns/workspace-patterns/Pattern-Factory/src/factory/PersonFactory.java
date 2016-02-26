package factory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonFactory {
	
	static int id = 0;
	
	public static List<Person> createPeopleFromList() {
		
		String text;
		List<Person> people = new ArrayList<Person>();
		
		try {

        	BufferedReader br =
        		new BufferedReader(new FileReader("c:\\person.txt"));

        	// Multiple people
        	while ((text = br.readLine()) != null) {
        		people.add(new Person(id++, text));
        	}
        	
       		br.close();
     	} catch (FileNotFoundException fnfe) {
      		System.out.println(fnfe);
      	} catch (IOException ioe) {
       		System.out.println(ioe);
      	}
		return people;
	}

	public static Person createPersonFromList() {
		
		Person p = new Person(id++, "Unknown");
		String text;
		
		try {

        	BufferedReader br =
        		new BufferedReader(new FileReader("c:\\person.txt"));

        	// Single Person
        	text = br.readLine();
        	p = new Person(id++, text);
        	
       		br.close();
     	} catch (FileNotFoundException fnfe) {
      		System.out.println(fnfe);
      	} catch (IOException ioe) {
       		System.out.println(ioe);
      	}
		return p;
	}

}
