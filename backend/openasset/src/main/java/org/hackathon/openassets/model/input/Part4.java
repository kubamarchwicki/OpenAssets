package org.hackathon.openassets.model.input;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Part4 {

	private String stocks_government;
	private String stocks_government_more_10_proc;
	private String stocks_government_income;
	private String stocks;
	private String stocks_income;

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

	public String getStocks() {
		return stocks;
	}

	public void setStocks(String stocks) {
		this.stocks = stocks;
	}

	public String getStocks_income() {
		return stocks_income;
	}

	public void setStocks_income(String stocks_income) {
		this.stocks_income = stocks_income;
	}

}
