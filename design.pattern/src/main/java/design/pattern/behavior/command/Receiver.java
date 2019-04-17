package design.pattern.behavior.command;

public class Receiver {

	public Receiver() {
		// empty
	}

	public void performRedo() {
		System.out.println("Executing a redo command in Receiver");
	}

	public void doTaskPriorToRedo() {
		System.out.println("Executing optional task prior to execute redo command");
	}

	public void performUndo() {
		System.out.println("Executing an undo command in Receiver");
	}

	public void doTaskPriorToUndo() {
		System.out.println("Executing optional task prior to execute undo command");
	}

}
