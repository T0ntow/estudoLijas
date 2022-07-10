import java.util.Scanner;

class Prova {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Double num[][] = new Double[2][2], pesq;

    String answer;

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("Digite o nome linha: " + (i + 1) + ", coluna: " + (j + 1));
        num[i][j] = entrada.nextDouble();
      }
    }

    System.out.print("Deseja pesquisar pelos nomes? S/N:");
    answer = entrada.nextLine();

    while (answer.equalsIgnoreCase("S")) {
      System.out.print("Digite ai ent: ");
      pesq = entrada.nextDouble();

      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
          if (pesq.equals(num[i][j])) {
            System.out.println(pesq + " foi encontrado, na linha" + (i + 1) + ", coluna: " + (j + 1));
          }
        }
      }
      System.out.print("Deseja continuar pesquisando nomes? S/N:");
      answer = entrada.nextLine();
    }

  }

}