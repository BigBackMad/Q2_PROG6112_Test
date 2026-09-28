public class ConsoleSales extends Consoles {

    public ConsoleSales(ConsolesModel model){
        super(model);
    } //pass model straight up to consoles constructors

    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("****************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }


}
