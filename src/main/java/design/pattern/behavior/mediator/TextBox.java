package design.pattern.behavior.mediator;

public class TextBox implements Component {

	private Mediator mediator;
	private String id;
	
	public TextBox(Mediator mediator, String id){
		this.mediator = mediator;
		this.id = id;
		
		mediator.add(this);
	}
	
	public void valueChanged(String value) {
		mediator.notify(this, value);
	}
	
	@Override
	public void perform(String data) {
		System.out.println("TextBox Id " + getId() + " changed its value to " + data);
	}


	@Override
	public void update(String data) {
		System.out.println("TextBox Id " + getId() + " updated its value to " + data);
	}


	@Override
	public String getId() {
		return id;
	}

}
