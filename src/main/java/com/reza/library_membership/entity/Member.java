package com.reza.library_membership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int memberId;
	@Column
	private String memberName;
	@Column
	private String birthData;
	@Column
	private String address;
	@Column
	private String phoneNumber;
	@Column
	private String email;
	
	public Member() {
		
	};
	
	public Member(int memberId, String memberName, String birthData, String address, String phoneNumber, String email) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.birthData = birthData;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getBirthData() {
		return birthData;
	}
	public void setBirthData(String birthData) {
		this.birthData = birthData;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "member [memberId=" + memberId + ", memberName=" + memberName + ", birthData=" + birthData + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
	
}
