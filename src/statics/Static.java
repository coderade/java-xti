package statics;


public class Static extends ClassRoom {
	public static void main(String[] args) 
	{
		ClassRoom.teacher = "Leonardo";
		
		ClassRoom s1 = new ClassRoom();
		s1.student = "Valdeci";
		ClassRoom.teacher = "jonas";
		
		System.out.println(ClassRoom.teacher);
		ClassRoom s2 = new ClassRoom();
		s2.student = "Joao";
		System.out.println(ClassRoom.teacher) ;
		
		System.out.println(s1.student);
		toTeach();
	}

}
