public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shake s = new Shake();
		int i = 0;
		double pot = 0;
		do{
			i++;
			pot+=.50;
			System.out.println("\n" +  i);
			System.out.println(pot + "$");
		}while(s.roll()!=true);
	}
}
