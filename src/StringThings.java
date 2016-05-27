
public class StringThings {

	
public int getLength(String string) {
		// TODO Auto-generated method stub
		return string.length();
	}

public boolean isAfter(String string, String string2) {
	// TODO Auto-generated method stub
	return string.compareTo(string2) > 0;
}

public String capitalize(String string, String string2) {
	// TODO Auto-generated method stub
	return Character.toUpperCase(string.charAt(0)) +
			string.substring(1) + " " +
	Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
}
	

}
