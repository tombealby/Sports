package model.games;

import model.results.Result;

/** 
 * Representation of a football game
 * @author Tom
 *
 */
public class FootballGame implements Game {
	
	private int homeGoals;
	private int awayGoals;
	private String homeTeam;
	private String awayTeam;
	
	public int getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(int homeGoals) {
		this.homeGoals = homeGoals;
	}

	public int getAwayGoals() {
		return awayGoals;
	}

	public void setAwayGoals(int awayGoals) {
		this.awayGoals = awayGoals;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;

	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;

	}

	@Override
	public String getHomeTeam() {
		return homeTeam;
	}

	@Override
	public String getAwayTeam() {
		return awayTeam;
	}

	@Override
	public Result getResult() {
		
		if (homeGoals > awayGoals) {
			return Result.HOME_WIN;
		} else if (homeGoals < awayGoals) {
			return Result.AWAY_WIN;
		} else {
			return Result.DRAW;
		}
	}

}
