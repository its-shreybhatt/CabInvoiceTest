public class CabInvoice {

    public double invoiceGenerator(double distance, int time) {
        double result = distance * 10 + time * 1;
        if (result < 5) {
            return 5;
        }
        return result;
    }

    public double invoiceGenerator(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.invoiceGenerator(ride.distance, ride.time);
        }
        return totalFare;
    }

    public InvoiceSummary invoiceGeneratorNew(Ride[] rides) {
        int totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.invoiceGenerator(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public InvoiceSummary invoiceGeneratorList(Ride[] rides, Ride[] ridesTwo) {
        int fareUserOne = 0, fareUserTwo = 0, totalFare = 0;
        for (Ride ride : rides) {
            fareUserOne += this.invoiceGenerator(ride.distance, ride.time);
        }
        for (Ride ride : ridesTwo) {
            fareUserTwo += this.invoiceGenerator(ride.distance, ride.time);
        }
        totalFare=fareUserOne+fareUserTwo;
        return new InvoiceSummary(rides.length, totalFare);
    }
}
