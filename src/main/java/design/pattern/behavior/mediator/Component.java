package design.pattern.behavior.mediator;

public interface Component {
	void perform(String data);
	void update(String data);
	String getId();
}
