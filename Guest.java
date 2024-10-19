package com.hotelmanagement.guest;

public class Guest {
private int guestid;
private String name;
private String mobno;
private String emailid;
private String address;
private int age;
private String gender;
public Guest(int guestId2, String name2, String phoneNumber, String email, String address2, int age2, String gender2) {
	// TODO Auto-generated constructor stub
}
public int getGuestid() {
	return guestid;
}
public void setGuestid(int guestid) {
	this.guestid = guestid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Guest [guestid=" + guestid + ", name=" + name + ", mobno=" + mobno + ", emailid=" + emailid + ", address="
			+ address + ", age=" + age + ", gender=" + gender + "]";
}

}
