import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 2;
        int time = 2;
        CabInvoice cabInvoice = new CabInvoice();
        double invoice = cabInvoice.invoiceGenerator(distance, time);
        Assert.assertEquals(22, invoice, 0.0);
    }
}