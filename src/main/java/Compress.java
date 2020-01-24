import java.util.ArrayList;

public interface Compress <dataType, configType>{

   ArrayList<ArrayList<String>> compressData(dataType data, configType config);

}
