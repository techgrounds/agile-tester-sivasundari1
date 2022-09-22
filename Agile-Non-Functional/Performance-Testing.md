# Performance Testing

## Wat is Performance Testen?

Performance Testing, ook bekend als 'Perf Testing', is een type van testen dat wordt uitgevoerd om te controleren hoe een applicatie of software presteert onder werkbelasting in termen van responsiviteit en stabiliteit. Het doel van de performance test is om de knelpunten in de Performance van een applicatie te identificeren en te verwijderen.

Deze test wordt hoofdzakelijk uitgevoerd om na te gaan of de software voldoet aan de verwachte vereisten voor applicatie snelheid, schaalbaarheid en stabiliteit.

#
## Soorten Performance Tests

Load testing

**Load tests** zijn een soort **Performance tests** waarbij de applicatie wordt getest op zijn prestaties bij normaal en piekgebruik. De prestaties van een applicatie worden gecontroleerd met betrekking tot de reactie op het verzoek van de gebruiker en het vermogen. Om consistent te reageren binnen een geaccepteerde tolerantie op verschillende gebruikersbelastingen.

**De belangrijkste overwegingen zijn:**

- Wat is de maximale belasting die de toepassing aankan voordat de toepassing zich onverwacht gaat gedragen?
- Hoeveel gegevens kan de database aan voordat het systeem vertraagt of de crash wordt waargenomen?
- Zijn er netwerkgerelateerde problemen die moeten worden aangepakt?

Stress testing

Stress tests worden gebruikt om manieren te vinden om het systeem te breken. De test geeft ook het bereik aan van de maximale belasting die het systeem aankan.

Over het algemeen hebben stress tests een stapsgewijze aanpak waarbij de belasting geleidelijk wordt verhoogd. De test wordt gestart met een belasting waarvoor de applicatie al is getest. Daarna wordt de belasting langzaam opgevoerd om het systeem te belasten. Het punt waarop de servers niet meer reageren op de verzoeken wordt beschouwd als het breekpunt.

**De volgende vragen moeten worden beantwoord:**

- Wat is de maximale belasting die een systeem kan verdragen voordat het kapot gaat?
- Hoe gaat het systeem kapot?
- Is het systeem in staat te herstellen als het eenmaal is gecrasht?
- Op hoeveel manieren kan een systeem breken en welke zijn de zwakke knooppunten bij het verwerken van de onverwachte belasting?

Volume testing

**Volume tests** zijn bedoeld om te verifiëren dat de prestaties van de applicatie niet worden beïnvloed door het volume van de gegevens die door de applicatie worden verwerkt. Om een **Volume test** uit te voeren, wordt een enorme hoeveelheid gegevens in de database ingevoerd. Deze test kan een incrementele of een gestage test zijn. Bij de incrementele test wordt het volume van de gegevens geleidelijk opgevoerd.

In het algemeen groeit de databasegrootte met het gebruik van de applicatie, en is het nodig om de applicatie te testen met een zware database. Een goed voorbeeld hiervan zou een website van een nieuwe school of een hogeschool kunnen zijn die aanvankelijk kleine hoeveelheden gegevens opslaat, maar na 5-10 jaar is de hoeveelheid gegevens in de database van de website veel groter.

Capacity testing

=\> Is de toepassing in staat om zowel onder normale als onder piekbelasting aan het bedrijfsvolume te voldoen?

Capacity tests worden over het algemeen gedaan voor toekomstverwachtingen. Capacity tests richten zich op het volgende:

- Zal de applicatie in staat zijn om de toekomstige belasting te ondersteunen?
- Is de omgeving in staat om de komende verhoogde belasting aan te kunnen?
- Wat zijn de extra resources die nodig zijn om de omgeving voldoende capabel te maken?

Capacity tests worden gebruikt om te bepalen hoeveel gebruikers en/of transacties een bepaalde webapplicatie kan ondersteunen en nog steeds aan de performance kan voldoen. Tijdens deze tests worden resources zoals processorcapaciteit, netwerkbandbreedte, geheugengebruik, schijfcapaciteit, enz. in overweging genomen en aangepast om het doel te bereiken.

Online bankieren is een perfect voorbeeld van waar capaciteitstesten een grote rol kunnen spelen **.**

