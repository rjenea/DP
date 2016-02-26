package burglary_prevention;

public class RemoteControl2 {
	
	Command[] doCommands;
	Command[] undoCommands;
	Command undoCommand;
	 
	public RemoteControl2() {
		doCommands = new Command[2];
		undoCommands = new Command[2];		
	}
 
//	public void setCommand(Command command) {
//		slot = command;
//	}
	
	public void setCommand(int slot, Command doCommand, Command undoCommand) {
		doCommands[slot] = doCommand;
		undoCommands[slot] = undoCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		doCommands[slot].execute();
		undoCommand = doCommands[slot];
	}
 
	public void offButtonWasPushed(int slot) {
		undoCommands[slot].execute();
		undoCommand = undoCommands[slot];
	}
 
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
 
//	public void buttonWasPressed() {
//		slot.execute();
//	}
}
