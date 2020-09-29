package uca.covid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataManager {

	//create an ArrayList of Persons
	List<Person> list = new ArrayList<>();

	
	//add Persons to the ArrayList
	public void addPerson(Person p) {
		list.add(p);

	}

	
	//Search for the person with an Id from the ArrayList
	public Person findPersonById(String id) {

		int index = list.indexOf(new Person(id));
		System.out.println("Searching for a  person with an id.." + id + "..with  index " + index);
		Person p = list.get(index);
		return p;

	}

	
	//remove a person from the ArrayList based on the Id
	public void removePerson(String id) {

		int index = list.indexOf(new Person(id));
		System.out.println("removing person with an id.." + id + "..from index " + index);
		list.remove(index);

	}

	
	//Iterate through the elements of the ArrayList uding the iterator method 
	public Iterator<Person> iterator() {
		Iterator<Person> p = list.iterator();
		while (p.hasNext()) {
			System.out.println(p.next());

		}

		return p;

	}

	
	//add a list of contacts associated with the Infected patient in the ArrayLiist
	public void addContact(Person p, Person c) {

		List clist = new ArrayList<>();
		clist.add(c);

		p.setInfectedPersonList(clist);

	}

	
	//Read the Persons stored in the ArrayList from a file
	public List<Person> readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
		List<Person> plist = (List<Person>) ois.readObject();
		return plist;

//		BufferedReader br = new BufferedReader(new FileReader("person123.txt"));
//		Person p = null;
//		List<Person> readPerson = null;
//		while (br != null) {
//			String id = br.readLine();
//			String fname = br.readLine();
//			String lname = br.readLine();
//			String age = br.readLine();
//			String dob = br.readLine();
//			String email = br.readLine();
//			String pno = br.readLine();
//
//			p = new Person(id, fname, lname, age, dob, email, pno);
//			readPerson.add(p);
//
//		}
//		return readPerson;
//
	}

	
	//Write the ArrayLst Object to the file
	public void writeToFile() throws FileNotFoundException, IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
		oos.writeObject(list);

		System.out.println("Written the object to the file..!!!");

//		BufferedWriter bw = new BufferedWriter(new FileWriter("person123.txt", true));
//		for (Person p : list) {
//			bw.write(p.getPersonId());
//			bw.write(p.getFisrtName());
//			bw.write(p.getLastName());
//			bw.write(p.getAge());
//			bw.write(p.getDob());
//			bw.write(p.getEmail());
//			bw.write(p.getPhoneNumber());
//
//		}
//		bw.close();
//
	}

}
