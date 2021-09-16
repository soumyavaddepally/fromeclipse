package UsComplaints;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration; 
public class functions {
	CsvRead f=new CsvRead();
	Scanner sc=new Scanner(System.in);
	
	void loadData() {
		f.loadfile();
	}
	void complaintsBasedOnYear(String year)
	{
		for (HashMap.Entry<String,details> entry :f.getmapobj().entrySet()) 
		{
			if(entry.getValue().dateReceived.contains(year))
				  { 
			  		System.out.println(entry.getValue().issue);
				  }
		}
		
	}
	void complaintsBasedOnCompany(String u_company)
	{
	for (HashMap.Entry<String,details> entry :f.getmapobj().entrySet()) 
	{
	  if(entry.getValue().company.equalsIgnoreCase(u_company))
	  {
		  System.out.println(entry.getValue().issue + " "+ u_company);
	  }
	}
	}
	
	
	void complaintsBasedOnComplaintID(String id)
	{
	for (HashMap.Entry<String,details> entry :f.getmapobj().entrySet()) 
	{
	  if(f.getmapobj().containsKey(id))
	  {
		  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	  }
	  else
	  {
		  	System.out.println("Complaint ID does not exists.");
		  
	  }
	}
	}
	void NoOfDaysTOCloseComplaint(String id)
	{	
		for (HashMap.Entry<String,details> entry :f.getmapobj().entrySet()) 
		{	Date d1 = null;
			Date d2=null;
			if(f.getmapobj().containsKey(id))
			  {
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				String s1=entry.getValue().dateReceived;
				String s2=entry.getValue().dateSentToCompany;
				try {
					d1 = format.parse(s1);
					d2=format.parse(s2);
				} catch (ParseException e) {
					e.printStackTrace();
				}  
				
				int diff = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
				System.out.println(diff);
				}
			
		}
	}
	void complaintsClosed(String uid)
	{
	for (HashMap.Entry<String,details> entry :f.getmapobj().entrySet()) 
	{
		String compResp=entry.getValue().companyResponseToConsumer;
		
	  if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
	  {
		  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	  }
	  else
	  {
		  	System.out.println("Complaint ID does not exists.");
		  
	  }
	}

	}


	void complaintsReceivingTimelyResponse(String id)
	{
	for (HashMap.Entry<String,details> entry :f.getmapobj().entrySet()) 
	{
		if(entry.getValue().timelyResponse.equals("Yes"))
		{
			System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
		}
	}
	}
	
	void input() {
		
	}
	public void Inputs() {
		System.out.println("enter details");
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		String st3=sc.nextLine();
		String st4=sc.nextLine();
		String st5=sc.nextLine();
		String st6=sc.nextLine();
		String st7=sc.nextLine();
		String st8=sc.nextLine();
		String st9=sc.nextLine();
		String st10=sc.nextLine();
		String st11=sc.nextLine();
		String st12=sc.nextLine();
		String st13=sc.nextLine();
		
	}

}
