
import java.util.Scanner;
import java.util.Locale;

public class DesafioAtletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a quantidade de atletas? ");
        int N = sc.nextInt();
        while (N <= 0) {
            System.out.print("Valor inválido! Digite N > 0: ");
            N = sc.nextInt();
        }
        
        String[] nomes = new String[N];
        char[] sexos = new char[N];
        double[] alturas = new double[N];
        double[] pesos = new double[N];
        
        // Ler dados dos atletas
        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite os dados do atleta numero " + (i+1) + ":");
            sc.nextLine(); // Limpar buffer
            
            // Nome
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            
            // Sexo (com validação)
            System.out.print("Sexo: ");
            char sexo = sc.next().toUpperCase().charAt(0);
            while (sexo != 'F' && sexo != 'M') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().toUpperCase().charAt(0);
            }
            sexos[i] = sexo;
            
            // Altura (com validação)
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }
            alturas[i] = altura;
            
            // Peso (com validação)
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }
            pesos[i] = peso;
        }
        
        // Cálculos para o relatório
        // 1. Peso médio
        double somaPesos = 0;
        for (double peso : pesos) {
            somaPesos += peso;
        }
        double pesoMedio = somaPesos / N;
        
        // 2. Atleta mais alto
        double maiorAltura = alturas[0];
        String nomeMaisAlto = nomes[0];
        for (int i = 1; i < N; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
                nomeMaisAlto = nomes[i];
            }
        }
        
        // 3. Porcentagem de homens
        int totalHomens = 0;
        for (char sexo : sexos) {
            if (sexo == 'M') {
                totalHomens++;
            }
        }
        double porcentagemHomens = (double) totalHomens / N * 100;
        
        // 4. Altura média das mulheres
        int totalMulheres = 0;
        double somaAlturaMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (sexos[i] == 'F') {
                totalMulheres++;
                somaAlturaMulheres += alturas[i];
            }
        }
        
        // Relatório final
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.println("Atleta mais alto: " + nomeMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
        
        if (totalMulheres > 0) {
            double alturaMediaMulheres = somaAlturaMulheres / totalMulheres;
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }
        
        sc.close();
    }
}