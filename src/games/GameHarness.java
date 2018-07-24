package games;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import model.points.PointsCalculatorFootballMyTeam;

public class GameHarness {

	public static void main(String[] args) throws Exception {

		PointsCalculatorFootballMyTeam pcMyTeam = new PointsCalculatorFootballMyTeam();

		int points = 0;
		for (String inputResult: getInputResults()) {
			points += pcMyTeam.getPointsForMyTeam(new FootballGameInvolvingMyTeam(inputResult, "DTS United"));
		}
		System.out.println("points: " + points);

	}
	
	private static List<String> getInputResults() {
		List<String> inputResults = new ArrayList<String>();
		inputResults.add("4-1A");
		inputResults.add("2-1H");
		inputResults.add("1-1H");
		return inputResults;
	}

}
