package design.pattern.behavior.command;

public class Invoker {
	private Command command;

	public Invoker() {
	}

	public void invokeCommand() {
		command.executeCommand();
	}

	public void setCommand(Command command) {
		this.command = command;
	}
}
