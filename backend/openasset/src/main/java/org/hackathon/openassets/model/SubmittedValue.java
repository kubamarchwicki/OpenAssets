package org.hackathon.openassets.model;

import java.util.List;

public class SubmittedValue {

	public static class TranscriptionText {

		private String text;
		private Integer validLevel;

		public TranscriptionText() {
			text = "";
			validLevel = Integer.valueOf(0);
		}

		public TranscriptionText(String text) {
			this.text = text;
			validLevel = Integer.valueOf(0);
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Integer getValidLevel() {
			return validLevel;
		}

		public void setValidLevel(Integer validLevel) {
			this.validLevel = validLevel;
		}

	}

	private String field_name;

	private List<TranscriptionText> submittedValues;

	private String trusted;

	private String correct_value;

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public List<TranscriptionText> getSubmittedValues() {
		return submittedValues;
	}

	public void setSubmittedValues(List<TranscriptionText> submittedValues) {
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