Reliability / Recovery testing

Reliability tests of Recovery tests - hierbij wordt nagegaan of de applicatie na een storing of abnormaal gedrag al dan niet in staat is terug te keren naar de normale toestand en hoe lang dat duurt (met andere woorden, tijdsinschatting).

Als een online handelssite een storing ondervindt waarbij de gebruikers op een bepaald moment van de dag (piekuren) geen aandelen kunnen kopen/verkopen, maar dit na een uur of twee wel kunnen, kunnen we zeggen dat de applicatie betrouwbaar is of hersteld is van het abnormale gedrag.

#
## Proces van Performance tests

**#1) Analyse/verzameling van vereisten**

Het performance team werkt samen met de klant om de technische en zakelijke vereisten te identificeren en te verzamelen. Dit omvat het verkrijgen van informatie over de architectuur van de applicatie, gebruikte technologieën en database, beoogde gebruikers, functionaliteit, applicatie gebruik, testvereisten, hardware- en softwarevereisten, enz.

**#2) POC/Toolselectie**

Eens de sleutel ( Key ) functionaliteit geïdentificeerd is, wordt de POC (Proof Of Concept - een soort demonstratie van de real-time activiteit, maar dan in beperkte zin) uitgevoerd met de beschikbare tools.

De lijst van beschikbare tools hangt af van de kostprijs van de tool, het protocol dat de toepassing gebruikt, de technologieën die gebruikt worden om de toepassing te bouwen, het aantal gebruikers dat we simuleren voor de test, enz. Tijdens de POC worden scripts gemaakt voor de geïdentificeerde hoofdfunctionaliteit en uitgevoerd met 10-15 virtuele gebruikers.

**#3) Plan en ontwerp van de Performance test**

Afhankelijk van de informatie verzameld in de vorige stadia, worden test planning en design uitgevoerd.

Test Planning omvat informatie over hoe de Performance test zal plaatsvinden - testomgeving, werklast, hardware, enz.

**#4) Ontwikkeling van Performance tests**

- Use cases worden gemaakt voor de functionaliteit die in het testplan is geïdentificeerd als de scope van PT.
- Deze use cases worden gedeeld met de klant voor hun goedkeuring. Dit is om er zeker van te zijn dat het script zal worden opgenomen met de juiste stappen.
- Na goedkeuring begint de scriptontwikkeling met het opnemen van de stappen in de use cases met de performance test tool die tijdens de POC (Proof of Concepts) werd geselecteerd en die wordt uitgebreid met Korrelatie (voor het omgaan met dynamische waarden), Parameterisatie (waarde vervanging) en aangepaste functies, afhankelijk van de situatie of behoefte.
- De scripts worden vervolgens gevalideerd door verschillende gebruikers.
- Parallel aan het maken van scripts, blijft het performance team ook werken aan het opzetten van de testomgeving (Software en hardware).
- Het performance team zal ook zorg dragen voor Metadata (back-end) door middel van scripts indien deze activiteit niet wordt opgepakt door de klant.

**#5) Modellering van Performance tests**

