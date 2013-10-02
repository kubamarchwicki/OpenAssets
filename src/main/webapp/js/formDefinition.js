var app = app || {};
app.form_definition = {

		page1: {
			fields : [
				{ name: "name", desc: "Imię"},
				{ name: "date_of_birth", desc: "Data urodzenia"},
				{ name: "place_of_birth", desc: "Miejsce urodzenia" },
				{ name: "work", desc: "Miejsce zatrudnienia"},
				{ name: "cash_pln", desc: "Środki pieniężne zgromadzone w walucie polskiej" }, 
				{ name: "cash_other", desc: "Środki pieniężne zgromadzone w walucie obcej" }, 
				{ name: "stocks", desc: "Papiery wartościowe" },
				{ name: "house_area", desc: "Dom o powierzchni" },
				{ name: "house_value", desc: "O wartości" },
				{ name: "house_ownership", desc: "Tytuł prawny" }
			]
		},
		page2: {
			fields: [
				{ name: "flat_area", desc: "Mieszkanie	 o powierzchni" },
				{ name: "flat_value", desc: "O wartości" },
				{ name: "flat_ownership", desc: "Tytuł prawny" },
				{ name: "farm_type", desc: "Rodzaj gospodarstwa" },
				{ name: "farm_area", desc: "Powierzchnia" },
				{ name: "farm_value", desc: "Wartość" },
				{ name: "farm_buildings", desc: "Rodzaj zabudowy" },
				{ name: "farm_ownership", desc: "Tytuł prawny" },
				{ name: "farm_income", desc: "Przychód i dochód" },
				{ name: "other_realestate", desc: "Inne nieruchomości" },
				{ name: "stocks_participation", desc: "Uczestniczę w spółce cywilnej lub osobowej..." },
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
			
		},
		page4: {
	        fields: [
	            {name: "self_employment", desc: "Prowadzę działalność gospodarczą (należy podać formę prawną i przedmiot działalności)"},
	            {name: "self_employment_personal", desc: "osobiście"},
	            {name: "self_employment_with_others", desc: "wspólnie z innymi osobami"},
	            {name: "self_employment_income", desc: "Z tego tytułu osiągnąłem (ęłam) w roku ubiegłym przychód i dochód w wysokości"},
	            {name: "represent_self_employment", desc: "Zarządzam działalnością gospodarczą lub jestem przedstawicielem, pełnomocnikiem takiej działalności (należy podać formę prawną i przedmiot działalności"},
	            {name: "represent_self_personal", desc: "osobiście"},
	            {name: "represent_self_with_others", desc: "wspólnie z innymi osobami"},
	            {name: "represent_self_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochód w wysokości"},
	            {name: "public_company", desc: "W spółce handlowej (nazwa, siedziba spółki)"},
	            {name: "public_company_board", desc: "jestem członkiem zarządu (od kiedy)"},
	            {name: "public_company_directors", desc: "jestem członkiem rady nadzorczje (od kiedy)"},
	            {name: "public_company_audit", desc: "jestem członkiem komisji rewizyjnej (od kiedy)"},
	            {name: "public_company_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochód w wysokości"}
	        ]
	    },

	    page5: {
	        fields: [
	            {name: "foundation", desc: "W fundacjach i stowarzyszeniach prowadzących działalność gospodarczą"},
	            {name: "foundation_board", desc: "jestem członkiem zarządu (od kiedy)"},
	            {name: "foundation_directors", desc: "jestem członkiem rady nadzorczej (od kiedy)"},
	            {name: "foundation_audit", desc: "jestem członkiem komisji rewizyjnej (od kiedy)"},
	            {name: "foundation_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochów w wysokości"},
	            {name: "other_income", desc: "Inne dochody osiągnięte z tytułu zatrudnienia lub innej działalności zarobkowej lub zajęć, z podaniem kwot uzyskanych z każdego tytułu"},
	            {name: "cars", desc: "Składniki mienia ruchomego o wartości powyżej 10 000 zł (w przypadku pojazdów mechanicznych należy podać markę, model i rok produkcji)"}
	        ]
	    },

	    page6: {
	        fields: [
	            {name: "liabilities", desc: "Zobowiązania pieniężne o wartości powyżej 10 000 zł"}
	        ]
	    }

}

