package prototypemode;
/**
 * 
 * @描述 原型模式
 * @author 傅文城
 *
 */
public class Prototype implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
}
