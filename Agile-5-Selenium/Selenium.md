![](RackMultipart20220613-1-ekpt0l_html_db26975031fb734e.png)

# Selenium ( IDE )

# Introductie

Selenium Suite is een open-source test-framework voor onder andere het testen van webapplicaties. Selenium beperkt zich tot het &#39;geautomatiseerd&#39; testen van webapplicaties. Van belang hierbij is om aan te geven dat het gaat om het geautomatiseerd uitvoeren van de tests. De testcases zal je nog steeds vooraf zelf moeten maken en opvoeren in de tool.

# Wat is Selenium?

Selenium Suite bestaat uit vier onderdelen, namelijk:

- Selenium Integrated Development Environment (IDE)
- Selenium Remote Control (RC)
- WebDriver
- Selenium Grid

![My Remote Image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image2.png)

Wij gaan werken met Selenium IDE. Dit is het simpelste onderdeel binnen Selenium Suite en is het makkelijkst om te leren. Het is een plugin die makkelijk te installeren is. Door de eenvoud is Selenium IDE eigenlijk alleen geschikt als een prototyping tool. Wanneer je complexere testgevallen wil gebruiken kun je beter Selenium RC of WebDriver gebruiken. Ondertussen is er ook al een Selenium 4 uit.

# Wat is Selenium IDE

Selenium IDE is ontworpen door Shinya Kastani in 2006. Het grote voordeel is dat het gaat om geautomatiseerd testen, waardoor je geen ervaring hoeft te hebben met programmeren. Er is een add-on gemaakt die je kan installeren op je internet browser en die je helpt met het creëren van testen. Het heeft een easy-to-use interface om automated test scripts te maken. Selenium IDE maakt een opname van de gedragingen van de gebruiker in de browser en exporteert die als een herhaalbaar script.

Ondanks dat je Selenium IDE kunt gebruiken zonder enige kennis van programmeren, zou je eigenlijk wel bekend moeten zijn met HTML, JavaScript en de DOM (Document Object Model) om deze tool optimaal te kunnen benutten. Kennis van JavaScript is nodig bij het gebruik van het Selenium command &quot;runScript&quot;.

Selenium IDE maakt gebruik van automatische aanvulling als je testen aan het maken bent. Het voordeel hiervan is:

- Het helpt de tester om commando&#39;s sneller in te voeren
- Het zorgt ervoor dat er geen ongeldige commando&#39;s ingevoerd kunnen worden.

# Selenium IDE plugin installeren

De IDe plugin in op de volgende manier te installeren. Ga in je browser naar de volgende site:

- Chrome: chrome://extensions
- Firefox: about:addons

Hier kun je de plugin installeren en indien nodig activeren.

# Hoe ziet Selenium IDE eruit

Als je Selenium IDE opent, krijg je het volgende scherm:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image3.png)

In dit scherm heb je, zoals je ziet, vier keuzes:

- Een nieuwe test opnemen in een nieuw project
- Een reeds bestaand project openen
- Een nieuw project maken
- Selenium IDE sluiten

De eerste keer zal je kiezen voor de 1e of de 3e mogelijkheid.

Als je een test gemaakt hebt, ziet je scherm er als volgt uit:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image4.png)

Bovenin staat de naam van je project, in dit geval Selenium IDE. Als er naast de naam van je project een sterretje staat, betekent dit dat je project nog niet opgeslagen is. Aan de rechterkant van je project staan 4 knoppen, probeer eens uit waar ze toe dienen!

Aan de linkerkant zie je welke tests er in je project staan. In dit geval is dat één test, namelijk &#39;Netflix Clone&#39;. Deze staat nu geopend, en in het midden zie je bovenaan de website staan waarvan deze test gemaakt is. Eronder staan de stappen die gemaakt zijn tijdens het opnemen. Boven de URL van de website staan ook meerdere knoppen, de belangrijkste is de meest rechter, daarmee start of stop je namelijk de opname van je test!

# Opdracht 1

