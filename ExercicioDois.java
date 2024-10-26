/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String[] nomes = new String[15];

        // Lendo os nomes
        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

        // Convertendo o array para uma nova lista (cópia)
        List<String> listaNomes = new ArrayList<>(Arrays.asList(nomes));

        // Ordenando a lista
        Collections.sort(listaNomes, Collections.reverseOrder());

        // Imprimindo os nomes ordenados
        System.out.println("\nNomes em ordem alfabética decrescente:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}



