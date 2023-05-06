public class Main {
    public static void main(String[] args) {
        Navigator roadNavigator = new RoadNavigator();
        roadNavigator.buildRoute(1,2);
        Navigator walkingNavigator = new WalkingNavigator();
        walkingNavigator.buildRoute(5,10);
    }
}