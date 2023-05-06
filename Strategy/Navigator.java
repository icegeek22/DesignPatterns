public class Navigator {

    private RouteStrategy routeStrategy;

    Navigator(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(int a, int b){
        routeStrategy.buildRoute(a,b);
    }
}
