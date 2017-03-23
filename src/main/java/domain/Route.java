package domain;

/**
 * @author luiz.maestri
 * @since 23/03/17
 */
public class Route {
    private char origin;
    private char destination;
    private int distance;

    public Route() {
        new Route(null);
    }

    public Route(String route){
        if (route != null){
            setOrigin(route.charAt(0));
            setDestination(route.charAt(1));
            setDistance(Character.getNumericValue(route.charAt(2)));
        }
    }

    public char getOrigin() {
        return origin;
    }

    public void setOrigin(char origin) {
        this.origin = origin;
    }

    public char getDestination() {
        return destination;
    }

    public void setDestination(char destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
