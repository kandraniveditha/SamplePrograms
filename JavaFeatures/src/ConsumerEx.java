import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String>c=s->System.out.println(s);
	c.accept("Nive");
	c.accept("Kalpana");
	
	Consumer<Student>stu=s1->{
		System.out.println(s1.getName());
		System.out.println(s1.getMarks());
	};
	
	
	
	}

}
