package model.games;

import model.points.PointsCalculatorFootballMyTeam;

public class GameHarness {

	public static void main(String[] args) throws Exception {

		String inputString = "4-1A,2-1H,1-1H,4-5A,0-1H";
		String[] results = inputString.split(",");

		PointsCalculatorFootballMyTeam pcMyTeam = new PointsCalculatorFootballMyTeam();

		int points = 0;
		for (String inputResult: results) {
			points += pcMyTeam.getPointsForMyTeam(new FootballGameInvolvingMyTeam(inputResult, "DTS United"));
		}
		System.out.println("points: " + points);

	}

}
