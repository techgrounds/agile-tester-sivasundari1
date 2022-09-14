# Regressie Testing

# Wat is Regressie testing?

Regressietesten is een vorm van softwaretesten die controleert of een applicatie blijft werken zoals bedoeld na code revisies, updates, of optimalisaties. Als de applicatie zich blijft ontwikkelen door het toevoegen van nieuwe functies moet het team regressietesten uitvoeren om te evalueren of de bestaande functies werken zoals verwacht en of er geen bugs zijn geïntroduceerd met de nieuwe functie(s). 

In deze handout bespreken we verschillende technieken voor Regressie Testen en welke te gebruiken afhankelijk van de manier van werken van het team. 

Echter voordat we ingaan op het hoe laten we eerst begrijpen waarom een regressie testsuite essentieel is.

# Waarom hebben we regressie testen nodig?

Een softwaretoepassing wordt rechtstreeks gewijzigd door nieuwe verbeteringen (functioneel, prestatie of zelfs betere beveiliging), aanpassingen of wijzigingen aan bestaande functies, bug fixes en updates. Het wordt ook indirect beïnvloed door de diensten van derden die het gebruikt om functies te bieden via zijn interface. 

Zowel geplande als onbedoelde wijzigingen in de broncode van de applicatie vereisen verificatie. Daarnaast moet de impact van wijzigingen aan externe services die door de applicatie worden gebruikt, worden geverifieerd.

Teams moeten zich ervan vergewissen dat de gewijzigde component van de applicatie functioneert zoals verwacht en dat de wijziging geen nadelig effect heeft gehad op de andere delen van de applicatie. 

Een uitgebreide regressietesttechniek helpt het team bij het identificeren van regressieproblemen, die vervolgens worden gecorrigeerd en opnieuw getest om er zeker van te zijn dat de oorspronkelijke fouten niet aanwezig zijn. 

### Voorbeeld van regressietesten
Laten we het snel begrijpen met behulp van een voorbeeld - Login functionaliteit. 

* Een gebruiker kan inloggen op een app met zijn gebruikersnaam en wachtwoord of met zijn Gmail account via Google integratie.
* Een nieuwe functie LinkedIn integratie is toegevoegd om gebruikers in staat te stellen in te loggen op de app met behulp van hun LinkedIn account.
* Hoewel het van vitaal belang is om te verifiëren dat LinkedIn login functioneert zoals verwacht is het even noodzakelijk om te verifiëren dat andere login methodes blijven functioneren (Form login en Google integratie).

### Smoke vs Sanity vs Regression Testen

De termen smoke, sanity en regression worden bij het testen vaak door elkaar gebruikt, maar dat is misleidend. Deze termen verschillen niet alleen in de reikwijdte van de toepassing, maar ook in het moment waarop ze worden uitgevoerd. 

#### Refresher ( Wat is smoke testen ) ?

Smoke testen worden gedaan aan het begin van een nieuwe build. Het belangrijkste doel is om te zien of de build goed genoeg is om te gaan testen. Enkele voorbeelden zijn de mogelijkheid om de site te starten door simpelweg de URL in te typen, of de mogelijkheid om de app te draaien na het installeren van een nieuwe executable.

#### Wat is Sanity Testen?

Sanity testing is het aan de oppervlakte testen van nieuw geïmplementeerde omgevingen. Bijvoorbeeld de functies worden in grote lijnen getest op staging-omgevingen voordat ze worden doorgegeven aan User Acceptance Testing. Een ander voorbeeld is het verifiëren dat de fonts correct zijn geladen op de webpagina, dat de verwachte componenten interactief zijn en dat alles in orde lijkt te zijn zonder een gedetailleerd onderzoek.

#### Waarin verschillen regressietesten van rook- en saniteitstesten?

Regressietesten hebben meer diepgang waarbij de mogelijk beïnvloedde gebieden grondig worden getest op de omgeving waar de nieuwe wijzigingen zijn geïntroduceerd.

Bestaande stabiele features worden op regelmatige basis rigoureus getest om hun juistheid te garanderen in het licht van doelbewuste en onbedoelde wijzigingen. 

# Regressietest benaderingen

De technieken kunnen in de volgende categorieën worden ingedeeld:

#### Gedeeltelijke regressietests

Zoals de naam al aangeeft, is partiële regressietesting een aanpak waarbij een subset van de volledige regressiesuite wordt geselecteerd en uitgevoerd als onderdeel van regressietests.

Deze subset selectie resulteert uit een combinatie van verschillende logische criteria als volgt:

* De cases die zijn afgeleid van het identificeren van de potentieel getroffen feature(s) als gevolg van de wijziging(en)
* Bedrijfskritische cases
* Meest gebruikte paden

Partiële regressietesten werken uitstekend wanneer het team met succes de beïnvloede gebieden en de overeenkomstige testgevallen identificeert via beproefde manieren zoals de Requirement Traceability Matrix (RTM voortaan) - https://en.wikipedia.org/wiki/Traceability_matrix of een andere vorm van metadata die door het team is goedgekeurd.

