package projeto_calendario;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calend {
	
	public static void main(String[] args) {
	    GregorianCalendar calendario = new GregorianCalendar();
	    Scanner leitor = new Scanner(System.in);
	    int ano;
	    int mes;
	    
	    System.out.println("Lista de eventos: ");
	    System.out.println("ID - XXXXXX, nome: xxxxx");
	    System.out.println();
	    if (1 == 1)
	    {
	    	System.out.println("Deseja editar algum evento? informe o id dele: ");
	    }
	    
	    System.out.println("");
	    
	    System.out.println("Insira o ano desejado: ");
	    ano = leitor.nextInt();  
	    System.out.println("Insira o mes desejado: ");
	    mes = leitor.nextInt();
	    calendario.set(Calendar.DAY_OF_MONTH , 1);
	    
	    calendario.set(Calendar.MONTH, mes+1);
	    calendario.set(Calendar.YEAR,ano);
	    int diaum;
	    diaum = calendario.getActualMinimum(Calendar.DAY_OF_WEEK);
	    
	    
	    System.out.print("Do ");
	    System.out.print("Se ");
	    System.out.print("Te ");
	    System.out.print("Qa ");
	    System.out.print("Qi ");
	    System.out.print("Se ");
	    System.out.print("Sa ");
	    System.out.println();
	    for(int i=0; i<diaum;i++)
	    System.out.print("   ");
	    
	    for(int j=1; j<calendario.getActualMaximum(Calendar.DAY_OF_MONTH);j++){
	        String dia =Integer.toString(j);
	        System.out.print(dia);
	        System.out.print(" ");
	        if (dia.length()==1) System.out.print(" ") ;
	       
	        if ((diaum+j)%7==0) 
	            System.out.println();
	    }
	    
	}

}
//⣿⣿⣿⣿⣿⣿⣿⠟⠉⠉⠄⠄⠄⠄⠄⠉⠉⠻⣿⣿⣿⣿⣿⣿⣿ 
//⣿⣿⣿⣿⣿⡿⠁⢀⣤⡶⠶⠶⣦⡄⠰⡌⠂⠄⢸⣿⣿⣿⣿⣿⣿ 
//⣿⣿⣿⣿⡟⠄⣰⠟⣡⣴⣶⣶⣤⣉⣀⣴⠖⠂⠈⣀⣀⣀⠉⠻⣿ 
//⣿⣿⣿⣿⡇⠠⡏⠰⢋⣴⣶⣬⠹⣿⡟⢀⣴⣾⣿⣿⣿⣿⣿⣆⠘ 
//⣿⣿⣿⣿⡇⠄⡇⠄⢉⠉⠉⠄⠄⣿⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⡄ 
//⣿⣿⣿⣿⡇⠄⢻⠘⣬⣀⣀⣀⣴⢋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇ 
//⣿⣿⣿⣿⡇⠄⢸⠆⣿⣿⣿⡟⢱⣿⡟⠻⠛⠉⠄⠄⠄⣀⣴⣶⣶ 
//⣿⣿⣿⣿⡇⠄⠈⣰⣿⣿⣿⣷⡈⢿⣿⣦⣄⣀⠄⠄⠄⠉⠛⢻⣿ 
//⣿⣿⣿⣿⠃⠄⠄⠈⠋⠹⣿⣿⡿⣦⡉⠻⠿⠿⣿⡿⠿⠒⠄⣸⣿ 
//⠁⠄⠄⠈⢀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠐⠄⠄⠄⠄⠄⠠⣶⣿⣿ 
//⠄⠄⢀⣴⣿⣷⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿⣿ 
//⠄⢠⣾⣿⣿⡏⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣀⡀⢸⣿⣿ 
//⢀⣿⣿⣿⠏⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣴⣶⣿⣿⣿⡇⣼⣿⣿ 
//⢸⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢠⣾⣿⣿⣿⣿⣿⡟⢠⣿⣿⣿ 
//⠈⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣿⣿⣿⣿⣿⣿⠟⡀⠻⢿⣿⣿ 
//⣷⣶⣶⣤⡀⠄⠄⠄⠄⠄⠄⢠⣤⣄⠉⡉⢉⣉⣥⡌⢻⡆⠈⣿⣿ 
//⣿⣿⣿⣿⣿⣶⣤⠄⠄⠄⠄⢸⣿⡟⢀⡷⠸⢿⡿⠇⠘⠃⣰⣿⣿ 
//⠛⠛⠛⠛⠛⠛⠛⠂⠄⠄⠄⠄⠉⠄⠄⠄⠂⠄⠄⠒⠚⠛
