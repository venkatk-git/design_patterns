package singleton;

public class RocketShip {
    /* Class level static instance of the class */
    private static volatile RocketShip rocketShip;

    /* Private constructor to prevent other class instantiation */
    private RocketShip() {}

    /* Factory method to retrieve instance */
    public static RocketShip getInstance() {
        if (rocketShip == null) {
            /* `synchronized` keyword is used to prevent multiple threads to create instance mistakenly */
            synchronized (RocketShip.class) {
                rocketShip = new RocketShip();
            }
        }

        return rocketShip;
    }
}
