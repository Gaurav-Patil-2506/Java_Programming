package Question1;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Student[] arr= {
			new Student(3,"Rohan",78),
			new Student(5,"Pritesh",80),
			new Student(4,"Rohit",95),
			new Student(1,"Adesh",75),
			new Student(2,"Saurabh",68)
		};
		
		Arrays.sort(arr);
		
		for (Student student : arr) {
			System.out.println(student);
		}
	}
}
