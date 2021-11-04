# oblig3
git og continuous integration 

Første jeg gjorde var å klone repositoriet og pushe koden fra oblig 2. 

Brukte en java med gradle workflow template som starter når man pusher eller gjør en pull-request. 
Workflowen vil gjøre ting som å bygge og lage dependencies, men det viktigste er at den kjører alle kodene.

For å passe på at det funket, så la jeg til en bug i den ene testen, som gjorde at workflowen stoppet pga. en test ikke funket. Jeg fjernet dermed buggen for å bekrefte at det funket igjen.
