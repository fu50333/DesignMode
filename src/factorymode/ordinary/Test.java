package factorymode.ordinary;

/**
 * 
 * @描述 普通工厂模式
 * @author 傅文城
 *
 */
public class Test {
	@org.junit.Test
	public void test() {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}
}
