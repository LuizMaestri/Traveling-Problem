package domain;

import junit.framework.TestCase;

/**
 * @author luiz.maestri
 * @since 23/03/17
 */
public class RouteTest extends TestCase{
    private Route route;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        route = new Route("AB5");
    }

    public void testOrigin(){
        assertEquals("Error On Origin",'A', route.getOrigin());
    }

    public void testDestination(){
        assertEquals("Error On Destinarion",'B', route.getDestination());
    }

    public void testDistance(){
        assertEquals("Error of Distance",5, route.getDistance());
    }
}
