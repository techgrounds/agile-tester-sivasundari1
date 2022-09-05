# Black Box en White Box testing

IMG

Er zijn veel verschillende soorten software test technieken, ieder met zijn eigen sterke en zwakke punten. Elke techniek is te gebruiken om bepaalde types of defecten te vinden. In deze handout gaan we black box testing en white box testing bespreken, wat de verschillen hiertussen zijn en wanneer je welke techniek gebruikt.

# Black Box testing

## Wat is Black Box testing?
 
 Black Box testing wordt zo genoemd omdat de software wordt bekeken als een zwarte doos met inputs en outputs, maar waarbij niet gekeken wordt naar hoe het systeem of component is gestructureerd in de doos. In essentie betekent dit dat de tester kijkt naar wat de software doet, niet hoe het het doet.

Alle Black Box testtechnieken hebben als gemeenschappelijk kenmerk dat ze gebaseerd zijn op een model (formeel of informeel) van een bepaald aspect van het systeem, waardoor op systematische wijze testcondities en test cases kunnen worden afgeleid.

## Kenmerken van Black Box testing

De gemeenschappelijke kenmerken van Black Box testtechnieken zijn:
 * Test conditions, test cases en testgegevens worden afgeleid van een testbasis die softwarevereisten, specificaties, use cases en user stories kan omvatten. De informatiebron voor Black Box tests is een beschrijving van wat het systeem of de software zou moeten doen.
* Test cases kunnen worden gebruikt om een gebrek aan samenhang tussen de eisen en de implementatie van de eisen te detecteren, evenals afwijkingen van de eisen. Een van de sterkte punten van test cases is dat ze dingen specifiek maken, en dit benadrukt vaak verschillende opvattingen over de testbasis en laat zien wat er ontbreekt of anders wordt geïnterpreteerd.
* De dekking wordt gemeten op basis van de items die zijn vastgesteld in de testbasis en  de techniek die is toegepast op de testbasis. Zoals we later zullen zien, kun je de dekking meten als je een lijst kunt maken van een aantal dingen die getest kunnen worden en je kunt zien of ze wel of niet zijn getest. Dekking op Black Box niveau is gebaseerd op items uit de testbasis. Heeft elke beschreven vereiste bijvoorbeeld ten minste één test die deze uitoefent?

Black Box test technieken zijn geschikt op alle testniveaus (van Component testing tot Acceptance testing) waar een specificatie of andere testbasis bestaat. Bij het uitvoeren van systeem- of Acceptance Testing kan de eisen specificatie of functionele specificatie de basis vormen voor de tests. Bij het uitvoeren van component- of integratietesten kan een ontwerpdocument of low-level specificatie de basis vormen van de tests.

# Soorten Black Box testing

In deze handout gaan we vier soorten Black Box technieken behandelen, namelijk:

* Equivalence partitioning
* Boundary value analysis
* Decision table testing
* State transition testing

## Equivalence partitioning

Equivalence partitioning (EP) is een goede allround Black Box test techniek. Het kan op elk testniveau worden toegepast en is vaak een goede techniek om mee te beginnen. Het is een op gezond verstand gebaseerde benadering van testen, zozeer zelfs dat de meeste testers het informeel al oefenen, ook al beseffen ze het misschien niet. Hoewel het echter beter is om de techniek informeel te gebruiken dan helemaal niet, is het veel beter om de techniek op een formele manier te gebruiken om de volledige voordelen te bereiken die het kan opleveren. Deze techniek zal in de meeste boeken die over testen gaan  te vinden zijn. 

Het idee achter de techniek is om een set (Groep) test condities te verdelen (dat wil zeggen, te partitioneren) in groepen of sets waarbij alle elementen van de set als hetzelfde worden beschouwd. Het systeem zal ze dus gelijkwaardig moeten behandelen, vandaar ‘equivalence partitioning’. Equivalence partitions worden ook wel equivalence classes genoemd: de twee termen betekenen precies hetzelfde.

De EP-techniek vereist dat we slechts één voorwaarde van elke partitie hoeven te testen. Dit komt omdat we ervan uitgaan dat alle voorwaarden in één partitie op dezelfde manier door de software worden behandeld. Als één voorwaarde in een partitie werkt, nemen we aan dat alle voorwaarden in die partitie zullen werken, en het heeft dus weinig zin om een van deze andere voorwaarden te testen. Omgekeerd werkt het net zo: als één van de voorwaarden in een partitie niet werkt, nemen we aan dat geen van de voorwaarden in die partitie zal werken, dus heeft het nogmaals weinig zin meer om andere voorwaarden in die partitie te testen. 

