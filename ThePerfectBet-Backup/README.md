# Final-ecking-cmum-davis.knight
Final Project CS222 -The Perfect Bet
This application is for users who are trying to pull live data about sports betting

## General Info
This is the v0.3.0 release
* There is a warning because of the package name including "cs222"
* We were unable to get the project to run when our Main method was in the View package, so it is left out of it for now.


## Authors
* Davis Knight
* Evyn King
* Conner Um

## Main Entry Points
* Main.java: Run to use application with the built GUI
* Run the GUI through main class

## Technologies
Project is created with:
* Java: 16.0.0
* org.openjfx.javafxplugin: 0.07
* The Odds-API
* Statistics Api: https://gist.github.com/nntrn/ee26cb2a0716de0947a0a4e9a157bc1c
* Teams: http://sports.core.api.espn.com/v2/sports/football/leagues/nfl/seasons/2022/teams/1?lang=en&region=us
*Team Statistics: https://sports.core.api.espn.com/v2/sports/football/leagues/nfl/seasons/2022/types/2/teams/12/statistics
  * ^Replace the /12/ with a number to choose which team to view statistics for 
* Statistics Test Link: https://sports.core.api.espn.com/v2/sports/football/leagues/nfl/seasons/2022/types/2/teams/12/statistics


## Features
* Select the sport you are wanting with the drop down menu
* Then select the two teams and compare their odds
* Odds will display and you can enter a money amount for either team and click calculate and it will show you the money you could win.
* From there you can choose the statistics tab if you want to view the stats of the teams
* You can select from a wide variety of statistics you want to see

## Setup
To run this project, clone this repository, and download the dependencies and plugins
* Run the program in the main class
