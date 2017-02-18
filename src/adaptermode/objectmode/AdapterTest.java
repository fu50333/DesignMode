package adaptermode.objectmode;

import org.junit.Test;

import adaptermode.classmode.Source;
import adaptermode.classmode.Targetable;
/**
 * 
 * @描述 对象的适配器模式
 * @适用场景 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 * @author 傅文城
 *
 */
public class AdapterTest {
	@Test
	public void test(){
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method();
		target.method2();
	}
}
