package singleton;

public class Main {
    public static void main(String[] args) {
        RocketShip rocketShip1 = RocketShip.getInstance();
        RocketShip rocketShip2 = RocketShip.getInstance();

        System.out.println(rocketShip1);
        System.out.println(rocketShip2);
    }
}
