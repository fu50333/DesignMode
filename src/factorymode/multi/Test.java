package factorymode.multi;

import factorymode.ordinary.Sender;

/**
 * 
 * @描述 多工厂模式 
 * @author 傅文城
 *
 */
public class Test {
	@org.junit.Test
	public void test(){
		SendFactory factory = new SendFactory();
		Sender sender = factory.projectMail();
		sender.Send();
	}
}
