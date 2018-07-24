package model.games;

import org.junit.Assert;
import org.junit.Test;

import model.results.Result;

public class FootballGameTest {

	@Test
	public void test_getResultWhenAwayWin(){
		FootballGame footballGame = new FootballGame();
		footballGame.setHomeGoals(3);
		footballGame.setAwayGoals(4);
		Assert.assertEquals(Result.AWAY_WIN, footballGame.getResult());
	}

}
