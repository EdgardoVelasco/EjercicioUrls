import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        lista.add("file:///C:/Users/user1/Documents/arch1.jpg");
        lista.add("file:///C:/Users/user1/Documents/arch2.jpg");
        lista.add("https://host.mirepositorio.es/arch4.jpg");
        lista.add("https://host.mirepositorio.es/arch5.jpg");
        lista.add("https://host.mirepositorio.es/arch6.jpg");
        
        for(String tmp : lista){
           if(tmp.startsWith("http")||tmp.startsWith("https")){
               System.out.println(tmp);
           }
        }

    }
}
