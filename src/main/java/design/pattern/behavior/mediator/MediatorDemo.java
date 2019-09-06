package design.pattern.behavior.mediator;

import design.pattern.behavior.mediator.TextBox.UpdateListener;

public class MediatorDemo {
	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl();

		TextBox textbox1 = new TextBox(mediator, "001");
		textbox1.addUpdateListener(new UpdateListener() {

			public void onUpdate(String data) {
				System.out.println("TextBox Id " + textbox1.getId() + " update data to " + Integer.parseInt(data) + 2);

			}
		});

		TextBox textbox2 = new TextBox(mediator, "002");
		textbox2.addUpdateListener(new UpdateListener() {
			
			@Override
			public void onUpdate(String data) {
				System.out.println("TextBox Id " + textbox2.getId() + " update data to " + Integer.parseInt(data) + 34);
			}
		});

		CheckBox checkBox = new CheckBox(mediator, "003");

		textbox1.valueChanged("100");
		
		System.out.println("-----");

		textbox2.valueChanged("200");
		
		System.out.println("-----");
		
		checkBox.checked(true);

	}
}
