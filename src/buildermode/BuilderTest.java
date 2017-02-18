package buildermode;

import org.junit.Test;
/**
 * 
 * @描述 建造者模式
 * @author 傅文城
 *
 */
public class BuilderTest {
	@Test
	public void test() {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
