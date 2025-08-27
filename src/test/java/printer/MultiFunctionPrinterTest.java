package printer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Multifunction-printer.
 */
public class MultiFunctionPrinterTest {

    @Test
    void testMFPPrint() {
        /* to check the print functionality */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print("Xyz.pdf");
        String expectedAction = "printing Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testMFPScan() {
        /* To check the Scan functionality */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.scan("Xyz.pdf");
        String expectedAction = "scanning Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testMFPFax() {
        /* To check the Fax functionality */
        final MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.fax("Xyz.pdf");
        String expectedAction = "fax Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testBasicPrinter() {
        /* To test the Multifunctionality behaviour */
        final BasicPrinter printer = new BasicPrinter();
        printer.print("Xyz.pdf");
        String expectedAction = "printing Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testPrinterScannerScan() {
        /* To test the Multifunctionality behaviour */
        final MultiFunctionScannerPrinter printer = new MultiFunctionScannerPrinter();
        printer.scan("Xyz.pdf");
        String expectedAction = "scanning Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testPrinterScannerPrint() {
        /* To test the Multifunctionality behaviour */
        final MultiFunctionScannerPrinter printer = new MultiFunctionScannerPrinter();
        printer.print("Xyz.pdf");
        String expectedAction = "printing Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testFaxPrinterPrint() {
        /* To test the Multifunctionality behaviour */
        final MultiFunctionFaxPrinter printer = new MultiFunctionFaxPrinter();
        printer.print("Xyz.pdf");
        String expectedAction = "printing Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

    @Test
    void testFaxPrinterFax() {
        /* To test the Multifunctionality behaviour */
        final MultiFunctionFaxPrinter printer = new MultiFunctionFaxPrinter();
        printer.fax("Xyz.pdf");
        String expectedAction = "fax Xyz.pdf";
        assertEquals(expectedAction, printer.getLastAction());
    }

}
