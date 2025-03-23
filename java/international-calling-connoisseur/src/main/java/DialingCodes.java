import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)) setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        if (!dialingCodes.containsValue(country)) return null;

        return dialingCodes.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(country))
                .findFirst()
                .get()
                .getKey();
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (!dialingCodes.containsValue(country)) return;

        dialingCodes.remove(findDialingCode(country));
        setDialingCode(code, country);
    }
}
