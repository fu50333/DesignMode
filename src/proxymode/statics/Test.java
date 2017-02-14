package proxymode.statics;
/**
 * 
 * @描述 代理模式---静态代理
 * @author 傅文城
 *
 */
public class Test {
	@org.junit.Test
	public void TestStatic() {
		IDao realdao = new Dao();
		ProxyDao proxyDao = new ProxyDao();
		proxyDao.setDao(realdao);
		proxyDao.show();
	}
}
