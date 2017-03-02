package strategymode;

import org.junit.Test;

/**
 * 
 * @描述 策略模式
 * @策略模式 决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 * @author 傅文城
 *
 */
public class StrategyTest {
	@Test
	public void test() {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}
}
