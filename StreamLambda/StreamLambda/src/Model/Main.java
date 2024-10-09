package Model;

import Service.Usuario;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> emails = Usuario.listaEmail();
        System.out.println("\n");
        emails.forEach(System.out::println);


    }
}