Performance Load Model wordt gemaakt voor de testuitvoering. Het hoofddoel van deze stap is om te valideren of de gegeven performantie metrieken (voorzien door de klanten) al dan niet bereikt worden tijdens de test. Er zijn verschillende benaderingen om een Load model te maken. In de meeste gevallen wordt de "
[Wet van Little](https://leanleadership.be/artikels/de-wet-van-little-1/)" gebruikt.

**#6) Test Uitvoering**

Het scenario is ontworpen volgens het Load-model in Controller of Performance Center, maar de initiële tests worden niet uitgevoerd met het maximum aantal gebruikers dat in het Load-model zit.

De testuitvoering gebeurt incrementeel. Bijvoorbeeld, als het maximum aantal gebruikers 100 is, worden de scenario's eerst uitgevoerd met 10, 25, 50 gebruikers enzovoort, om uiteindelijk uit te komen op 100 gebruikers.

**#7) Analyse van testresultaten**

Testresultaten zijn de belangrijkste deliverable voor de performance tester. Dit is waar we de ROI (Return on Investment) en de productiviteit kunnen bewijzen die een performance test inspanning kan opleveren.

**Enkele van de beste praktijken die het proces van resultaatanalyse helpen:**

1. Een unieke en zinvolle naam aan elk testresultaat - dit helpt bij het begrijpen van het doel van de test.
2. Neem de volgende informatie op in de samenvatting van het testresultaat:

- Reden voor de mislukking(en)
- Verandering in de prestaties van de applicatie ten opzichte van de vorige test run
- Wijzigingen die zijn aangebracht in de test vanaf het punt van applicatiebouw of testomgeving.
- Het is een goede gewoonte om na elke test run een resultatenoverzicht te maken, zodat de analyseresultaten niet elke keer dat er naar testresultaten wordt verwezen, worden samengevoegd.
- PT heeft over het algemeen vele test runs nodig om tot een juiste conclusie te komen.
- **Het is goed om de volgende punten in de resultaat samenvatting op te nemen:**

1. Doel van de test
2. Aantal virtuele gebruikers
3. Samenvatting van het scenario
4. Duur van de test
5. Doorvoer
6. Grafieken
7. Vergelijking grafieken
8. Responstijd
9. Fout opgetreden
10. Aanbevelingen

**#8) Rapport**

De testresultaten moeten worden vereenvoudigd, zodat de conclusie duidelijker is en niet hoeft te worden afgeleid. Het ontwikkelingsteam heeft meer informatie nodig over de analyse, de vergelijking van de resultaten en de details over hoe de resultaten zijn verkregen.

# Voorbeeld Performance Test Strategy Template

Over ABC chat applicatie - Laten we aannemen dat dit een chat workbench is die wordt gebruikt in een bedrijf door hun customer support agent. Deze chat applicatie maakt gebruik van XMPP-protocol dat wil zeggen, Extensible Messaging and Presence Protocol en Open Fire-server voor het verzenden en ontvangen van Instant messages.

Sommige verbeteringen zijn gemaakt om deze bestaande chat client zoals Remote PC controle, PC-diagnose, Reparatie tools, Online chat, Enz., dus deze performance Test strategie is een voorbeeld van dergelijke toepassingen.

Laten we aannemen dat het projectteam voor deze toepassing heeft besloten JMeter te gebruiken voor Performance Testing en JIRA voor het bijhouden van gebreken ( Issues ).

**1# Introductie)**

Het doel van dit template is om te definiëren/uit te leggen hoe Performance Tests zullen worden uitgevoerd op de ABC chat applicatie voor de huidige en toekomstige status.

ABC chat applicatie is een in-house remote support Agent workbench. Deze werkbank zal worden gebruikt om verzoeken van klanten te behandelen. Deze workbench heeft mogelijkheden zoals Online chat, Klant Identificatie, Remote PC controle, PC diagnose, en reparatie tools.

**Doelstelling**

De belangrijkste doelstellingen van Performance Testing zijn als volgt:

- Om het vertrouwen te krijgen dat de veranderingen aan de bestaande chatapplicatie in lijn zijn met de gedefinieerde Service Level Agreement.
- Verzekeren dat de applicatie performance, service beschikbaarheid, en de stabiliteit van de applicatie niet worden beïnvloed als gevolg van de nieuwe verbeteringen.
- De transactie responstijden blijven binnen de aanvaardbare tolerantie gedurende het toenemende belastingprofiel.
- JVM's vertonen gedurende de toenemende belastingsprofielen een stabiel geheugengebruik.

**De onderstaande afbeelding verklaart duidelijk het proces van Performance Testing & Optimization:**

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Non-Functional/per1.png)

**Architectuur**

Je moet het architectuurdiagram van jouw project in deze sessie opnemen.

**#2) Scope**

**In Scope**

Hieronder is de Performance Testing scope voor ABC chat workbench:

- Kennisverwerving van de belangrijkste zakelijke transacties en de verdeling van de belasting bouwen na een gedetailleerde studie van het systeem.
- Identificeer de kritieke scenario's voor performance testen met hulp van verschillende project sporen.
- Gebruik de vorige release resultaten als een basislijn voor toekomstige releases.
- Verifiëren en valideren van de performance test omgeving en de Performance/Load test tool infrastructuur voor alle additionele Agent Machines.
- Voorbereiden van performance test scripts met behulp van JMeter voor de geïdentificeerde scenario's die de geïdentificeerde piekbelasting nabootsen.
- Opzetten van performance monitoring op de servers voor het monitoren van de test om de knelpunten tijdens de test uitvoeringsfase te identificeren.
- Publiceren van performance test resultaten.
- Coördineren met verschillende stakeholders om de geïdentificeerde performantie problemen op te lossen.
- Baseline het prestatieniveau voor toekomstige releases.

