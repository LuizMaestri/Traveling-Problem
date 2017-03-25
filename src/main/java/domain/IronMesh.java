package domain;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author luiz.maestri
 * @since 23/03/17
 */
public class IronMesh {
    private Route[] routes;

    public IronMesh(String graph){
        String[] strRoutes = graph.split(",");
        int length = strRoutes.length;
        setRoutes(new Route[length]);
        for (int index = 0; index < length; index++) {
            String route = strRoutes[index];
            routes[index] = new Route(route);
        }
    }

    protected Route[] getRoutes() {
        return routes;
    }

    private void setRoutes(Route[] routes) {
        this.routes = routes;
    }

    public  Route getRouteFromTo(TravelRoute route) {
        List<Route> listRoutes = Arrays.asList(this.getRoutes());
        char origin = route.getOrigin();
        char destination = route.getDestination();
        List<Route> routeFromTo =  listRoutes.stream().filter(_route ->
                _route.getDestination() == destination &&
                        _route.getOrigin() == origin
        ).collect(Collectors.toList());
        if (!routeFromTo.isEmpty()){
            return routeFromTo.get(0);
        }
        return null;
    }
}
