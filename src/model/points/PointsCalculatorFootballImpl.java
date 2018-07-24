package model.points;

/**
 * PointsCalculator returns points earned for a football match.
 * @author Tom
 * @since 2018.07.24
 */
public class PointsCalculatorFootballImpl implements PointsCalculator {

	@Override
	public int getPointsForWin() {

		return 3;
	}

	@Override
	public int getPointsForDraw() {

		return 1;
	}

	@Override
	public int getPointsForLoss() {

		return 0;
	}
}
