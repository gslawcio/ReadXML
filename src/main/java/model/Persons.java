package model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persons implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "person")
	private List<Person> persons = null;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Persons [persons=" + persons + "]";
	}
}
