package br.com.ricardolonga;

/**
 * Precisamos garantir uma única instância da classe DatabaseProperties no ciclo de vida da aplicação.Ou seja, para o segundo cliente 
 * o host deveria também ser 192.168.10.10.
 */
public class Aplicacao {

    public static void main(String[] args) {
        /*
         * Simulando o primeiro cliente consumiddor...
         */
        DatabaseProperties.getInstance().setHost("192.168.10.10");

        System.out.println("Host para o primeiro cliente: " + DatabaseProperties.getInstance().getHost());

        /*
         * Simulando o segundo cliente consumiddor...
         */
        System.out.println("Host para o segundo cliente: " + DatabaseProperties.getInstance().getHost());
    }

}
