import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Human> humans = Arrays.asList(new Human("Sarah", 10), new Human("Jack", 12));
		Collections.sort(humans, new Comparator<Human>() {
			@Override
			public int compare(Human o1, Human o2) {
				return o1.getName().compareTo(o2.getName());
			}
	
		});
		
		System.out.println(humans);
	}

}

class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	// standard constructors, getters/setters, equals and hashcode
}