import java.util.Scanner;
public class pwc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        boolean teste = true;
        System.out.print("Informe o endereco: ");
        String frase = sc.nextLine();
        System.out.print("Rua: ");
        do{
            char caracter = frase.charAt(cont);
            if((caracter == 32) || (caracter >= 65) && (caracter <= 90) || (caracter >= 97) && (caracter <= 122)){
                System.out.print(frase.charAt(cont));
                cont++;
            } else {
                teste = false;
            }
        } while(cont < frase.length() && teste == true);
        System.out.print("\nNumero: ");
        System.out.print(frase.substring(cont, frase.length()));
        sc.close();
    }
}