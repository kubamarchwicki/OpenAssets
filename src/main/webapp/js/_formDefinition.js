var app = app || {};
app.form_definition = {

    page3: {
        field: [
            {name: "stocks_government_more_10_proc", desc: "udziały te stanowią pakiet większy niż 10 % udziałów w spółce"},
            {name: "stocks_government_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochów w wysokości "},
            {name: "stocks", desc: "Posiagam udział w innych spółkach handlowych - należy podać liczbę i emitenta udziałów"},
            {name: "stocks_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochód w wysokości"},
            {name: "stocks_government_more_10_proc", desc: "akcje te stanowią pakiet większy niż 10% akcji w spółce"},
            {name: "stocks_government_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochód w wysokości"},
            {name: "stocks", desc: "Posiadam akcje w innych spółkach handlowych - należy podać liczbę i emitenta"},
            {name: "stocks_income", desc: "Z tego tytułu osiągnąłem(ęłam) w roku ubiegłym dochów wysokości"},
            {name: "auction", desc: "Nabyłem(am) (nabył mój małżonek) od Skarbu Państwa, innej państwowej osoby prawnej, jednostek samorządu terytorialnego, ich związków lub komunalnej osoby prawnej następujące mienie, które podległo zbyciu w drodze przetargu - należy podać opis mienia i datę nabycia, od kogo"}
        ]
    },

    page4: {
        field: [
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
        field: [
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
        field: [
            {name: "liabilities", desc: "Zobowiązania pieniężne o wartości powyżej 10 000 zł"}
        ]
    }


}