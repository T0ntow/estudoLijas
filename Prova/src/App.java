import java.util.Scanner;

class Prova {
  static Scanner entrada = new Scanner(System.in);

  static int matA[][] = new int[3][2], pesq, pesq2; // Variáveis Globais ⬇
  static int matB[][] = new int[2][2];
  static int matC[][] = new int[matA.length][matB[0].length];

  static String answer;

  public static void matC() { // Sub Rotina Matriz C
    System.out.println("A Multiplicação das matrizes A e B é: ");

    for (int i = 0; i < matA.length; i++) {
      for (int j = 0; j < matB[0].length; j++) {
        for (int k = 0; k < matB.length; k++) {
          matC[i][j] += matA[i][k] * matB[k][j];
        }  
      }
    }
    
    for (int i = 0; i < matC.length; i++) {
      for (int j = 0; j < matC[0].length; j++) {
        System.out.println("linha " + (i + 1) + ", coluna " + (j + 1) + ": " + matC[i][j]);
      }
    }
  } 

  public static void main(String[] args) {

    // MATRIZ A
    System.out.println("PRIMEIRA MATRIZ");
    for (int i = 0; i < matA.length; i++) {
      for (int j = 0; j < matA[i].length; j++) {
        System.out.println("Digite o número linha: " + (i + 1) + ", coluna: " + (j + 1));
        matA[i][j] = entrada.nextInt();
      }
    }

    // MATRIZ B

    System.out.println("SEGUNDA MATRIZ");
    for (int i = 0; i < matB.length; i++) {
      for (int j = 0; j < matB[i].length; j++) {
        System.out.println("Digite o número linha: " + (i + 1) + ", coluna: " + (j + 1));
        matB[i][j] = entrada.nextInt();
      }
    }

      matC();
  }
}