De volgende situaties zijn meer bevorderlijk voor gedeeltelijke regressietesten:

* Het project beschikt over een solide testautomatiseringsraamwerk, met een groot aantal Unit-, API-, Integratie-, en Acceptatietests in verhouding volgens de testpiramide.
* Wijzigingen aan de broncode worden altijd bijgehouden en gecommuniceerd binnen het cross-functionele team.
* Kortlopende projecten strak op budget en tijd.
* Dezelfde teamleden werken aan het project voor een lange periode.

Hoewel deze methode effectief is, is het mogelijk om problemen over het hoofd te zien als:

* De getroffen regio's niet op de juiste wijze worden geïdentificeerd.
* De wijzigingen niet worden doorgegeven aan het hele team.
* Het team niet religieus het proces van het documenteren van testscenario's of testgevallen volgt.

#### Volledige Regressie Testen

In veel gevallen redenen zoals significante software updates veranderingen in de tech stack vragen het team om uitgebreide regressie testen uit te voeren om nieuwe problemen of problemen die door de veranderingen zijn geïntroduceerd aan het licht te brengen.

In deze aanpak wordt de hele testsuite uitgevoerd om problemen aan het licht te brengen telkens als nieuwe code wordt gecommit of met een afgesproken interval.

Dit is een aanzienlijk tijdrovende aanpak in vergelijking met de andere technieken en zou idealiter alleen moeten worden toegepast wanneer de situatie daarom vraagt.

Om de feedback cyclus sneller te houden moet men geautomatiseerd testen omarmen om productieve volledige regressie testen in hun teams mogelijk te maken.

#### Welke regressietechniek moet ik gebruiken?

Ongeacht de gekozen techniek stel ik altijd voor dat teams bij de uitvoering prioriteit geven aan de meest bedrijfskritische cases en de meest voorkomende use cases die door eindgebruikers worden uitgevoerd. 

Vergeet niet dat het hoofddoel van regressietesten is ervoor te zorgen dat de eindgebruiker niet wordt beïnvloed door een niet-beschikbare/incorrecte functie die de bedrijfsresultaten op vele manieren kan beïnvloeden.

# Beste praktijken voor regressietesten

Om een betere testdekking van de applicatie te bereiken plan je regressietesten met een combinatie van technologie en bedrijfsscenario's. Pas de praktijken toe in de gehele testpiramide. 

# Benut de kracht van visuele weergave

Door de informatie in de vorm van een matrix te ordenen, kan het team snel de gebieden identificeren die mogelijk beïnvloed worden. 

* De RTM in het diagram hieronder, elke verandering in REQ1 UC 1.3 zal ons laten weten dat we de testgevallen 1.1.2, 1.1.4 en 1.1.7 moeten testen.
* En aangezien testgeval 1.1.2 ook verband houdt met UC 1.2, zouden we dat onmiddellijk testen op eventuele regressieproblemen. 
* Natuurlijk moet de RTM altijd up-to-date zijn om de techniek correct te laten werken voor het team.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/Functuinal%20testing/RTM-spreadsheet.jpg)

Als alternatief bieden veel test case management tools nu ingebouwde ondersteuning om een regressie testsuite op te bouwen met behulp van de juiste tags en modules. Deze tools laten je ook toe om systematisch patronen in de regressietestuitvoering op te sporen en te identificeren om zo meer gerelateerde gebieden te onderzoeken.

Ik heb teams gezien die het meest effectief zijn als ze het grootste deel van hun regressie tests geautomatiseerd hebben, en de niet-geautomatiseerde tests georganiseerd en weergegeven hebben op een zinvolle manier die snel filteren en zinvolle informatie mogelijk maakt.

#### Testgegevens

Wij moeten gebruik maken van de kracht van automatisering om onmiddellijk testgegevens te creëren in verschillende testomgevingen. We moeten ervoor zorgen dat de bijgewerkte functie wordt geëvalueerd met zowel oude als nieuwe gegevens. 

Voorbeeld: Een nieuw veld toegevoegd aan een gebruikersprofiel bijvoorbeeld moet consistent werken voor zowel bestaande als nieuw gevormde accounts.

#### Productiegegevens

Productietestgegevens spelen een cruciale rol bij het identificeren van problemen die mogelijk zijn gemist tijdens de eerste oplevering. 

Repliceer waar mogelijk de productieomgeving om randgevallen te identificeren en voeg die scenario's toe aan de regressietestsuite. 

Het gebruik van productiegegevens is niet altijd haalbaar,en het kan leiden tot non-compliance problemen. Teams verbergen / maskeren vaak gevoelige informatie uit productiegegevens en gebruiken de informatie om te voldoen aan de eis voor scenario-analyse ter plaatse.

#### Testomgevingen

Als je meerdere omgevingen heb moeten we verifiëren dat de applicatie werkt zoals bedoeld in elk van de omgevingen.

#### Automatiseer

Automatiseer de regressie testsuite! 

Simpelweg het automatiseren van de bedrijfskritische scenario's of de meest gebruikte workflows is een goed genoeg begin. Initieer deze activiteit en werk incrementeel.

