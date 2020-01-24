import java.util.ArrayList;

public class CompressData {

    public static String Compress(String name, String element){

        if(name.equals("AES")){
            return AES.encrypt(element,"Dimitris");
        }else{
            return null;
        }

    }

}
