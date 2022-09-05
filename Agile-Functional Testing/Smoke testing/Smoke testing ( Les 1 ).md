# Smoke testing

Smoke Testing is een software testproces dat bepaalt of de ingezette software-build stabiel is of niet. Smoke Testing is een bevestiging voor het QA-team om door te gaan met verdere software tests. Het bestaat uit een minimale reeks tests die op elke build worden uitgevoerd om software functionaliteiten te testen. Smoke tests worden ook wel 'Build Verification Testing' of 'Confidence Testing' genoemd.

Simpel gezegd, we controleren of de belangrijke functies werken en of er geen showstoppers zitten in de build die wordt getest.

Het is een mini- en snelle regressietest van belangrijke functionaliteiten. Het is een eenvoudige test die laat zien dat het product klaar is om getest te worden. Dit helpt bij het bepalen of de build gebrekkig is, zodat verder testen geen verspilling van tijd en middelen wordt.


# Wanneer een smoke test?

Smoke Testing wordt gedaan wanneer de nieuwe functionaliteiten van software worden ontwikkeld en geïntegreerd met bestaande build die wordt ingezet in QA/staging-omgeving. Het zorgt ervoor dat alle kritieke functionaliteiten correct werken of niet correct werken.

Bij deze testmethode implementeert het ontwikkelteam de build in QA. De subsets van testcases worden genomen en vervolgens voeren testers test cases uit op de build. Het QA-team toetst de applicatie aan de kritische functionaliteiten. Deze reeks testcases is ontworpen om fouten in de build aan het licht te brengen. Als deze tests worden doorstaan, gaat het QA-team verder met Functioneel Testen.

Elke storing geeft aan dat het systeem moet worden teruggestuurd naar het ontwikkelteam. Wanneer er een verandering in de build is, voeren we Smoke Testing uit om de stabiliteit te garanderen.

Voorbeeld:  ( Nieuwe registratieknop is toegevoegd in het inlogvenster en de build wordt geïmplementeerd met de nieuwe code. Wij voeren de Smoke test uit op een nieuwe build. )

# Wie doen de smoke tests?

Na het vrijgeven van de build naar de QA-omgeving, wordt Smoke Testing uitgevoerd door de QA-ingenieurs/QA-lead. Telkens wanneer er een nieuwe build is, bepaalt het QA-team de belangrijkste functionaliteit in de applicatie om Smoke tests uit te voeren. Het QA-team controleert op showstoppers in de applicatie die wordt getest.

Testen uitgevoerd in een ontwikkelomgeving op de code om de juistheid van de applicatie te garanderen voordat de build wordt vrijgegeven voor QA, dit staat bekend als Sanity-testing (Hier gaan we later nog verder op in ). 

Het is meestal smal en diep testen. Het is een proces dat verifieert dat de applicatie die in ontwikkeling is, voldoet aan de functionele basisvereisten.

Sanity-tests bepalen de voltooiing van de ontwikkelingsfase en nemen de beslissing om het softwareproduct al dan niet door te geven voor de verdere testfase.


## Voordelen van Manual testing

Smoke tests spelen een belangrijke rol bij de ontwikkeling van software omdat het de correctheid van het systeem in de beginfase garandeert. Hierdoor kunnen we testinspanningen besparen. Hierdoor brengen Smoke tests het systeem in een goede staat. Zodra we de Smoke tests hebben voltooid, beginnen we alleen met functioneel testen.

* Alle showstoppers in de build worden geïdentificeerd door Smoke tests uit te voeren.
* Smoke tests worden gedaan nadat de build is vrijgegeven aan QA. Met behulp van Smoke tests worden de meeste defecten in de beginfase van softwareontwikkeling geïdentificeerd.
* Met Smoke tests vereenvoudigen we de detectie en correctie van grote defecten.
* Door Smoke tests kan het QA-team defecten in de applicatie functionaliteit vinden die mogelijk door de nieuwe code zijn opgedoken.
* Smoke tests vinden de belangrijkste ernstige defecten.

Voorbeeld 1: Logboek Venster: In staat om naar het volgende venster te gaan met een geldige gebruikersnaam en wachtwoord door op de verzendknop te klikken.

Voorbeeld 2: Gebruiker kan zich niet afmelden bij de webpagina.

# Hoe doen we een smoke test?

