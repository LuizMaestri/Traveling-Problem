package manager;

import domain.IronMesh;
import domain.Route;
import domain.Travel;
import domain.TravelRoute;
import exception.NotRoute;

import java.util.List;

/**
 * @author luiz
 * @since 24/03/17
 */
public class TravelManager {

    private Travel travel;
    private IronMesh ironMesh;

    public TravelManager(String IronMesh, String travel) {
        this.setTravel(travel);
        this.setIronMesh(IronMesh);
    }

    private Travel getTravel() {
        return this.travel;
    }

    private void setTravel(Travel travel) {
        this.travel = travel;
    }

    private void setTravel(String travel){
        this.setTravel(new Travel(travel));
    }

    private IronMesh getIronMesh() {
        return this.ironMesh;
    }

    private void setIronMesh(IronMesh ironMesh) {
        this.ironMesh = ironMesh;
    }

    private void setIronMesh(String ironMesh){
        this.setIronMesh(new IronMesh(ironMesh));
    }

    public int getTravelDistance() throws NotRoute {
        final int[] distance = {0};
        List<TravelRoute> travelRoutes = this.getTravel().getRoutes();
        try {
            travelRoutes.forEach( travelRoute -> {
                Route route = this.getIronMesh().getRouteFromTo(travelRoute);
                distance[0] += route.getDistance();
            });
        } catch (NullPointerException e){
            throw new NotRoute();
        }
        return distance[0];
    }

}
