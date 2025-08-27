package printer;

/**
 * Class for multi function fax printer which only implements fax, print.
 */
public class MultiFunctionFaxPrinter implements IPrinter, IFax {
    /**
     * to access the last action of the printer.
     */
    private String lastAction;

    @Override
    public void print(final String doc) {
        // print logic
        this.lastAction = "printing " + doc;
        System.out.println("Multi Function Fax-Printer printing the doc....");
    }

    @Override
    public void fax(final String doc) {
        // scan logic
        this.lastAction = "fax " + doc;
        System.out.println("Multi Function Fax-Printer sending fax....");
    }

    public String getLastAction() {
        return this.lastAction;
    }
}
