package Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Usuario {
    private String email;

    public static TreeSet<String> emails() throws IOException, InterruptedException {
        ConsomeApi api = new ConsomeApi();
        String jsonResponse = api.consomeApi();
        Gson gson = new Gson();
        List<Usuario> infos = gson.fromJson(jsonResponse,new TypeToken<List<Usuario>>(){}.getType());
        return infos.stream()
                .map(n ->  "E-mail: " + n.email)
                .collect(Collectors.toCollection(TreeSet::new));
    }
    public static List<String> listaEmail() throws IOException, InterruptedException {
        return new ArrayList<>(emails());
    }
}

