package com.cg.votingapp.entity;

@Entity
@Table(name="register_user")
public class register_user {
	
	@Id
	@Column(name="application_id")
	private int application_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private int dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="mobile_number")
	private int mobile_number;
	
	@Column(name="address")
	private String address;
	
	@Column(name="district")
	private String district;

	public register_user() {
		super();
	}

	public register_user(int application_id, String name, int dob, String gender, int mobile_number, String address,
			String district) {
		super();
		this.application_id = application_id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.mobile_number = mobile_number;
		this.address = address;
		this.district = district;
	}

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "register_user [application_id=" + application_id + ", name=" + name + ", dob=" + dob + ", gender="
				+ gender + ", mobile_number=" + mobile_number + ", address=" + address + ", district=" + district + "]";
	}

	

}
