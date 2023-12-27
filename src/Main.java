import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número:");
        Double valor1 = scanner.nextDouble();

        System.out.printf("Digite o segundo número:");
        Double valor2 = scanner.nextDouble();

        System.out.printf("Digite a operação:");
        String operacao = scanner.next();

        Double resultado = calculadoraCompleta(valor1, valor2, operacao);
        System.out.printf("Resultado:" + resultado);
    }


    public static Double calculadoraCompleta(Double valor1, Double valor2, String operacao){

        switch (operacao){
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                return valor1 / valor2;

        }
        return 0.0;
    }

}