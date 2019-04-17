package design.pattern.behavior.command;

public class RedoCommand implements Command {

	private Receiver receiver;

	public RedoCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void executeCommand() {
		receiver.doTaskPriorToRedo();
		receiver.performRedo();
	}

}
