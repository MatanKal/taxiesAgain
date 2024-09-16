public class TaxiStation {
    private String stationName;
    private Taxi[] taxiArray = new Taxi[80];
    private int index = 0;

    public void addTaxi(String driverName,String taxiId,int numPass)
    {
        this.taxiArray[index] = new Taxi(driverName, taxiId, numPass);
        this.index++;
    }
    public int getArray(){
        return this.index;
    }
    public int GetMonit(int numPass){
        if(taxiArray[index].TaxiAvailable()&&taxiArray[index].GetNumpass()>numPass) {
        return taxiArray[index].GettaxiId();
        }
    }
}
