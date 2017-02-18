package factorymode.multi;

import org.junit.Test;

import factorymode.ordinary.Sender;

/**
 * 
 * @描述 多工厂模式 
 * @author 傅文城
 *
 */
public class MultiFactoryTest {
	@Test
	public void test(){
		SendFactory factory = new SendFactory();
		Sender sender = factory.projectMail();
		sender.Send();
	}
}
