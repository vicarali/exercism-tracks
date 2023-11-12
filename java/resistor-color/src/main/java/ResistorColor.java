import java.util.*;

class ResistorColor {
    Map<String, Integer> colorsDictionary = new LinkedHashMap<String, Integer>();

    public ResistorColor() {
        colorsDictionary.put("black", 0);
        colorsDictionary.put("brown", 1);
        colorsDictionary.put("red", 2);
        colorsDictionary.put("orange", 3);
        colorsDictionary.put("yellow", 4);
        colorsDictionary.put("green", 5);
        colorsDictionary.put("blue", 6);
        colorsDictionary.put("violet", 7);
        colorsDictionary.put("grey", 8);
        colorsDictionary.put("white", 9);
    }

    int colorCode(String color) {
        return colorsDictionary.get(color);
    }

    String[] colors() {
        Set<String> colorKeys = colorsDictionary.keySet();
        return colorKeys.toArray(new String[colorKeys.size()]);
    }
}
