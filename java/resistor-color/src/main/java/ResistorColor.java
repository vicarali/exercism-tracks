import java.util.*;

class ResistorColor {
    Map<String, Integer> colorsDictionary = new HashMap<String, Integer>();

    public ResistorColor() {
        colorsDictionary.put("black", 0);
    }

    int colorCode(String color) {
        return colorsDictionary.get(color);
    }

    String[] colors() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
