package br.senac.rn.helloworld;

public class EstruturaSwitch {

    public static void main(String[] args) {

        Character letra = 'A';

        switch (letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("VOGAL");
                break;
            default:
                System.out.println("NÃO É VOGAL");
        }

    }

}
