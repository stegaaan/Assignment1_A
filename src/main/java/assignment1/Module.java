package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private String Name;
    private String ID;
    ArrayList<Student> students = new ArrayList<Student>();
	
    public Module(String name, String id){
        Name = name;
       	ID = id;
    	} 
    
    public void addStudents(Student x) {
    	students.add(x);
    	}
    
    public void printModule(){
    	for(int i = 0; i < students.size(); i++) {
			System.out.println("->" + students.get(i).getUsername());
    		}
    	}
    public String getName() {
        return Name;
    }
    
}
