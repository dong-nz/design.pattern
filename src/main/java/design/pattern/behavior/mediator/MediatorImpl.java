package design.pattern.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

public class MediatorImpl implements Mediator {

	private Map<String, Component> components;

	public MediatorImpl() {
		components = new HashMap<>();

	}

	private void updateCheckBoxs() {

	}

	private void updateTextBoxes(String skipId, String data) {
		components.forEach((key, value) -> {

			if (key != skipId && value instanceof TextBox) {
				value.update(data);
			}
		});
	}

	@Override
	public void notify(Component component, String data) {

		if (components.containsKey(component.getId())) {
			Component comp = components.get(component.getId());

			comp.perform(data);

			// It can be any logic for any specific component
			if (comp instanceof TextBox) {
				updateTextBoxes(comp.getId(), data);
			} else {
				updateCheckBoxs();
			}
		}
	}

	@Override
	public void add(Component comp) {
		components.put(comp.getId(), comp);
	}

}
