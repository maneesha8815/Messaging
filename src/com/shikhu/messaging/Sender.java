package com.shikhu.messaging;

public class Sender implements SenderInterface{

	String name;
	
	public Sender(String name) {  //constructor
		this.name = name;
	}
	
	@Override
	public void sendMessage(Receiver receiver, String msg) {
		
		System.out.println(receiver.name+" is receiving message : "+msg);
		
	}

}
