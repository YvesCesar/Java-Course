package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//Date no formato dia/mês/ano:
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		 
		//Date com Hora, min e seg:
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Mudando para GMT:
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//parse recebe um valor em String, respeitando uma regra e converte para Date:
		//A excessão é um erro a ser tratado.
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		//Especificando data no formato ISO 8601(UTC):
		Date y3 = Date.from( Instant.parse("2018-06-25T15:42:07Z") );
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		System.out.println("------------Com base no Brasil:--------------");
		
		//Mostrando na tela com o formato definido:
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		
		System.out.println();
		
		//Criando uma data com o horário atual:
		Date x1= new Date();
		Date x2 = new Date( System.currentTimeMillis() ); //pega o instante do sistema, converte para milissegundos e cria uma data com esse valor
		Date x3 = new Date( 0L );
		Date x4 = new Date( 1000L * 60L * 60L * 5L ); //sufixo L indica que é do tipo Long
		/*
		 *1 segundo tem 1000 milissegundos
		 *Multiplicando por 60, temos 1 minuto
		 *Multiplicando por 60 novamente, temos 1 hora
		 *multiplicando por 5 temos 5 horas após o dia 1 de janeiro de 1970(UTC Padrão).
		*/
		
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		
		System.out.println("------------Formato UTC:--------------");
		
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		System.out.println();
		
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		
		System.out.println("--------------------------");
		
		System.out.println("y1: " + y1);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		
		System.out.println();
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
	}

}
