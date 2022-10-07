import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio;
        double area;
        // ação do usuário: digitar raio do círculo
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a o raio do círculo ");
        raio = teclado.nextDouble();
        teclado.close();
        // tarefa do programa: calcular a área do circulo
        area = Math.PI * (raio * raio);

        System.out.println("A área do círculo é:" + area);

    }
}