Onderzoek via deze link: [https://www.guru99.com/introduction-selenuim-ide.html](https://www.guru99.com/introduction-selenuim-ide.html) de mogelijkheden van Selenium IDE. De screenshots zijn van een oude versie van Selenium, maar de mogelijkheden zijn verder hetzelfde. Verwerk de belangrijkste punten, dingen die je nog niet wist en dingen die voor jou nog niet vanzelfsprekend zijn in je eigen woorden in je Github Classroom ( Selenium_Opdracht.md ).

# Scripts maken door op te nemen

Je kunt een script maken door een opname te maken. Dit is de makkelijkste manier om een script te maken. Er zijn nog meer manieren, maar daar komen we later op terug.

Als eerste start je Selenium IDE op. Je vult de webpagina in (voor dit voorbeeld is de website van Linkedin gebruikt) en je start de opname. Nu wordt automatisch de website van Linkedin geopend. Om te kunnen bekijken wat een bepaald onderdeel als titel heeft, doe je het volgende:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image5.png)

Je klikt met de rechtermuisknop op het object van de website waar je de naam van wilt weten, in dit geval is dat het logo van Linkedin. Dan ga je naar Selenium IDE, vervolgens assert, en dan naar title. Nu wordt in je opname van Selenium weergegeven wat de titel is van dit object. Hierdoor kun je nagaan of je op de goede pagina zit. Over Assert later meer.

Als je vervolgens de stappen volgt om in te loggen (in dit geval met ongeldige inloggegevens) en daarna de opname stopt, krijg je dit te zien in je IDE:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image6.png)

Nu kan je je test opslaan, in dit geval bijvoorbeeld onder de naam Login. Je bestand wordt opgeslagen als een html bestand.

Door op de play button te klikken, word je hele test stap voor stap uitgevoerd. Op deze manier kun je je test oneindig reproduceren. Mocht er dus iets veranderd worden door de developers op de site, dan kun je heel makkelijk je test runnen om te kijken of het inloggen nog werkt. (Wat in dit geval natuurlijk niet werkt omdat ik valse gegevens ingevoerd heb).

Onderin je project zie je de log staan. Als de test helemaal goed is uitgevoerd, dan krijg je onderstaande log. Onderaan zie je in het groen staan dat de test succesvol is uitgevoerd.

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image7.png)

Maar mocht er nou iets verkeerd gaan, dan geeft de log een foutmelding in het rood. In dit geval was ik al ingelogd bij Linkedin, waardoor de titel anders was (die we met assert na wilden laten kijken). Hierdoor geeft Selenium een error en stopt hij met het uitvoeren van het script.

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image8.png)

# Opdracht 2

Kun je zelf nog meer voorbeelden bedenken waarom deze manier van test cases maken handig is? Schrijf ze op in je Classroom ( Selenium_Opdracht.md ) .

# Opdracht 3

Installeer Selenium IDE (als je dit nog niet gedaan hebt), en maak een nieuw project aan. Oefen hiermee door een test op te nemen. Kies een website uit, maak een test door op verschillende dingen aan te klikken op de website, en maak een screenshot van je test en sla deze op op je Github Classroom. Leg hierbij uit wat je gedaan hebt. Let wel op dat als je een wachtwoord in moet vullen, dat je deze onherkenbaar maakt op je screenshot. Zorg ook dat je je project opslaat! ( Selenium_Opdracht.md ) 
# Selenium Commands

Naast een script maken met een opname, kan je het script ook zelf schrijven met commands. Selenium commands kunnen maximaal twee parameters hebben: target en value. Deze zijn niet altijd nodig, het hangt er vanaf hoeveel het command nodig heeft.

Selenium heeft 3 typen commands, namelijk:

- Actions
- Accessors
- Assertions

**Actions** zijn commands die rechtstreeks communiceren met elementen van de pagina. Bijvoorbeeld: het command &#39;click&#39; is een action omdat het meteen reageert met het element waar je op klikt. Zo is &#39;type&#39; ook een action command omdat je waardes in de tekstveld plaatst, en het veld laat je meteen zien wat je ingevoerd hebt.

