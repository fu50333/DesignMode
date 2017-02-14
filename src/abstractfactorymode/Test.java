package abstractfactorymode;

/**
 * 
 * @描述 抽象工厂模式
 * @author 傅文城
 *
 */
public class Test {
	@org.junit.Test
	public void test() {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