**Buiten scope**

- Functioneel testen, UAT, System Testing & Security Testing.
- Performance testen/monitoren van alle derde partij interfaces.
- Performance tuning. (Meestal wordt tuning gedaan door een ander team, indien er performance engineers zijn om het systeem te tunen dan kan dit toegevoegd worden in de Inscope).
- Code profiling / Hardware sizing / Capaciteitsplanning.
- Beveiliging / Vulnerability testen / UAT / White box testen.
- Data generatie voor Performance testen.
- Niet-functionele testen (Bijvoorbeeld, failover, disaster recovery, back-up, bruikbaarheid) anders dan de performance testen.
- Testen van een mobiele oplossing.
- Third-Party Applicatie Performance Testen & Tuning.
- Realisatie van performance aanbevelingen, Applicatie code veranderingen en de vendor-ondersteunde producten/server configuratie veranderingen zullen buiten scope zijn vanuit het Performance Team perspectief.
- Infrastructuur Ondersteuning / Build Deployment / Environment Readiness / Database Restore / Netwerk Ondersteuning etc.

**#3) Aanpak**

Performance testen voor ABC chat zullen worden uitgevoerd met behulp van Jmeter door het schrijven van aangepaste XMPP plugins die gebruik maken van een smack library voor XMPP verbindingen. Deze libraries worden gebruikt om verbindingen op te zetten, in te loggen en chatberichten te versturen naar de XMPP server.

Deze libraries worden gebundeld in een jar file die in de Jmeter wordt geplaatst en is ontworpen op basis van de te testen scenario's. De Jmeter Work Bench wordt geïnstalleerd in de lokale machine die verbinding maakt met de JMeter server die de Load Generators heeft om de vereiste belasting op het Chat server systeem te genereren om het systeem gedrag te controleren.

Het test scenario wordt gescript met behulp van de JMeter tool. De scripts worden zoals vereist. Het schema wordt gemaakt met de vereiste ramp-up om de echte-wereld scenario's te simuleren.

**Het testscenario wordt opgesplitst en gemeten in de volgende aspecten:**

**a) Baseline Test:** Elk scenario uitvoeren met 1 Vuser en meerdere iteraties om vast te stellen of de applicatie prestaties al dan niet voldoen aan de business Service Level Agreement.

**b) Basisbelasting** Test: Om te voldoen aan de Business Benchmark onder load test, zal het Performance Testing team een base load test uitvoeren die zal helpen om eventuele systeem performance problemen te identificeren met toenemende belasting en creëert de baseline voor het volgende niveau van performance testing.

**c) Piekbelasting** / Schaalbaarheid Test: Performance Testing team zal meerdere tests uitvoeren met toenemende Vusers om te voldoen aan de verwachte belasting en ook om de prestaties van de applicatie te meten om de prestatiecurve vast te stellen en te identificeren of de inzet de service level agreements kan ondersteunen onder de piekbelasting van gebruikers.

Het helpt bij het tunen of de capaciteitsplanning van de individuele virtuele Java machines (JVM), het totale aantal benodigde JVM's, en de processors. Dit wordt bereikt door het aantal Vusers te verhogen tot 50%, 75%, 100% en 125% van de piekcapaciteit.

**d) Duurtest:** Performance Testing team zal deze test uitvoeren gedurende een periode van 8 uur / 16 uur / 24 uur om geheugenlekken, prestatieproblemen in de tijd, en de algemene stabiliteit van het systeem te identificeren. Tijdens duurtesten controleert het Performance Testing team de belangrijkste prestatie-indicatoren, zoals de reactietijden van transacties en de stabiliteit van het geheugengebruik.

Systeembronnen zoals CPU, geheugen en IO moeten worden gemonitord met de hulp van het projectteam.

