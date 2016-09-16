import java.util.ArrayList;
import java.util.Collections;

public class DoctorSite {
	
	ArrayList< Doctor> doctorList = new ArrayList<Doctor>();
	
	public ArrayList< Doctor> getSimilarDoctor(Doctor d)
	{
		ArrayList< Doctor> similarDoctor = new ArrayList<Doctor>();
		int len= doctorList.size();
		for(int i=0;i<len;i++)
		{
			Doctor currDoctor =doctorList.get(i);
			if(currDoctor.getSpeciality().equalsIgnoreCase(d.getSpeciality()))
			{
				similarDoctor.add(currDoctor);
			}
		}
		
		Collections.sort(similarDoctor);
		
		return similarDoctor;				
		
	}
	
	public static void printList(ArrayList< Doctor> doctorList)
	{
		int len= doctorList.size();
		for(int i=0;i<len;i++)
		{
			System.out.println(doctorList.get(i).getName());
		}
	}
	

}
