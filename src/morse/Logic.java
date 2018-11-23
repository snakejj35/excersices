package morse;

public class Logic {
	public static String fontMorse(char character) 
	{
		String fuenteMorse="";
		switch (character) 
		{
		case 'A':
			fuenteMorse=".-";
			break;
		case 'B':
			fuenteMorse="-...";
			break;
		case 'C':
			fuenteMorse="-.-.";
			break;
		case 'D':
			fuenteMorse="-..";
			break;
		case 'E':
			fuenteMorse= ".";
			break;
		case 'F':
			fuenteMorse="..-.";
			break;
		case 'G':
			fuenteMorse="--.";
			break;
		case 'H':
			fuenteMorse="....";
			break;
		case 'I':
			fuenteMorse="..";
			break;
		case 'J':
			fuenteMorse=".---";
			break;
		case 'K':
			fuenteMorse="-.-";
			break;
		case 'L':
			fuenteMorse=".-..";
			break;
		case 'M':
			fuenteMorse="--";
			break;
		case 'N':
			fuenteMorse="-.";
			break;
		case 'O':
			fuenteMorse="---";
			break;
		case 'P':
			fuenteMorse=".--.";
			break;
		case 'Q':
			fuenteMorse="--.-";
			break;
		case 'R':
			fuenteMorse=".-.";
			break;
		case 'S':
			fuenteMorse="...";
			break;
		case 'T':
			fuenteMorse="-";
			break;
		case 'U':
			fuenteMorse="..-";
			break;
		case 'V':
			fuenteMorse="...-";
			break;
		case 'W':
			fuenteMorse=".--";
			break;
		case 'X':
			fuenteMorse="-..-";
			break;
		case 'Y':
			fuenteMorse="-.--";
			break;
		case 'Z':
			fuenteMorse="--..";
			break;
		case '1':
			fuenteMorse=".----";
			break;
		case '2':
			fuenteMorse="..---";
			break;
		case '3':
			fuenteMorse="...--";
			break;
		case '4':
			fuenteMorse="....-";
			break;
		case '5':
			fuenteMorse=".....";
			break;
		case '6':
			fuenteMorse="-....";
			break;
		case '7':
			fuenteMorse="--...";
			break;
		case '8':
			fuenteMorse="---..";
			break;
		case '9':
			fuenteMorse="----.";
			break;
		case '0':
			fuenteMorse="-----";
			break;
		}
		return fuenteMorse;
	}
	public static char getCharacter(String flag) 
	{
		char character=0;
		switch (flag) 
		{
		case ".-":
			character='A';
			break;
		case "-...":
			character='B';
			break;
		case "-.-.":
			character='C';
			break;
		case "-..":
			character='D';
			break;
		case ".":
			character='E';
			break;
		case "..-.":
			character='F';
			break;
		case "--.":
			character='G';
			break;
		case "....":
			character='H';
			break;
		case "..":
			character='I';
			break;
		case ".---":
			character='J';
			break;
		case "-.-":
			character='K';
			break;
		case ".-..":
			character='L';
			break;
		case "--":
			character='M';
			break;
		case "-.":
			character='N';
			break;
		case "---":
			character='O';
			break;
		case ".--.":
			character='P';
			break;
		case "--.-":
			character='Q';
			break;
		case ".-.":
			character='R';
			break;
		case "...":
			character='S';
			break;
		case "-":
			character='T';
			break;
		case "..-":
			character='U';
			break;
		case "...-":
			character='V';
			break;
		case ".--":
			character='W';
			break;
		case "-..-":
			character='X';
			break;
		case "-.--":
			character='Y';
			break;
		case "--..":
			character='Z';
			break;
		case ".----":
			character='1';
			break;
		case "..---":
			character='2';
			break;
		case "...--":
			character='3';
			break;
		case "....-":
			character='4';
			break;
		case ".....":
			character='5';
			break;
		case "-....":
			character='6';
			break;
		case "--...":
			character='7';
			break;
		case "---..":
			character='8';
			break;
		case "----.":
			character='9';
			break;
		case "-----":
			character='0';
			break;
		}
		return character;
	}
	public static boolean isMorse(String band) 
	{
		boolean trues = true;
		for (int i = 0; i<band.length(); i++) 
		{
			if (band.charAt(i) != ' ' && band.charAt(i) != '.'
					&& band.charAt(i) != '-') 
			{
				trues = false;
				break;
			}
		}
		return trues;
	}
	public static boolean isSimple(String band) 
	{
		boolean trues = true;
		for (int i = 0; i < band.length(); i++) 
		{
			if (!Character.isAlphabetic(band.charAt(i))
					&& !Character.isDigit(band.charAt(i))
					&& band.charAt(i) != ' ') 
			{
				trues = false;
				break;
			}
		}
		return trues;
	}
	public static String printf(String cadena){
		System.out.println(cadena);
		return cadena;
	}
}