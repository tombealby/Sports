package model.points;

import org.junit.Assert;
import org.junit.Test;

import model.games.FootballGameInvolvingMyTeam;

public class PointsCalculatorFootballMyTeamTest {

	@Test
	public void test_getPointsForHomeWin() throws Exception{
		PointsCalculatorFootballMyTeam pointsCalculatorFootballMyTeam = new PointsCalculatorFootballMyTeam();
		FootballGameInvolvingMyTeam footballGameInvolvingMyTeam = new FootballGameInvolvingMyTeam("4-2H", "DTS United");
		Assert.assertEquals(3, pointsCalculatorFootballMyTeam.getPointsForMyTeam(footballGameInvolvingMyTeam));
	}

	@Test
	public void test_getPointsForHomeLoss() throws Exception{
		PointsCalculatorFootballMyTeam pointsCalculatorFootballMyTeam = new PointsCalculatorFootballMyTeam();
		FootballGameInvolvingMyTeam footballGameInvolvingMyTeam = new FootballGameInvolvingMyTeam("2-4H", "DTS United");
		Assert.assertEquals(0, pointsCalculatorFootballMyTeam.getPointsForMyTeam(footballGameInvolvingMyTeam));
	}

}
