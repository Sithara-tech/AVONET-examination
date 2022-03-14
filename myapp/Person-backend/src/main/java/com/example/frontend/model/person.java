package com.example.frontend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class person{
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String Field;
	private String Type;
	private int Length;
	private String Validations;
	
	public person() {		
	}
	public person(String field, String type, int length,String validations) {
		super();
		this.Field= field;
		this.Type= type;
		this.Length= length;
		this.Validations= validations;
	}
	
	
	public String getField() {
		return Field;
	}
	public void setField(String field) {
		Field = field;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public String getValidations() {
		return Validations;
	}
	public void setValidations(String validations) {
		Validations = validations;
	}

	
	
	

}
