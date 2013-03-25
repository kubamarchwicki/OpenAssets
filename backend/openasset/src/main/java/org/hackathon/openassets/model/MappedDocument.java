package org.hackathon.openassets.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MappedDocument {

	private String trusted;
	private String ep_object_id;
	private String document_id;
	private SubmittedValue name;
	private SubmittedValue date_of_birth;
	private SubmittedValue place_of_birth;
	private SubmittedValue work;
	private SubmittedValue cash_pln;
	private SubmittedValue cash_other;
	private SubmittedValue stocks;
	private SubmittedValue house_area;
	private SubmittedValue house_value;
	private SubmittedValue house_ownership;
	private SubmittedValue flat_area;
	private SubmittedValue flat_value;
	private SubmittedValue flat_ownership;
	private SubmittedValue farm_type;
	private SubmittedValue farm_area;
	private SubmittedValue farm_value;
	private SubmittedValue farm_buildings;
	private SubmittedValue farm_ownership;
	private SubmittedValue farm_income;
	private SubmittedValue other_realestate;
	private SubmittedValue stocks_participation;
	private SubmittedValue stocks_income;
	private SubmittedValue stocks_government;
	private SubmittedValue stocks_government_more_10_proc;
	private SubmittedValue stocks_government_income;
	private SubmittedValue stocks_commercial_company;
	private SubmittedValue stocks_commercial_company_income;
	private SubmittedValue stocks_commercial_company_government;
	private SubmittedValue stocks_commercial_company_government_more_10proc;
	private SubmittedValue stocks_commercial_company_government_income;
	private SubmittedValue stocks_other_company;
	private SubmittedValue stocks_other_company_income;
	private SubmittedValue auction;
	private SubmittedValue self_employment;
	private SubmittedValue self_employment_personal;
	private SubmittedValue self_employment_with_others;
	private SubmittedValue self_employment_income;
	private SubmittedValue represent_self_employment;
	private SubmittedValue represent_self_personal;
	private SubmittedValue represent_self_with_others;
	private SubmittedValue represent_self_income;
	private SubmittedValue public_company;
	private SubmittedValue public_company_board;
	private SubmittedValue public_company_directors;
	private SubmittedValue public_company_audit;
	private SubmittedValue public_company_income;
	private SubmittedValue foundation;
	private SubmittedValue foundation_board;
	private SubmittedValue foundation_directors;
	private SubmittedValue foundation_audit;
	private SubmittedValue foundation_income;
	private SubmittedValue other_income;
	private SubmittedValue cars;
	private SubmittedValue liabilities;

	public String getTrusted() {
		return trusted;
	}

	public void setTrusted(String trusted) {
		this.trusted = trusted;
	}

	public String getEp_object_id() {
		return ep_object_id;
	}

	public void setEp_object_id(String ep_object_id) {
		this.ep_object_id = ep_object_id;
	}

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public SubmittedValue getName() {
		return name;
	}

	public void setName(SubmittedValue name) {
		this.name = name;
	}

	public SubmittedValue getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(SubmittedValue date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public SubmittedValue getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(SubmittedValue place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public SubmittedValue getWork() {
		return work;
	}

	public void setWork(SubmittedValue work) {
		this.work = work;
	}

	public SubmittedValue getCash_pln() {
		return cash_pln;
	}

	public void setCash_pln(SubmittedValue cash_pln) {
		this.cash_pln = cash_pln;
	}

	public SubmittedValue getCash_other() {
		return cash_other;
	}

	public void setCash_other(SubmittedValue cash_other) {
		this.cash_other = cash_other;
	}

	public SubmittedValue getStocks() {
		return stocks;
	}

	public void setStocks(SubmittedValue stocks) {
		this.stocks = stocks;
	}

	public SubmittedValue getHouse_area() {
		return house_area;
	}

	public void setHouse_area(SubmittedValue house_area) {
		this.house_area = house_area;
	}

	public SubmittedValue getHouse_value() {
		return house_value;
	}

	public void setHouse_value(SubmittedValue house_value) {
		this.house_value = house_value;
	}

	public SubmittedValue getHouse_ownership() {
		return house_ownership;
	}

	public void setHouse_ownership(SubmittedValue house_ownership) {
		this.house_ownership = house_ownership;
	}

	public SubmittedValue getFlat_area() {
		return flat_area;
	}

	public void setFlat_area(SubmittedValue flat_area) {
		this.flat_area = flat_area;
	}

	public SubmittedValue getFlat_value() {
		return flat_value;
	}

	public void setFlat_value(SubmittedValue flat_value) {
		this.flat_value = flat_value;
	}

	public SubmittedValue getFlat_ownership() {
		return flat_ownership;
	}

	public void setFlat_ownership(SubmittedValue flat_ownership) {
		this.flat_ownership = flat_ownership;
	}

	public SubmittedValue getFarm_type() {
		return farm_type;
	}

	public void setFarm_type(SubmittedValue farm_type) {
		this.farm_type = farm_type;
	}

	public SubmittedValue getFarm_area() {
		return farm_area;
	}

	public void setFarm_area(SubmittedValue farm_area) {
		this.farm_area = farm_area;
	}

	public SubmittedValue getFarm_value() {
		return farm_value;
	}

	public void setFarm_value(SubmittedValue farm_value) {
		this.farm_value = farm_value;
	}

	public SubmittedValue getFarm_buildings() {
		return farm_buildings;
	}

	public void setFarm_buildings(SubmittedValue farm_buildings) {
		this.farm_buildings = farm_buildings;
	}

	public SubmittedValue getFarm_ownership() {
		return farm_ownership;
	}

	public void setFarm_ownership(SubmittedValue farm_ownership) {
		this.farm_ownership = farm_ownership;
	}

	public SubmittedValue getFarm_income() {
		return farm_income;
	}

	public void setFarm_income(SubmittedValue farm_income) {
		this.farm_income = farm_income;
	}

	public SubmittedValue getOther_realestate() {
		return other_realestate;
	}

	public void setOther_realestate(SubmittedValue other_realestate) {
		this.other_realestate = other_realestate;
	}

	public SubmittedValue getStocks_participation() {
		return stocks_participation;
	}

	public void setStocks_participation(SubmittedValue stocks_participation) {
		this.stocks_participation = stocks_participation;
	}

	public SubmittedValue getStocks_income() {
		return stocks_income;
	}

	public void setStocks_income(SubmittedValue stocks_income) {
		this.stocks_income = stocks_income;
	}

	public SubmittedValue getStocks_government() {
		return stocks_government;
	}

	public void setStocks_government(SubmittedValue stocks_government) {
		this.stocks_government = stocks_government;
	}

	public SubmittedValue getStocks_government_more_10_proc() {
		return stocks_government_more_10_proc;
	}

	public void setStocks_government_more_10_proc(
			SubmittedValue stocks_government_more_10_proc) {
		this.stocks_government_more_10_proc = stocks_government_more_10_proc;
	}

	public SubmittedValue getStocks_government_income() {
		return stocks_government_income;
	}

	public void setStocks_government_income(
			SubmittedValue stocks_government_income) {
		this.stocks_government_income = stocks_government_income;
	}

	public SubmittedValue getStocks_commercial_company() {
		return stocks_commercial_company;
	}

	public void setStocks_commercial_company(
			SubmittedValue stocks_commercial_company) {
		this.stocks_commercial_company = stocks_commercial_company;
	}

	public SubmittedValue getStocks_commercial_company_income() {
		return stocks_commercial_company_income;
	}

	public void setStocks_commercial_company_income(
			SubmittedValue stocks_commercial_company_income) {
		this.stocks_commercial_company_income = stocks_commercial_company_income;
	}

	public SubmittedValue getStocks_commercial_company_government() {
		return stocks_commercial_company_government;
	}

	public void setStocks_commercial_company_government(
			SubmittedValue stocks_commercial_company_government) {
		this.stocks_commercial_company_government = stocks_commercial_company_government;
	}

	public SubmittedValue getStocks_commercial_company_government_more_10proc() {
		return stocks_commercial_company_government_more_10proc;
	}

	public void setStocks_commercial_company_government_more_10proc(
			SubmittedValue stocks_commercial_company_government_more_10proc) {
		this.stocks_commercial_company_government_more_10proc = stocks_commercial_company_government_more_10proc;
	}

	public SubmittedValue getStocks_commercial_company_government_income() {
		return stocks_commercial_company_government_income;
	}

	public void setStocks_commercial_company_government_income(
			SubmittedValue stocks_commercial_company_government_income) {
		this.stocks_commercial_company_government_income = stocks_commercial_company_government_income;
	}

	public SubmittedValue getStocks_other_company() {
		return stocks_other_company;
	}

	public void setStocks_other_company(SubmittedValue stocks_other_company) {
		this.stocks_other_company = stocks_other_company;
	}

	public SubmittedValue getStocks_other_company_income() {
		return stocks_other_company_income;
	}

	public void setStocks_other_company_income(
			SubmittedValue stocks_other_company_income) {
		this.stocks_other_company_income = stocks_other_company_income;
	}

	public SubmittedValue getAuction() {
		return auction;
	}

	public void setAuction(SubmittedValue auction) {
		this.auction = auction;
	}

	public SubmittedValue getSelf_employment() {
		return self_employment;
	}

	public void setSelf_employment(SubmittedValue self_employment) {
		this.self_employment = self_employment;
	}

	public SubmittedValue getSelf_employment_personal() {
		return self_employment_personal;
	}

	public void setSelf_employment_personal(
			SubmittedValue self_employment_personal) {
		this.self_employment_personal = self_employment_personal;
	}

	public SubmittedValue getSelf_employment_with_others() {
		return self_employment_with_others;
	}

	public void setSelf_employment_with_others(
			SubmittedValue self_employment_with_others) {
		this.self_employment_with_others = self_employment_with_others;
	}

	public SubmittedValue getSelf_employment_income() {
		return self_employment_income;
	}

	public void setSelf_employment_income(SubmittedValue self_employment_income) {
		this.self_employment_income = self_employment_income;
	}

	public SubmittedValue getRepresent_self_employment() {
		return represent_self_employment;
	}

	public void setRepresent_self_employment(
			SubmittedValue represent_self_employment) {
		this.represent_self_employment = represent_self_employment;
	}

	public SubmittedValue getRepresent_self_personal() {
		return represent_self_personal;
	}

	public void setRepresent_self_personal(
			SubmittedValue represent_self_personal) {
		this.represent_self_personal = represent_self_personal;
	}

	public SubmittedValue getRepresent_self_with_others() {
		return represent_self_with_others;
	}

	public void setRepresent_self_with_others(
			SubmittedValue represent_self_with_others) {
		this.represent_self_with_others = represent_self_with_others;
	}

	public SubmittedValue getRepresent_self_income() {
		return represent_self_income;
	}

	public void setRepresent_self_income(SubmittedValue represent_self_income) {
		this.represent_self_income = represent_self_income;
	}

	public SubmittedValue getPublic_company() {
		return public_company;
	}

	public void setPublic_company(SubmittedValue public_company) {
		this.public_company = public_company;
	}

	public SubmittedValue getPublic_company_board() {
		return public_company_board;
	}

	public void setPublic_company_board(SubmittedValue public_company_board) {
		this.public_company_board = public_company_board;
	}

	public SubmittedValue getPublic_company_directors() {
		return public_company_directors;
	}

	public void setPublic_company_directors(
			SubmittedValue public_company_directors) {
		this.public_company_directors = public_company_directors;
	}

	public SubmittedValue getPublic_company_audit() {
		return public_company_audit;
	}

	public void setPublic_company_audit(SubmittedValue public_company_audit) {
		this.public_company_audit = public_company_audit;
	}

	public SubmittedValue getPublic_company_income() {
		return public_company_income;
	}

	public void setPublic_company_income(SubmittedValue public_company_income) {
		this.public_company_income = public_company_income;
	}

	public SubmittedValue getFoundation() {
		return foundation;
	}

	public void setFoundation(SubmittedValue foundation) {
		this.foundation = foundation;
	}

	public SubmittedValue getFoundation_board() {
		return foundation_board;
	}

	public void setFoundation_board(SubmittedValue foundation_board) {
		this.foundation_board = foundation_board;
	}

	public SubmittedValue getFoundation_directors() {
		return foundation_directors;
	}

	public void setFoundation_directors(SubmittedValue foundation_directors) {
		this.foundation_directors = foundation_directors;
	}

	public SubmittedValue getFoundation_audit() {
		return foundation_audit;
	}

	public void setFoundation_audit(SubmittedValue foundation_audit) {
		this.foundation_audit = foundation_audit;
	}

	public SubmittedValue getFoundation_income() {
		return foundation_income;
	}

	public void setFoundation_income(SubmittedValue foundation_income) {
		this.foundation_income = foundation_income;
	}

	public SubmittedValue getOther_income() {
		return other_income;
	}

	public void setOther_income(SubmittedValue other_income) {
		this.other_income = other_income;
	}

	public SubmittedValue getCars() {
		return cars;
	}

	public void setCars(SubmittedValue cars) {
		this.cars = cars;
	}

	public SubmittedValue getLiabilities() {
		return liabilities;
	}

	public void setLiabilities(SubmittedValue liabilities) {
		this.liabilities = liabilities;
	}

}
