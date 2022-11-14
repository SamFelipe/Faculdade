import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Qual tamano do seu vetor: ");
        int tamanho = reader.nextInt();
        int[] vetor = new int[tamanho];
        int i = 0;
        boolean busca = false;

        System.out.println("Preencha o vetor com " + tamanho + " números inteiros: ");

        while(i < tamanho){
            System.out.print((i+1) + "° numero: ");
            vetor[i] = reader.nextInt();
            i++;
        }

        System.out.println("Os valores do vetor são: ");
        for(int j = 0; j < tamanho; j++){
            System.out.println(vetor[j]);
        }

        System.out.print("Digite um número para buscá-lo no vetor: ");
        int elemento = reader.nextInt();

        for(int k = 0; k < tamanho; k++){
            if(vetor[k] == elemento){
                System.out.println("O elemento está no índice: " + k);
                busca = true;
                break;
            }
        }

        if(!busca){
            System.out.println("O elemento não existe no vetor.");
        }
    }
}