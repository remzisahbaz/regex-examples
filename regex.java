import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegex1 {


	public void regexExample() {
		
		String word="u";
		String str="uzun yoldan gelen uzun adamın dramını uzunca bir vakir izledik.";
		Pattern pattern = Pattern.compile(word);
		Matcher mach = pattern.matcher(str);
		
		int count=0;
		while(mach.find()) {
			
			count+=1;
		}
		
		System.out.println(String.format("'%s' kelimesinde  %d tane %s kelime var", str,count,word));
	
	//
	System.out.println(Pattern.matches(".z.","aza"));// true -> accepts 3 characters, the second character there must  be 'z'
	System.out.println(Pattern.matches("..d.","aldo"));// true -> accept 4 characters , the third character there must be 'd'
	System.out.println(Pattern.matches("[a]","aldo"));// false -> must have only one character 'a'
	System.out.println(Pattern.matches("[a]{5}","aldo"));// false -> should only  have  five characters 'a' characters
	System.out.println(Pattern.matches("[a]{5}","aaaaa"));// true -> should only  have  five characters 'a' characters
	System.out.println(Pattern.matches("[zab]?","a"));// true -> does not accept characters other than [zab]. It only accept one character. 
	System.out.println(Pattern.matches("[zab]?","za"));// false -> does not accept characters other than [zab]. It only accept one character. 
	System.out.println(Pattern.matches("[zab]?","a"));// true -> does not accept characters other than [zab]. It only accept one character. 
	System.out.println(Pattern.matches("[zab]+","zabzabazzzzaaaaaa"));// true -> does not accept characters other than [zab]. characters unlimited
	System.out.println(Pattern.matches("[zab]*",""));// true -> does not accept characters other than [zab] and "<empyt>". characters unlimited
	System.out.println(Pattern.matches("[^zab]","9"));// true -> it will not  start in 'zab'characters
	System.out.println(Pattern.matches("[^zab]","ag"));// false -> it will not  start in 'zab'characters
	System.out.println(Pattern.matches("[a-zA-Z]*","sdfsAADFdvfds"));// true -> can only take letters
	System.out.println(Pattern.matches("[a-zÜüğçÖA-ZÖö]","ÜüüğüöÖ"));// true -> support Turkish language
	System.out.println(Pattern.matches("[a-zA-Z0-9]","aaa9"));// true -> more digit and more non-digit
	System.out.println(Pattern.matches("[a-zA-Z0-9]{1}","8"));// true -> only one 
	System.out.println(Pattern.matches("[a-z]{2}[1-5]{2}[A-Z]{1}","ac35A"));// true 
	System.out.println(Pattern.matches("[+][\\d]{2}[1-9]{1}[\\d]{9}","+905307718154"));// true ->phone number
	System.out.println(Pattern.matches("[+]abc","+abc"));// true 
	System.out.println(Pattern.matches("[^+]abc","tabc"));// true 
	System.out.println(Pattern.matches("[^+]abc","abc"));// false 
	System.out.println(Pattern.matches("[a-z0-9]+[@][a-z]+[.][a-z]+","remzisah454baz@outlook.com"));// true ->@ email
	System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]{2,}","remzisah454baz@outlook.com"));// true ->@ email
	System.out.println(Pattern.matches("kaza(n|r)","kazar"));// true -> ending in "n" or "r"
	System.out.println(Pattern.matches("kaza(n|r)","kazar"));// true -> ending in "n" or "r"
	System.out.println(Pattern.matches("(n)?dı","dı"));// true -> n may not be
	System.out.println(Pattern.matches("(\\d{3})-?(\\d{3})-?(\\d{3})-?","123-789-741"));// true -> -? : "-" may  be 
	System.out.println(Pattern.matches("(\\d{3})-?(\\d{3})-?(\\d{3})-?","123789841"));// true -> -? : "-" may not be 
	System.out.println(Pattern.matches("\\(?(\\d{3})\\)?-?(\\d{3})-?(\\d{3})-?","(963)-789-841"));// true -> -? : "-" may not be 
	System.out.println(Pattern.matches("\\(?(\\d{3})\\)?(-| )?(\\d{3})(-| )?(\\d{3})","(963) 789 841"));// true -> -? : "-| " may not be 
	System.out.println(Pattern.matches("(\\+(\\d{2}))[ ]\\(?(\\d{3})\\)?(-| )?(\\d{3})(-| )?(\\d{3})","+90 (963) 789 841"));// true -> [space]
	System.out.println(Pattern.matches("\\+(?<areacode>\\d{2})[ ]\\((?<opearator>\\d{3})\\)[ ](?<firstTrio>\\d{3})[ ](?<secondTrio>\\d{3})","+90 (963) 789 841"));// true -> ?<...> :grup name
	System.out.println(Pattern.matches("(?<day>[0-3]{1}?[0-9]{1})[\\.|\\-|\\/](?<month>[0-1]?[0-2])[\\.|\\-|\\/](?<year>(19[0-9]{2}|20[0-2][0-9]))","11/12/2022"));// true -> ?<...> :grup name
	System.out.println(Pattern.matches(
			"(?<=\\[)(?<url> .*)"
			+ "(?=~)"
			+ "~"
			+ "(?<=~)(?<title>.*)"
			+ "(?=\\])",
			"[https://www.remzisahbaz.com~çalışma sayfası]"));// true -> 

	
}
}
