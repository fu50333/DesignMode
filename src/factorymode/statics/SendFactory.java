package factorymode.statics;

import factorymode.ordinary.MailSender;
import factorymode.ordinary.Sender;
import factorymode.ordinary.SmsSender;

public class SendFactory {
	public static Sender projectMail() {
		return new MailSender();
	}

	public static Sender projectSms() {
		return new SmsSender();
	}
}
