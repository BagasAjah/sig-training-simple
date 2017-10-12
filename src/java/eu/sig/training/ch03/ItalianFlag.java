package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ItalianFlag implements Flag {

    @Override
    public List<Color> getColor() {
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
    }
}
