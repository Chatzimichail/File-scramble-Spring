import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;


public class CompressData {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Binding.class);

    CompressAES compress = context.getBean("compress", CompressAES.class);

    public static ArrayList<ArrayList<String>>  compressData(ArrayList<ArrayList<String>> data, ArrayList<String> config, String nameOfAlgorithm){

        if(nameOfAlgorithm.equals("AES")){
            return CompressAES.compressAES(data, config);
        }else{
            return null;
        }

    }

}


//public class CompressData {
//
//    public static String Compress(String name, String element){
//
//        if(name.equals("AES")){
//            return AES.encrypt(element,"Dimitris");
//        }else{
//            return null;
//        }
//
//    }
//
//}