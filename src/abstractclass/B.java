package abstractclass;

public class B extends A {
	
	public void addImage() {
		
		System.out.println("Add image functionality from B class");
		
	}

	
	public void deleteProfile() {
		System.out.println("Delete profile functionality from B class");
		
	}
	
	
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.addImage();
		
		b.deleteProfile();
		
		b.addPersonalInformation();
		
		
		
		
	}
	
	
}
