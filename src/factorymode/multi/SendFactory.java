package factorymode.multi;

import factorymode.ordinary.MailSender;
import factorymode.ordinary.Sender;
import factorymode.ordinary.SmsSender;

public class SendFactory {
	public Sender projectMail() {
		return new MailSender();
	}

	public Sender projectSms() {
		return new SmsSender();
	}
}
