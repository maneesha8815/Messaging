package com.shikhu.messaging;

public class Controller implements ManagementInterface{

	Sender sender;
	Receiver receiver;
	
	public Controller() {
		
	}

	@Override
	public void registerAsSender(Sender sender) {
	    this.sender = sender;
	}

	@Override
	public void registerAsReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void sendMessage() {
		
		if(sender != null) {
			sender.sendMessage(receiver, "Hey this is very confidential");
		}
		
		if(receiver!=null) {
			receiver.receiverMessage(sender, "Hey this is very confidential");
		}
		
	}
	
	
	
	
	
}
