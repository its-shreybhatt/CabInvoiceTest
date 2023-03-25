public class CabInvoice {

    public double invoiceGenerator(double distance, int time) {
        double result = distance * 10 + time * 1;
        if (result<5){
            return 5;
        }
        return result;
    }

    public double invoiceGenerator(Ride[] rides) {
        double totalFare=0;
        for (Ride ride: rides) {
           totalFare+= this.invoiceGenerator(ride.distance,ride.time);
        }
        return totalFare;
    }

    public InvoiceSummary invoiceGeneratorNew(Ride[] rides) {
        int totalFare=0;
        for (Ride ride: rides) {
            totalFare+= this.invoiceGenerator(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length,totalFare);
    }
}
