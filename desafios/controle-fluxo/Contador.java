package DesafioControleFluxo;

import java.util.Scanner;
import DesafioControleFluxo.Exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Insira o primeiro parâmetro:");
        int number1 = userInput.nextInt();
        System.out.println("Insira o segundo parâmetro:");
        int number2 = userInput.nextInt();

        try {
            count(number1, number2);
        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage());
        } finally {
            userInput.close();
        }
    }

    static void count(int arg1, int arg2) throws ParametrosInvalidosException {
        if (arg1 >= arg2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        
        int length = arg2 - arg1;
        
        for (int i = 1; i <= length; i++) {
            System.out.println("Imprimindo o número %d".formatted(i));
        }
    }
}
