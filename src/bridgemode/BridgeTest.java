package bridgemode;

import org.junit.Test;

/**
 * 
 * @描述 桥接模式
 * @适用场景 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。例如JDBC驱动
 * @author 傅文城
 *
 */
public class BridgeTest {
	@Test
	public void test() {
		Bridge bridge = new MyBridge();

		/* 调用第一个对象 */
		Sourceable source = new SourceSub();
		bridge.setSource(source);
		bridge.method();

		/* 调用第二个对象 */
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
