package oopinheritance;

public class Fruit {

	String fruitName, taste;
	int size;

	void eat(String fruitName) {
		System.out.println("Name: " + fruitName + " Taste: " + taste);
	}

	public static void main(String[] args) {
		
	}

	class Apple extends Fruit {

		public void eat(String fruitName) {
			System.out.println("I overwritten the eat method!");
		}

	}

	class Orange extends Fruit {
		Orange(){
			super();
		}
		public void eat(){
			
		}
		public void eat(String fruitName){
			this.eat();
		}
		public  void eat(String fruitName, int size){
			this.size = size;
			this.fruitName = fruitName;
		}
	}
}
