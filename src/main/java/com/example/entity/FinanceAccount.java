package com.example.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "finance_account")
@DiscriminatorValue("finance")
public class FinanceAccount extends Account{

	private static final long serialVersionUID = 1L;
	
	
	@Column(name="finace")
	private String finace;


	public String getFinace() {
		return finace;
	}


	public void setFinace(String finace) {
		this.finace = finace;
	}

}
