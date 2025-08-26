package printer;

/**
 * Class MultiFunctionPrinter to
 * implement the interface.
 */
public class MultiFunctionPrinter implements IPrinter, IFax, IScanner {
    @Override
    public void print(final String doc) {
        // print logic
        System.out.println("Printing the doc....");
    }

    @Override
    public void fax(final String doc) {
        // fax logic
        System.out.println("Faxing the doc...");
    }

    @Override
    public void scan(final String doc) {
        // scan logic
        System.out.println("Scanning the doc....");
    }
}
