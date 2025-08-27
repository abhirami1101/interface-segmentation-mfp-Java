package printer;

/**
 * Multifunction Printer Scanner that only implements printing and scanning.
 */
public class MultiFunctionScannerPrinter implements IPrinter, IScanner {
    /**
     * to access the last action of the printer.
     */
    private String lastAction;

    @Override
    public void print(final String doc) {
        // print logic
        this.lastAction = "printing " + doc;
        System.out.println("Multi Function Scanner-Printer printing the doc....");
    }

    @Override
    public void scan(final String doc) {
        // scan logic
        this.lastAction = "scanning " + doc;
        System.out.println("Multi Function Scanner-Printer scanning the doc....");
    }

    public String getLastAction() {
        return this.lastAction;
    }
}
