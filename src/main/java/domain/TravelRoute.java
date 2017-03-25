package domain;

/**
 * @author luiz
 * @since 24/03/17
 */
public class TravelRoute {
    private char origin;
    private char destination;

    TravelRoute(char origin, char destination) {
        this.setOrigin(origin);
        this.setDestination(destination);
    }

    char getOrigin() {
        return origin;
    }

    private void setOrigin(char origin) {
        this.origin = origin;
    }

    char getDestination() {
        return destination;
    }

     private void setDestination(char destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Route){
            Route routeCompare = (Route) obj;
            boolean equals = this.getOrigin() == routeCompare.getOrigin();
            equals = equals && this.getDestination() == routeCompare.getDestination();
            return equals;
        }
            return false;
    }
}
