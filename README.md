# TP 11 – Maîtrise Avancée des Collections en Java

## Présentation

Ce TP porte sur la maîtrise des structures de données de l'API **Collections de Java**. Il permet de découvrir et de manipuler les principales interfaces `List`, `Set` et `Map` à travers plusieurs exercices pratiques.

L'objectif est de comprendre comment choisir et utiliser la structure de données adaptée selon les besoins d'une application, notamment pour gérer des listes, éviter les doublons et organiser des données sous forme de clés et de valeurs.

##  Objectifs pédagogiques

- Comprendre le fonctionnement de l'API Collections de Java.
- Manipuler les listes avec `List` et ses implémentations.
- Utiliser `Set` pour gérer des éléments uniques.
- Exploiter `Map` pour stocker des données sous forme de clés-valeurs.
- Comparer différentes implémentations des collections.
- Appliquer les collections dans un projet orienté objet.
- Développer une application console de gestion d'une bibliothèque.

##  Technologies utilisées

- **Langage :** Java
- **Version :** JDK 11 ou supérieur
- **IDE :** Eclipse 
- **Concepts :** Programmation orientée objet (POO), API Collections, structures de données.

## Contenu du TP avec les exécution  

Le TP est organisé en 16 étapes :

### 1. Introduction et prérequis
Présentation de l'API Collections et des différentes structures de données disponibles en Java.

### 2. Exercice 1 – Introduction à la Liste de Courses
- Création et manipulation d'une liste.
- Ajout de nouveaux éléments.
- Affichage du contenu d'une liste.

### 3. Exercice 1 (Suite) – Manipulation et Suppression
- Suppression d'éléments.
- Recherche d'éléments.
- Modification du contenu d'une liste.
<img width="1366" height="768" alt="ex1" src="https://github.com/user-attachments/assets/0a809f60-f296-40be-aa0d-10d2e3fcbb29" />

### 4. Exercice 2 – Gestionnaire de Tâches
- Création d'une classe métier `Task`.
- Utilisation de `List` pour stocker les tâches.
- Organisation des données avec la POO.

### 5. Exercice 2 (Suite) – Implémentation du TaskManager
- Création d'une classe `TaskManager`.
- Ajout et suppression des tâches.
- Gestion des objets métier.
<img width="1366" height="768" alt="ex2" src="https://github.com/user-attachments/assets/e9c8c86f-b688-42c7-97ac-403bb7362ab8" />

### 6. Exercice 3 – Analyse de Mots Uniques
- Découverte de l'interface `Set`.
- Extraction des mots uniques.
- Élimination automatique des doublons.

### 7. Exercice 3 (Suite) – Comparaison des implémentations de Set
- Étude de `HashSet`.
- Étude de `LinkedHashSet`.
- Étude de `TreeSet`.
- Comparaison de leur comportement.
<img width="1366" height="768" alt="ex3" src="https://github.com/user-attachments/assets/2a484368-9087-44dd-8916-45a452e7bd96" />

### 8. Exercice 4 – Dictionnaire Bilingue avec Map
- Découverte de l'interface `Map`.
- Stockage de traductions sous forme de clés-valeurs.
- Recherche d'une traduction.

### 9. Exercice 4 (Suite) – Exploration des Vues d'une Map
- Utilisation de `keySet()`.
- Utilisation de `values()`.
- Utilisation de `entrySet()`.
- Parcours des éléments d'une Map.
<img width="1366" height="768" alt="ex4" src="https://github.com/user-attachments/assets/5d19e50d-0159-4395-bb01-8b68e0e39d9d" />

### 10 à 15. Exercice 5 – Gestion d'une Bibliothèque

Développement progressif d'une application de gestion de bibliothèque.

Fonctionnalités étudiées :
- Conception des classes de l'application.
- Organisation des livres et des collections.
- Indexation rapide des livres avec `Map`.
- Gestion des emprunteurs.
- Enregistrement des prêts.
- Gestion de la restitution des livres.
- Conservation de l'historique des emprunts.
- Création d'une application finale de test.
<img width="1366" height="768" alt="ex5" src="https://github.com/user-attachments/assets/b17fb4a6-b564-4b7a-a4f2-02cd33c83811" />

### 16. Résumé et Conclusion
Synthèse des notions abordées et consolidation des connaissances sur les collections Java.

##  Notions essentielles

| Interface | Rôle | Implémentations |
|---|---|---|
| `List` | Liste ordonnée, accepte les doublons | `ArrayList`, `LinkedList` |
| `Set` | Stockage d'éléments uniques | `HashSet`, `LinkedHashSet`, `TreeSet` |
| `Map` | Association clé-valeur | `HashMap`, `LinkedHashMap`, `TreeMap` |


##  Compétences acquises

À travers ce TP, les compétences travaillées sont :

- Manipulation des structures de données Java.
- Gestion dynamique des collections.
- Organisation et recherche des informations.
- Utilisation des objets métier avec les collections.
- Conception d'applications orientées objet.
- Développement d'un système simple de gestion de bibliothèque.

##  Auteur

**Hamza ID EL BAZ**

Étudiant en 3e année de Licence professionnelle d'enseignement d'informatique.

Établissement : École Normale Supérieure de Marrakech (ENS Marrakech).

##  Conclusion

Ce TP permet de renforcer les connaissances en Java en passant des manipulations simples de collections à la réalisation d'une application concrète de gestion de bibliothèque.

Il constitue une étape importante dans la maîtrise de la programmation orientée objet et des structures de données en Java.
