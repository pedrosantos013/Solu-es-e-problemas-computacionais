package aplicacao;

import java.util.Scanner;
import entidade.Voo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Voo entra = new Voo("Azul", "Salvador", "Belo Horizonte", "24/10/2022", "13:30", 974);


			System.out.println("Companhia Área: " + entra.getCompanhia());
			
			System.out.println("");
			
			System.out.println("Origem da Viagem: " + entra.getOrigem());
			
			System.out.println("");
			
			System.out.println("Destino da Viagem: " + entra.getDestino());
			
			System.out.println("");
			
			System.out.println("Data do voo: " + entra.getData());
			
			System.out.println("");
			
			System.out.println("Hora do voo: " + entra.getHoraVoo());
			
			System.out.println("");
			
			System.out.println("Número do voo: " + entra.getVoo());
			
			System.out.println("");
			
			System.out.println("Vagas disponíveis: " + entra.vagas());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Essas são as Cadeiras Disponiveis");
			String[] assentos = new String[100];
			for (int i = 0; i < assentos.length; i++) {
				int fila = i / 6 + 1;
				String letra = String.valueOf((char) ('A' + (i % 6)));
				assentos[i] = fila + letra;
			}

			System.out.println("Assentos Disponíveis:");
			for (int i = 0; i < assentos.length; i++) {
				System.out.print(assentos[i] + " ");
				if ((i + 1) % 6 == 0) {
					System.out.println();
				}
			}
			do {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Digite o número do assento desejado: ");
			String assentoEscolhido = scan.nextLine();
			boolean assentoEncontrado = false;
			for (int i = 0; i < assentos.length; i++) {
				if (assentos[i].equals(assentoEscolhido)) {
					assentoEncontrado = true;
					System.out.println("Assento " + assentoEscolhido + " selecionado.");
					assentos[i] = "XX";
					break;
				}
			}
			if (!assentoEncontrado) {
				System.out.println("Assento " + assentoEscolhido + " não encontrado ou já ocupado.");
			}
			break;
			

		} while (entra.vagas() <= 100);
	}
}