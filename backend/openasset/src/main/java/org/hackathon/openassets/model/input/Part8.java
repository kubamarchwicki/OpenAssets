package org.hackathon.openassets.model.input;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Part8 {
	private String public_company;
	private String public_company_board;
	private String public_company_directors;
	private String public_company_audit;
	private String public_company_income;
	private String foundation;
	private String foundation_board;
	private String foundation_directors;
	private String foundation_audit;
	private String foundation_income;

	public String getPublic_company() {
		return public_company;
	}

	public void setPublic_company(String public_company) {
		this.public_company = public_company;
	}

	public String getPublic_company_board() {
		return public_company_board;
	}

	public void setPublic_company_board(String public_company_board) {
		this.public_company_board = public_company_board;
	}

	public String getPublic_company_directors() {
		return public_company_directors;
	}

	public void setPublic_company_directors(String public_company_directors) {
		this.public_company_directors = public_company_directors;
	}

	public String getPublic_company_audit() {
		return public_company_audit;
	}

	public void setPublic_company_audit(String public_company_audit) {
		this.public_company_audit = public_company_audit;
	}

	public String getPublic_company_income() {
		return public_company_income;
	}

	public void setPublic_company_income(String public_company_income) {
		this.public_company_income = public_company_income;
	}

	public String getFoundation() {
		return foundation;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	public String getFoundation_board() {
		return foundation_board;
	}

	public void setFoundation_board(String foundation_board) {
		this.foundation_board = foundation_board;
	}

	public String getFoundation_directors() {
		return foundation_directors;
	}

	public void setFoundation_directors(String foundation_directors) {
		this.foundation_directors = foundation_directors;
	}

	public String getFoundation_audit() {
		return foundation_audit;
	}

	public void setFoundation_audit(String foundation_audit) {
		this.foundation_audit = foundation_audit;
	}

	public String getFoundation_income() {
		return foundation_income;
	}

	public void setFoundation_income(String foundation_income) {
		this.foundation_income = foundation_income;
	}

}
