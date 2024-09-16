public class Taxi
{
    public String getTaxiId() {
        return taxiId;
    }

    private String taxiId;
    private String driverName;
    private int numPass;
    private boolean available;

    public int getNumPass() {
        return numPass;
    }

    public Taxi(String driverName, String taxiId){
        this.driverName = driverName;
        this.taxiId=taxiId;
        this.numPass=4;
        this.available=true;
    }
    public Taxi(String driverName, String taxiId, int numPass)
    {
        this.driverName = driverName;
        this.taxiId=taxiId;
        this.numPass=numPass;
    }
    public void TaxiBusy(){
        this.available=false;
    }
}
