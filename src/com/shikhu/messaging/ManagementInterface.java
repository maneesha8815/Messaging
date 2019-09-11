package com.shikhu.messaging;

public interface ManagementInterface {

	public void registerAsSender(Sender sender);
	public void registerAsReceiver(Receiver receiver);
	public void sendMessage();
	
}
