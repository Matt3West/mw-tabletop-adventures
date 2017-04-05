package tabletop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public static String[] parseRollString(String rollString){
		String[] roll = new String[3];
		if (validateRollString(rollString)) {
			if (rollString.contains(":")){
				int splitter = rollString.indexOf('d');
				int splitter2 = rollString.indexOf(':');
				roll[0] = rollString.substring(0, splitter);
				roll[1] = rollString.substring(splitter+1, splitter2);
				roll[2] = rollString.substring(splitter2+1);
			} else {
				int splitter = rollString.indexOf('d');
				roll[0] = rollString.substring(0, splitter);
				roll[1] = rollString.substring(splitter+1);
				roll[2] = null;
			}
		}
		return roll;
		
	}

	private static boolean validateRollString(String rollString) {
		Pattern p = Pattern.compile("[0-9]+d[0-9]+");
		Matcher m = p.matcher(rollString);
		return m.matches();
	}

}
