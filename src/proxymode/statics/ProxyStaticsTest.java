package proxymode.statics;

import org.junit.Test;

/**
 * 
 * @描述 代理模式---静态代理
 * @author 傅文城
 *
 */
public class ProxyStaticsTest {
	@Test
	public void TestStatic() {
		IDao realdao = new Dao();
		ProxyDao proxyDao = new ProxyDao();
		proxyDao.setDao(realdao);
		proxyDao.show();
	}
}
