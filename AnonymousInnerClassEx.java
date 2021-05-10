package may_7;

public class AnonymousInnerClassEx {
public static void main(String[] args) {
	Greet g = new Greet() {

		@Override
		public void wish(String n) {
			// TODO Auto-generated method stub
			System.out.println("Hi " + n + " Happy Birthday");
			
		} };
		
		g.wish("Aravind");
		System.out.println("-----");
		g.wish("Shivam");
}
}


interface Greet{
	void wish (String n);
}
