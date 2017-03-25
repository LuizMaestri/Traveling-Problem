package exception;

/**
 * @author luiz
 * @since 24/03/17
 */
public class NotRoute extends Throwable {

    public NotRoute() {
        super("NO SUCH ROUTE");
    }
}
