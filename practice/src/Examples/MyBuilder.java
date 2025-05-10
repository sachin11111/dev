package Examples;

public class MyBuilder {

	String str = new String();
	
	public MyBuilder append(String s) {
		str = str + s;
		return this;
	}
	
	public String toString() {
		return str;
	}
}
