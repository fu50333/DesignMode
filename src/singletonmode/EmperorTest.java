package singletonmode;
/**
 * 
 * @描述 单例模式扩展
 * @author 傅文城
 *
 */
public class EmperorTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int ministerNum = 5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor e = Emperor.getInstance();
			System.out.println("第" + (i + 1) + "个大臣参拜的是：");
			e.say();
		}
	}
}
