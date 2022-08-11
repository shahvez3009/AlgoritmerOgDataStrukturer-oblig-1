[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=448317&assignment_repo_type=GroupAssignmentRepo)

# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer.
Oppgaven er levert av følgende studenter:

- Alime Deniz Ølcek, s354399, s354399@oslomet.no
- Tintun Naing, s354358, s354358@oslomet.no
- Shahvez Mahmood, S354404, s354404@oslomet.no
- Rebekka Løvås Svalland, s354345, s354345@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:


- Shahvez har hatt hovedansvar for oppgave 2,4,5,6, 7b), 8 og 9.
- Alime har hatt hovedansvar for oppgave 1,7 a) og 9.
- Rebekka har hatt hovedansvar for oppgave 3,4.
- Tintun har hatt hovedansvar for oppgave 8 og 9.
- Vi har i fellesskap løst oppgave 10.


# Oppgavebeskrivelse

Teorispørsmål:

1. Når blir det flest ombyttinger? Det er flest ombyttinger i enhver situasjon der det største tallet ligger på index 0.
2. Når blir det færrest ombyttinger? Det skjer færrest ombyttinger når tallene forekommer i stigende rekkefølge
3. Hvor mange blir det i gjennomsnitt? I gjennomsnitt skjer det: n / 2

oppgave 1) så gikk vi frem ved å finne den største verdien i tabellen og returnere den. 
Dette skjer ved å sammenlikne et tall og naboen dens forså å bytte om plassene. 
Som følge vil det største tallet forekomme lengst til høyre i tabellen.
Deretter returnere det siste tallet i denne tabellen 



oppgave 2) Sjekker om lengden er mindre enn 1, og isfall returner null. 
kjører en for-løkke for å undersøke og tester om array er sortert. 
Deretter en ny for-løkke å sjekke antall unike verdier ved å se om nabo tallet er høyere 

oppgave 3)

Sjekker om lengden til array er mindre enn 1, returnerer isåfall 0. 
Deretter initialiserer at det er 1 variant i array. 
Looper gjennom array og ser etter om array sin i og j er like, hvis det er så bryter loopen. 
Om verdiene i = j inkrementerer vi ulike. 

oppgave 4)
Oppgaven her er løst ved mye kodet fra kompendiet. Vi så hintet for denne oppgaven i test. Der stod om partisjonering. Vi så da på kompendiet om både partisjonering og kvikksortering. Fant en midtverdi og sorterte via den. Brukte modulo for å finne oddetall. Partallene ville da automatisk være på venstre side. Kvikksort bidro til sorteringen av disse oppgavene.

Oppgave 5)
Oppgaven her er løst ved mye kodet fra kompendiet. Vi så hintet for denne oppgaven i test. Der stod om partisjonering. Vi så da på kompendiet om både partisjonering og kvikksortering. Fant en midtverdi og sorterte via den. Brukte modulo for å finne oddetall. Partallene ville da automatisk være på venstre side. Kvikksort bidro til sorteringen av disse oppgavene.

oppgave 6)
Oppgaven her er løst via kodet fra kompendiet. Kopierer verdiene i arrayet som blir mistet ved flytting av verdiene i arrayet. Bruker for løkke for å flytte dem enten bakover eller framover. Når det er gjort, kopierer vi inn verdiene satt inn i hjelpetabellen på de plassene de skal være på etter forskyvingen. 

oppgave 7)

Denen oppgaven ble løst gjennom å lage to forskjellige arrays og deretter flette disse sammen inn i et nytt array. Sjekker om lengden av i og j samsvarer med lengden av order så lenge while-løkken gjennomfører. Hvis i og j overgår lengden av ordet vil da bokstavene fra det resterende ordet settes inn på slutten.

Med videre i oppgaven fletter vi sammen med hver bokstav fra hvert ord som har samme posisjon.
Bruker en for-løkke for å finne det lengste ordet. 
Lager en string som inneholder flettingen, og returnerer resultatet av flettingen. 


oppgave 8)

lager en tabell for indeksene og sammenligner den med den reelle tabellen.
Returnerer tabellen med indekser til verdiene av den reelle tabellen uten å endre verdiene etter stigende rekkefølge 


oppgave 9)

Tar inn heltallsarray og returnerer indekser til de tre minste verdiene. 
Lager en if statement som tester at det er minst tre verdier. 
Bruker deretter metoden fra oppgave 8), og henviser at det er tre verdier som skal ut. 
Definerer index til minst, nestminst og tredjeminst. Tester verdiene og sammenligner om verdiene opp mot hverandre. 
Oppdaterer dem følgende gjennom loopen, for så å returnere indexene til verdiene. 



oppgave 10)

Går frem ved å gjøre om char-verdi til integer verdi for bokstav, men ble hensyntatt bare på grunn av oppgaven (brukes ikke). 
Lager et array som inneholder indexer(256) til chars. Deretter inkrementerer vi verdien til x. 
Følgende lopper vi gjennom toCharArray, forså å sjekke med en if-statement om det er noe resterende bokstaver igjen x-indeks listen. 
Returnerer falsk dersom bokstaven ikke eksisterer lenger i listen. 


