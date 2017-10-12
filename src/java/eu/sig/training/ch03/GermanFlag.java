package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class GermanFlag implements Flag {

    @Override
    public List<Color> getColor() {
        return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}
