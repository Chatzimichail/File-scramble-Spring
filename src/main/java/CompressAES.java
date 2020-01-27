import java.util.ArrayList;

public class CompressAES implements Compress {

    public  static ArrayList<ArrayList<String>> compressAES(ArrayList<ArrayList<String>> data, ArrayList<String> config) {



        for (String field : config) {
            for (int i = 0; i < data.get(0).size(); i++) {
                if (field.equals(data.get(0).get(i))) {
                    for (int j = 1; j < data.size(); j++) {
                        data.get(j).set(i, AES.encrypt(data.get(j).get(i),"Dimitris"));
                        //data.get(j).set(i, CompressData.Compress(nameOfAlgorithm,data.get(j).get(i)));
                    }
                }
            }

        }

        return data;

    }
}

