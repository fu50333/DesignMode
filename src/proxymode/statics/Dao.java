package proxymode.statics;
public class Dao implements IDao{

	@Override
	public void show() {
		System.out.println("real show");
	}
}
