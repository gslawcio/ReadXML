package model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import contact.Contacts;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String surname;
	private Integer age;
	private String city;

	private Contacts contacts;

	public Person() {
	}

	public Person(String name, String surname, Integer age, String city, Contacts contacts) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.city = city;
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", city=" + city + ", contacts="
				+ contacts + "]";
	}
}
