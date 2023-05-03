import java.util.Scanner;

class SingletonAssignment2{
	private static SingletonAssignment2 InstanceVariable = null;
	private static int count=0;
	private static String s = "";
	private static Boolean flag= false;
	
	private SingletonAssignment2() {
		// TODO Auto-generated constructor stub
	}
	public static SingletonAssignment2 getInstance() {
		
		if (count<3) {
			if (flag == false ) {
			InstanceVariable = new SingletonAssignment2();
			s = (count+1) + " " + "instance created ..\n";
			System.out.println(s);
			count++;
			return InstanceVariable;
			}
			
			else if (flag==true) {return null;}
				
			}
			
		else {
				System.out.println("You cannot create more than three instances..\n" +s);
				//return InstanceVariable;
			}
		return null;
}
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String result, v = "yes"; 
		int n = 0;
		int count =0;
		do{
			System.out.println("Would you like to create an instance of the SingletonAssignment2 Class?\nPress yes or no:  ");
		result = sc.nextLine();
		
		if (result.equals(v)) {
			if(count==0) {
				SingletonAssignment2 sa1 = SingletonAssignment2.getInstance();
				}
			if (count ==1) {
				SingletonAssignment2 sa2 = SingletonAssignment2.getInstance();
				
			}
			if(count ==2) {
				SingletonAssignment2 sa3 = SingletonAssignment2.getInstance();
				
			}
			if (count ==3) {
				SingletonAssignment2 sa4 = SingletonAssignment2.getInstance();
				
				if(sa4 == null) {
					System.out.println("Exit..");
					break;
				}
				
			}
			count++;
		}
		else {
			System.out.println("\nNo instance is requested.");
		}
	
		}while (n<5);
	
	}
}
