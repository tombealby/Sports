package model.games;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.results.Result;

/**
 * Represents a football game created from a football score
 * which contains the number of goals for my team followed by
 * the number of goals for the opposing team. The football score
 * will also contain information specifying whether my team was
 * playing at home or away.
 *
 * @author Tom
 * @since 2018.07.24
 *
 */
public class FootballGameInvolvingMyTeam extends FootballGame {
	
	/*
	 * INPUT_PATTERN is a regex pattern used to extract the number of goals
	 * for my team, the number of goals for the opposing team, and whether
	 * my team was playing at home or away. The pattern is expected to be 
	 * applied against a string with the format 
	 * <number of goals for my team>-<number of goals for opposing team><H|A>
	 * For example a the input string "4-1A".
	 */
	private final Pattern INPUT_PATTERN = Pattern.compile("^(\\d)+-(\\d)+([AH])$");
	private final String TEAM_NAME;
	
	public FootballGameInvolvingMyTeam(String inputResult, String teamName) throws Exception {
		
		this.TEAM_NAME = teamName;
		Matcher matcher = INPUT_PATTERN.matcher(inputResult);
		if (matcher.find()) {

			int homeGoals = Integer.valueOf(matcher.group(1));
			int awayGoals = Integer.valueOf(matcher.group(2));
			String homeOrAway = matcher.group(3);

			boolean isHomeTeam = "H".equals(homeOrAway);

			String homeTeam = isHomeTeam ? this.TEAM_NAME : null;
			String awayTeam = !isHomeTeam ? this.TEAM_NAME : null;

			this.setHomeTeam(homeTeam);
			this.setAwayTeam(awayTeam);
			this.setHomeGoals(homeGoals);
			this.setAwayGoals(awayGoals);
		} else {
			throw new Exception("Invalid input result format for creation of FootballGameInvolvingMyTeam. "
					+ "Input result:" + inputResult);
		}
	}

	public String getTEAM_NAME() {
		return TEAM_NAME;
	}

}