Smoke tests worden meestal handmatig gedaan, hoewel er een mogelijkheid is om hetzelfde te bereiken door middel van automatisering. Het kan per organisatie verschillen.

## Manual Smoke tests

Smoke tests worden over het algemeen handmatig gedaan. De aanpak verschilt van organisatie tot organisatie. Smoke tests worden uitgevoerd om ervoor te zorgen dat de navigatie van kritieke paden verloopt zoals verwacht en de functionaliteit niet belemmert. Zodra de build is vrijgegeven aan QA, moeten functionele test cases met hoge prioriteit worden genomen en worden getest om de kritieke defecten in het systeem te vinden. Als de test slaagt, gaan we verder met het functioneel testen. Als de test mislukt, wordt de build afgewezen en teruggestuurd naar het ontwikkelteam voor correctie. QA start opnieuw met Smoke tests met een nieuwe build versie. Smoke tests worden uitgevoerd op nieuwe builds en worden geïntegreerd met oude builds om de correctheid van het systeem te behouden. Voordat Smoke tests worden uitgevoerd, moet het QA-team controleren op de juiste build versies.

## Smoke tests door automatisering

Automation testing wordt gebruikt voor Regression testing. We kunnen echter ook een reeks geautomatiseerde testgevallen gebruiken om tegen Smoke Testen te werken. Met behulp van Automation testing kunnen ontwikkelaars de build onmiddellijk controleren wanneer er een nieuwe build klaar is voor implementatie.

In plaats van het handmatig herhalen van tests telkens wanneer de nieuwe softwareversie wordt geïmplementeerd, worden geregistreerde Smoke test cases uitgevoerd op basis van de build. Het controleert of de belangrijkste functionaliteiten nog goed werken. Als de test mislukt, kunnen ze de build corrigeren en de build onmiddellijk opnieuw implementeren. Hierdoor kunnen  ze tijd besparen en zorgen voor een kwaliteitsvolle opbouw van de QA-omgeving.

Met behulp van een geautomatiseerde tool legt de test engineer alle handmatige stappen vast die worden uitgevoerd in de software build.


## Smoke testing cycle

Onderstaande flow chart laat zien hoe Smoke tests worden uitgevoerd. Zodra de build is geïmplementeerd in QA en de Smoke tests zijn doorstaan, gaan we verder met functionele tests. Als de Smoke test mislukt, stoppen we met testen totdat het probleem in de build is opgelost.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Functuinal%20testing/Smoke%20testing%20(%20Cycle%20).png)

## Voordelen van Smoke tests

Hier zijn enkele voordelen voor Smoke testing:

* Eenvoudig uit te voeren testen
* Defecten worden in een vroeg stadium gesignaleerd.
* Verbetert de kwaliteit van het systeem
* Vermindert het risico
* Vooruitgang is gemakkelijker toegankelijk.
* Bespaart testinspanning en tijd
* Gemakkelijk om kritieke fouten te detecteren en fouten te corrigeren.
* Het loopt snel
* Minimaliseert integratie risico's

# Wat gebeurt er als we niet smoke testen?

Als we in een vroeg stadium geen Smoke tests uitvoeren, kunnen er in latere stadia defecten optreden, waar dit kosteneffectief kan zijn. En het defect dat in latere stadia wordt gevonden, zou een showstopper kunnen zijn waardoor het de vrijgave van deliverables kan beïnvloeden.

# Samenvatting

In Software Engineering moeten Smoke-tests zonder fouten op elke build worden uitgevoerd, omdat dit helpt om defecten in een vroeg stadium te vinden. Smoke test activiteit is de laatste stap voordat de software-build de systeemfase ingaat. Smoke tests moeten worden uitgevoerd op elke build die wordt getest. Dit geldt voor nieuwe ontwikkelingen en grote en kleine releases van het systeem.

Alvorens Smoke tests uit te voeren, moet het QA-team ervoor zorgen dat de juiste build versie van de te testen applicatie wordt uitgevoerd. Het is een eenvoudig proces dat een minimum aan tijd kost om de stabiliteit van de applicatie te testen.

Smoke tests kunnen de testinspanning minimaliseren en de kwaliteit van de toepassing verbeteren. Smoke tests kunnen handmatig of geautomatiseerd worden uitgevoerd, afhankelijk van de klant en de organisatie.



