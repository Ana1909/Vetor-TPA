/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioUm {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String[] nomes = new String[15];

        // Lendo os nomes
        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

        // Ordenando os nomes
        Arrays.sort(nomes);

        // Imprimindo os nomes ordenados
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

