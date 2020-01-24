import java.util.ArrayList;

public interface Output {

    String name = null;

    void CreateFile(String name);
    boolean filePopulate(ArrayList<ArrayList<String>> words);
}