**Accessors** zijn commands waarmee je waarden in een variabele op kunt slaan. Voorbeeld: Het command &#39;storeTitle&#39; is een accessor omdat het alleen de pagina titel leest en opslaat in een variabele. Er is dus geen interactie met enige element op de pagina.

**Assertions** zijn commands die verifiëren of aan een bepaalde voorwaarde is voldaan. Er zijn 3 verschillende soorten assertions, namelijk:

- _Assert_ → als een Assert command mislukt, wordt de test meteen gestopt. (Zie het voorbeeld over Linkedin eerder)
- _Verify_ → als een Verify commando mislukt, wordt dit gelogd en gaat Selenium IDE daarna verder met de rest van de test
- _WaitFor_ → voordat er verder gegaan wordt met het volgende commando, wacht &#39;waitFor&#39; eerst tot een bepaalde voorwaarde waar is.
  - Als de voorwaarde waar wordt tijdens de wachtperiode, dan wordt deze stap overgeslagen.
  - Als de voorwaarde niet waar wordt, is deze stap mislukt. Dit wordt gelogd, en de test wordt verder uitgevoerd.
  - Standaard is de wachttijd ingesteld op 30 seconden. Je kan dit zelf veranderen.

Meest gebruikte commands

| **Command** | **Aantal parameters** | **Beschrijving** |
| --- | --- | --- |
| open | 0 - 2 | Opent een pagina dmv een URL |
| click/clickAndWait | 1 | Klikt op een specifiek element |
| type/typeKeys | 2 | Typt een aantal karakters in |
| verifyTitle/assertTitle | 1 | Vergelijkt de echte pagina titel met een verwachte waarde |
| verifyTextPresent | 1 | Controleert of een bepaalde tekst gevonden wordt in de pagina |
| verifyElementPresent | 1 | Controleert de aanwezigheid van een bepaald element |
| verifyTable | 2 | Vergelijkt de inhoud van een tabel met verwachte waarden |
| waitForPageToLoad | 1 | Pauzeert de uitvoering tot de pagina volledig is geladen |
| waitForElementPresent | 1 | Pauzeert de uitvoering tot een bepaald element aanwezig is |

# Script maken door middel van commands

Hierboven hebben we de belangrijkste commands genoteerd. Met deze commands kun je zelf een script maken. Dit gaat als volgt:

Je begint op dezelfde manier als wanneer je een script op gaat nemen, je typt bovenin de website in waar je heen wilt gaan. In dit geval gaan we Techgrounds opzoeken op Google.

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image9.png)

Je command line is nu verder nog helemaal leeg, deze gaan we nu vullen met de commands die nodig zijn om de zoekopdracht te voltooien. Klik op de eerste lege regel (die is hier blauw gekleurd). Om de website te openen, begin je als eerste met &#39;open&#39; te typen bij command. Iedere keer als je een nieuw command in wil typen, moet je op de volgende lege regel klikken. Vervolgens willen we eerst weer &#39;assert title&#39; doen, om te kijken of we op de goede pagina zitten. Hiervoor gaan we gebruik maken van iets nieuws, namelijk de Inspector.

| Inspector Als je in je webbrowser zit, kun je met de rechtermuisknop klikken in je browser, en klikken op &#39;Inspecteren&#39;. Voor een Mac moet je eerst Ontwikkelmenu inschakelen, klik [hier](https://www.imymac.com/nl/mac-tips/how-to-inspect-element-on-mac.html) om te zien hoe dat moet.
Als je de Inspector open hebt staan, zie je precies hoe de html er voor die pagina uitziet, en hoe elementen genoemd worden. In dit geval willen we weten wat de titel van de pagina is. ![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image10.png)Dit staat altijd vermeld in de zogenoemde &#39;head&#39;. Zoek in de head naar &#39;title&#39;. Je ziet dat er staat Google. Dit gaan we dus invoeren bij &#39;assert title&#39;. |
| --- |

