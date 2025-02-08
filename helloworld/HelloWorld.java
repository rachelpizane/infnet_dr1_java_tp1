package helloworld;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // 7. Modificar e Re-executar o Programa

        Date dataAtual = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        String Sdata = formatador.format(dataAtual);

        System.out.print("Olá Mundo!! ");

        System.out.printf("Meu nome é Rachel e hoje é dia %s.\n", Sdata);


        System.out.println();
        //8. Usar Variáveis e Tipos de Dados

        int numInt = 2_000_000_000;

        double numDouble = 4.56;
        float numFloat = 4.56F;

        String textString = "R";
        char textChar = 'R';

        System.out.println("int: " + numInt);

        System.out.println("double: " + numDouble);
        System.out.println("float: " + numFloat);

        System.out.println("String: " + textString);
        System.out.println("char: " + textChar);


        System.out.println();
        // Ler Entrada do Usuário

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Nome: [%s], Idade: [%d]\n", nome, idade);

    }
}