Een voorbeeld: Een spaarrekening bij een bank levert een ander rentepercentage op, afhankelijk van het saldo op de rekening. Om de software te testen die de verschuldigde rente berekent, kunnen we de reeksen van balanswaarden identificeren die de verschillende rentetarieven opleveren. Bijvoorbeeld: Een saldo van €0 tot €100 heeft een rentepercentage van 3%, een saldo van €100 tot €1000 heeft een rentepercentage van 5% en een saldo van €1000 en meer heeft een rentepercentage van 7%. Dan zouden we in eerste instantie drie geldige partities en één ongeldige partitie identificeren, zoals hieronder weergegeven:

    Ongeldige partitie | Geldig (voor 3%) | Geldig (voor 5%) | Geldig (voor 7%)
         €-0,01        | €0,00   €99,99   | €100,00  €999,99 | €1000,00

Bij het ontwerpen van de testgevallen voor deze software zullen we ervoor moeten zorgen dat de drie geldige partities elk één keer worden gedekt, en de ongeldige partitie ook minstens één keer. We zouden er bijvoorbeeld voor kunnen kiezen om de rente te berekenen over saldo van €-10, €50,00, €260,00 en €1348,00. Als we deze partities niet specifiek hadden geïdentificeerd, is het mogelijk dat er ten minste één ervan was gemist, en een andere partitie meerdere keren was getest. 

Hoe zou iemand dit testen zonder na te denken over de partities? Een naïeve tester (laten we hem Robbie noemen) had misschien gedacht dat een goede reeks tests zou zijn om elke €50 te testen. Dat zou de volgende tests opleveren: €50, €100, €150, €200, €250 enz. Zeg tot €800, dan is Robbie het zat en denkt dat er genoeg tests zijn uitgevoerd. Maar kijk eens wat Robbie heeft getest: slechts twee van de vier partities! Dus als het systeem een negatief saldo of een saldo van €1000 of meer niet correct afhandelt, zou hij deze gebreken niet hebben gevonden. De naïeve benadering van Robbie is minder effectief dan EP. Tegelijkertijd heeft Robbie vier keer meer tests (hij heeft 16 uitgevoerd, tegenover 4 testen bij EP), dus is hij ook veel minder efficiënt! Daarom zeggen we dat het gebruik van dergelijke technieken het testen zowel effectiever als efficiënter maakt.

# Boundary value analysis

Boundary value analysis is gebaseerd op het testen op de grenzen tussen geordende partities, zoals een veld met numerieke invoer of een alfabetische lijst met waarden in een menu. Het is in wezen een verbetering of uitbreiding van EP en kan ook worden gebruikt om andere black-box (en white-box) test technieken uit te breiden. We hebben zowel geldige grenzen (in de geldige partities) als ongeldige grenzen (in de ongeldige partities). 

Neem als voorbeeld een printer die een invoer optie heeft voor het aantal te maken kopieën, van 1 tot 99.

    Ongeldig | Geldig | Ongeldig 
       0       1  99     100

Om BVA toe te passen, nemen we de minimale en maximale grenswaarden van de geldige partitie (1 en 99 in dit geval) samen met respectievelijk de eerste of laatste waarde in elk van de ongeldige partities naast de geldige partitie (0 en 100 in dit geval). In dit voorbeeld zouden we drie EP-tests hebben en vier BVA-tests.

Laten we nog even teruggaan naar het voorbeeld van de spaarrekening:

    Ongeldige partitie | Geldig (voor 3%) | Geldig (voor 5%) | Geldig (voor 7%)
         €-0,01        | €0,00   €99,99   | €100,00  €999,99 | €1000,00

Omdat de grenswaarden gedefinieerd zijn als die waarden aan de rand van een partitie, hebben we de volgende grenswaarden geïdentificeerd: -€0,01 (een ongeldige grenswaarde omdat deze aan de rand van een ongeldige partitie ligt), €0.00, €100.00, €100.01, €999.99 en €1000.00, allemaal geldige grenswaarden.