De performance testomgeving wordt verondersteld een replica te zijn van de productieomgeving. De tests zullen worden uitgevoerd met een incrementele belasting om te identificeren waar de applicatie faalt.

# Performance test scenario

**Voorbeeld,**

**Scenario 1:** De chat van agent en klant valideren voor X aantal gelijktijdige sessies.

Soorten Performance tests

In de onderstaande tabel worden de verschillende soorten prestatietests met hun doelstellingen toegelicht.

| **Test Type** | **Objective** |
| --- | --- |
| Baseline Test | Bepaal de beste prestatie onder specifieke volumes die als referentie zullen dienen voor latere metingen... |
| Load Test | Meet de Performance van het systeem onder de verwachte piek productiebelasting. |
| Endurance Test | Het meten van de stabiliteit van het systeem onder hoog volume gedurende een langere periode. |
| Stress Test | Meet de Performance van het systeem onder ongunstige omstandigheden. |


# Performance Metingen

- **Client side metingen:**

| **S.No** | **Metric** | **Description** | **Format** |
| --- | --- | --- | --- |
| 1 | Transaction Response Time | Responstijd van pagina's tijdens de stationaire toestand van de Performance test | Graph |
| 2 | Throughput | De hoeveelheid gegevens die de VUsers in de loop der tijd van de server hebben ontvangen | Graph |
| 3 | Hits/second | The number of HTTP requests made by VUsers to the Web server during the scenario run | Graph |
| 4 | Number of Passed/Failed Transactions
 | Het aantal HTTP-verzoeken van VU-gebruikers aan de webserver tijdens de uitvoering van het scenario | Excel |
| 5 | Transaction Error Rate | Het percentage transacties dat tijdens de uitvoering van de test mislukte | Graph |

- **Systeem- en netwerk prestatiemetingen**

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Non-Functional/per2.png)

# Performance test activiteiten en resultaten

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Non-Functional/per3.png)

**#4) Testgegevens**

Er wordt van uitgegaan dat de gegevens van de Performance omgeving een kopie zullen zijn van de productiegegevens en dat de vereiste testgegevens door het projectteam zullen worden verstrekt.

**#5) Criteria voor binnenkomst en vertrek**

- Toegang tot alle applicaties in de omgeving.
- Klaarheid van de omgeving is voltooid.
- Performance Test Data gereed.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Non-Functional/per3.png)

**#6) Gebreken Beheer**

- De Defect Management module in JIRA zal gebruikt worden in het project voor het loggen van defecten en voor het traceren tot sluiting.
- Identificatie van defecten die worden gevonden tijdens de test uitvoeringsfase zullen worden vastgelegd in JIRA en deze defecten zullen worden opgelost door het ontwikkelingsteam volgens de onderstaande ernst.
- Defect review vergaderingen zouden worden gehouden op een dagelijkse basis met de deelname van het testen, ontwikkeling, Kwaliteit Analisten, en business teams.
- De criteria om defecten op te lossen zouden strenger worden naarmate het project de Go Live datum nadert. De richtlijnen voor de criteria om gebreken te herstellen worden gepubliceerd tijdens de evaluatievergaderingen.

Definitie van de ernst van het defect

De definities van de ernst codes zijn als volgt:

| **Severity** | **Beschrijving van ontwikkelings- en verbeteringsproblemen** |
| --- | --- |
| **Blocker** | Systeemfout, show stopper, Netwerk problemen |
| **Critical** | Systeemfouten, geen duidelijke workaround, onderbreking of ontbrekende bedrijfsfunctionaliteit
 |
| **Major** | Er is een ernstig probleem ontdekt waarvoor een oplossing bestaat die misschien niet voor alle gebruikers duidelijk is, maar het product mag niet worden vrijgegeven zonder de oplossing |
| **Medium** | Het probleem kan eenvoudig worden opgelost, maar dit type defect kan worden vrijgegeven na goedkeuring door de bedrijfs- en/of projectmanager |
| **Low** | Cosmetische problemen die de bedrijfs functionaliteit niet hinderen of andere intermitterende problemen die niet elke keer kunnen worden gereproduceerd |

**#7) Testing tools & Technieken**

| **Tools** | **Purpose** |
| --- | --- |
| **Jmeter** | Om de belasting en de prestaties van de ABC Chat applicatie te controleren **.** |

