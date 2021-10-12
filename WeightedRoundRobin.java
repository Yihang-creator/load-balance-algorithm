//pitfall: when a server's weight is large,  servers are continuously accessed.
public class WeightedRoundRobin {
    public static String getServer(Integer num) {
        int totalWeights = ServerIps.WEIGHT_LIST.values().stream().mapToInt(w -> w).sum();

        Integer pos = num % totalWeights;

        for (String ip: ServerIps.WEIGHT_LIST.keySet()) {
            Integer weight = ServerIps.WEIGHT_LIST.get(ip);
            if (pos < weight) {
                return ip;
            }
            pos = pos - weight;
        }

        return "";
    }

    public static void main(String[] args) {
        for (int i = 0; i< 10; i++) {
            System.out.println(getServer(i));
        }
    }
}
