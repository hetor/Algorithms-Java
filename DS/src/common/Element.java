package common;

public class Element {
	
	private int value;
	
	public Element(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
}
