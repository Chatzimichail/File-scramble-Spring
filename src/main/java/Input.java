import java.util.ArrayList;

public interface Input {

    void  readFromAnywhere(InputData firstFileName, InputData secondFileName);

     ArrayList<ArrayList<String>> getWords();

     ArrayList<String> getConfig() ;

}
