public class Weight {

    private String ip;

    private Integer weight;

    private Integer currWeight;

    public Weight(String ip, Integer weight, Integer currWeight) {
        this.currWeight = currWeight;
        this.weight = weight;
        this.ip = ip;
    }

    public Integer getCurrWeight() {
        return currWeight;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setCurrWeight(Integer currWeight) {
        this.currWeight = currWeight;
    }
}
