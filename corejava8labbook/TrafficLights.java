package corejava8labbook;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one of the choice::\n");
		System.out.println("1.RED");
		System.out.println("2.YELLOW");
		System.out.println("3.GREEN");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("READY");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("INVALID INPUT");
		}
		sc.close();
	}

}
