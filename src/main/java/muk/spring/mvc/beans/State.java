package muk.spring.mvc.beans;

public class State {

	private String id;
	private String state;
	
	public State(){
	}
	
	public State(String id, String state) {
		super();
		this.id = id;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
}
