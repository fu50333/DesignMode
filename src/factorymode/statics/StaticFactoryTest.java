package factorymode.statics;

import org.junit.Test;

import factorymode.ordinary.Sender;

/**
 * 
 * @描述 静态工厂模式
 * @author 傅文城
 *
 */
public class StaticFactoryTest {
	@Test
	public void test() {
		Sender sender = SendFactory.projectMail();
		sender.Send();
	}
}
