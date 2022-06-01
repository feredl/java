import java.io.*;
import java.util.HashMap;
public class File_Processing {
    public HashMap<String, String> MapPutFromFile(File file) {
        HashMap<String, String> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(":");
                String name = parts[0].trim();
                String number = parts[1].trim();

                if ((!name.equals("") && !number.equals("")) && !IfKeyExists(name, number, map)) {
                    map.put(name, number);
                } //method that checks the key entry!
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public void MapConsoleOutput(HashMap<String, String> map) {
        for (String name: map.keySet()) {
            String value = map.get(name);
            System.out.println(name + ": " + value);
        }
    }
    public boolean IfKeyExists(String key, String data, HashMap<String, String> map) {
        boolean res = map.containsKey(key);
        if (res) {
            System.out.println("The key <" + key + "> already exists. The line <" + data + "> won't be included to the dictionary");
        }
        return res;
    }
}
