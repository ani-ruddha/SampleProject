package section2_evening;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_PopUp {

	public static void main(String[] args) {
		
		Calendar cal =	Calendar.getInstance();
		
//		Date d  = 	Calendar.getInstance().getTime(); //optimized way
		cal.add(Calendar.DAY_OF_MONTH, 1);
		
		Date d = cal.getTime();
		
//		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
	String modifiedDate = 	sdf.format(d);
	
	System.out.println(modifiedDate);
		
		
	
	}
}
