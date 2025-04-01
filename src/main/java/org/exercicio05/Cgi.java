package org.exercicio05;

public class Cgi {
    public static void main(String[] args) {
        String resposta = "Content-Type: text/html\n" +
                "\n" +
                "<html>\n" +
                "<head><title>Saudação CGI</title></head>\n" +
                "<body>\n" +
                "<h1>Olá, Terráqueos!</h1>\n" +
                "</body>\n" +
                "</html>\n";

        System.out.print(resposta);
    }
}
