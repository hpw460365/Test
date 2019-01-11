package com.example.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sub_tech_account")
@DiscriminatorValue("subTech")
public class SubTechAccount extends TechAccount{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="sub_tech")
	private String subTech;

	public String getSubTech() {
		return subTech;
	}

	public void setSubTech(String subTech) {
		this.subTech = subTech;
	}
	
	
}
