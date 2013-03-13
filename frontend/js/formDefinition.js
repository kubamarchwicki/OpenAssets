var app = app || {};
app.form_definition = {

		page1: {
			fields : [
				{ name: "name", desc: "Imię"},
				{ name: "date_of_birth", desc: "Data urodzenia"},
				{ name: "place_of_birth": desc: "Miejsce urodzenia" },
				{ name: "work", desc: "Miejsce zatrudnienia"},
				{ name: "cash_pln", desc: "Środki pieniężne zgromadzone w walucie polskiej" }, 
				{ name: "cash_other", desc: "Środki pieniężne zgromadzone w walucie obcej" }, 
				{ name: "stocks", desc: "Papiery wartościowe" }
			]
		},
		page2: {
			fields: [
				{ name: "house_area", desc: "Mieszkanie o powierzchni" },
				{ name: "house_value", desc: "Wartość mieszkania" },
				{ name: "house_ownership", desc: "Tytuł prawny" },
				{ name: "farm_type", desc: "Rodzaj gospodarstwa" },
				{ name: "farm_area", desc: "Powierzchnia" },
				{ name: "farm_value", desc: "Wartość" },
				{ name: "farm_buildings", desc: "Rodzaj zabudowy" },
				{ name: "farm_ownership", desc: "Tytuł prawny" },
				{ name: "farm_income", desc: "Przychód i dochód" }
				{ name: "other_realestate", desc: "Inne nieruchomości" },
				{ name: "stocks", desc: "Uczestniczę w spółce cywilnej lub osobowej..." },
				{ name: "stocks_income", desc: "Z tego tytułu osiągnąłem w roku ubiegłym..." },
				{ name: "stocks_government", desc: "Posiadam udziały w spółce handlowej z udziałem państwowych..." }
			]
			
		},
		page3: {
			fields: [
				{ name: "stocks_government_more_10_proc", desc: "Udziały te stanowią pakiet większy niż 10% udziałów w spółce:" },
				{ name: "stocks_government_income", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości:" },
				{ name: "stocks_commercial_company", desc: "Posiadam udziały w spółkach handlowych" },
				{ name: "stocks_commercial_company_income", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości" },
				{ name: "stocks_commercial_company_government", desc: "Posiadam akcje w spółkach handlowych" },
				{ name: "stocks_commercial_company_government_more_10proc", desc: "Akcje te stanowią pakiet większy niż 10% akcji w spółce" },
				{ name: "stocks_commercial_company_government_income", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości" },
				{ name: "stocks_other_company", desc: "Posiadam akcje w innych spółkach handlowych" },
				{ name: "stocks_other_company_income", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości" },
				{ name: "auction", desc: "Nabyłem od Skarbu Państwa, innej państwowej..."}	
			]
			
		}
]

