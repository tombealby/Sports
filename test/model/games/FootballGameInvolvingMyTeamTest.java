package model.games;

import org.junit.Assert;
import org.junit.Test;

import model.results.Result;

public class FootballGameInvolvingMyTeamTest {

	@Test
	public void test_getResultWhenDraw() throws Exception{
		FootballGameInvolvingMyTeam footballGameInvolvingMyTeam = new FootballGameInvolvingMyTeam("88-88H", "DTS United");
		Assert.assertEquals(Result.DRAW, footballGameInvolvingMyTeam.getResult());
	}

	@Test
	public void test_getResultWhenAwayLoss() throws Exception{
		FootballGameInvolvingMyTeam footballGameInvolvingMyTeam = new FootballGameInvolvingMyTeam("4-1A", "DTS United");
		Assert.assertEquals(Result.HOME_WIN, footballGameInvolvingMyTeam.getResult());
	}

	@Test
	public void test_invalidInputString() {
		FootballGameInvolvingMyTeam footballGameInvolvingMyTeam = null;
		try {
			footballGameInvolvingMyTeam = new FootballGameInvolvingMyTeam("88-88", "DTS United");
			Assert.fail("Exception expected due to invalid input => should not reach this line.");
		} catch (Exception e) {
			// Exception is expected => if code executes catch block then the test has passed.
		}
		Assert.assertNull(footballGameInvolvingMyTeam);
	}

}
