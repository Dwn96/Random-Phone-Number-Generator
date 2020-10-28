import java.util.Random;

public class Genr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Rand numbers between	720000000 - 729999999

	int max= 729999999;
	int min= 720000000;
		
	Random rn = new Random();
	
	

	int range = max - min + 1;
	
	
	for (int i =0; i<10; i++) {
		
		int randomNum = rn.nextInt(range) + min;
		int numberSet[]= new int[10];
		numberSet[i] = randomNum;		
		
		System.out.print("+254"+numberSet[i]+ ",");
	}
	
	
	

	
	
	
	
		
	}

}
