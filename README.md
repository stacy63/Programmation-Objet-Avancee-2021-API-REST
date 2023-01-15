# Introduction
Le but de ce TP est de prendre en main un concept fondamental dans le d'eveloppement moderne, l’intégration
d’une API réseau RESTFull. Pour cela, il faut faire un appel HTTP et ”parser” les données renvoyées en
réponse.

# Objectif
Il s'agit de créer, en mode console, un programme permettant de récupérer la météo dans la ville spécifiée
en paramètre de l’application. Pour cela, un WS disponible sur internet : OpenWeatherMap. Le programme affiche la ville en question, la 
température actuelle dans la ville, la température maximale, la température minimale et l’humidité.

# Projet
Le jar de la librairie gson-2.8.2 a été ajouté au projet, ainsi que la librairie junit-4.13. openjdk-17 est utilisé pour ce projet.

# Détails
## model
Meteo représente l'objet meteo contenant un attribut ville, température actuelle, température max, température min et l'humidité. La présence de l'annotation @SerializedName sur certains des attributs permet d'associer les données présentes dans le json correspondant au nom donné à l'attribut. Elle possède un constructeur par défaut et des getter et setter sur les attributs. Elle possède également sa propre méthode d'affichage.
## service
Contient toutes les méthodes permettant de déserialiser un json obtenu via un appel réseau en un objet meteo. La méthode getMeteo est la méthode principal qui permet de faire cela via l'appel des autres méthodes. La méthode readStream permet de créer une chaine de caractère contenant l'ensemble du json lu retourné par l'appel réseau. Enfin, la méthode deserialization permet de créer l'objet meteo à partir de la chaîne de caractère représentant le json récupéré. 
## main
Contient la séquence du programme et qui effectue la récupération des infos via le nom de la ville passée en paramètre.
## test
Contient les tests sur la méthode de désérialisation
