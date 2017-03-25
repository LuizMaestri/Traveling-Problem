import exception.NotRoute;
import manager.TravelManager;
import utils.Config;

/**
 * @author luiz.maestri
 * @since 23/03/17
 */
class Main {
    public static void main(String[] args) {
        Config config = new Config();
        String ironMesh = config.getProperty("ironMesh");
        String strTravels = config.getProperty("travels");
        String[] travels = strTravels.split("--");
        for (String travel : travels){
            TravelManager manager = new TravelManager(ironMesh, travel);
            try {
                System.out.println(manager.getTravelDistance());
            } catch (NotRoute notRoute) {
                System.out.println(notRoute.getMessage());
            }
        }
    }
}