**#8) Criteria voor opschorting en hervatting**

**Hieronder staan de kritieke opschortings- en hervattingscriteria die van invloed zijn op de testactiviteiten:**

| **Suspension** | **Impact** | **Resumption** |
| --- | --- | --- |
| Environment not set up | Testen kan niet doorgaan
 | Environment readiness. |
| Application found to be unstable | Testen kan niet doorgaan
 | Issue resolved |
| Test Data not available | Testen kan niet doorgaan
 | Test Data ready
 |

**#9) Testresultaten**

De Performance Test Deliverables omvatten:

- Performance Test strategie
- Prestatie-eisen document
- Performance Test Scenario Document
- Performance Test Scripts
- Performance Test resultaten

**#10) Rollen & Verantwoordelijkheden**

De rollen en verantwoordelijkheden worden duidelijk uitgelegd in de onderstaande tabel.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Non-Functional/per5.png)

### **#11) Potential Risks & Mitigation Plan**

| **S.No** | **Risk** | **Probability** | **Impact** | **Mitigation Plan** | **Owner** |
| --- | --- | --- | --- | --- | --- |
| 1 | Test Data unavailability for performance load test executions | H | H | De geraamde data voor de uitvoering van de Performance tests moeten worden herzien en bijgewerkt. Functioneel/Dev-team ondersteuning vereist voor gegevensverzameling. | -- |
| 2 | Environmental Issues | L | M | Herprioriteer Deliverables | -- |
| 3 | Change in Functionality/design during performance test execution
 | M | H | Dit vereist herbewerking van de Performance testscenario's | -- |
| 4 | Extra performance runs to troubleshoot performance issues | M | H | De schema's voor Performance tests zouden worden gewijzigd en bijgewerkt voor het productteam. | -- |
| 5 | Estimations are prepared based on 1 bug fix build for performance. Multiple bug fix builds will delay test cycles and eventually it depends on when the next build will be available for rerun. | H | H | Herprioriteer de cycli voor de uitvoering van Performance tests. | -- |

**#12) Veronderstellingen**

- De Performance testomgeving zal een replica zijn van het product architectuur landschap. (d.w.z. correcte Hardware, Software, Interfaces, Integratie Lagen, enz).
- Performance scripts zullen worden ontworpen op basis van de kritische flows waarvoor het gebruik hoog is.
- Alle infrastructuur problemen moeten opgelost zijn voor het begin van de performantie testen. Alle systeemconfiguratie veranderingen die later worden doorgevoerd zullen de testresultaten ongeldig maken.
- Een applicatie is stabiel en klaar voor gebruik in de Performance test omgeving.
- Noodzakelijke hardware en software resources (zoals load generator machines/software, controller/agent machines) zijn beschikbaar gesteld.
- Eventuele wijzigingen in de scope zullen door een change control proces gaan en het performance testing team zal de impact op tijdlijnen en resources beoordelen.
- Van de respectieve servers wordt verwacht dat zij de belasting aankunnen.
- Applicatie trace logs moeten worden ingeschakeld voor de ondersteunende systemen voor monitoring doeleinden.

**#13) Afhankelijkheden**

- Beschikbaarheid van de performance testomgeving die een replica is van het product architectuur landschap.
- Ondersteuning vereist van verschillende Functionele, Ontwikkel, Database en Infrastructuur teams tijdens de test voorbereiding en uitvoering stadia.
- Er worden geen code veranderingen doorgevoerd tijdens de gehele Performance test fase omdat de tijd zeer beperkt is.
- In het geval van onvoorziene problemen die leiden tot beperkingen binnen de tijdlijnen. Als de tijdlijnen niet toestaan dat alle test scopes worden gehaald binnen de oorspronkelijke mijlpaal data. Is ondersteuning beschikbaar van de Release Managers, om een scoping en prioritering beslissing te nemen.
- Applicatie Business Gebruikers / Subject Matter Experts zullen beschikbaar worden gesteld voor functionele verduidelijkingen, en zakelijke transacties sign-off.
- ABC chat Program Manager zal beoordelen en aftekenen.

**#14) Afkortingen**

