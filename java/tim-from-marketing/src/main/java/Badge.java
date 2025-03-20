import java.util.ArrayList;

class Badge {
    public String print(Integer id, String name, String department) {
        ArrayList<String> badgeComponents = new ArrayList<>();

        if(id != null) badgeComponents.add("[" + id + "]");

        badgeComponents.add(name);

        if(department != null) badgeComponents.add(department.toUpperCase());
        else badgeComponents.add("OWNER");

        return String.join(" - ", badgeComponents);
    }
}
