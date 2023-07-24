package com.dilip.dayFiveCodes.abstractDemo.exceptionalInterfaces;

/* The example here demonstrates and gives a basic idea of how interfaces 
with method implementations can be used in real time scenarios. */

interface NotificationService {
	void sendNotification(String recipient, String message);

	default void logNotification(String recipient, String message) {
		System.out.println("Sending notification to: " + recipient);
		System.out.println("Message: " + message);
	}

	static NotificationService getNotificationService(String type) {
		if ("email".equalsIgnoreCase(type)) {
			return new EmailNotificationService();
		} else if ("sms".equalsIgnoreCase(type)) {
			return new SMSNotificationService();
		} else if ("push".equalsIgnoreCase(type)) {
			return new PushNotificationService();
		}
		throw new IllegalArgumentException("Invalid notification type: " + type);
	}
}

class EmailNotificationService implements NotificationService {
	@Override
	public void sendNotification(String recipient, String message) {
		System.out.println("Sending email to: " + recipient);
		System.out.println("Message: " + message);
	}
}

class SMSNotificationService implements NotificationService {
	@Override
	public void sendNotification(String recipient, String message) {
		System.out.println("Sending SMS to: " + recipient);
		System.out.println("Message: " + message);
	}
}

class PushNotificationService implements NotificationService {
	@Override
	public void sendNotification(String recipient, String message) {
		System.out.println("Sending push notification to: " + recipient);
		System.out.println("Message: " + message);
	}
}

public class NotificationServiceDemo {

	public static void main(String[] args) {
		NotificationService emailService = NotificationService.getNotificationService("email");
		emailService.logNotification("john@example.com", "Hello, this is an email notification.");

		NotificationService smsService = NotificationService.getNotificationService("sms");
		smsService.logNotification("+1234567890", "Hello, this is an SMS notification.");

		NotificationService pushService = NotificationService.getNotificationService("push");
		pushService.logNotification("user123", "Hello, this is a push notification.");
	}

}
