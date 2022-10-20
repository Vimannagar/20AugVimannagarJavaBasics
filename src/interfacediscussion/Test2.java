package interfacediscussion;

public class Test2 extends Test3 implements Browser{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		t2.deleteInformation();
		
		t2.editInformation();
		
	}

}
