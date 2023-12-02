class TwelveDays {
    String[] verseGifts = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };

    String[] ordinalNumbers = {
            "first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh",
            "twelfth"
    };

    String sing() {
        return verses(1, 12);
    }

    String verses(int startVerse, int endVerse) {
        String completeVerses = "";

        for (int i = startVerse; i <= endVerse; i++) {
            completeVerses += verse(i);

            if (i < endVerse) completeVerses += "\n";
        }

        return completeVerses;
    }

    String verse(int verseNumber) {
        String startOfVerse = getStartOfVerse(verseNumber);
        String completeVerse = getCompleteVerse(verseNumber, startOfVerse);
        return completeVerse + ".\n";
    }

    private String getStartOfVerse(int verseNumber) {
        String startOfVerse = "On the " + ordinalNumbers[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        return startOfVerse;
    }

    private String getCompleteVerse(int verseNumber, String startOfVerse) {
        String completeVerse = startOfVerse;

        for (int i = verseNumber; i >= 1; i--) {
            String currentVerseGift = verseGifts[i - 1];

            if (verseNumber != 1 && i > 1) {
                completeVerse += currentVerseGift + ", ";
            } else if (verseNumber != 1 && i == 1) {
                completeVerse += "and " + currentVerseGift;
            } else {
                completeVerse += currentVerseGift;
            }
        }

        return completeVerse;
    }
}