| **Afkorting** | **Description** |
| --- | --- |
| **DB** | **Database** |
| **Http** | **HyperText Transfer Protocol** |
| **JDBC** | **Java Database Connectivity** |
| **QA** | **Quality Assurance** |
| **SLA** | **Service Level Agreement** |
| **SME** | **Subject Matter Expert** |
| **UAT** | **User Acceptance Testing** |

Je zult nu wel begrepen hebben hoe je een effectieve Performance Test Strategie schrijft voor een Messaging applicatie.

# Beste praktijken voor realistische Performance Tests

Om een Performance Test project succesvol af te ronden, moeten we ervoor zorgen dat we het op de juiste manier doen vanaf de planningsfase, dat wil zeggen planning, ontwikkeling, uitvoering en analyse.

Laten we eens kijken naar elke fase in detail om Performance Testing effectief uit te voeren.

## **#1) Planning**

- Probeer de meest voorkomende workflows te identificeren, d.w.z. de business scenario's die getest moeten worden. Als het om een bestaande applicatie gaat, controleer dan de server logs om de meest gebruikte scenario's te begrijpen. Als de applicatie nieuw is, praat dan met het project management team om de belangrijkste business flow te begrijpen.
- Plan de Load test zo dat je een breed scala van workflows dekt, zoals licht gebruik, gemiddeld gebruik en piekbelasting.
- Er moeten veel cycli van de Load Test uitvoeren, dus probeer een kader te creëren zodat dezelfde scripts steeds opnieuw gebruikt kunnen worden. Probeer ook een back-up van de scripts te maken.
- Probeer te analyseren hoe lang een test moet lopen, is het een uur? Acht uur? Een dag of een week? Meestal zullen tests met een lange duur veel belangrijke defecten aan het licht brengen, zoals OS bugs, geheugenlekken, enz.
- Als de organisatie een APM (Application Monitoring Tool) gebruikt, dan kan deze gebruikt worden tijdens de test runs, zodat de performantieproblemen gemakkelijk geïdentificeerd kunnen worden en de hoofdoorzaak gemakkelijker achterhaald kan worden.

## **#2) Ontwikkeling**

- Probeer tijdens het ontwikkelen van de scripts, d.w.z. het opnemen, een meer betekenisvolle transactie naam te geven op basis van de business flow-namen die in het plan worden genoemd.
- Neem geen toepassingen van derden op en als ze toch worden opgenomen, probeer ze dan te filteren tijdens het verbeteren van de scripts.
- Niet alle dynamische waarden kunnen worden gecorreleerd met behulp van de autocorrelatiefunctie in de tool, dus probeer een handmatige correlatie uit te voeren om fouten te voorkomen.
- Probeer de performancetesten zo op te zetten dat de backend van de applicatie geraakt wordt en niet alleen de cache server.

## **#3) Uitvoering**

- Zorg ervoor dat de tests uitgevoerd worden in een productie-achtige omgeving, inclusief factoren zoals SSL, Load Balancer en Firewalls. Dit is nodig om een realistische belasting van het systeem te simuleren.
- Probeer een werklast te creëren die zeer realistisch is, je kunt dit krijgen door de server logs te controleren als het een bestaande applicatie is en als het een nieuwe applicatie is moet je deze informatie krijgen van het business team. Onthoud dat werklast erg belangrijk is voor het uitvoeren van succesvolle performance tests.
- Kom nooit tot een conclusie door testen uit te voeren met de helft van de productie omgeving, het is altijd aan te raden om testen uit te voeren in een omgeving die net hetzelfde is als de productie.
- Probeer tijdens het uitvoeren van long-run tests de run met regelmatige tussenpozen te bekijken om er zeker van te zijn dat de test goed verloopt.

## **#4) Analyse**

- Probeer de applicatie te analyseren door eerst een paar belangrijke tellers toe te voegen, wanneer er een bottleneck wordt gevonden probeer dan extra tellers toe te voegen met betrekking tot de bottleneck. Dit zal op zijn beurt helpen om het probleem gemakkelijker te vinden.
- Een applicatie kan om vele redenen falen: het kan niet reageren op een verzoek, reageren met een foutcode, de validatie logica kan falen of het kan te traag reageren. Probeer dit allemaal te onderzoeken voordat je tot een conclusie komt.