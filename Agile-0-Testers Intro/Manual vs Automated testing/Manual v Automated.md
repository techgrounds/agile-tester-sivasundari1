# Automation testing versus Manual testing: Het kiezen van de juiste balans

Het testen van software is een integraal onderdeel van de ontwikkeling van een succesvol softwareproject. Het testen van software zelf is een enorm domein waarin vele varianten bestaan. Om jouw een idee te geven enkele voorbeelden van testmethodologieën zijn Regression testen, Smoke testen, Network testen, Integration testen en nog veel meer. 

Naast de overvloed aan testvormen is er ook een zeer actieve discussie gaande over de vraag of Automated testen beter is dan Manual testen. Dit stuk neemt je mee in de voordelen van elke aanpak en zal proberen te concluderen wat de beste optie is voor elke use case. Laten we beginnen met het verkennen van het verschil tussen Manual en Automated testen

# Wat is het verschil?

Bij Manual testen voert een testingenieur (een mens) testgevallen Manual ( Handmatig ) uit. Dit betekent dat de test engineer verschillende scenario's en edge cases beschrijft waarvan hij de werking wil verifiëren. Bij Manual testen wordt geen gebruik gemaakt van tools of scripts. Dit betekent dat de test engineer een dataset en het scenario moet voorbereiden en de juiste inputs of acties moet triggeren om het beschreven scenario te testen.

Bij Automated testen is dit alles - zoals de naam al aangeeft - Automated. Dit betekent dat gebruik wordt gemaakt van scripts en hulpmiddelen die gegevens en een toestand voorbereiden en vervolgens de stappen uitvoeren die nodig zijn om het scenario op een Automatede manier te verifiëren.

Zowel Manual als Automated testen heeft voor- en nadelen. Het is de moeite waard om het verschil te kennen en te weten wanneer het een of het ander moet worden gebruikt voor de beste resultaten.

# Pros en Cons van Manual Testing

Laten we de voor- en nadelen van Manual testing eens vergelijken.

## Voordelen van Manual testing

Bij Manual testen heeft de testingenieur de volledige controle over het uitvoeren van elke actie. Dit betekent meer visuele feedback tijdens het proces waardoor de testingenieur gemakkelijker problemen kan debuggen of vinden. 

Omdat er voor Manual testen geen tools nodig zijn is een bedrijf bovendien minder geld kwijt aan testen. 

Ook is het voor kleine wijzigingen of codebases zinvoller om snel een functie te verifiëren door deze Manual te testen in plaats van een hele testsuite te configureren en op te starten.

Tenslotte werkt Manual testen goed voor het vinden van visuele bugs en het testen van de gebruiksvriendelijkheid van een applicatie. Dit deel van het testen omvat menselijke observatie om eventuele glitches te vinden - iets dat niet (goed) kan worden gedetecteerd door Automatede tools.


## Nadelen van Manual testing

Normaal gesproken vergt Manual testen meer tijd om te voltooien de testingenieur moet datasets voorbereiden, de toestand van de applicatie voorbereiden, en alle stappen uitvoeren om het scenario te verifiëren. Het proces is traag en vatbaar voor menselijke fouten. Eén fout kan al betekenen dat de testingenieur de hele set-up helemaal opnieuw moet doen.

Veel bedrijven denken dat Manual testen goedkoper is omdat ze geen geld hoeven uit te geven aan testautomatiseringstools of continuous integration (CI) tools. Deze tools zijn echter goedkoop in vergelijking met het vinden en in dienst nemen van meerdere testingenieurs die eigenlijk hetzelfde werk doen als automatiseringstools.

Veel tests zijn moeilijk te simuleren met Manual testen. Stress tests zijn hier een goed voorbeeld van bij stresstests wordt software getest onder een zware belasting. Testingenieurs gebruiken dit type testen om het breekpunt van een applicatie te vinden en te ervaren hoe deze zich gedraagt onder deze hoge belasting. Vaak vereist stress testing het aanmaken van vele honderden of duizenden verzoeken in een kort tijdsbestek. Soms vereist het de inzet van een aantal gebruikers die allemaal op hetzelfde moment verbinding maken met de applicatie. Het is gewoon niet mogelijk voor een test engineer om dit soort gedrag Manual na te bootsen.

Tenslotte worden complexe scenario's vaak vermeden tijdens Manual testen of worden ze slechts sporadisch getest. Hierdoor blijven er testgaten in de applicatie, Automatisering is een geweldige optie voor een test engineer om deze complexe gevallen te simuleren.


## Samenvatting

* De kosten van Manual testen zijn afhankelijk van de personele middelen die bij het testen worden ingezet.
* Manual testen is vaak trager en vatbaar voor menselijke fouten.
* Manual testen is niet geschikt voor veel soorten testen (zoals stress testen).
* Het is moeilijk om complexe cases Manual te testen.
* Manual testen is goed voor het vinden van visuele of UX bugs.

