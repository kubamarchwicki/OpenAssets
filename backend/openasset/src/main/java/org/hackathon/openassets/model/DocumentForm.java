package org.hackathon.openassets.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.hackathon.openassets.datagrabber.ImageNode;

@XmlRootElement
public class DocumentForm {

	private String ep_object_id;
	private String document_id;
	private String trusted;
	private String name;
	private String date_of_birth;
	private String place_of_birth;
	private String work;
	private String cash_pln;
	private String cash_other;
	private String stocks;
	private String house_area;
	private String house_value;
	private String house_ownership;
	private String flat_area;
	private String flat_value;
	private String flat_ownership;
	private String farm_type;
	private String farm_area;
	private String farm_value;
	private String farm_buildings;
	private String farm_ownership;
	private String farm_income;
	private String other_realestate;
	private String stocks_participation;
	private String stocks_income;
	private String stocks_government;
	private String stocks_government_more_10_proc;
	private String stocks_government_income;
	private String stocks_commercial_company;
	private String stocks_commercial_company_income;
	private String stocks_commercial_company_government;
	private String stocks_commercial_company_government_more_10proc;
	private String stocks_commercial_company_government_income;
	private String stocks_other_company;
	private String stocks_other_company_income;
	private String auction;
	private String self_employment;
	private String self_employment_personal;
	private String self_employment_with_others;
	private String self_employment_income;
	private String represent_self_employment;
	private String represent_self_personal;
	private String represent_self_with_others;
	private String represent_self_income;
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
	private String other_income;
	private String cars;
	private String liabilities;
	private List<ImageNode> images;

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

	public String getTrusted() {
		return trusted;
	}

