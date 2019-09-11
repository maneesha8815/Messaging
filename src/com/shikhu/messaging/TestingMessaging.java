package com.shikhu.messaging;

public class TestingMessaging {
	
	
	public static void main(String[] args) {
		
		Sender sender = new Sender("SHikhu"); //sender
		
		Receiver receiver = new Receiver("Poonam Dhillo pillo"); //receiver
		
		Controller controller = new Controller(); //controller
		
		controller.registerAsSender(sender);
		controller.registerAsReceiver(receiver);
		
		controller.sendMessage();
		
	}

}
