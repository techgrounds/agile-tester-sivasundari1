# White Box testing

# Wat is white box testing?

White Box test technieken gebruiken de interne structuur van de software om testgevallen af te leiden. Ze worden gewoonlijk White Box of Glass Box technieken genoemd (wat inhoudt dat je in het systeem/de doos kunt kijken), omdat ze kennis vereisen van hoe de software wordt geïmplementeerd, dat wil zeggen, hoe het werkt. Een structurele techniek kan bijvoorbeeld betrekking hebben op het oefenen van de loops in de software. Er kunnen verschillende testgevallen worden afgeleid om de loop één keer, twee keer en vaker uit te oefenen. Dit kan ongeacht de functionaliteit van de software. Alle op structuur gebaseerde technieken hebben als gemeenschappelijk kenmerk dat ze zijn gebaseerd op hoe de te testen software is geconstrueerd of ontworpen. Deze structurele informatie wordt gebruikt om te beoordelen welke delen van de software zijn uitgevoerd door een reeks testen (vaak afgeleid door andere technieken). Aanvullende testgevallen kunnen dan op een systematische manier worden afgeleid om de delen van de constructie te coveren die nog niet eerder door een test zijn aangeraakt.

# Kenmerken van White Box testing

De gemeenschappelijke kenmerken van White Box test technieken zijn:
* Test conditions, test cases en test data zijn afgeleid van een testbasis die code, software architectuur, gedetailleerd ontwerp of enige andere informatiebron met betrekking tot de structuur van de software kan omvatten. White Box test technieken worden het meest gebruikt voor code structuur, maar deze technieken zijn ook nuttig voor andere structure. Zo zou bijvoorbeeld de menustructuur van een app getest kunnen worden met White Box technieken.
* De dekking wordt gemeten op basis van de geteste items binnen een geselecteerde structuur, bijvoorbeeld de code statements, de beslissingen, de interfaces, de menustructuur of elk ander geïdentificeerd structureel element.
* White Box testtechnieken bepalen het te volgen pad door de software, dit wordt bepaald door specifieke invoer in de software. Om een test te zijn, moeten we echter ook weten wat de verwachte uitkomst van de testcase zou moeten zijn, ook al heeft dit geen invloed op de ingeslagen weg. Een soort test orakel, bijvoorbeeld een specificatie, wordt gebruikt om de verwachte uitkomst te bepalen. 

White Box test technieken kunnen ook op alle testniveaus worden gebruikt. Ontwikkelaars gebruiken White box technieken bij het testen van componenten en het testen van component integratie, vooral wanneer er goede tool ondersteuning is voor code dekking. White Box technieken worden ook gebruikt bij systeem- en acceptatietesten, maar de structuren zijn anders. De dekking van grote zakelijke transacties kunnen bijvoorbeeld het structurele element zijn in systeem- of Acceptance Testing.

# Soorten white box testing

In deze handout gaan we twee soorten White Box testing behandelen, namelijk:
* Statement coverage
* Decision coverage

Maar eerst:

# Wat is Coverage?

Coverage (dekking) meet de hoeveelheid tests die zijn uitgevoerd door een reeks tests die mogelijk op een andere manier zijn afgeleid, bijvoorbeeld met behulp van black box-technieken. Overal waar we dingen kunnen tellen en kunnen zien of al die dingen al dan niet zijn getest door een test, dan kunnen we de dekking meten. De basisregel is:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-1.png)

waar de coverage item is wat we hebben kunnen tellen en zien of een test dit item heeft uitgeoefend of gebruikt.

