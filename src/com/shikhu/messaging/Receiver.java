package com.shikhu.messaging;

public class Receiver implements ReceiverInterface {

	String name;
	
	public Receiver(String name) {
		this.name = name;
	}
	
	
	@Override
	public void receiverMessage(Sender sender, String msg) {
		
		System.out.println(sender.name+" is saying "+msg);
		
	}

	
	
}
