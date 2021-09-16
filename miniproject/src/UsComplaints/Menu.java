package UsComplaints;
import java.util.*;

public class Menu {
	public static void main(String[] args) {
		functions fun=new functions();
		fun.loadData();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Display all the complaints based on the year provided by the user ");
		System.out.println("2.Display all the complaints based on the name of the bank provided by the user");
		System.out.println("3.Display complaints based on the complaint id provided by the user ");
		System.out.println("4.Display number of days took by the Bank to close the complaint ");
		System.out.println("5.Display all the complaints closed/closed with explanation ");
		System.out.println("6.Display all the complaints which received a timely response ");
		System.out.println("7.Take input for user for storing new complaints");
		System.out.println("Choose your option:");
		
		int op=sc.nextInt();
		sc.nextLine();
		switch(op) {
		case 1:
			System.out.println("enter year:");
			String y=sc.nextLine();
			fun.complaintsBasedOnYear(y);
			break;
		case 2:
			System.out.println("enter company:");
			String c=sc.nextLine();
			fun.complaintsBasedOnCompany(c);
			break;
		case 3:
			System.out.println("enter complaint id:");
			String id=sc.nextLine();
			fun.complaintsBasedOnComplaintID(id);
			break;
		case 4: 
			System.out.println("Enter complaint ID");
			String compid=sc.next();
			fun.NoOfDaysTOCloseComplaint(compid);
			break;
		case 5: 
			System.out.println("Enter complaint ID");
			String uid=sc.next();
			fun.complaintsClosed(uid);
		break;
		case 6: 
			System.out.println("Enter complaint ID");
			String timely_compid=sc.nextLine();
			fun.complaintsReceivingTimelyResponse(timely_compid);
		break;
		case 7:
			System.out.println("enter imputs");
			fun.Inputs();
		break;
		default: System.out.println("Enter valid option");
		}
	}

}
