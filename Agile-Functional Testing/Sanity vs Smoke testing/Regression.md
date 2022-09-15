# Sanity vs Smoke testing 

Het verschil tussen Smoke en Sanity testen is het meest onbegrepen onderwerp in software testen. Er is een enorme hoeveelheid literatuur over dit onderwerp maar de meeste zijn verwarrend.

# Wat is een Software build?

Als je een eenvoudig computerprogramma ontwikkelt dat uit slechts één Source code file bestaat, hoef je alleen dit ene bestand te compileren en te koppelen om een uitvoerbaar bestand te maken. Dit proces is heel eenvoudig.
Meestal is dit niet het geval. Een typisch software project bestaat uit honderden of zelfs duizenden Source files. Het maken van een uitvoerbaar programma van deze Source bestanden is een gecompliceerde en tijdrovende taak.
Je moet "build"-software gebruiken om een uitvoerbaar programma te maken en het proces heet "Software Build".


# Smoke testing 

Smoke testing even in het kort weer als een reminder : 

Smoke Testing is een software test techniek die wordt uitgevoerd na het bouwen van de software om te controleren of de kritieke functionaliteiten van de software goed werken. Het wordt uitgevoerd voordat er gedetailleerde functionele of regression tests worden uitgevoerd. Het belangrijkste doel van Smoke testen is om een ​​softwaretoepassing met defecten af ​​te wijzen, zodat het QA-team geen tijd verspilt aan het testen van kapotte softwaretoepassingen.

Bij Smoke Testing kozen de testgevallen ervoor om de belangrijkste functionaliteit of component van het systeem te dekken. Het doel is niet om uitputtende tests uit te voeren, maar om te verifiëren dat de kritieke functionaliteiten van het systeem goed werken.
Een typische Smoke Test zou bijvoorbeeld zijn: Controleer of de toepassing met succes wordt gestart, controleer of de GUI reageert ... enz.


##### BELANGRIJK VERSCHIL:

* Smoke Testing heeft als doel om "stabiliteit" te verifiëren, terwijl Sanity Testing een doel heeft om "rationaliteit" te verifiëren.
* Smoke Testing wordt gedaan door zowel ontwikkelaars als testers, terwijl Sanity Testing wordt gedaan door testers.
Smoke Testing verifieert de kritieke functionaliteiten van het systeem, terwijl Sanity Testing de nieuwe functionaliteit verifieert, zoals bugfixes.
* Smoke testing is een subset van Acceptance testing, terwijl Sanity-testen een subset is van Regression testing.
* Smoke testing zijn gedocumenteerd of gescript, terwijl Sanity-testen dat niet is.
* Smoke testing verifieert het hele systeem van begin tot eind, terwijl Sanity Testing alleen een bepaald onderdeel verifieert.


# Wat is Sanity testing?

Sanity-testen is een soort softwaretest die wordt uitgevoerd na ontvangst van een software build, met kleine wijzigingen in code of functionaliteit, om er zeker van te zijn dat de bugs zijn verholpen en dat er geen verdere problemen zijn geïntroduceerd als gevolg van deze wijzigingen. Het doel is om vast te stellen dat de voorgestelde functionaliteit ongeveer werkt zoals verwacht. Als de sanity-test mislukt, wordt de build afgewezen om de tijd en kosten te besparen die gepaard gaan met een meer Rigorous testing. (Je kunt opzoeken wat rigorous testing in houdt.)

Het doel is "niet" om de nieuwe functionaliteit grondig te verifiëren, maar om vast te stellen dat de ontwikkelaar enige rationaliteit (gezond verstand) heeft toegepast bij het produceren van de software. Als uw wetenschappelijke rekenmachine bijvoorbeeld het resultaat 2 + 2 =5 geeft! Dan heeft het geen zin om de geavanceerde functionaliteiten zoals sin 30 + cos 50 te testen.



# Sanity vs Smoke testing - Belangrijke verschillen

|   Smoke Testing  	|   Sanity Testing	|
|---	|---	|
|   Smoke tests worden uitgevoerd om na te gaan of de kritieke functionaliteiten van het programma goed werken	|   Sanity Testing is gedaan om te controleren of de nieuwe functionaliteit/bugs zijn opgelost	|
|  Het doel van deze tests is om de "stabiliteit" van het systeem te verifiëren om door te gaan met strengere tests	| Het doel van het testen is om de "rationaliteit" van het systeem te verifiëren om door te gaan met meer Rigorous tests   	|
|  Deze test wordt uitgevoerd door de ontwikkelaars of testers 	|   Sanity Tests bij software tests worden uitgevoerd door testers	|
|   Smoke tests zijn meestal gedocumenteerd of gescript	|   Sanity testen zijn meestal niet gedocumenteerd en zijn niet gescript	|
| Smoke testing is een subset van Acceptance testing  	|   Sanity testen is een subset van Regression testing	|
|   Smoke tests oefenen het hele systeem van begin tot eind uit	|   Sanity-tests oefenen alleen het specifieke onderdeel van het hele systeem uit	|
|   Smoke testing is als een algemene gezondheidscheck	|  Sanity Testing is als een gespecialiseerde gezondheidscontrole 	|



# Punten om te onthouden :

* Zowel Sanity- als Smoke-tests zijn manieren om tijd en moeite niet te verspillen door snel vast te stellen of een toepassing te gebrekkig is om Rigorous tests te verdienen.
* Smoke testen wordt ook wel tester acceptatietesten genoemd.
* Smoke tests die op een bepaalde software build worden uitgevoerd, worden ook wel build verification tests genoemd.
* Een van de beste praktijken in de branche is het uitvoeren van dagelijkse build- en Smoke tests in softwareprojecten.
* Zowel Smoke- als Sanity tests kunnen handmatig of met behulp van een automatiseringstool worden uitgevoerd. Wanneer geautomatiseerde tools worden gebruikt, worden de tests vaak gestart door hetzelfde proces dat de build zelf genereert.
* Afhankelijk van de test behoeften, moet je mogelijk zowel Sanity- als Smoke-tests uitvoeren in de software-build. In dergelijke gevallen voer je eerst Smoke tests uit en ga je daarna verder met Sanity Testing. In de industrie worden testgevallen voor Sanity Testing vaak gecombineerd met die voor Smoke testen, om de uitvoering van tests te versnellen. Daarom is het gebruikelijk dat de termen vaak door elkaar worden gehaald en door elkaar worden gebruikt

