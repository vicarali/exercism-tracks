public class LogLevels {
    
    public static String message(String logLine) {
        String[] splitLogLine = logLine.split("]:");
        return splitLogLine[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] splitLogLine = logLine.split("]:");
        String logLevel = splitLogLine[0].trim().substring(1).toLowerCase();
        return logLevel;
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        String reformattedLogLine = message + " (" + logLevel + ")";

        return reformattedLogLine;
    }
}
