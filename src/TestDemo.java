import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
	
		int a;
		String ch;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		a = input.nextInt();
		ch = new Character((char)a).toString();
		
		if(a == 0){
			System.out.println("You have entered Zero, ascii value: "+ch);
		}else if(a < 0){
			System.out.println("You have entered Negative Value, ascii value: "+ch);
		}else{
			System.out.println("You have entered Positive Value, ascii value: "+ch);
		}
	}

}
