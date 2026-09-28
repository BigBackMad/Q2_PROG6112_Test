import java.util.Scanner;
void main() {

    Scanner sc = new Scanner(System.in);
    ConsolesModel model = new  ConsolesModel();

    System.out.println("Select the console type " +
            "\n1) PS5" +
            "\n2) XBOX" +
            "\n3) SWITCH");
    int userChoice = sc.nextInt(); //user inputs choice of console

    sc.nextLine();

    switch (userChoice) {
        case 1:
            model.consoleType = "PS5";
            break;
        case 2:
            model.consoleType = "XBOX";
            break;
        case 3:
            model.consoleType = "SWITCH";
            break;
        default:
            model.consoleType = "";
    }

    System.out.print("Enter the store: ");
    model.store = sc.nextLine();


    System.out.print("Enter the totalSales of " + model.consoleType + " consoles for " + model.store + ": ");
    model.totalSales = sc.nextInt();

    sc.nextLine();

    System.out.println();

    ConsoleSales report = new ConsoleSales(model); //creates object of the consolesales class in order to use the printreport method

    report.printReport();



}
