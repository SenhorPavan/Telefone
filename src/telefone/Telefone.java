
package telefone;

import java.util.Scanner;


public class Telefone {


    public static void main(String[] args) {
        
      Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nome1 = ler.nextLine();
        System.out.println("Digite um numero de celular");
        String celular1 = ler.nextLine();
        
         
     Contato c1 = new Contato(nome1,celular1,"1234-5678","ggg333xxx@gmail.com");   
     
        System.out.println("Digite um nome");
        String nome2 = ler.nextLine();
        System.out.println("Digite um numero de celular");
        String celular2 = ler.nextLine();
        
     Contato c2 = new Contato(nome2,celular2,"1564-4856","gdsahdsay@vsdhfbisab.com");
             
             
             
     Agenda a1 = new Agenda();
     a1.adicionaContato(c1);
     a1.adicionaContato(c2);
        
     a1.mostrarContato();
     
    }
}
