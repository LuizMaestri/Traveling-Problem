package domain;

import java.util.ArrayList;

/**
 * @author luiz
 * @since 24/03/17
 */
public class Travel {
    private ArrayList<TravelRoute> routes;

    public Travel(String travel) {
        travel = travel.replace("-", "");
        int length = travel.length();
        this.setRoutes(new ArrayList<>());
        for (int index = 0; index < length - 1; index++) {
            char origin = travel.charAt(index);
            char destination = travel.charAt(index + 1);
            TravelRoute route = new TravelRoute(origin, destination);
            this.routes.add(route);
        }
    }

    public ArrayList<TravelRoute> getRoutes() {
        return routes;
    }

    private void setRoutes(ArrayList<TravelRoute> routes) {
        this.routes = routes;
    }

}

