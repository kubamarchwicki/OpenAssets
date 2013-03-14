package org.hackathon.openassets.model;

import java.util.List;

public class SubmittedValue {

	private String field_name;
	
	private List<String> submittedValues;
	
	private String trusted;
	
	private String correct_value;

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public List<String> getSubmittedValues() {
		return submittedValues;
	}

	public void setSubmittedValues(List<String> submittedValues) {
		this.submittedValues = submittedValues;
	}

	public String getTrusted() {
		return trusted;
	}

	public void setTrusted(String trusted) {
		this.trusted = trusted;
	}

	public String getCorrect_value() {
		return correct_value;
	}

	public void setCorrect_value(String correct_value) {
		this.correct_value = correct_value;
	}
	
	
	
}