Als je naar deze lijst kijkt zou je moeten zien dat Manual testen meer nadelen dan voordelen heeft ook al heeft het nog steeds zijn nut. De grootste misvatting over Manual testen is dat IT-managers denken dat ze geld besparen door geen gebruik te maken van betaalde automatiseringstools. Maar ze vergeten de verborgen kosten van het bemannen van een groter testteam om het gat tussen Manual en Automated testen op te vullen.

# Pros en Cons van Automated testing

Hier volgen enkele van de voor- en nadelen van Automated testen.

## Voordelen van Automated testing

Het eerste waar ik op wil wijzen is hoe veerkrachtig Automated testen is. Automated testen is betrouwbaar en geeft altijd hetzelfde resultaat (reproduceerbaar). En omdat elke stap Automated is, is het niet onderhevig aan menselijke fouten zoals Manual testen dat is.

Het is ook logisch dat een bedrijf investeert in testautomatiseringstools die hen helpen bij het opzetten van hun testsuite. Dit stelt hen in staat om zaken als stresstesten uit te voeren omdat de suite duizenden klanten kan simuleren die allemaal op hetzelfde moment verbinding maken. Naar mijn mening stelt een Automatede testsuite je in staat om de kwaliteit van je product beter te testen en te bewaken.

Zodra je je testsuite hebt geïnstalleerd, is het eenvoudig om andere projecten aan te sluiten op deze suite.

Daarnaast stelt testautomatisering je in staat om al je tests veel sneller uit te voeren dan Manual testen. Je kunt snel complexe scenario's simuleren, en in tegenstelling tot personeel ( Manual ) klaagt je testsuite niet wanneer het deze complexe gevallen moet verifiëren.

Tot slot stelt Automated testen ontwikkelaars snel in staat om sneller feedback te krijgen. Het komt de algehele productiviteit van het ontwikkelteam ten goede en geeft meer inzicht in de kwaliteit van de applicatie.

## Nadelen van Automated testing

Automated testen kan niet worden gebruikt voor het opsporen van visuele of UX bugs. Het vinden van UX bugs vereist een menselijk oog, het simpelweg uitvoeren van je testsuite kan geen andere dingen meten zoals de klantervaring. Dus Automatede test tools zullen niet alle test scenario's dekken. Sommige scenario's kunnen gewoon worden Automated.

Bovendien kunnen ontwikkelaars kostbare tijd verliezen met het debuggen van incorrecte testscripts. Vaak werkt mijn code perfect, maar ben ik meer tijd kwijt met het debuggen van de Automatede tests die ik heb gecodeerd.

## Samenvatting

* Automated testen is betrouwbaarder en sneller dan Manual testen.
* Het verhoogt de productiviteit van het ontwikkelingsteam (snellere feedback): het team kan echter veel tijd besteden aan het debuggen van tests.
* Automated testen maakt verschillende complexe soorten testen mogelijk.
* Het verbetert de kwaliteit van het project.
* Het vindt geen visuele of UX bugs.

Dus je kunt zien dat Automated testen veel voordelen heeft maar het doet niet alles. Bijvoorbeeld Automated testen is niet geschikt voor het vinden van visuele bugs. Ook moet ik toegeven dat niet alles Automated kan worden echter Automated testen verhoogt zeker de kwaliteit van het product.

# Wanneer gebruiken we Manual testen?

Manual testen is geschikt voor usability testing, ad-hoc testen en exploratory testen.

Usability testing richt zich op het meten van de gebruiksvriendelijkheid van een applicatie. Ad-hoc testen gebruiken een vrije aanpak waarbij de test engineer probeert onderdelen te breken zonder een vast scenario. 

De laatste benadering exploratory testen richt zich op de kennis, ervaring, analytische vaardigheden, creativiteit en intuïtie van de tester. Hier wordt de test gekenmerkt door slecht geschreven specificatiedocumentatie of een korte tijd voor uitvoering. 

# Wanneer gebruiken we Automated testen?

Automated testen is goed voor Regression testen, performance testing, Load testing, en sterk herhaalbare functionele testgevallen. Automated testen zou een integraal onderdeel moeten zijn van de DevOps cyclus. 

Kortom, je zou elke test moeten automatiseren die je kunt.

# De kern van de zaak

Testen moet een integraal onderdeel zijn van softwareontwikkeling. Er zijn veel factoren waarmee je rekening moet houden bij het kiezen van je teststrategie. De basisregel voor testen: probeer zo veel mogelijk Automated te testen. Manual testen is traag en past niet in de agile praktijken van vandaag. De voordelen van Automated testen zijn veel groter dan die van Manual testen.