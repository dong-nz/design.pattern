package design.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

	private List<Component> components;

	public MediatorImpl() {
		components = new ArrayList<>();

	}

	@Override
	public void notify(Component component, String data) {

		if (components.contains(component)) {
			for (Component comp : components) {
				if (comp == component) {
					comp.perform(data);
				} else {
					comp.update(data);
				}
			}
		}
	}

	@Override
	public void add(Component textBox) {
		components.add(textBox);
	}

}