Er zijn verschillende gevaren (valkuilen en waarschuwingen) bij het gebruik van dekking meten:
100% dekking betekent niet 100% getest! Dekking Technieken meten slechts één dimensie van een multidimensionaal concept.
Twee verschillende testgevallen kunnen exact dezelfde dekking bereiken, maar de invoergegevens van de ene kunnen een fout vinden die de invoergegevens van de andere niet vinden. Als u geen regel of codeblok uitvoert dat een bug bevat, ziet u gegarandeerd de fouten die deze bug kan veroorzaken niet. Echter, alleen omdat je die regel of dat blok hebt uitgevoerd, garandeert niet dat je de fouten zult zien die de bug kan veroorzaken. Er kunnen veel verschillende gegevens combinaties zijn die dezelfde beslissing uitkomst True/False geven, maar sommigen zullen een storing veroorzaken en anderen niet.
Dekking kijkt alleen naar wat er is geschreven, dat is de code zelf. Het kan niets zeggen over de software die niet is geschreven. Als een bepaalde functie niet is geïmplementeerd, zullen Black Box technieken dit aan het licht brengen. Als een functie uit de specificatie is weggelaten, kunnen op ervaring gebaseerde technieken deze vinden. Maar White Box technieken kunnen alleen kijken naar een structuur die er al is.
Alleen omdat een bepaald dekking item is gedekt, betekent dit NIET dat dit deel van het systeem daadwerkelijk doet wat het zou moeten doen. Dekking beoordeelt alleen of je iets wel of niet hebt getest, niet of die test wel of niet geslaagd was en of het een goede test was die de moeite waard was. Dekking zegt niets over de kwaliteit of het systeem of de testen.

Dus is de dekking de moeite waard om te meten? Ja, dekking kan handig zijn. Het is een manier om een aspect van grondigheid te beoordelen. Maar het wordt het beste gebruikt als u precies begrijpt wat u meet en de valkuilen kent, vooral als u verslag uitbrengt aan stakeholders.

# Statement testing en coverage

Statement coverage wordt berekend door:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-2.png)

Studies en ervaring in de branche hebben uitgewezen dat wat als redelijk grondige black box-testen wordt beschouwd, in werkelijkheid slechts 60% tot 75% dekking van de statements kan opleveren. Typische ad-hoc tests zullen waarschijnlijk slechts ongeveer 30% opleveren, waardoor 70% van de statements niet is getest. Verschillende dekkings tools kunnen op enigszins verschillende manieren werken, dus ze kunnen verschillende dekkingen cijfers geven voor dezelfde set tests op dezelfde code, hoewel ze bij 100% dekking hetzelfde zouden moeten zijn.

We zullen de principes van de coverage op code illustreren. Om onze voorbeelden uit te leggen, zullen we twee soorten codevoorbeelden gebruiken, één een basis pseudo-code - dit is geen specifieke programmeertaal, maar zou voor u leesbaar en begrijpelijk moeten zijn, zelfs als u zelf niets heeft geprogrammeerd - en de tweede lijkt meer op JavaScript. Beide geven dezelfde regelstroom. We hebben de set-upcode die nodig is om de code daadwerkelijk uit te voeren, weggelaten, om ons op de logica te concentreren.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-3.png)

Om 100% statement coverage van dit code segment te bereiken, is slechts één testgeval vereist, een die ervoor zorgt dat variabele A een waarde bevat die groter is dan de waarde van variabele B, bijvoorbeeld A = 12 en B = 10. Merk op dat we hier doen structureel testontwerp, omdat we onze invoerwaarden kiezen om de dekking van de statements te garanderen.

Laten we eens kijken naar een voorbeeld waarbij we eerst de coverage meten. Om het voorbeeld te vereenvoudigen, beschouwen we elke regel als een statement. Verschillende tools en methoden kunnen verschillende dingen als statements tellen, maar het basisprincipe is hetzelfde, hoe ze ook worden geteld. Een statement kan op één regel staan, maar ook over meerdere regels. Eén regel kan meer dan één statement bevatten, slechts één statement of slechts een deel van een statement. Sommige statements kunnen andere statements bevatten. In de volgende voorbeelden hebben we twee read-statements, een toewijzing statement en dan een IF-statement op drie regels, maar het IF-statement bevat een ander statement (print) als onderdeel ervan.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-4.png)

Hoewel het niet helemaal correct is, hebben we elke regel genummerd en beschouwen we elke regel als een statement. Sommige tools kunnen instructies groeperen die altijd samen zouden worden uitgevoerd in een basisblok dat als een enkele instructie wordt beschouwd. We zullen echter alleen genummerde regels gebruiken om het principe van coverage van statements (regels) te illustreren. Laten we de coverage van een reeks tests op ons programma met zes statements analyseren:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-5.png)

