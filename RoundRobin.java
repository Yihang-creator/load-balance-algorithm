public class RoundRobin {
    //position
    public static Integer pos = 0;
    public static String getServer() {
        String ip = null;
        synchronized (pos) {
            if (pos >= ServerIps.LIST.size()) {
                pos = 0;
            } else {
                ip = ServerIps.LIST.get(pos);
                pos++;
            }
        }
        return ip;

    }
}
