import java.util.HashSet;
import java.util.Set;

public class NoteBookMain {
        public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        s

        Map<String, Object> filterCriteria = new HashMap<>();
      

       

        Set<Notebook> filteredNotebooks = Notebook.filterNotebooks(notebooks, filterCriteria);
    
    }
}

class Notebook {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }




    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filterCriteria) {
        Set<Notebook> filteredNotebooks = new HashSet<>();
        for (Notebook notebook : notebooks) {
            boolean meetsCriteria = true;
            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String criteria = entry.getKey();
                Object value = entry.getValue();
                if (criteria.equals("ram") && notebook.getRam() < (int)value) {
                    meetsCriteria = false;
                }

            }
            if (meetsCriteria) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }


}