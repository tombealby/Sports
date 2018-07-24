# Sports

This repository contains the code for a Sports games application containing the functionality to calculate points using the results of games.

File `GameHarness.java` contains code that processes a list of football game results and prints the total number of points earned from those games.

The code includes 4 test classes which should be run as JUnit tests. These 4 classes all contain `Test` in their name. 

Test instructions -
Run the following classes as JUnit tests
-  `FootballGameInvolvingMyTeamTest.java`
-  `FootballGameTest.java`
-  `PointsCalculatorFootballImplTest.java`
-  `PointsCalculatorFootballMyTeamTest.java`

Please note the following tasks that have not been done due to time pressures -
- the code contains very limited tests.
- the comments in the code should perhaps be expanded

Design Decisions
The Game class hierarchy is as follows -

       Game <interface>
         ^
         |
    FootballGame <concrete class>
        ^
        |
  FootballGameInvolvingMyTeam <concreate class>
  
The Game interface contains methods relating to teams. However in real life it is possible to have games between individuals and not teams. The Football class contains methods relating to goals. However in real life other games can also have goals. For example there are goals in hockey. We could have created a class or interface called GamesWithGoals and have FootballGame implement GamesWithGoals. This change would add complications and might be considered premature optimization.
