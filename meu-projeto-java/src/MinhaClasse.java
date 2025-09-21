import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        String idade = sc.nextLine();

        System.out.println("Digite em que cidade voçê mora:");
        String cidade = sc.nextLine();

        System.out.println("Oi, me chamo " + nome + ", tenho " + idade + " e moro em " + cidade);
    }
}
