package domain;

/**
 * @author luiz.maestri
 * @since 23/03/17
 */
public class Graph {
    private Route[] routes;

    public Graph(String graph){
        String[] stringRoutes = graph.split(" ");
        int length = stringRoutes.length;
        setRoutes(new Route[length]);
        for (int index = 0; index < length; index++) {
            String route = stringRoutes[index];
            routes[index] = new Route(route);
        }
    }

    public Route[] getRoutes() {
        return routes;
    }

    public void setRoutes(Route[] routes) {
        this.routes = routes;
    }
}
