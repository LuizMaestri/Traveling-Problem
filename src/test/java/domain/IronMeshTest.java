package domain;

import junit.framework.TestCase;


/**
 * @author luiz
 * @since 24/03/17
 */
public class IronMeshTest extends TestCase{

    private IronMesh ironMesh;
    private final String strRoute1 = "AB5";
    private final String strRoute2 = "AC5";
    private final String strRoute3 = "CB5";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        String[] arRoutes = new String[]{this.strRoute1, this.strRoute2, this.strRoute3};
        String strGraph = String.join(" ", arRoutes);
        this.ironMesh = new IronMesh(strGraph);
    }

    public void testRoute1(){
        Route route = new Route(strRoute1);
        assertEquals(route, this.ironMesh.getRoutes()[0]);
    }

    public void testRoute2(){
        Route route = new Route(strRoute2);
        assertEquals(route, this.ironMesh.getRoutes()[1]);
    }

    public void testRoute3(){
        Route route = new Route(strRoute3);
        assertEquals(route, this.ironMesh.getRoutes()[2]);
    }
}
