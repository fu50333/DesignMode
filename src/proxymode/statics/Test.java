package proxymode.statics;

public class Test {
	@org.junit.Test
	public void TestStatic() {
		IDao realdao = new Dao();
		ProxyDao proxyDao = new ProxyDao();
		proxyDao.setDao(realdao);
		proxyDao.show();
	}
}
