package proxymode.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 
 * @描述 代理模式---动态代理
 * @author 傅文城
 *
 */
public class Test {
	@org.junit.Test
	public void TestProxy() {
		// 创建接口实现类
		final IDao dao = new Dao();
		// 类proxy
		IDao proxy = (IDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(),
				new InvocationHandler() {
					// proxy代理对象 method被代理对象的方法 args方法的参数
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("before show");
						Object result = method.invoke(dao, args);
						System.out.println("after show");
						return result;
					}
				});
		proxy.show();
	}
}
