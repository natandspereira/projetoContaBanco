import java.util.Locale;
import java.util.Scanner;

public class  ContaTerminal {
    
    public static void main (String[] args){
    
      Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
      //Nome Cliente 
      System.out.println("Qual o seu nome ?");
      String nomeCliente=scanner.next();  
      //Numero do cliente
      System.out.println("Qual o seu numero ?");
      int numero=scanner.nextInt(); 
      //Numero da agencia
      System.out.println("Qual o numero da sua agencia ?");
      int agencia=scanner.nextInt();
      //Valor do saldo
      System.out.println("Qual o valor do seu saldo ?");
      int saldo=scanner.nextInt(); 
      //Menssagem final
      System.out.println("Olá"+" "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+" "+agencia+" "+"conta"+" "+numero+" "+"e seu saldo "+saldo+" "+"já está disponivel para saque.");
    }
}

