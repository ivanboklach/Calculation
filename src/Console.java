import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by macbook on 24.09.17.
 */
public class Console {
    BufferedReader console() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
