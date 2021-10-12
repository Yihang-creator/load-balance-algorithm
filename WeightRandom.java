import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightRandom {
    public static String getServer() {
        List<String> ips = new ArrayList<>();

        for (String ip: ServerIps.WEIGHT_LIST.keySet()) {
            int weight = ServerIps.WEIGHT_LIST.get(ip);
            for (int i = 0; i < weight; i++) {
                ips.add(ip);

            }
        }
        Random random = new Random();
        int rand = random.nextInt(ips.size());
        return ips.get(rand);

    }
}
