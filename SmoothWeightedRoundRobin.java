import java.util.HashMap;
import java.util.Map;

public class SmoothWeightedRoundRobin {

    public static Map<String,Weight> currWeight = new HashMap<>();

    public static String getServer() {

        int totalWeights = ServerIps.WEIGHT_LIST.values().stream().mapToInt(w->w).sum();

        if (currWeight.isEmpty()) {
            ServerIps.WEIGHT_LIST.forEach((ip,weight) -> {
                currWeight.put(ip,new Weight(ip,weight,0));
            });
        }

        for (Weight weight: currWeight.values()) {
            weight.setCurrWeight(weight.getCurrWeight() + weight.getWeight());
        }

        String maximumIp = null;
        Integer maximumWeight = 0;
        for (Weight weight : currWeight.values()) {
            if (weight.getCurrWeight() > maximumWeight) {
                maximumWeight = weight.getCurrWeight();
                maximumIp = weight.getIp();
            }
        }
        currWeight.get(maximumIp).setCurrWeight(maximumWeight-totalWeights);

        return maximumIp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getServer());
        }
    }




}
