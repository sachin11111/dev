package Examples;

public class MyBuilderMain {

	public static void main(String args[]) {
		MyBuilder builder = new MyBuilder();
		builder.append("Sachin ").append(" P").append(" Suryavanshi");
		
		System.out.print(builder.toString());
		
		
		String s = "###";
		  String[] txID2groups = s.split("#"); 
		  System.out.print(txID2groups[0]);
				  
	}
}
