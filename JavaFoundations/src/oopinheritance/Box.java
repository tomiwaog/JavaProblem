package oopinheritance;

public class Box {
	double width, height, depth;
	public static double calcVolume(double width, double height, double depth){
		return width*height*depth;
	}
	
	public static void main(String[] args) {
		System.out.println(calcVolume(4,2,3)+"cm^3");
	}

}
