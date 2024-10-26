/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int[] numeros = new int[50];

        // Lendo os números
        System.out.println("Digite 50 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Convertendo o array para uma lista
        List<Integer> listaNumeros = new ArrayList<>();
        for (int numero : numeros) {
            listaNumeros.add(numero);
        }

        // Ordenando a lista em ordem decrescente
        Collections.sort(listaNumeros, Collections.reverseOrder());

        // Imprimindo os números ordenados
        System.out.println("\nNúmeros em ordem decrescente:");
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}


