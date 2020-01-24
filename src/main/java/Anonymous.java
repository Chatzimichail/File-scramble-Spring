import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

public class Anonymous {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Binding.class);


        Input input = context.getBean("inputTxt", Input.class);
        Output output = context.getBean("output", Output.class);
        CompressAES compress = context.getBean("compress", CompressAES.class);



        //Input input = new InputTXT();
       // CompressAES compress = new CompressAES();
        //Output output = new OutPutTxt();


        try (Scanner myObj = new Scanner(System.in)) {
        }
        catch (Exception e){
           e.printStackTrace();
        }
        ArrayList<String> config = new ArrayList<>();
        ArrayList<ArrayList<String>> words = new ArrayList<>();

        System.out.println("Give me the file name");
        //String file1 = myObj.nextLine();
        String file1 = "Test.txt";

        System.out.println("Give me the second file name");
        //String file2 = myObj.nextLine();
        String file2 = "test2.txt";

        System.out.println("Give me the name of the exported file");
        System.out.println("");
        //String name = myObj.nextLine();
        String name = "OutPut.txt";


        // tou dino ta dio onomata arxion gia na diabasi
        input.readFromAnywhere(file1, file2);

        // perno piso se morfi pinaka ta dio arxia pou diabasa
        words = input.getWords();
        config = input.getConfig();

        //dino ta dio arxia mou gia comprress kai mou epistrefi to katakermatismeno arxio
        words = compress.compressData(words,config);

        //dino to onoma tou eksagomenou arxiou gia dimiourgia
        output.CreateFile(name);

        //stelno to katakermatismeno arxio gia grapsimo sto eksagomeno arxio
        System.out.println( output.filePopulate(words) ? "File was created successfully " : "File was not created successfully ");

    }

}
