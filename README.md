# jdbc

Projet Gradle :

    installation de Gradle : http://gradle.org/

    utilisation de gradle :

    1°/ télécharger le projet à partir de ce site

    2°/ construire le projet avec la commande "gradle build"

    3°/ convertir le projet en un projet Eclipse avec la commande "gradle eclipse" puis importer le projet dans Eclipse

Ce programme contient trois classes principales :
- Main qui créé une table
- RemplirBase qui insere des données
- Requete qui recherche dans la base

Utilisation de la base de données HSQLDB :

- télécharger hsqldb sur http://hsqldb.org/ (attention utilisez la version 1_8_0)
- décompresser le fichier téléchargé
- démarer le serveur de base de données via la commande 
    java -cp "hsqldb.jar" org.hsqldb.Server
  à saisir dans le dossier lib de hsqldb
- démarer l'outil d'inspection de la base via la commande
    java -cp "hsqldb.jar" org.hsqldb.util.DatabaseManagerSwing
  à saisir dans le dossier lib de hsqldd.
  Dans le menu qui s'afficher choisir le mode de connection (type) server
