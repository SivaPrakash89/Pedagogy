package com.pedagogy.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	protected String email;
	private String password;
	private String phoneNo;
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String role;
	private String status;
	private String comments;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@OneToMany
	@JoinColumn(name="email")
	private List<Address> addressList;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public Users(String email, String password, String phoneNo, String role, String firstName, String lastName, String status, String comments, List<Address> addressList) {
		super();
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.addressList = addressList;
		this.status = status;
		this.comments = comments;
	}
	public Users(String email, String password, String phoneNo, String role, String firstName, String lastName, String status, String comments) {
		super();
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.status = status;
		this.comments = comments;
	}

	public Users() {
		super();
	}
	
}

