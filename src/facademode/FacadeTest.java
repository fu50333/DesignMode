package facademode;

import org.junit.Test;

/**
 * 
 * @描述 外观模式
 * @适用场景 解耦类之间的依赖关系
 * @author 傅文城
 *
 */
public class FacadeTest {
	@Test
	public void test() {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
