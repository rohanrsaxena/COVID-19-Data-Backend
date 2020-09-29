package uca.covid;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person implements Serializable {

	private String personId;
	private String fisrtName;
	private String lastName;
	private String age;
	private String dob;
	private String email;
	private String phoneNumber;
	private String personType;
	private String status;
	private List<Person> infectedPersonList;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String personId) {
		super();
		this.personId = personId;
	}

		

	public Person(String personId, String fisrtName, String lastName, String age, String dob, String email,
			String phoneNumber, String personType, String status) {
		super();
		this.personId = personId;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.personType = personType;
		this.status = status;
	}

	public Person(String personId, String fisrtName, String lastName, String age, String dob, String email,
			String phoneNumber, List<Person> infectedPersonList) {
		super();
		this.personId = personId;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.infectedPersonList = infectedPersonList;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Person> getInfectedPersonList() {
		return infectedPersonList;
	}

	public void setInfectedPersonList(List<Person> infectedPersonList) {
		this.infectedPersonList = infectedPersonList;
	}

	

	
	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", age=" + age
				+ ", dob=" + dob + ", email=" + email + ", phoneNumber=" + phoneNumber + ", personType=" + personType
				+ ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personId == null) ? 0 : personId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (personId == null) {
			if (other.personId != null)
				return false;
		} else if (!personId.equals(other.personId))
			return false;
		return true;
	}
	
	

}
