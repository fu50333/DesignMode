package buildermode;

import java.util.ArrayList;
import java.util.List;

import abstractfactorymode.MailSender;
import abstractfactorymode.Sender;
import abstractfactorymode.SmsSender;

public class Builder {
	private List<Sender> list = new ArrayList<>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}

	}

	public void produceSmSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
