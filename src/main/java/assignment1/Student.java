package assignment1;

public class Student {

	private String Name;
    private String Age;
    private String DOB;
    private String Username;
    private int ID; 
	
    public Student(String name, String age, String dob, int id){
        	Name = name;
        	Age = age;
        	DOB = dob;
        	ID = id;
    	} 
    
    public String getUsername() {
    	Username = Name+Age;
    	return Username;
    }
    
    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }
    
}
