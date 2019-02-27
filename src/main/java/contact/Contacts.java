package contact;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contacts")
@XmlAccessorType(XmlAccessType.FIELD) // NONE nie muszê wszytkie pobieraæ dane
public class Contacts implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "phone")
	private List<String> phone;
	@XmlElement(name = "email")
	private List<String> email;
	@XmlElement(name = "icq")
	private List<String> icq;
	@XmlElement(name = "jabber")
	private List<String> jabber;

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public List<String> getIcq() {
		return icq;
	}

	public void setIcq(List<String> icq) {
		this.icq = icq;
	}

	public List<String> getJabber() {
		return jabber;
	}

	public void setJabber(List<String> jabber) {
		this.jabber = jabber;
	}

	@Override
	public String toString() {
		return "Contacts [phone=" + phone + ", email=" + email + ", icq=" + icq + ", jabber=" + jabber + "]";
	}

}
