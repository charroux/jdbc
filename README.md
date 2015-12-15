# jdbc

Utilisation de la base de données HSQLDB :

- télécharger hsqldb sur http://hsqldb.org/
- décompresser le fichier téléchargé
- démarer le serveur de base de données via la commande 
    java -cp "hsqldb.jar" org.hsqldb.Server
  à saisir dans le dossier lib de hsqldb
- démarer l'outil d'inspection de la base via la commande
    java -cp "hsqldb.jar" org.hsqldb.util.DatabaseManagerSwing
  à saisir dans le dossier lib de hsqldd.
  Dans le menu qui s'afficher choisir le mode de connection (type) server
