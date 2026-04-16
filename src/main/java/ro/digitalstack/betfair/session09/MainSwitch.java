package ro.digitalstack.betfair.session09;

public class MainSwitch {
    public static int nrOfDays(Integer n){
        var nrOfDays = 0;

        switch(n) {
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                nrOfDays = 31;
                break;
            case (2):
                System.out.println("Check for leap year");
                nrOfDays = 28;
                break;

            case(4):
            case(6):
            case(9):
            case(11):
                nrOfDays = 30;
                break;

            default:
                nrOfDays = 1000;
        }

        return nrOfDays;
    }


    public static int nrOfDaysExpr(Integer n){
        return switch (n) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                System.out.println("Check for leap year");
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> 1000;
        };
    }
    public static void main(String[] args) {
        System.out.println(nrOfDays(2));
        System.out.println(nrOfDaysExpr(2));
    }
}
