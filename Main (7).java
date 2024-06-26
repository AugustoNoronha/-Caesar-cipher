import java.util.*;

public class Main {
  private static Scanner sc;

  public static void main(String[] argumentos) {
    sc = new Scanner(System.in);
    String entrada = sc.nextLine();
    cifraCesar(entrada);
  }

  private static void cifraCesar(String entrada) {
    if (entrada.equals("FIM"))
      return;
    String palavraCriptografada = "";
    for (int indice = 0; indice < entrada.length(); indice++) {
      palavraCriptografada += (char) (entrada.charAt(indice) + 3);
    }
    System.out.println(palavraCriptografada);
    entrada = sc.nextLine();
    cifraCesar(entrada);
  }
}
