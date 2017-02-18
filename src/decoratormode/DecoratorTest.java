package decoratormode;

import org.junit.Test;
/**
 * 
 * @描述 装饰器模式
 * @适用场景 1、需要扩展一个类的功能 2动态为一个对象增加功能，而且能动态撤销
 * @author 傅文城
 *
 */
public class DecoratorTest {
	@Test
	public void test(){
		Sourceable source = new Source();
		Sourceable decorator = new Decorator(source);
		decorator.method();
	}
}
