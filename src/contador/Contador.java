package contador;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o Primeiro Parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o Segundo Parâmetro: ");
        int parametroDois = terminal.nextInt();
        System.out.println("Os Paramentros Digitados foram: " + parametroUm + " e " + parametroDois);

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O Segundo parâmentro deve ser MAIOR que o primeiro.");
        }      
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois)
            throw new ParametrosInvalidosException();
        
        int contagem = parametroDois - parametroUm;

        for(int i = 0; i<=contagem; i++){

            System.out.println(i);
        }
    }
}
