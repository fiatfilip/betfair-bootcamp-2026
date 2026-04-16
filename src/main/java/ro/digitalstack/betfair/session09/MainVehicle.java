package ro.digitalstack.betfair.session09;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Caravan();
        int i = switch (vehicle) {
            case Car car -> 1;
            case Caravan caravan -> 4;
            case MiniBus miniBus -> 3;
            case Bus bus -> 2;
            default -> 0;
        };
    }
}
