/**
 * 
 */
package Java10;
class Caaa{
	private int num;
	
	public void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb extends Caaa{
	public void display() {
		System.out.println("printed form Cbbb class");
	}
}
public class J09{
	public static void main(String[] args) {
		Caaa bb = new Cbbb();
		bb.display();
	}

}
