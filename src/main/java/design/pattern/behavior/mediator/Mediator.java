package design.pattern.behavior.mediator;

public interface Mediator {
	void notify(Component component, String action);

	void add(Component textBox);
}
