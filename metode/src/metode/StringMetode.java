package metode;

public class StringMetode {

	public static void main(String[] args) {
		/*1*/
		String str = "Mama mia";
		System.out.println(notString(str));
	
		/*2*/
		String str1 = "U jednoj zemlji postoji jedno carstvo!";
		System.out.println(missingChar(str1,5));
		/*3*/
		System.out.println(frontBack(str));
		/*4*/
		System.out.println(front3("java"));
		System.out.println(front3("chocolate"));
		/*5*/
		System.out.println(backAround("catt"));
		System.out.println(backAround("Hello"));
		/*6*/
		System.out.println(front22("kitten"));
		System.out.println(front22("Ha"));
		System.out.println(front22("abc"));
		/*7*/
		System.out.println(startHi("hi there"));
		System.out.println(startHi("hi"));
		System.out.println(startHi("hello hi"));
		/*8*/
		System.out.println(delDel("adelbc"));
		System.out.println(delDel("adelHello"));
		System.out.println(delDel("adedbc"));
		/*9*/
		
		System.out.println(mixStart("mix snacks"));
		System.out.println(mixStart("pix snacks"));
		System.out.println(mixStart("piz snacks"));
		/*10*/
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx"));
		/*11*/
		System.out.println(stringE("Hello"));
		System.out.println(stringE("Heelle"));
		System.out.println(stringE("Heelele"));
		/*12*/
		System.out.println(endUp("Hello"));
		System.out.println(endUp("hi there"));
		System.out.println(endUp("hi"));
		/*13*/
		System.out.println(everyNth("Miracle", 2));
		System.out.println(everyNth("abcdefg", 2));
		System.out.println(everyNth("abcdefg", 3));
		

	}
	/*1* Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.*/
	public static String notString(String str) {
		  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
	/*2* Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).*/
	public static String missingChar(String str, int n) {
		  String front = str.substring(0, n);
		  
		  // Start this substring at n+1 to omit the char.
		  // Can also be shortened to just str.substring(n+1)
		  // which goes through the end of the string.
		  String back = str.substring(n+1, str.length());
		  
		  return front + back;
		}
	/*3* Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"*/
	public static String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  String mid = str.substring(1, str.length()-1);
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}
	/*4* Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"*/
	
	public static String front3(String str) {
		  String front;
		  
		  if (str.length() >= 3) {
		    front = str.substring(0, 3);
		  }
		  else {
		    front = str;
		  }
		  return front + front + front;
	}
	/*5* Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"*/
	public static String backAround(String str) {
		  // Get the last char
		  String last = str.substring(str.length() - 1);
		  return last + str + last;
	}
	/*6* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"*/
	public static String front22(String str) {
		  // First figure the number of chars to take
		  int take = 2;
		  if (take > str.length()) {
		    take = str.length();
		  }
		  
		  String front = str.substring(0, take);
		  return front + str + front;
		}
	/*7* Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/
	public static boolean startHi(String str) {
		  // First test if the string is not at least length 2
		  // (so the substring() below does not go past the end).
		  if (str.length() < 2) return false;
		  
		  // Pull out the string of the first two chars
		  String firstTwo = str.substring(0, 2);
		  
		  // Test if it is equal to "hi"
		  if (firstTwo.equals("hi")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to: return(firstTwo.equals("hi"));
		}
	/*8* Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"*/
	public static String delDel(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
		    // First char + rest of string starting at 4
		    return str.substring(0, 1) + str.substring(4);
		  }
		  // Otherwise return the original string.
		  return str;
		}
	/*9* Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false*/
	public static boolean mixStart(String str) {
		  // Check if string is too small
		  // (so substring() below does not go off the end)
		  if (str.length() < 3) return false;
		  
		  // Pull out length 2 string for the "ix" part
		  // (i.e. substring starting at index 1 and stopping just before 3).
		  String two = str.substring(1, 3);
		  
		  if (two.equals("ix")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to just:
		  // return(two.equals("ix"));
		}
	/*10* Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"*/
	public static String startOz(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
	}
	/*11* Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false*/
	public static boolean stringE(String str) {
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		    // alternately: str.substring(i, i+1).equals("e")
		  }

		  return (count >= 1 && count <= 3);
	}
	/*12* Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"*/
	public static String endUp(String str) {
		  if (str.length() <= 3) return str.toUpperCase();
		  int cut = str.length() - 3;
		  String front = str.substring(0, cut);
		  String back  = str.substring(cut);  // this takes from cut to the end
		  
		  return front + back.toUpperCase();
	}
	/*13* Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"*/
	public static String everyNth(String str, int n) {
		  String result = "";
		  
		  // Look at every nth char
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		}
	
}
