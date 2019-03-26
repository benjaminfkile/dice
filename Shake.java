
public class Shake {

	boolean win;
	boolean lose;

	public boolean roll(){
		
		Die d1 = new Die();
		Die d2 = new Die();
		Die d3 = new Die();
		Die d4 = new Die();
		Die d5 = new Die();
		
		d1.roll();
		d2.roll();
		d3.roll();
		d4.roll();
		d5.roll();

		if((d1.value == d2.value) && (d2.value == d3.value) && (d3.value == d4.value) && (d4.value == d5.value)){
			System.out.println(d1.value + "," + d2.value + "," + d3.value + "," + d4.value + "," + d5.value);
			return true;
		}
		else{
			System.out.println(d1.value + "," + d2.value + "," + d3.value + "," + d4.value + "," + d5.value + ",");
			return false;
		}
	}
}