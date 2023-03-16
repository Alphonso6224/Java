J2EE -> Java 2 Enterprise Edition 
    -> développe des applications professionnelles, des sites web.

## Outils nécessaire
-->jdk-17
--> Apache-tomcat
--> Apache-maven

### POM
A la racine de notre projet on a le fichier pom.xml
    pom --> modèle d'objet de projet
        --> C'est un fichier XML qui contient des informations sur le projet et les détails de configuration utilisés par Maven pour construire le projet
        -->il résume tous les détails de notre project

#### POM minimal
- Les exigences minimales pour un Pom sont les suivantes:
    -->project : racine
    -->modelVersion: doit être défini sur 4.0.0
    -->groupId: l'identifiant du groupe du projet
    -->artifactId: l'identifiant de l'artefact (project)
    -->version: la version de l'artefact sous le groupe spécfié


### Listes des commandes
- mvn package