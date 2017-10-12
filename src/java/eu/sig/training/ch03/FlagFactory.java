package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlagFactory {

    private static final HashMap<Nationality, Flag> flagMap = new HashMap<>();

    static {
        flagMap.put(Nationality.DUTCH, new DutchFlag());
        flagMap.put(Nationality.GERMAN, new GermanFlag());
        flagMap.put(Nationality.BELGIAN, new BelgianFlag());
        flagMap.put(Nationality.FRENCH, new FrenchFlag());
        flagMap.put(Nationality.ITALIAN, new ItalianFlag());
        flagMap.put(Nationality.ROMANIA, new RomaniaFlag());
        flagMap.put(Nationality.IRELAND, new IrelandFlag());
        flagMap.put(Nationality.HUNGARIAN, new HungariaFlag());
        flagMap.put(Nationality.BULGARIAN, new BulgariaFlag());
        flagMap.put(Nationality.RUSSIA, new RusiaFlag());
        flagMap.put(Nationality.UNCLASSIFIED, new DefaultFlag());
    }

    public List<Color> getFlagColors(Nationality nationality) {
        Flag flag = flagMap.get(nationality) != null ? flagMap.get(nationality) : new DefaultFlag();
        return flag.getColor();
    }

}