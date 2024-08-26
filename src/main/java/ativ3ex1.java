import java.util.Scanner;
public class ativ3ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tes, prof, area;

        System.out.printf("Informe a testadado do terreno: ");
        tes = scanner.nextDouble();

        System.out.printf("Informe a profundidade do terreno: ");
        prof = scanner.nextDouble();

        area = tes * prof;
        System.out.printf("Área do terreno: %.2f M²%n", area);

    }
}
