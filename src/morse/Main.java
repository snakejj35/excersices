package morse;

import java.util.Scanner;
import static morse.Logic.*;

public class Main {
	public static void main(String[] args) 
	{
		excec();
	}
	public static void excec(){
		String entradas="";
		String salidas="";
		Scanner claves=new Scanner(System.in);
		printf("CODIGO MORSE <--> TEXTO");
		boolean trues=true;
		while (trues) 
		{
			printf("DIGITA LAS CLAVES: ");	
			entradas=claves.nextLine();
				if (isSimple(entradas)) 
				{
					salidas="";
					entradas=entradas.replace(" ", "  ");
					entradas=entradas.toUpperCase();
					for (int i = 0; i<entradas.length(); i++) 
					{
						salidas+="\0"+fontMorse(entradas.charAt(i));
					}					
					printf("SALIDA MORSE: "+salidas+"\n");					
				}else if(isMorse(entradas)) 
				{					
					salidas="";
					entradas=entradas.replace("   ", "  ");					
					entradas=entradas.toUpperCase();
					String vec[]=entradas.split(" ");
					for (String character : vec) 
					{
						salidas+=getCharacter(character);
					}
					printf("SALIDA TEXTO: "+salidas+"\n");					
				}else 
				{
					printf("POR FAVOR INGRESE DATOS VALIDOS\n");
				}
		}
	}
}