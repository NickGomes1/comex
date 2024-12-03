import java.util.Scanner;
public class Teste {
    public static void main(String[] args){
        Produto p1 = new Produto("Notebook", "Eletronico", 4500, 10);
        Produto p2 = new Produto("Geladeira", "Eletrodomestico", 6000, 3);
        Produto p3 = new Produto("Livro", "Conjunto de folhas impressas", 60, 100);

        if(p1 == p2){
            System.out.println("Referências iguais");
        }
        else{
            System.out.println("Referências diferentes");
        }

        p3.getInfo();


        Endereco endereco1 = new Endereco("Ficticio", "Rio Branco", "Casa", "Acre", "Rua1", 500);
        Cliente cliente1 = new Cliente("Cleber", "123.456.789-00", "Cleber@gmail.com", "Pedreiro", "55 11 32145-3758", endereco1);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o nome do produto que irá criar: ");
        String nomeproduto = sc.nextLine();
        Produto p4 = new Produto(nomeproduto);
        
        Cliente cliente2 = new Cliente("Jorge", "009.876.543-21", "Jorge@gmail.com");
        Cliente cliente3 = new Cliente("Fernando", "111.222.333-44");
    }
}
