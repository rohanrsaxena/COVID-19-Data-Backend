package uca.covid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import uca.covid.Person.PersonType;
//import uca.covid.Person.Status;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		DataManager manager = new DataManager();

		String id = null, fname = null, lname = null, dob = null, email = null, phonenumber = null,age=null;
		String  statustype=null;
		String  persontype=null;
		
		

		//accept input from the user through the keyboard
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {

			System.out.println("Enter the personId");
			id = s.next();

			System.out.println("Enter the person's firstname");

			fname = s.next();
			System.out.println("Enter the person's lastname");

			lname = s.next();
			
			System.out.println("Enter the person's age");

			age = s.next();
			
			System.out.println("Enter the person's  dob");

			dob = s.next();
			System.out.println("Enter the person's email");

			email = s.next();
			
			System.out.println("Enter the person's phonenumber");

			phonenumber = s.next();
			
			
			System.out.println(	"Enter the person's type--infected, -recovered, -deceased, -unknown");
			persontype = s.next();
			
			System.out.println(	"Enter the person's status-- staff,-instructor,-student");

			statustype = s.next();
			
			Person p = new Person(id, fname, lname, age, dob, email, phonenumber,persontype, statustype);
			
			manager.addPerson(p);
			
			

		}
		
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Iterate the persons");
		System.out.println(manager.iterator());
		System.out.println("---------------------------------------------------------------------");


		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter the id of the person you want to search");
		System.out.println(manager.findPersonById(s.next()));
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Enter the id of the person you want to remove");
		manager.removePerson(s.next());
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Iterate the persons ");
		System.out.println(manager.iterator());
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Wirte to file");
		manager.writeToFile();
		System.out.println("---------------------------------------------------------------------");

		System.out.println("read from file..!!!");

		List<Person> rlp = manager.readFromFile();
		for (Person pp : rlp) {
			System.out.println(pp);

		}

	}

}
