package methods;

public class AreaCalculation {
	
	public int areaCalculator(int length, int breadth)
	{
		int area = length * breadth;
		
		return area;
		
	}
	
	public static void main(String[] args) {
		
		
		AreaCalculation ac = new AreaCalculation();
		
		int land1area = ac.areaCalculator(10, 20);
		
		
		int land2area = ac.areaCalculator(5, 40);
		
		int land3area = ac.areaCalculator(5, 5);
		
		int totalarea = land1area + land2area + land3area;
		
		System.out.println("Total area is "+totalarea);
	}

}
