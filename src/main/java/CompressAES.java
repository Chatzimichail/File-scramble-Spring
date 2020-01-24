import java.util.ArrayList;

public class CompressAES implements Compress<ArrayList<ArrayList<String>>, ArrayList<String> > {

    public  ArrayList<ArrayList<String>> compressData(ArrayList<ArrayList<String>> data, ArrayList<String> config, String nameOfAlgorithm) {

        String SecretKey = "Dimitris";

        for (String field : config) {
            for (int i = 0; i < data.get(0).size(); i++) {
                if (field.equals(data.get(0).get(i))) {
                    for (int j = 1; j < data.size(); j++) {
                        //data.get(j).set(i, AES.encrypt(data.get(j).get(i),SecretKey));
                        data.get(j).set(i, CompressData.Compress(nameOfAlgorithm,data.get(j).get(i)));
                    }
                }
            }

        }

        return data;

    }
}

