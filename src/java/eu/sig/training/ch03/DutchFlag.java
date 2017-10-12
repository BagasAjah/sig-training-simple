package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class DutchFlag implements Flag {

    @Override
    public List<Color> getColor() {
        return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
    }
}
