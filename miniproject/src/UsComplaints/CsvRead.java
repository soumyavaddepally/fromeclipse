package UsComplaints;
import java.io.*;
import java.util.*;

public class CsvRead {
	HashMap<String,details> Mapobj=new HashMap<>();
	public void loadfile() {
		String path="C:\\Users\\soumya\\Downloads\\complaints.csv";
		String line="";
	try {
		BufferedReader bf=new BufferedReader(new FileReader(path));
		while ((line=bf.readLine())!=null)
		{   
			
			String[] elements=line.split(",");
			details detobj=new details();
			detobj.dateReceived=elements[0];
			detobj.product=elements[1];
			detobj.subProduct=elements[2];
			detobj.issue=elements[3];
			detobj.subIssue=elements[4];
			detobj.company=elements[5];
			detobj.state=elements[6];
			detobj.ZIPcode=elements[7];
			detobj.submittedVia=elements[8];
			detobj.dateSentToCompany=elements[9];
			detobj.companyResponseToConsumer=elements[10];
			detobj.timelyResponse=elements[11];
			detobj.consumerDisputed=elements[12];
			Mapobj.put(elements[13], detobj);
		}
		bf.close();
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
	 
	HashMap<String,details> getmapobj(){
		
		return Mapobj;
	
}
}