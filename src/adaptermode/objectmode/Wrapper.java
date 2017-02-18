package adaptermode.objectmode;

import adaptermode.classmode.Source;
import adaptermode.classmode.Targetable;

public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		source.method();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