Door BVA toe te passen krijgen we dus zes toetsingen voor grenswaarden. Vergelijk wat onze naïeve tester Robbie had gedaan: hij heeft echt een van de grenswaarden (€100,00) bereikt, hoewel het meer per ongeluk dan ontwerp was. Dus naast het testen van slechts de helft van de partities, heeft Robbie slechts een zesde van de grenzen getest (zodat hij minder effectief zal zijn in het vinden van eventuele grens defecten). Als we al onze tests voor zowel EP als BVA in overweging nemen, geven de technieken ons in totaal tien tests, vergeleken met de 16 die Robbie had, dus we zijn nog steeds aanzienlijk efficiënter en meer dan drie keer effectiever (test vier scheidingswanden en zes grenzen, dus tien voorwaarden in totaal vergeleken met drie).

# Decision table testing

De technieken van EP en BVA worden vaak toegepast op specifieke situaties of inputs. Als verschillende combinaties van invoer er echter toe leiden dat verschillende acties worden ondernomen, kan dit moeilijker aan te tonen zijn met EP en BVA, die meestal meer gericht zijn op de gebruikersinterface. De andere twee op specificaties gebaseerde technieken: decision table testing en state transition testing zijn meer gericht op bedrijfslogica of bedrijfsregels.

Een decision table (beslistabel) is een goede manier om met combinaties van zaken (bijvoorbeeld inputs) om te gaan. Deze techniek wordt ook wel een 'oorzaak-gevolg'-tabel genoemd. De reden hiervoor is dat er een bijbehorende techniek voor het maken van logische diagrammen is, 'oorzaak-gevolg grafieken' genaamd, die soms werd gebruikt om de beslistabel af te leiden.

Als je beslistabellen gaat gebruiken om te onderzoeken wat de bedrijfsregels zijn die moeten worden getest, zult u merken dat de analisten en ontwikkelaars de tabellen erg nuttig vinden en ze ook willen gaan gebruiken. Moedig dit aan, want het zal je werk in de toekomst gemakkelijker maken.  Beslistabellen bieden een systematische manier om complexe bedrijfsregels op te stellen, wat zowel handig is voor ontwikkelaars als voor testers. Beslistabellen kunnen worden gebruikt in testontwerp, ongeacht of ze al dan niet in ontwikkeling zijn, omdat ze testers helpen de effecten te onderzoeken van combinaties van verschillende inputs en andere software statussen die bedrijfsregels correct moeten implementeren. De ontwikkelaars helpen hun werk beter te doen, kan ook leiden tot betere relaties met hen.

Het testen van combinaties kan een uitdaging zijn, aangezien het aantal combinaties vaak enorm kan zijn. Het testen van alle combinaties kan onpraktisch, zo niet onmogelijk zijn. We moeten tevreden zijn met het testen van slechts een kleine subset van combinaties, maar het is niet eenvoudig om te kiezen welke combinaties we wel en niet testen. Als je geen systematische manier hebt om combinaties te selecteren, zal een willekeurige subset worden gebruikt en dit kan leiden tot een ineffectieve testinspanning.

Beslistabellen helpen de systematische selectie van effectieve testgevallen en kunnen het gunstige neveneffect hebben van het vinden van problemen en dubbelzinnigheden in de specificatie. Het is een techniek die goed werkt in combinatie met EP. De combinatie van onderzochte condities kunnen combinaties zijn van equivalentie partities.

De eerste taak is het identificeren van een geschikte functie of subsysteem met een gedrag dat reageert op een combinatie van inputs of gebeurtenissen. Het van belang zijnde gedrag mag niet te uitgebreid zijn (dat wil zeggen, het mag niet te veel invoer bevatten), anders wordt het aantal combinaties omslachtig en moeilijk te beheren. Het is beter om met grote aantallen voorwaarden om te gaan door ze in subsets te verdelen en de subsets één voor één af te handelen.

Als je eenmaal de aspecten hebt geïdentificeerd die moeten worden gecombineerd, zet je ze in een tabel met alle combinaties van True en False voor elk van de aspecten. Neem als voorbeeld een leningaanvraag, waarbij je het bedrag van de maandelijkse aflossing of het aantal jaren dat je erover wilt doen om deze terug te betalen (de looptijd van de lening) kunt invullen. Als je beide invoert, gaan we ervan uit dat het systeem een compromis zal sluiten tussen de twee als ze conflicteren. De twee voorwaarden zijn het aflossingsbedrag en de looptijd, die hebben we in een tabel gezet.