	public void setTrusted(String trusted) {
		this.trusted = trusted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getCash_pln() {
		return cash_pln;
	}

	public void setCash_pln(String cash_pln) {
		this.cash_pln = cash_pln;
	}

	public String getCash_other() {
		return cash_other;
	}

	public void setCash_other(String cash_other) {
		this.cash_other = cash_other;
	}

	public String getStocks() {
		return stocks;
	}

	public void setStocks(String stocks) {
		this.stocks = stocks;
	}

	public String getHouse_area() {
		return house_area;
	}

	public void setHouse_area(String house_area) {
		this.house_area = house_area;
	}

	public String getHouse_value() {
		return house_value;
	}

	public void setHouse_value(String house_value) {
		this.house_value = house_value;
	}

	public String getHouse_ownership() {
		return house_ownership;
	}

	public void setHouse_ownership(String house_ownership) {
		this.house_ownership = house_ownership;
	}

	public String getFlat_area() {
		return flat_area;
	}

	public void setFlat_area(String flat_area) {
		this.flat_area = flat_area;
	}

	public String getFlat_value() {
		return flat_value;
	}

	public void setFlat_value(String flat_value) {
		this.flat_value = flat_value;
	}

	public String getFlat_ownership() {
		return flat_ownership;
	}

	public void setFlat_ownership(String flat_ownership) {
		this.flat_ownership = flat_ownership;
	}

	public String getFarm_type() {
		return farm_type;
	}

	public void setFarm_type(String farm_type) {
		this.farm_type = farm_type;
	}

	public String getFarm_area() {
		return farm_area;
	}

	public void setFarm_area(String farm_area) {
		this.farm_area = farm_area;
	}

	public String getFarm_value() {
		return farm_value;
	}

	public void setFarm_value(String farm_value) {
		this.farm_value = farm_value;
	}

	public String getFarm_buildings() {
		return farm_buildings;
	}

	public void setFarm_buildings(String farm_buildings) {
		this.farm_buildings = farm_buildings;
	}

	public String getFarm_ownership() {
		return farm_ownership;
	}

	public void setFarm_ownership(String farm_ownership) {
		this.farm_ownership = farm_ownership;
	}

	public String getFarm_income() {
		return farm_income;
	}

	public void setFarm_income(String farm_income) {
		this.farm_income = farm_income;
	}

	public String getOther_realestate() {
		return other_realestate;
	}

	public void setOther_realestate(String other_realestate) {
		this.other_realestate = other_realestate;
	}

	public String getStocks_participation() {
		return stocks_participation;
	}

	public void setStocks_participation(String stocks_participation) {
		this.stocks_participation = stocks_participation;
	}

	public String getStocks_income() {
		return stocks_income;
	}

	public void setStocks_income(String stocks_income) {
		this.stocks_income = stocks_income;
	}

	public String getStocks_government() {
		return stocks_government;
	}

	public void setStocks_government(String stocks_government) {
		this.stocks_government = stocks_government;
	}

	public String getStocks_government_more_10_proc() {
		return stocks_government_more_10_proc;
	}

	public void setStocks_government_more_10_proc(
			String stocks_government_more_10_proc) {
		this.stocks_government_more_10_proc = stocks_government_more_10_proc;
	}

	public String getStocks_government_income() {
		return stocks_government_income;
	}

	public void setStocks_government_income(String stocks_government_income) {
		this.stocks_government_income = stocks_government_income;
	}

	public String getStocks_commercial_company() {
		return stocks_commercial_company;
	}

	public void setStocks_commercial_company(String stocks_commercial_company) {
		this.stocks_commercial_company = stocks_commercial_company;
	}

	public String getStocks_commercial_company_income() {
		return stocks_commercial_company_income;
	}

	public void setStocks_commercial_company_income(
			String stocks_commercial_company_income) {
		this.stocks_commercial_company_income = stocks_commercial_company_income;
	}

	public String getStocks_commercial_company_government() {
		return stocks_commercial_company_government;
	}

	public void setStocks_commercial_company_government(
			String stocks_commercial_company_government) {
		this.stocks_commercial_company_government = stocks_commercial_company_government;
	}

	public String getStocks_commercial_company_government_more_10proc() {
		return stocks_commercial_company_government_more_10proc;
	}

	public void setStocks_commercial_company_government_more_10proc(
			String stocks_commercial_company_government_more_10proc) {
		this.stocks_commercial_company_government_more_10proc = stocks_commercial_company_government_more_10proc;
	}

	public String getStocks_commercial_company_government_income() {
		return stocks_commercial_company_government_income;
	}

	public void setStocks_commercial_company_government_income(
			String stocks_commercial_company_government_income) {
		this.stocks_commercial_company_government_income = stocks_commercial_company_government_income;
	}

	public String getStocks_other_company() {
		return stocks_other_company;
	}

	public void setStocks_other_company(String stocks_other_company) {
		this.stocks_other_company = stocks_other_company;
	}

	public String getStocks_other_company_income() {
		return stocks_other_company_income;
	}

	public void setStocks_other_company_income(
			String stocks_other_company_income) {
		this.stocks_other_company_income = stocks_other_company_income;
	}

	public String getAuction() {
		return auction;
	}

	public void setAuction(String auction) {
		this.auction = auction;
	}

	public String getSelf_employment() {
		return self_employment;
	}

	public void setSelf_employment(String self_employment) {
		this.self_employment = self_employment;
	}

	public String getSelf_employment_personal() {
		return self_employment_personal;
	}

	public void setSelf_employment_personal(String self_employment_personal) {
		this.self_employment_personal = self_employment_personal;
	}

	public String getSelf_employment_with_others() {
		return self_employment_with_others;
	}

	public void setSelf_employment_with_others(
			String self_employment_with_others) {
		this.self_employment_with_others = self_employment_with_others;
	}

	public String getSelf_employment_income() {
		return self_employment_income;
	}

	public void setSelf_employment_income(String self_employment_income) {
		this.self_employment_income = self_employment_income;
	}

	public String getRepresent_self_employment() {
		return represent_self_employment;
	}

	public void setRepresent_self_employment(String represent_self_employment) {
		this.represent_self_employment = represent_self_employment;
	}

	public String getRepresent_self_personal() {
		return represent_self_personal;
	}

	public void setRepresent_self_personal(String represent_self_personal) {
		this.represent_self_personal = represent_self_personal;
	}

	public String getRepresent_self_with_others() {
		return represent_self_with_others;
	}

	public void setRepresent_self_with_others(String represent_self_with_others) {
		this.represent_self_with_others = represent_self_with_others;
	}

	public String getRepresent_self_income() {
		return represent_self_income;
	}

	public void setRepresent_self_income(String represent_self_income) {
		this.represent_self_income = represent_self_income;
	}

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

	public String getOther_income() {
		return other_income;
	}

	public void setOther_income(String other_income) {
		this.other_income = other_income;
	}

	public String getCars() {
		return cars;
	}

	public void setCars(String cars) {
		this.cars = cars;
	}

	public String getLiabilities() {
		return liabilities;
	}

	public void setLiabilities(String liabilities) {
		this.liabilities = liabilities;
	}

	public List<ImageNode> getImages() {
		return images;
	}

	public void setImages(List<ImageNode> images) {
		this.images = images;
	}

}
