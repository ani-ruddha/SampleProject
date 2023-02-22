package xpath_programs;

public class Execution_class {

public static void main(String[] args) throws Exception {
		
		Actitime_execution ae = new Actitime_execution();
		ae.launchBrowser();
		Thread.sleep(3000);
		ae.login();
		Thread.sleep(3000);
		ae.execution();
		Thread.sleep(3000);
		ae.logOut();
		Thread.sleep(3000);
		ae.closeBrowser();
	}
}