|   Conditions 	|   Rule 1	|   Rule 2	|  Rule 3 	|   Rule	|
|---	|---	|---	|---	|---	|
|   Maandelijkse aflossing is ingevoerd	|   	|   	|   	|   	|
|   Looptijd is ingevoerd	|   	|   	|   	|   	|

Vervolgens zullen we alle combinaties van True en False identificeren. Met twee voorwaarden, die elk waar of niet waar kunnen zijn, hebben we vier combinaties (twee tot de macht van het aantal dingen dat moet worden gecombineerd). Merk op dat we drie dingen moeten combineren, we zullen acht combinaties hebben, met vier dingen, het zijn er zestien, enz. Dit is omdat het goed is om kleine sets combinaties tegelijk aan te pakken. Om bij te houden welke combinaties we hebben, wisselen we True en False af op de onderste rij, plaatsen we twee Trues en dan twee Falses in de rij boven de onderste rij, enz., zodat de bovenste rij alle Trues heeft en dan alle Falses (en dit principe is van toepassing op al dergelijke tabellen).

|   Conditions 	|   Rule 1	|   Rule 2	|  Rule 3 	|   Rule	|
|---	|---	|---	|---	|---	|
|   Maandelijkse aflossing is ingevoerd	|   True	|   True	|   False	|  False 	|
|   Looptijd is ingevoerd	|   True	|  False 	|  True  	|  False 	|

In dit geval hebben we True en False gebruikt, we kunnen ook alleen T en F gebruiken, Y en N en 1 en 0. 

De volgende stap (althans voor dit voorbeeld) is het identificeren van de juiste uitkomst voor elke combinatie. In dit voorbeeld kunnen we een of beide van de twee velden invoeren. Elke combinatie wordt soms een regel genoemd. In dit voorbeeld gebruiken we Y voor de acties die moeten plaatsvinden en laten we deze leeg als die actie niet zou moeten plaatsvinden. Andere opties zijn om X of 1 te gebruiken als een actie zou moeten plaatsvinden, en N, F, '--' of 0 voor acties die niet zouden moeten plaatsvinden. We kunnen een getal of een reeks getallen gebruiken als een uitkomst voor die getallen optreedt en niet voor andere. U kunt ook discrete waarden gebruiken, er moet bijvoorbeeld een actie plaatsvinden als een invoer rood is, wat niet gebeurt als deze groen of geel is.

|   Conditions 	|   Rule 1	|   Rule 2	|  Rule 3 	|   Rule	|
|---	|---	|---	|---	|---	|
|   Maandelijkse aflossing is ingevoerd	|   True	|   True	|   False	|  False 	|
|   Looptijd is ingevoerd	|   True	|  False 	|  True  	|  False 	|
|   Action / Outcomes	|   	|   	|    	|   	|
|   Lening bedrag verwerken	|   Y	|  Y 	|    	|   	|
|   Looptijd verwerken	|   Y	|   	|  Y  	|   	|

Op dit punt realiseren we ons misschien dat we niet hadden nagedacht over wat er gebeurt als de klant niets invult in een van de twee velden. In de tabel is een combinatie gemarkeerd die niet in de specificatie voor dit voorbeeld werd genoemd. We zouden kunnen veronderstellen dat deze combinatie zou moeten resulteren in een foutmelding, dus we moeten nog een actie toevoegen. Dit benadrukt de kracht van deze techniek om omissies en onduidelijkheden in specificaties te ontdekken. Het is niet ongebruikelijk dat sommige combinaties uit de specificatie worden weggelaten; daarom is dit ook een waardevolle techniek bij het beoordelen van de testbasis.

|   Conditions 	|   Rule 1	|   Rule 2	|  Rule 3 	|   Rule	|
|---	|---	|---	|---	|---	|
|   Maandelijkse aflossing is ingevoerd	|   True	|   True	|   False	|  False 	|
|   Looptijd is ingevoerd	|   True	|  False 	|  True  	|  False 	|
|   Action / Outcomes	|   	|   	|    	|   	|
|   Lening bedrag verwerken	|   Y	|  Y 	|    	|   	|
|   Looptijd verwerken	|   Y	|   	|  Y  	|   	|

De laatste stap van deze techniek is het schrijven van testgevallen om elk van de vier regels in onze tabel uit te voeren.

In dit voorbeeld zijn we begonnen met het identificeren van de invoervoorwaarden en vervolgens met het identificeren van de uitkomsten. In de praktijk kan het echter andersom werken - we kunnen zien dat er een aantal verschillende resultaten zijn en we moeten terugwerken om te begrijpen welke combinatie van invoervoorwaarden deze resultaten daadwerkelijk aanstuurt. De techniek werkt net zo goed als je het op deze manier doet en het kan best een interactieve benadering zijn als je meer ontdekt over de regels die het systeem aansturen.

