import org.apache.commons.io.FilenameUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class OutPutData {

    public static void OutPut(String name, ArrayList<ArrayList<String>> array){

        if(FilenameUtils.getExtension(name).equals("txt")){

            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Binding.class);
            Output output = context.getBean("output", Output.class);

            output.CreateFile(name);
            System.out.println( output.filePopulate(array) ? "File was created successfully " : "File was not created successfully ");

        }

    }

}
