package design.pattern.behavior.command;

public class UndoCommand implements Command {

	private Receiver receiver;

	public UndoCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void executeCommand() {
		receiver.doTaskPriorToUndo();
		receiver.performUndo();
	}

}