# State transition testing

State transition testing (toestandsovergang testen) worden gebruikt waarbij een bepaald aspect van het systeem kan worden beschreven in wat een 'eindige-toestandsmachine' wordt genoemd. Dit betekent simpelweg dat het systeem zich in een beperkt (eindig) aantal verschillende toestanden kan bevinden, en de overgangen van de ene toestand naar de andere worden bepaald door de regels van de 'machine'. Dit is het model waarop het systeem en de tests zijn gebaseerd. Elk systeem waarbij je een andere output krijgt voor dezelfde input, afhankelijk van wat er eerder is gebeurd, in een eindige toestand systeem. Een eindige toestand systeem wordt vaak weergegeven als een toestandsdiagram.

IMG 

Een state transition model bestaat uit vier basisonderdelen:
De staten die de software kan innemen (open/gesloten of gefinancierde/onvoldoende middelen)
De overgangen van de ene toestand naar de andere (niet alle overgangen zijn toegestaan)
De gebeurtenissen die een transitie veroorzaken (een dossier sluiten of geld opnemen)
De acties die voortvloeien uit een transitie (een foutmelding of je geld krijgen)

Merk op dat in een bepaalde toestand één gebeurtenis slechts één actie kan veroorzaken, maar dat dezelfde gebeurtenis uit een andere toestand een andere actie en een andere eindtoestand kan veroorzaken. We zullen eerst kijken naar testgevallen die geldige toestandsovergangen uitvoeren.

Bij het afleiden van testgevallen kunnen we uitgaan van een typisch scenario. Een verstandige eerste testcase hier zou de normale situatie zijn, waarbij de eerste keer de juiste pincode wordt ingevoerd. Om grondiger te zijn, kunnen we ervoor zorgen dat we elke toestand dekken (dat is ten minste één test die door elke toestand gaat) of we willen misschien elke overgang behandelen. Een tweede test (om elke staat te bezoeken) zou zijn om elke keer een verkeerde pincode in te voeren, zodat het systeem de kaart opeet. We hebben nog niet alle transities getest. Om dat te doen, zouden we een test willen waarbij de pincode de eerste keer onjuist was, maar de tweede keer correct, en een andere test waarbij de pincode bij de derde poging correct was. Deze tests zijn waarschijnlijk minder belangrijk dan de eerste twee.

|   	|   Insert card	|   Valid PIN	|   Invalid PIN	|
|--:	|--:	|--:	|--:	|
|   S1) Start state	|   S2	|   -	|   -	|
|   S2) Wait for PIN	|   -	|   S6	|   S3	|
|   S3) 1st try invalid	|   -	|   S6	|   S4	|
|   S4) 2nd try invalid	|   -	|   S6	|   S5	|
|   S5) 3rd try invalid	|   -	|   -	|   S7	|
|   S6) Access account	|   -	|   ?	|   ?	|
|   S7) Eat card	|   S1 (for new card)	|   -	|   -	|

Deze tabel bevat de statussen in de eerste kolom en de mogelijke gebeurtenissen in de bovenste rij. Als het systeem zich bijvoorbeeld in staat 1 bevindt, gaat het invoeren van een kaart naar staat 2. Als we ons in staat 2 bevinden en een geldige pincode wordt ingevoerd, gaan we naar staat 6 om toegang te krijgen tot de rekening. Als we in staat 2 een ongeldige pincode invoeren, gaan we naar staat 3. We hebben een streepje in de cellen gezet die onmogelijk zouden moeten zijn, dat wil zeggen, ze vertegenwoordigen ongeldige overgangen vanuit die staat. We hebben een vraagteken geplaatst voor twee cellen, waar we een geldige of ongeldige pincode invoeren wanneer we toegang krijgen tot het account. Misschien zal het systeem onze pincode gebruiken als geldbedrag om op te nemen? Misschien een goede test! De meeste andere ongeldige cellen zouden in dit voorbeeld fysiek onmogelijk zijn. Ongeldige (negatieve) tests zullen proberen ongeldige overgangen te genereren, overgangen die niet mogelijk zouden moeten zijn (maar maken vaak goede tests wanneer blijkt dat ze mogelijk zijn).





