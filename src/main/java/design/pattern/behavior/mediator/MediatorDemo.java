package design.pattern.behavior.mediator;

public class MediatorDemo {
	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl();

		TextBox textbox1 = new TextBox(mediator, "001");
		
		TextBox textbox2 = new TextBox(mediator, "002");

		textbox1.valueChanged("100");
		
		textbox2.valueChanged("200");
	}
}
