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

    @Test
    public void givenDistanceAndTime_ShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 2;
        CabInvoice cabInvoice = new CabInvoice();
        double invoice = cabInvoice.invoiceGenerator(distance, time);
        Assert.assertEquals(5, invoice, 0.0);
    }

    @Test
    public void givenDistanceAndTime_ForMultipleRide_ShouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        Ride[] rides = {new Ride(2,2),new Ride(5,1)};
        double invoice = cabInvoice.invoiceGenerator(rides);
        Assert.assertEquals(73, invoice, 0.0);
    }

    @Test
    public void givenDistanceAndTime_ForMultipleRide_ShouldReturnSummary() {
        CabInvoice cabInvoice = new CabInvoice();
        Ride[] rides = {new Ride(2,2),
                        new Ride(5,1)};
        InvoiceSummary summary = cabInvoice.invoiceGeneratorNew(rides);
        InvoiceSummary expectedSummary = new InvoiceSummary(2, 73);
        Assert.assertEquals(expectedSummary, summary);
    }
}