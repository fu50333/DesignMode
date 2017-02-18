package abstractfactorymode;

import org.junit.Test;

/**
 * 
 * @描述 抽象工厂模式
 * @author 傅文城
 *
 */
public class AbstractFactoryTest {
	@Test
	public void test() {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
