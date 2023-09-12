import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = scanner.nextInt();
        scanner.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {

        if (parametroUm > parametroDois)
            throw new ParametroInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {

            System.out.println("Imprimindo o numero " + i);

        }

    }
}
