package utilidades;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Mouse {
    Screen screen = new Screen();

    public void mover(int x, int y) throws FindFailed {
        screen.mouseMove(new Location(x, y));
    }
}
