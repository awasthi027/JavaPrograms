package com.ashi.corepatherns.command;



public class CommandOff implements Command {

	public Television television;
	
	@Override
	public void execute() {
		television.off();
		
	}

	public CommandOff(Television television) {
		this.television = television;
	}


}
