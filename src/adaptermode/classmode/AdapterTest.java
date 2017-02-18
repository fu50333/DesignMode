package adaptermode.classmode;

import org.junit.Test;
/**
 * 
 * @描述 类的适配器模式
 * @适用场景 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 * @author 傅文城
 *
 */
public class AdapterTest {
	@Test
	public void test(){
		Targetable target = new Adapter();
		target.method();
		target.method2();
	}
}