Welke statements hebben we gedekt?
In Test 1_1 is de uitkomst van C 8, dus we dekken de statements op regels 1 t/m 4 en 6.
In Test 1_2 is de uitkomst van C 50, dus we dekken precies dezelfde statements als bij Test 1_1
In Test 1_3 is de uitkomst van C 49, dus ook hier dekken we weer precies dezelfde statements als bij Test 1_1

Omdat we vijf van de zes statements gedekt hebben, hebben we 83% statement coverage (met drie testen). Wat voor test hebben we nodig om ook statement 5 te dekken, de enige die we nog niet uitgeoefend hebben? Wat denk je van deze:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-6.png)

Deze keer is de uitkomst van C 70, dat betekent dat ‘Large C/C large’ geprint wordt en dat we alle statements gedekt hebben. Dit betekent dat we nu een statement coverage van 100% hebben. In dit geval zouden we zelfs met 1 testcase een statement coverage van 100% hebben. Als we alleen Test 1_4 uitgevoerd zouden hebben, zouden we al 100% statement coverage hebben.

# Decision testing en coverage

Decision coverage wordt berekend door:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-7.png)

Een decision (beslissing) is een IF-statement, een loop control-statement (bijvoorbeeld DO-WHILE of REPEAT-UNTIL) of een CASE-statement, waarbij er twee of meer mogelijke uitgangen of uitkomsten van het statement zijn. Bij een IF-statement kan de exit True of False zijn, afhankelijk van de waarde van de logische voorwaarde die na IF komt. Met een loop control statement is het resultaat ofwel het uitvoeren van de code binnen de lus of niet - opnieuw een True of False exit.

Wat aanvoelt als redelijk grondige black-box-tests, kan slechts 40 tot 60% decision coverage opleveren. Typische ad-hoc tests kunnen slechts 20% van de décisions dekken, waardoor 80% van de mogelijke uitkomsten niet getest zijn. Zelfs als je testen redelijk grondig lijken vanuit functioneel of black-box perspectief, heb je misschien maar tweederde of driekwart van de decisions genomen. Decision coverage is sterker dan statement coverage. Dit houdt in dat 100% dekking van decisions altijd 100% dekking van statements garandeert. 

Als we terugkijken naar het eerste voorbeeld bij statement coverage, zagen we dat er maar 1 test case nodig is om 100% statement coverage te krijgen. Decision coverage vereist echter dat elke beslissing zowel een True als False uitkomst heeft gehad. Om 100% decision coverage te bereiken, is daarom een tweede testgeval nodig waarbij A kleiner is dan of gelijk is aan B. Dit zal ervoor zorgen dat de decision statement IF A>B een False-uitkomst heeft. Dus één test is voldoende voor 100% dekking van statements, maar twee tests zijn nodig voor 100% dekking van decisions. Houd er rekening mee dat 100% dekking van de decision 100% dekking van statements garandeert, maar niet andersom.

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-8.png)

Hier is het andere voorbeeld van statement coverage iets veranderd. Laten we aannemen dat we de volgende test al hebben, die ons 100% statement coverage geeft:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-9.png)

Welke decision outcomes hebben we geoefend met onze test? De waarde van C is -10, dus de voorwaarde C < 0 is True, dus we zullen 'C negative' afdrukken en we hebben de True-uitkomst van die decision statement uitgeoefend. Maar we hebben de décision outcome van False niet toegepast. Welke andere test zouden we nodig hebben om de False-uitkomst uit te voeren en 100% decision coverage te bereiken?

Laten we, voordat we die vraag beantwoorden, eens kijken naar een andere manier om deze code weer te geven. Soms is de beslissingsstructuur beter te zien in een controle stroomschema:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-10.png)

De gestippelde lijn laat zien waar Test 2_1 langs is gegaan en laat duidelijk zien dat we nog geen test hebben die langs de False-uitkomst van het IF statement gaat. Laten we onze test set aanpassen met een extra test:

![image](https://github.com/Mitch1996/QA-Image-Store/blob/main/white-blackbox%20testing/white-13.png)

Dit omvat nu beide decision outcomes, True (met Test 2_1) en False (met Test 2_2). Als we het pad van Test 2_2 zouden tekenen, zou het een rechte lijn zijn van het READ statement langs de False-uitgang en door het ENDIF. Merk op dat we andere getallen hadden kunnen kiezen om de True of False-resultaten te bereiken.


