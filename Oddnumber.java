package player;
import java.util.Scanner;
public class Oddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Number of elements:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int result=0;
for(int i=0;i<=n;i++){
	if(i/2!=0){
		result=result+i;
		System.out.println("Odd Number");
	}
	//else{
		//System.out.println("Even Number");
	//}
}
	}

}
