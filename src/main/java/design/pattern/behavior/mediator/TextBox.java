package design.pattern.behavior.mediator;

import java.util.Objects;

public class TextBox implements Component {

	interface UpdateListener {
		void onUpdate(String data);
	}

	private Mediator mediator;
	private String id;
	private UpdateListener event;

	public TextBox(Mediator mediator, String id) {
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
		System.out.println("TextBox Id " + getId() + " received updated value: " + data);
		if (!Objects.isNull(event)) {
			event.onUpdate(data);
		}
	}

	@Override
	public String getId() {
		return id;
	}

	public void addUpdateListener(UpdateListener event) {
		this.event = event;
	}
}
