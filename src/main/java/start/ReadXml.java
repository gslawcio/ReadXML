package start;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Persons;

//									Czyta wszystkich u¿ytkowniów i ich kontakty
public class ReadXml {

	public static void main(String[] args) {

		File xmlFile = new File("dane-osoby.xml");

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Persons.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Persons persons = (Persons) jaxbUnmarshaller.unmarshal(xmlFile);

			System.out.println(persons);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
