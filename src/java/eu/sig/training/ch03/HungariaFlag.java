package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class HungariaFlag implements Flag {

    @Override
    public List<Color> getColor() {
        return Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
    }
}
