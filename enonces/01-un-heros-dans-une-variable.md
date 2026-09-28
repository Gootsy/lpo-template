# TP 01 — Un héros dans une variable

🟢 Découverte · ~45 min

## Notions

Classe, objet, champ, instanciation (`new`), référence, `null`, type primitif contre
type objet.

## Point de départ

Combat écrit avec les seules notions déjà vues. Le recopier et l'exécuter.

```java
void main() {
    String heroName = "Aria";
    int heroHealth = 100;
    int heroAttack = 12;

    String monsterName = "Gobelin";
    int monsterHealth = 40;
    int monsterAttack = 7;

    monsterHealth = monsterHealth - heroAttack;
    IO.println(heroName + " frappe " + monsterName + " !");
    IO.println(monsterName + " a maintenant " + monsterHealth + " PV.");

    heroHealth = heroHealth - monsterAttack;
    IO.println(monsterName + " riposte !");
    IO.println(heroName + " a maintenant " + heroHealth + " PV.");
}
```

## Problème

Ajouter un Squelette, puis un Troll, chacun avec ses trois variables, et faire
affronter les trois par le héros.

Répondre par écrit, une phrase par question :

1. Combien de variables pour 10 monstres ?
2. Qu'est-ce qui garantit que `skeletonHealth` et `skeletonAttack` décrivent le même
   squelette ?
3. Ajouter une défense à chaque monstre demande combien de modifications ?

## Consigne

1. Créer `Character.java` : classe `Character` avec trois champs publics — nom,
   points de vie, puissance d'attaque.
2. Réécrire le combat dans `Main.java` en utilisant cette classe. Un héros, trois
   monstres, quatre objets.
3. Le héros affronte les monstres dans l'ordre ; chaque monstre vivant riposte à
   chaque tour.

## Contraintes

- Une seule classe `Character` pour le héros comme pour les monstres.
- Champs `public` pour l'instant. Le TP 02 traite ce point.
- Pas de tableau : trois variables de type `Character`.

## Sortie attendue

```
Aria (100 PV) entre dans le donjon.

--- Gobelin (40 PV) apparaît ---
Aria frappe Gobelin pour 12 dégâts. Gobelin : 28 PV
Gobelin frappe Aria pour 7 dégâts. Aria : 93 PV
Aria frappe Gobelin pour 12 dégâts. Gobelin : 16 PV
Gobelin frappe Aria pour 7 dégâts. Aria : 86 PV
Aria frappe Gobelin pour 12 dégâts. Gobelin : 4 PV
Gobelin frappe Aria pour 7 dégâts. Aria : 79 PV
Aria frappe Gobelin pour 12 dégâts. Gobelin : -8 PV
Gobelin est vaincu !

--- Squelette (55 PV) apparaît ---
...

Aria sort du donjon avec 34 PV.
```

## À vérifier

```java
Character a = new Character();
a.name = "Gobelin";
Character b = a;
b.name = "Troll";
IO.println(a.name);   // résultat ? expliquer
```

```java
Character c = null;
IO.println(c.name);   // noter le nom exact de l'erreur
```

## Pour aller plus loin

- Le Gobelin termine à `-8 PV`. Où faudrait-il l'empêcher, et qu'est-ce qui l'empêche
  aujourd'hui ?
- Ajouter un champ `defense` à `Character` et comparer le nombre de modifications
  avec la réponse à la question 3.
