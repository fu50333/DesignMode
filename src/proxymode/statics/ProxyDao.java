package proxymode.statics;

public class ProxyDao implements IDao {
	private IDao dao;

	@Override
	public void show() {
		System.out.println("before show");
		dao.show();
		System.out.println("after show");
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
