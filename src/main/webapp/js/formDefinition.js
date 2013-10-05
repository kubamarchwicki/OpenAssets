var app = app || {};
app.form_definition = {

		page1: {
			fields : [
				{ name: "miejsce_urodzenia", desc: "Miejsce urodzenia" },
				{ name: "miejsce_zatrudnienia", desc: "Miejsce zatrudnienia"},
				{ name: "gotowka_pln", desc: "Środki pieniężne zgromadzone w walucie polskiej" }, 
				{ name: "gotowka_euro", desc: "Środki pieniężne zgromadzone w walucie obcej" }, 
				{ name: "akcje", desc: "Papiery wartościowe" },
				{ name: "dom_powierzchnia", desc: "Dom o powierzchni" },
				{ name: "dom_wartosc", desc: "O wartości" },
				{ name: "dom_tytul_prawny", desc: "Tytuł prawny" }
			]
		},
		page2: {
			fields: [
				{ name: "mieszkanie_powierzchnia", desc: "Mieszkanie	 o powierzchni" },
				{ name: "mieszkanie_wartosc", desc: "O wartości" },
				{ name: "mieszkanie_tytul_prawny", desc: "Tytuł prawny" },
				{ name: "gospodarstwo_rodzaj", desc: "Rodzaj gospodarstwa" },
				{ name: "gospodarstwo_powierzchnia", desc: "Powierzchnia" },
				{ name: "gospodarstwo_wartosc", desc: "Wartość" },
				{ name: "gospodarstwo_zabudowa", desc: "Rodzaj zabudowy" },
				{ name: "gospodarstwo_tytul_prawny", desc: "Tytuł prawny" },
				{ name: "gospodarstwo_przychod", desc: "Przychód i dochód" },
				{ name: "nieruchomosci_inne", desc: "Inne nieruchomości" },
				{ name: "spolki", desc: "Uczestniczę w spółce cywilnej lub osobowej..." },
				{ name: "spolki_przychod", desc: "Z tego tytułu osiągnąłem w roku ubiegłym..." },
				{ name: "spolki_panstw", desc: "Posiadam udziały w spółce handlowej z udziałem państwowych..." }
			]
			
		},
		page3: {
			fields: [
				{ name: "spolki_panstw_10proc", desc: "Udziały te stanowią pakiet większy niż 10% udziałów w spółce:" },
				{ name: "spolki_panstw_przychod", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości:" },
				{ name: "spolki_handlowe", desc: "Posiadam udziały w spółkach handlowych" },
				{ name: "spolki_handlowe_przychod", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości" },
				{ name: "spolki_handlowe_panstw", desc: "Posiadam akcje w spółkach handlowych" },
				{ name: "spolki_handlowe_panstw_10proc", desc: "Akcje te stanowią pakiet większy niż 10% akcji w spółce" },
				{ name: "spolki_handlowe_panstw_przychod", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości" },
				{ name: "spolki_inne", desc: "Posiadam akcje w innych spółkach handlowych" },
				{ name: "spolki_inne_przychod", desc: "Z tego tytułu osiągnąłem w roku ubiegłym dochód w wysokości" },
				{ name: "przetargi", desc: "Nabyłem od Skarbu Państwa, innej państwowej..."}	
			]
			
		},
		page4: {
	        fields: [
	            {name: "dzialanosc_gosp", desc: "Prowadzę działalność gospodarczą (należy podać formę prawną i przedmiot działalności)"},
	            {name: "dzialanosc_gosp_osobista", desc: "osobiście"},
	            {name: "dzialanosc_gosp_zinnymi", desc: "wspólnie z innymi osobami"},
	            {name: "dzialanosc_gosp_przychod", desc: "Z tego tytułu osiągnąłem (ęłam) w roku ubiegłym przychód i dochód w wysokości"},
	            {name: "zarzad_dzialanosc_gosp", desc: "Zarządzam działalnością gospodarczą lub jestem przedstawicielem, pełnomocnikiem takiej działalności (należy podać formę prawną i przedmiot działalności"},
	            {name: "zarzad_dzialanosc_gosp_osobista", desc: "osobiście"},
	            {name: "zarzad_dzialanosc_gosp_zinnymi", desc: "wspólnie z innymi osobami"},
	            {name: "zarzad_dzialanosc_gosp_przychod", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochód w wysokości"},
	            {name: "spolki_handlowe_rep", desc: "W spółce handlowej (nazwa, siedziba spółki)"},
	            {name: "spolki_handlowe_rep_zarzad", desc: "jestem członkiem zarządu (od kiedy)"},
	            {name: "spolki_handlowe_rep_rada", desc: "jestem członkiem rady nadzorczje (od kiedy)"},
	            {name: "spolki_handlowe_rep_komisja", desc: "jestem członkiem komisji rewizyjnej (od kiedy)"},
	            {name: "spolki_handlowe_rep_przychod", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochód w wysokości"}
	        ]
	    },

	    page5: {
	        fields: [
	            {name: "fundacje", desc: "W fundacjach i stowarzyszeniach prowadzących działalność gospodarczą"},
	            {name: "fundacje_zarzad", desc: "jestem członkiem zarządu (od kiedy)"},
	            {name: "fundacje_rada", desc: "jestem członkiem rady nadzorczej (od kiedy)"},
	            {name: "fundacje_komiscja", desc: "jestem członkiem komisji rewizyjnej (od kiedy)"},
	            {name: "fundacje_przychod", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochów w wysokości"},
	            {name: "inne_przychody", desc: "Inne dochody osiągnięte z tytułu zatrudnienia lub innej działalności zarobkowej lub zajęć, z podaniem kwot uzyskanych z każdego tytułu"},
	            {name: "samochod", desc: "Składniki mienia ruchomego o wartości powyżej 10 000 zł (w przypadku pojazdów mechanicznych należy podać markę, model i rok produkcji)"}
	        ]
	    },

	    page6: {
	        fields: [
	            {name: "zobowiazania", desc: "Zobowiązania pieniężne o wartości powyżej 10 000 zł"}
	        ]
	    }

}

