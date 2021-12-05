package com.ashi.corepatherns.command;



public class CommandOn implements Command {

	public Television television;
	
	@Override
	public void execute() {
		television.on();
		
	}

	public CommandOn(Television television) {
		this.television = television;
	}



}
