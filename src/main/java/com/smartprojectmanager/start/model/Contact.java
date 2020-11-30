package com.smartprojectmanager.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int cId;
private String contactName;
private String email;
private String work;
private String image;
@Column(length = 1000)
private String description;
@ManyToOne
private User user;
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Contact(int cId, String contactName, String email, String work, String image, String description) {
	super();
	this.cId = cId;
	this.contactName = contactName;
	this.email = email;
	this.work = work;
	this.image = image;
	this.description = description;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getWork() {
	return work;
}
public void setWork(String work) {
	this.work = work;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Contact [cId=" + cId + ", contactName=" + contactName + ", email=" + email + ", work=" + work + ", image="
			+ image + ", description=" + description + "]";
}





}
