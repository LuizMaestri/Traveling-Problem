package domain;

/**
 * @author luiz.maestri
 * @since 23/03/17
 */
public class Route  extends TravelRoute{
    private int distance;

    Route(String route){
        super(route.charAt(0), route.charAt(1));
        setDistance(Character.getNumericValue(route.charAt(2)));
    }

    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Route){
            Route routeCompare = (Route) obj;
            boolean equals = super.equals(routeCompare);
            equals = equals && this.getDistance() == routeCompare.getDistance();
            return equals;
        }
        return false;
    }
}
