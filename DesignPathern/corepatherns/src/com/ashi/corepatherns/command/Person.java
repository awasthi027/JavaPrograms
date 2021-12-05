package com.ashi.corepatherns.command;

public class Person {
	
  public static void main(String[] args) {
	  Television tvTelevision = new Television();
	  RemoteControl rmControl = new RemoteControl();
	  CommandOn on = new CommandOn(tvTelevision);
	  rmControl.setCommand(on);
	  rmControl.pressButton();
	  CommandOff off = new CommandOff(tvTelevision);
	  rmControl.setCommand(off);
	  rmControl.pressButton();
   }
}