Op de tweede regel gaan we dus bij command &#39;assert title&#39; invoeren, en bij target &#39;Google&#39;.

Vervolgens willen we dat Selenium automatisch klikt op het invoerveld. Ook dit gaan we weer opzoeken met de Inspector. Op het moment dat je ergens met je muis overheen gaat bij de inspector, zie je aan de linkerkant over welk element het gaat. In dit geval moeten we dus op zoek gaan naar de zoekbalk. Dit staat altijd in de &#39;body&#39;, dit geeft je al een beetje een richtlijn waar we moeten gaan zoeken. Na even goed kijken naar de onderdelen, en wat delen uitklappen, komen we uiteindelijk bij het volgende uit:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image11.png)

Voor de command in Selenium hebben we de waarde van de &#39;name&#39; nodig. In dit geval is dat name=q.

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image12.png)

Op de derde command regel vullen we dan in: click, en bij target name=q.

Tot nu toe hebben we dit dan staan:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image13.png)

Maar dan zijn we er nog niet. We willen nog dat Techgrounds ingevoerd gaat worden in het zoekvenster en dat er op Zoeken geklikt wordt.

De volgende stap wordt het intypen, daar hebben we het command &#39;type&#39; voor. Nu hebben we 2 variabelen nodig, namelijk waar het ingevoerd gaat worden, en wat er ingevoerd moet worden. Bij command voeren we in &#39;type&#39;, bij target wederom &#39;name=q&#39;, en bij value de waarde die we in willen voeren, in dit geval &#39;Techgrounds&#39;.

Dit ziet er dan als volgt uit:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image14.png)

Je kan altijd tussendoor je script runnen door bovenin op de play knop te klikken, om te kijken of je test tot nu toe goed gaat.

Als laatste willen we nog dat de &#39;Google Zoeken&#39; knop ingedrukt gaat worden. Dit kan ook via de inspector, maar dit kan ook op een andere manier.

Als je in je command line &#39;click&#39; invoert, en dan vervolgens bij target klikt op &#39;Select target in page&#39;, dan gaat je test runnen en kan je op de knop klikken die je wilt hebben. ![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image15.png)

Nu vult hij automatisch je target in. Sla nu je werk op en probeer je test te runnen en kijk of alles werkt.

# Opdracht 4

Maak van twee sites een script door middel van de commands, gebruik hierbij ook de Inspector. Maak een screenshot, zet deze in je Github Classroom en beschrijf wat je gedaan

hebt. ( Selenium_Opdracht.md )

# Andere commands

Naast de commands die we hiervoor gebruikt hebben, zijn er nog meer. We gaan er nu nog een aantal behandelen.

|
verifyElementPresent → komt terug als TRUE als het element wel gevonden is op de pagina, FALSE als het element niet gevonden is
verifyElementNotPresent → precies andersom, TRUE als het element niet gevonden is, FALSE als het wel gevonden is
Dit kun je bijvoorbeeld gebruiken bij een inlogpagina, om te controleren of het inlogveld (met een bepaalde naam) inderdaad aanwezig is op de pagina. |
| --- |
|
verifyTextPresent → komt terug als TRUE als de specifieke tekst gevonden is op de pagina, FALSE als het niet gevonden is.
verifyTextNotPresent → weer precies andersom
Let op! Dit command is hoofdlettergevoelig! |
|
verifyElementPositonLeft → meet op hoeveel pixels van de linkerkant van de pagina het element aanwezig is. Komt terug als FALSE als het vooral gespecificeerde aantal pixels niet overeenkomt met de werkelijkheid.

