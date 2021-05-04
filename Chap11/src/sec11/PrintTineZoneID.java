package sec11;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTineZoneID {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar now = Calendar.getInstance(timeZone);
		String[] availableIDs = TimeZone.getAvailableIDs();
		for (String id : availableIDs) {
			System.out.println(timeZone);
			break;
		}
	}

}
