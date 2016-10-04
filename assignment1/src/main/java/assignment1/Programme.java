package assignment1;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Programme {

	private String Name;
	private DateTime start;
	private DateTime end;
    ArrayList<Module> modules = new ArrayList<Module>();
	
    public Programme(String name, String startdate, String enddate){
        Name = name;
       	start = DateTime.parse(startdate, DateTimeFormat.forPattern("dd/MM/yyyy"));
       	end = DateTime.parse(enddate, DateTimeFormat.forPattern("dd/MM/yyyy"));
    	} 
    
    public void addModules(Module x) {
    	modules.add(x);
    	}
    
    public void printProgramme(){
    	System.out.println(Name + "(" + start.toString(DateTimeFormat.forPattern("dd/MM/yyyy")) + " to " 
            + end.toString(DateTimeFormat.forPattern("dd/MM/yyyy")) + ")" );
    	for(int i = 0; i < modules.size(); i++) {
			System.out.println(">" + modules.get(i).getName());
			modules.get(i).printModule();
    		}
    	}
    public String getName() {
        return Name;
    }
    
}

