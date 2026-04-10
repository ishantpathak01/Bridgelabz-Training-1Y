public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(
            new DeliveryCheckpoint("C1", "Warehouse A", 40, 60, 70)
        );

        d.routeHistory.addCheckpoint(
            new FuelCheckpoint("C2", "Pump 12", 20, 30, 30)
        );

        d.routeHistory.addCheckpoint(
            new RestCheckpoint("C3", "Motel X", 10, 20, 40)
        );

        d.routeHistory.addCheckpoint(
            new DeliveryCheckpoint("C4", "Client Hub", 50, 60, 75)
        );

        System.out.println("Driver: " + d.driverId + " – " + d.name);
        System.out.println("Route Summary:");

        d.routeHistory.printRoute();

        double distance = d.routeHistory.computeTotalDistance();
        double penalty = d.routeHistory.computeTotalPenalty();
        double score = distance - penalty;

        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        System.out.println("Critical Route Check: " +
                (d.routeHistory.checkCritical()
                        ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }
}
