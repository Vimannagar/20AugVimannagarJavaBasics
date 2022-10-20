package interfacediscussion;

public class Chrome implements Browser {

	
	public void openBrowser() {
		System.out.println("Open browser from chrome");
		
	}


	public void close() {
		System.out.println("close browser from Chrome");
		
	}

	
	public void newTab() {
	System.out.println("new tab from Chrome");
		
	}

	
	public void refresh() {
		System.out.println("Refresh from Chrome");
		
	}
	
	
	public void incognito()
	{
		System.out.println("Chrome incognito mode");
	}

}
