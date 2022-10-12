package atividade;

import java.util.HashMap;
import java.util.Scanner;

public class AtividadeMapa {

	public static void main(String[] args) {
		HashMap<String, String> mapa1 = new HashMap<>();
		HashMap<String, Integer[]> mapa2 = new HashMap<>();

		Scanner s = new Scanner(System.in);

		mapa1.put("AC", "Acre");
		mapa1.put("AL", "Alagoas");
		mapa1.put("AP", "Amapá");
		mapa1.put("AM", "Amazonas");
		mapa1.put("BA", "Bahia");
		mapa1.put("CE", "Ceará");
		mapa1.put("DF", "Destrito Federal");
		mapa1.put("ES", "Espírito Santo");
		mapa1.put("GO", "Goiás");
		mapa1.put("MA", "Maranhão");
		mapa1.put("MT", "Mato Grosso");
		mapa1.put("MS", "Mato Grosso do Sul");
		mapa1.put("PA", "Pará");
		mapa1.put("PB", "Paraíba");
		mapa1.put("PR", "Paraná");
		mapa1.put("PE", "Pernambuco");
		mapa1.put("PI", "Piauí");
		mapa1.put("RJ", "Rio de Janeiro");
		mapa1.put("RN", "Rio grande do Norte");
		mapa1.put("RS", "Rio grande do Sul");
		mapa1.put("RO", "Rôndonia");
		mapa1.put("RR", "Roraima");
		mapa1.put("SC", "Santa Catarina");
		mapa1.put("SP", "São Paulo");
		mapa1.put("SE", "Sergipe");
		mapa1.put("TO", "Tocantins");
		// Centro Oeste
		mapa2.put("DF", new Integer[] { 61 });
		mapa2.put("GO", new Integer[] { 62, 64 });
		mapa2.put("MG", new Integer[] { 65, 66 });
		mapa2.put("MS", new Integer[] { 67 });
		// Nordeste
		mapa2.put("AL", new Integer[] { 82 });
		mapa2.put("BA", new Integer[] { 71, 73, 74, 75, 77 });
		mapa2.put("CE", new Integer[] { 85, 88 });
		mapa2.put("MA", new Integer[] { 98, 99 });
		mapa2.put("PB", new Integer[] { 83 });
		mapa2.put("PE", new Integer[] { 81, 87 });
		mapa2.put("PI", new Integer[] { 86, 89 });
		mapa2.put("RN", new Integer[] { 84 });
		mapa2.put("SE", new Integer[] { 79 });
		// Norte
		mapa2.put("AC", new Integer[] { 68 });
		mapa2.put("AP", new Integer[] { 96 });
		mapa2.put("AM", new Integer[] { 92, 97 });
		mapa2.put("PA", new Integer[] { 91, 93, 94 });
		mapa2.put("RR", new Integer[] { 69 });
		mapa2.put("RO", new Integer[] { 95 });
		mapa2.put("TO", new Integer[] { 63 });
		// Sudeste
		mapa2.put("ES", new Integer[] { 27, 28 });
		mapa2.put("MG", new Integer[] { 31, 32, 33, 34, 35, 37, 38 });
		mapa2.put("RJ", new Integer[] { 21, 22, 24 });
		mapa2.put("SP", new Integer[] { 11, 12, 13, 14, 15, 16, 17, 18, 19 });
		// Sul
		mapa2.put("PR", new Integer[] { 41, 42, 43, 45, 46 });
		mapa2.put("RS", new Integer[] { 51, 53, 54, 55 });
		mapa2.put("SC", new Integer[] { 47, 48, 49 });

		System.out.println("Qual DDD deseja pesquisar");
		int pesquisa = s.nextInt();

		String siglaEscolhida = "";
		
		for (String sigla : mapa2.keySet()) {			
			for (Integer ddds : mapa2.get(sigla)) {
				if (ddds == pesquisa) {
					siglaEscolhida = sigla;
					break;
				}
			}

		}
		System.out.printf("\nO DDD %d é do ", pesquisa);
		System.out.println(mapa1.get(siglaEscolhida) + " - " + siglaEscolhida);
	}
}
