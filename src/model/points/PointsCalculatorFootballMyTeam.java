package model.points;

import model.games.FootballGameInvolvingMyTeam;
import model.results.Result;

/**
 * Calculates the points that my team gets from a football game.
 * @author Tom
 * @since 2018.07.24
 */
public class PointsCalculatorFootballMyTeam {

	PointsCalculator pointsCalculator = new PointsCalculatorFootballImpl();

	public int getPointsForMyTeam(FootballGameInvolvingMyTeam footballGameInvolvingMyTeam) {

		Result result = footballGameInvolvingMyTeam.getResult();
		String homeTeam = footballGameInvolvingMyTeam.getHomeTeam();
		String awayTeam = footballGameInvolvingMyTeam.getAwayTeam();
		String myTeamName = footballGameInvolvingMyTeam.getTEAM_NAME();

		if ((myTeamName.equals(homeTeam) && result == Result.HOME_WIN) ||
				(myTeamName.equals(awayTeam) && result == Result.AWAY_WIN)	) {
			return pointsCalculator.getPointsForWin();
		} else if (result == Result.DRAW) {
			return pointsCalculator.getPointsForDraw();
		} else {
			return pointsCalculator.getPointsForLoss();
		}
	}

}
