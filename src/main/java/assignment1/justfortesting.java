package assignment1;

public class justfortesting {
	static Student example1= new Student("JohnDoe","19","26-11-1996",13456789);
	static Student example2 = new Student("JaneDone","20","21-12-1995",13456789);
	static Student example3 = new Student("JoeDove","21","11-1995",13456789);
	
	static Module EXAMPLE = new Module("Maths","MT123");
	
	static Programme EXamPLe = new Programme("ECE","01/09/2016","01/06/2017");
	
	public static void main(String[] args){
		test();
	}
	
	public static void test(){
		
		EXAMPLE.addStudents(example1);
		EXAMPLE.addStudents(example2);
		EXAMPLE.addStudents(example3);
		
		EXAMPLE.printModule();
		
		EXamPLe.addModules(EXAMPLE);
		
		EXamPLe.printProgramme();
		
	}
}
