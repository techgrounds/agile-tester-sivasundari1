# Wat is GitBash?

https://www.atlassian.com/git/tutorials/git-bash


# Gitbash installeren

https://git-scm.com/downloads

# Geinstalleerd? 

Als je naar een folder gaat en binnen de folder rechter muis klik doet, komt er een optie 
"Git bash here" als je daar op klikt komt er een CMD menu dit is Gitbash.

# Het gebruik van Gitbash.

Gitbash wordt gebruikt om files naar github te sturen en files van github aftehalen, nu hoor ik 
jou misschien denken. Hee daar heb je ook Github Destkop voor of andere programma's dat klopt,
maar wat Gitbash zo handig maakt is dat je alles in eigen handen heb met commandos en niet hoeft
te hopen dat Github Destkop of een ander programma het heeft inegebouwd.

## Commandos

Jij gaat werken met een github template en van een template moet je updates kunnen pullen,
hoe doen we dat? 

Stap 1 : Clone de git repo naar jouw destkop dit doe je door middel van rechtermuis klik op je
bureaublad te doen git bash te klikken en in de CMD window het volgende in te vullen 
(git clone url) (Voorbeeld git clone https://github.com/techgrounds/agile-tester-Mitch1996)

Stap 2 : Nu heb je de files gecloned van github binnen de folder doe je weer rechter muis klik
en klik je op "Git bash here" nu krijg je weer de zelfde CMD window. Binnen het CMD doe je het volgende :

* git remote add template https://github.com/Mitch1996/Agile-Template

Dit zorgt er voor dat je dingen kan pullen vanaf het template als er nieuwe stof online komt,
hoe pullen we dat?

* git fetch --all
* git pull origin template --allow-unrelated-histories
* git status

Zorg er wel altijd voor dat je eerst je eigen dingen commit en pusht! Dit doe je zo : 

* git add .
* git commit -m "Wat heb je gedaan"
* git push

Kom je er niet uit? Stap naar mij toe :

- Mitchell