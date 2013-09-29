OpenAssets project 
------------------

Forms to digitalize Assets Declaration from Members of Parlament

Zależności
==========
Projekt używa mongodb to przechowywania danych.
Konfiguracja bazy opiera się na zmiennej systemowej MONGOHQ_URL

mongodb://<user>:<pass>@<host>:<port>/<collection> 

Jeżeli zmienna nie jest ustawiona przymowana jest wartość domyślna:
mongodb://localhost/hackaton

Uruchomienie projektu lokalnie
==============================
Po uruchomieniu i skonfigurowaniu MongoDB, uruchamiany serwer

'''bash
mvn jetty:run
'''

Strona dostępna jest pod adresem: http://localhost:8080/

Uruchomienie projektu na heroku
===============================

Zgodnie z instrukcjami:
https://devcenter.heroku.com/articles/getting-started-with-java#deploy-your-application-to-heroku
https://devcenter.heroku.com/articles/mongohq#use-with-java

1. Utwórz aplikację na heroku
heroku apps:create <nazwa>

2. Dodaj obsługę bazy MongoDB (do tego potrzeba jest zweryfikowanego konta: https://devcenter.heroku.com/articles/account-verification)
heroku addons:add mongohq:sandbox

Infomacje o bazie (także connection string) można zobaczyć wydając komendę
heroku addons:open mongohq
W przeglądarce zostanie otwarta pełna informacja nt. bazy

3. Załaduj przykładowe dane do bazy
Zgodnie z opisem: https://devcenter.heroku.com/articles/mongohq#upgrading-your-database
Zamiast mongorespore importujemy zawatość pliku init_import.json
mongoimport -c documents -h <hostname>.mongohq.com:<port> -d <baza_danych> -u <username> -p <haslo> /sciezka/do/pliku/init_import.json 

4. Dodaj nowy `git remote`
git remote add heroku git@heroku.com:<nazwa>.git

5. Wyślij aplikację
git push heroku master


