package singletonmode;

import java.util.Random;
import java.util.Vector;
/**
 * @描述 单例模式扩展
 * @author 傅文城
 *
 */
public class Emperor {
	// 定义最多能产生的实例数量
	private static int maxNumOfEmperor = 2;
	// 每个皇帝都有名字。使用一个Vector来容纳，每个对象的私有属性  Vector线程安全
	private static Vector<String> nameList = new Vector<>();
	// 定义一个列表。容纳所有皇帝的实例
	private static Vector<Emperor> emperorList = new Vector<>();
	// 当前皇帝序列号
	private static int countNumOfEmperor = 0;
	// 产生所有对象
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇帝：" + (i + 1)));
		}
	}

	private Emperor() {
	}

	// 传入皇帝名称，建立一个皇帝对象
	private Emperor(String name) {
		nameList.add(name);
	}

	// 随机获得一个皇帝对象
	public static Emperor getInstance() {
		Random random = new Random();
		// 随机拉出一个皇帝
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}

	// 皇帝发话了
	public static void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
}
