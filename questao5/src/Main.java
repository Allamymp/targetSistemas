import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insira uma string para ser revertida: ");
        String string = sc.nextLine();

        String[] arrayString = string.split("");
        String invertida = "";

        for(int i = arrayString.length-1; i>=0;i--){
            invertida= invertida.concat(arrayString[i]);
        }
        System.out.println("String invertida: "+invertida);

    }
}