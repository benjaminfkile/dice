import java.util.Random;

public class Die {
	Random rn = new Random();
	private int max = 6;
	private int min = 1;
	public int value;
	public int roll(){
		final int x = rn.nextInt(max-min +1) + min;
		value = x;
		return x;
	}
}
