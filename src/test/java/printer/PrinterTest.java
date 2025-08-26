package printer;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Unit tests for the Multifunction-printer.
 */
public class PrinterTest {

    @Test
    void testPrint() {
        /* to check the print functionality */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        assertDoesNotThrow(() -> printer.print("Xyz.pdf"));
    }

    @Test
    void testScan() {
        /* To check the Scan functionality */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        assertDoesNotThrow(() -> printer.scan("Xyz.pdf"));
    }

    @Test
    void testFax() {
        /* To check the Fax functionality */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        assertDoesNotThrow(() -> printer.fax("Xyz.pdf"));
    }

    @Test
    void testMultiFunc() {
        /* To test the Multifunctionality behaviour */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        assertDoesNotThrow(() -> printer.fax("Xyz.pdf"));
        assertDoesNotThrow(() -> printer.print("Xyz.pdf"));
        assertDoesNotThrow(() -> printer.scan("Xyz.pdf"));
    }

}
