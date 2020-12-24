package com.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int lId;
	private String lName;
	

	/**
	 * @return the lId
	 */
	public int getlId() {
		return lId;
	}
	/**
	 * @param lId the lId to set
	 */
	public void setlId(int lId) {
		this.lId = lId;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

}