Label/annoteer je geautomatiseerde scenario's per functie of verdeel ze in geschikte mappen zodat je bepaalde geautomatiseerde regressiescenario's kunt uitvoeren.

Sequentiële uitvoering is niet schaalbaar met een toenemend aantal testomgevingen en permutaties ondanks het feit dat geautomatiseerde testuitvoering sneller is. Als gevolg daarvan is gelijktijdige testuitvoering in verschillende omgevingen nodig om aan de schaalbaarheidseisen te voldoen. Selenium Grid en andere cloud-oplossingen zoals Applitools Ultrafast Test Cloud stellen u in staat geautomatiseerde tests parallel uit te voeren in verschillende configuraties.

Naast het volgen van best practices bij het maken van het testautomatiseringsraamwerk moeten deze tests in een hoog tempo en parallel worden uitgevoerd om snellere feedback te kunnen geven.

#### Kies wat voor jou werkt

Altijd! Men kan de beperkingen van de business en de eisen van de klant niet negeren om de oplevering te halen. Gebaseerd op
context kies de meest geschikte regressie test technieken.

#### Plan voor regressietesten in Sprints

Ik heb gezien dat het veel tijd kost om een regressie backlog te automatiseren. Om vooruitgang te blijven boeken met deze activiteit moet je bij het schatten van de Sprint-taken altijd expliciet rekening houden met regressietest-inspanningen of je zou je technische schuld kunnen vergroten in de vorm van ongedekte bugs.

#### Communiceer binnen het Cross-Functionele Team

Wijzigingen zijn niet altijd direct gerelateerd aan de behoeften van de klant noch worden ze altijd overgebracht. Intern optimaliseert het ontwikkelingsteam voortdurend de code voor herbruikbaarheid prestatie en andere factoren. Zorg ervoor dat deze wijzigingen in de broncode worden gedocumenteerd/opgevolgd in een ticket zodat het team regressietesten kan uitvoeren.

#### Plan voor niet-functionele regressietests
Niet-functionele elementen zoals prestaties, veiligheid, toegankelijkheid en bruikbaarheid moeten allemaal worden onderzocht als onderdeel van uw regressietestplan naast functionaliteit.

Benchmarking van testuitvoeringsresultaten uit het verleden en deze vergelijken met testuitvoeringsresultaten na de meest recente wijzigingen is een eenvoudige maar effectieve techniek om performance toegankelijkheid en andere degradaties op te sporen.

Als gevolg van substantiële fouten op niet-functionele gebieden hebben toepassingen met de beste functionaliteit ofwel de productie niet kunnen doorstaan ofwel zijn ze op de lange baan geschoven ondanks een succesvolle lancering.

In dezelfde geest hebben problemen met de beveiliging en toegankelijkheid van toepassingen bedrijven miljoenen dollars gekost naast een aangetaste reputatie.

# De noodzaak van een geautomatiseerde regressietestsuite

Ongeacht de applicatiearchitectuur of ontwikkelmethodologie het belang van het automatiseren van de regressietests kan nooit vervagen. Of het nu gaat om een kleinschalige applicatie of een enterprise product,het hebben van geautomatiseerde tests bespaart je tijd, mensen energie en geld op de langere termijn.

Laten we eens kijken naar de redenen om de regressie tests te automatiseren:

#### Snelle terugkoppeling

Geautomatiseerde softwareverificatie is exponentieel sneller dan mensen. Geautomatiseerd continu testen in de CI-CD pijplijn is een krachtige aanpak voor het identificeren van regressie bugs zo dicht mogelijk bij de introductie ervan vanwege de verhoogde snelheid en frequentie waarmee het werkt.

Even belangrijk is om te kijken naar de testresultaten van elke geautomatiseerde suite uitvoering en zinvolle stappen te nemen om het product en de test suite progressief beter te krijgen.

Tijdige identificatie van problemen voorkomt het weglekken van defecten in de belangrijkste delen van de applicatie en latere testfasen.

De lichte verschuiving naar links levert de organisatie dus altijd veel voordelen op afgezien van de kosten.

#### Geautomatiseerde aanmaak van testgegevens

Alvorens tot het eigenlijke testen over te gaan besteden de testteams een aanzienlijke hoeveelheid tijd aan het genereren van testgegevens. Automatisering helpt niet alleen bij het uitvoeren van tests maar ook bij het snel genereren van grote hoeveelheden testdata. Het functionele testteam kan gebruik maken van gegevens die worden gegenereerd door scripts (SQL, API's) zodat zij zich kunnen concentreren op het testen in plaats van zich zorgen te maken over de gegevens.

Het testen van functies zoals paginering, oneindige scroll, tabulaire weergave, de prestaties van de app zijn enkele voorbeelden waar snelle test data generatie helpt het team met instant test data. 

Bank- en verzekeringswezen zijn gereguleerde sectoren met verschillende complexe operaties en subtiliteiten. Om de datamodellen en flows te oefenen en aan te pakken, is een verscheidenheid aan testdata nodig. De mogelijkheid om test data management te automatiseren is een kritische component gebleken van succesvol testen.



