package model.points;

import org.junit.Assert;
import org.junit.Test;

public class PointsCalculatorFootballImplTest {

	@Test
	public void test_getPointsForWin(){
		PointsCalculator pointsCalculator = new PointsCalculatorFootballImpl();
		Assert.assertEquals(3, pointsCalculator.getPointsForWin());
	}

	@Test
	public void test_getPointsForDraw(){
		PointsCalculator pointsCalculator = new PointsCalculatorFootballImpl();
		Assert.assertEquals(1, pointsCalculator.getPointsForDraw());
	}

	@Test
	public void test_getPointsForLoss(){
		PointsCalculator pointsCalculator = new PointsCalculatorFootballImpl();
		Assert.assertEquals(0, pointsCalculator.getPointsForLoss());
	}

}