verifyElementPositionTop → meet op hoeveel pixels van de bovenkant van de pagina het element aanwezig is. Komt ook terug als FALSE als het vooral gespecificeerde aantal pixels niet overeenkomt met de werkelijkheid. |
| clickAndWaittypeAndWaitselectAndWait
Deze elementen zorgen ervoor dat er wordt gewacht met het doorgaan met het volgende commando tot de pagina geopend is. |
| waitForTitle
waitForTextPresent
waitForAlert
Deze elementen zorgen ervoor dat er wordt gewacht met het doorgaan met het volgende command tot een bepaalde element geladen is, zoals bijvoorbeeld een popup. Het gaat dan niet om de hele pagina, maar om een element dat verandert zonder dat de hele pagina herladen wordt. |

# Opdracht 5

Oefen op een website met de bovenstaande commands. Maak er een script van, maak een screenshot en zet deze in je Classroom. Beschrijf ook wat je gedaan hebt.

Variabelen opslaan en gebruiken

Om variabelen op te slaan in Selenium IDE, gebruik je het command &#39;store&#39;. Dat doe je op de volgende manier:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image16.png)

In dit geval is de tekst die we ingevoerd willen hebben, dus de inhoud van de variabele, de tekst &#39;gebruikersnaam&#39;. Hier geven dan de naam &#39;varUserName&#39; aan. Om deze variabele nu te kunnen gebruiken, hoeven we hem alleen maar op deze manier in te voeren: ${varUserName}. Dat ziet er op deze manier uit:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image17.png)

Nu opent Selenium de Linkedin pagina, hij maakt een variabele aan en klikt op het inlogveld, en vult vervolgens de variabele in.

( Selenium_Opdracht.md )

# Opdracht 6

- Waarom is het handig om een variabele op te kunnen slaan, en deze te gebruiken in Selenium? Werk dit uit in je Classroom.
- Oefen zelf met het command store, maak screenshots en plaats deze in je Classroom. Beschrijf wat je gedaan hebt.

Breakpoints

Breakpoint kun je gebruiken in Selenium IDe om te uitvoering van je code te controleren. Iedere keer als je een breakpoint invoert, stopt de code met uitvoeren. Dit helpt om te controleren om de code werkt zoals verwacht. Breakpoints in Selenium IDE helpen bij het debuggen (= het opsporen en verhelpen van bugs in programma&#39;s.)

Om Breakpoints toe te voegen, ga je in je script staan op het punt waar je een breakpoint in wil voegen. Dit kan op twee manieren:

1. Je klikt met je rechter muisknop op dit command, dan krijg je het volgende:

![](https://github.com/Mitch1996/QA-Image-Store/blob/main/Selenium/image18.png)

Hier klik je op Toggle breakpoint.

1. Je drukt op je toetsenbord op de letter b.

Nu staat er aan de linkerkant een blauw pijltje bij het command. Dit betekent dat je een breakpoint toegevoegd hebt. Als je nu je code draait, stopt hij bij ieder breakpoint. Als blijkt dat je code klopt, kun je de test verder laten lopen door op play te drukken. Op deze manier kan je tussendoor controleren of je script klopt, voordat alle commands uitgevoerd worden. Je kunt in één test meerdere breakpoints toevoegen.

Starting point

Je kan je code op een ander punt in je test laten beginnen. In de afbeelding hierboven kan je het al zien staan. Helemaal onderin staat Play from here. Waarom zou je dit willen doen? Stel, je hebt een test gemaakt van een site waar je in moet loggen. Na de eerste keer uitvoeren, blijf je ingelogd staan. Als je de test de volgende keer vanaf het begin af zal laten spelen, zal hij niet goed uitgevoerd worden, omdat je al ingelogd staat. Als je het startpunt zet meteen na het inloggen, wordt de rest van de test gewoon uitgevoerd en krijg je hier dus geen foutmelding bij. In tegenstelling tot de breakpoints, kun je maar 1 startpunt aangeven (eigenlijk heel logisch, je kan niet op twee punten tegelijk starten).

( Selenium_Opdracht.md )

# Opdracht 7

Oefen met de breakpoints en starting point in je script. Maak hier een screenshot van en verwerk deze in je Classroom. Beschrijf wat je gedaan hebt.

( Selenium_Opdracht.md )