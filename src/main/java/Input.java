import java.util.ArrayList;

public interface Input {

    ArrayList<ArrayList<String>>  readFromAnywhere(String firstFileName, String secondFileName);

     ArrayList<ArrayList<String>> getWords();

     ArrayList<String> getConfig() ;

}
