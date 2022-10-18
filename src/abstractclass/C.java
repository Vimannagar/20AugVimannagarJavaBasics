package abstractclass;

public class C extends B
{


	public void deleteProfile() {
		
		System.out.println("delete profile from C class");
		
	}
	
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.addImage();
		
		c.addPersonalInformation();
		
		c.deleteProfile();
		
		
		
	}
	
	
	

}
