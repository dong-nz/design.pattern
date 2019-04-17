package design.pattern.behavior.command;

public class CommandPatternDemo {

	public static void main(String[] args) {

		Receiver receiver = new Receiver();
		
		Command command = new RedoCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.invokeCommand();

		command = new UndoCommand(receiver);
		invoker.setCommand(command);
		invoker.invokeCommand();
	}

}
