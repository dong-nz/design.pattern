package design.pattern.behavior.mediator;

public class CheckBox implements Component {

	private Mediator mediator;
	private String id;

	public CheckBox(Mediator mediator, String id) {
		this.mediator = mediator;
		this.id = id;
		
		this.mediator.add(this);
	}

	public void checked(boolean checked) {
		if (checked) {
			mediator.notify(this, "checked");
		}else {
			mediator.notify(this, "unchecked");
		}
		
	}
	
	@Override
	public void perform(String data) {
		System.out.println("CheckBox Id " + id + " has changed to " + data);
	}

	@Override
	public void update(String data) {
		System.out.println("CheckBox Id " + id + " has updated to " + data);
	}

	@Override
	public String getId() {
		return id;
	}

}
