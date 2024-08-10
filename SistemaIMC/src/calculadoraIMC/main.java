package calculadoraIMC;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.text.SimpleDateFormat;
public class main {

	public static void main(String[] args) throws IOException  {
		
		Scanner scan = new Scanner(System.in);
		Pessoa cadastro = new Pessoa();
		
		
		
		
		
		//ENTRADA DE DADOS MANDANDO PARA CLASS Pessoa
		
		//cadastro.setDataconsulta(LocalTime.now());
		
		System.out.print("Entrecom o primeiro nome: ");
		cadastro.setPrimeironome(scan.next());
		
		System.out.print("Entre com o segundo nome: ");
		cadastro.setSegundonome(scan.next());
		
		System.out.print("Entre com a data de nascimento: ");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse((scan.next()));
		cadastro.setDatanasciment(data);
		
		System.out.print("Entre com o contato: ");
		cadastro.setContato(scan.next());
		
		System.out.print("Entre com o email: ");
		cadastro.setEmail(scan.next());
		
		System.out.print("Entre com o gênero: ");
		cadastro.setGenero(scan.next());
		
		System.out.print("Entre o motivo da consulta: ");
		cadastro.setMotivoconsulta(scan.next());
		
		System.out.print("Entre com a Observação: ");
		cadastro.setObservacoes(scan.next());
		
		imc calcularimc = new imc();
		
		System.out.print("Entre com o Peso: ");
		calcularimc.setPeso(scan.nextDouble());
		
		System.out.print("Entre com a Altura: ");
		calcularimc.setAltura(scan.nextDouble());
		
		
		//System.out.print("\033\143");

		//System.out.print("\033[H\033[2J");  
		
		//Runtime.getRuntime().exec("cls");
		
		//SAIDA DE DADOS DA CLASSE Pessoa
		
		System.out.println(
				"- - - - - - - FICHA - - - - - " + "\n" +
				"Primeiro Nome: " + cadastro.getPrimeironome() + "\n" +
				"Segundo Nome: " + cadastro.getSegundonome() + "\n" +
				"Data de Nascimento" + cadastro.getDatanasciment() + "\n"
				"Contato: " + cadastro.getContato() + "\n" +
				"Email: " + cadastro.getEmail() + "\n" +
				"Gênenro: " + cadastro.getGenero() + "\n" +
				"Consulta: " + cadastro.getContato() + "\n" +
				"Observação: " + cadastro.getObservacoes() + "\n" +
				"- - - - - - - - - - -" + "\n");
		
		System.out.println("\n");
		System.out.printf(
				"- - - - - - RESULTADO - - - - -" + "\n" +
				"Peso: " + calcularimc.getPeso() + "\n" +
				"- - - - - - - - - - - -" + "\n" +
				"Altura: " + calcularimc.getAltura() + "\n" +
				"- - - - - - - - - - - -" + "\n" +
				"IMC: %.2f" , calcularimc.getResultado());
		
		
		
		
		scan.close();

		    

		
		
	}

}
