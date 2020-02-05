package aplication;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Fisica;
import entidades.Juridica;
import entidades.TaxaImposto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TaxaImposto> listaC = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe numero de taxas");
		int n = leia.nextInt();
		leia.nextLine();

		for (int cc = 1; cc <= n; cc++) {
			System.out.println("Informe o " + cc + "° cliente:");
			System.out.println("Fisica ou Juridica? (f/j): ");
			char resp = leia.next().charAt(0);
			leia.nextLine();
			System.out.println("Nome: ");
			String nome = leia.nextLine();
			System.out.println("Salário Anual: ");
			double salarioA = leia.nextDouble();

			if (resp == 'f') {
				System.out.println("Gastos médicos: ");
				double gastosM = leia.nextDouble();
				Fisica fisica = new Fisica(nome, salarioA, gastosM);
				listaC.add(fisica);
			} else {
				System.out.println("Número de funcionários: ");
				int fun = leia.nextInt();
				Juridica juridica = new Juridica(nome, salarioA, fun);
				listaC.add(juridica);
			}
		}
		System.out.println("Taxas Paid: ");
		for (TaxaImposto x : listaC) {
			System.out.println(x.getNome() + ": R$ " + x.taxa());
			double total = 0;
			double taxa = x.taxa();
			total = total+taxa;
		}
		
		;
	}

}
