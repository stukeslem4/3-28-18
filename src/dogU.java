import java.util.Scanner;
public class dogU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner T=new Scanner(System.in);

dog []dog=new dog[3];
for(int i=0;i<3;i++){
	
System.out.println("Enter the Dog's name and breed");
	
String O=T.nextLine();
String Tw=T.nextLine();		
	
dog[i]=new dog(O,Tw);

}


System.out.println(dog[1].name);		
System.out.println(dog[1].breed);		
		
		
		
		
		
	}
	
	
}
