import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//服务器IP
public class ServerIps {
    public final static List<String> LIST = Arrays.asList(
            "IP1",
            "IP2",
            "IP3"
    );
    //with weight
    public final static Map<String, Integer> WEIGHT_LIST = new LinkedHashMap<>();

    static {
        WEIGHT_LIST.put("IP1", 2);
        WEIGHT_LIST.put("IP2", 3);
        WEIGHT_LIST.put("IP3", 5);

    }
}

