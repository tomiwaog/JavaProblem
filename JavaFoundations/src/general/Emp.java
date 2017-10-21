package general;

public class Emp {

	int id;
	String name;

	public Emp(String name, int id) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e = new Emp("Bola", 5);
		System.out.println(e);
	}

	public String toString() {
		return "Name=" + name + ", Id=" + id;
	}

	public int compareTo(Object obj) {
		System.out.println("compareTo called!");
		Emp el = (Emp) obj;
		return this.name.compareTo(el.name);
		//return 0 if thery are the same
		//1 if different , -1 if neg
	}
}
