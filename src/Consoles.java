public abstract class Consoles implements IConsoles {

    public String consoleType;
    public String store;
    public int totalSales;

    //constructor copies the captured data from model into this object

    public Consoles(ConsolesModel model){
        this.consoleType = model.consoleType;
        this.store = model.store;
        this.totalSales = model.totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    //override required by the interface to expose this field safely
    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales(){
        return totalSales;
    }

}
