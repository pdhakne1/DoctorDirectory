import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Before;
import org.junit.Test;


public class DoctorSiteTest {

	private DoctorSite doc;
	 
    @Before
    public void setUp() throws Exception {
        doc = new DoctorSite();
        ArrayList<Doctor> actualList = new ArrayList<Doctor>();
    	actualList.add(new Doctor("Doc1","1111111111",'M',"A","San Jose",1));
    	actualList.add(new Doctor("Doc2","1111111111",'M',"A","San Jose",1));
    	actualList.add(new Doctor("Doc3","1111111111",'M',"B","Cupertino",2));
    	actualList.add(new Doctor("Doc4","1111111111",'M',"C","San Clara",3));
    	actualList.add(new Doctor("Doc5","1111111111",'M',"C","San Jose",2));
    	actualList.add(new Doctor("Doc6","1111111111",'M',"C","Cupertino",1));
    	actualList.add(new Doctor("Doc7","1111111111",'M',"C","Cupertino",1));
    	doc.doctorList=actualList;
    }
 
    @Test
    public void testGetSimilarDoctors() {
    	
    	
    	
    	Doctor testDoctor = new Doctor("Doc7","1111111111",'M',"C","Cupertino",1);
    	

    	ArrayList<Doctor> result = doc.getSimilarDoctor(testDoctor);

    	assertNotNull("List shouldn't be null", result);
    	assertEquals("Wrong size", 4, result.size());
    	assertEquals("Doc4", result.get(0).getName());
        assertEquals("Doc5", result.get(1).getName());
        assertEquals("Doc6", result.get(2).getName());
        assertEquals("Doc7", result.get(3).getName());
        
        
    }
	

}
