package www.dedham.pantry;

public class data {
    String x;
    int y;

    public data(String product,int amount){
        String x = product;
        int y = amount;
    }
    public String getproduct(){
        return x;
    }
    public Integer getamount(){
        return y;
    }
}
