package printer;

/**
 * Basic printer which implements only the Print functionality.
 */
public class BasicPrinter implements IPrinter {
    /**
     * to access the last action of the printer.
     */
    private String lastAction;

    @Override
    public void print(final String doc) {
        // print logic
        this.lastAction = "printing " + doc;
        System.out.println("Basic Printer printing the doc....");
    }

    public String getLastAction() {
        return this.lastAction;
    }
}
