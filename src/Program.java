import java.io.*;
import java.util.HashMap;

public class Program {
    static File_Processing f = new File_Processing();
    static File file = new File("C:\\Users\\kseni\\IdeaProjects\\hash\\src\\dic.txt");

    public static void main(String[] args) {
        HashMap<String, String> map = f.MapPutFromFile(file);
        f.MapConsoleOutput(map);
    }
}
