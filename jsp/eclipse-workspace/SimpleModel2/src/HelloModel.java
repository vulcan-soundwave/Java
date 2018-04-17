
import java.util.*;

public class HelloModel {
    private Map<String, String> messages 
                = new HashMap<String, String>();
    
    public HelloModel() {
        messages.put("caterpillar", "Hello");
        messages.put("Justin", "Welcome");
        messages.put("momor", "Hi");
    }

    public String doHello(String user) {
        String mess = messages.get(user);
        return mess + ", " + user + "!";
    }
}
