import java.util.Scanner;
public class FanWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		String[] str=string.split(" ");
		System.out.print("print string is \n"+string+"\n");
		System.out.print("fan words is: \n");
		for(int a=str.length-1;a>=0;a--){
			System.out.print(str[a]+" ");
		}		
	}

}
