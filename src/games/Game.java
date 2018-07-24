package games;

import model.results.Result;

public interface Game {
	
	public void setHomeTeam(String homeTeam);
	public void setAwayTeam(String awayTeam);
	public String getHomeTeam();
	public String getAwayTeam();
	public Result getResult();
	

}
