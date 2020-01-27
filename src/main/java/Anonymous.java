import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

public class Anonymous {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Binding.class);


        Input input = context.getBean("inputTxt", Input.class);



        try (Scanner myObj = new Scanner(System.in)) {
        }
        catch (Exception e){
           e.printStackTrace();
        }
        ArrayList<String> config = new ArrayList<>();
        ArrayList<ArrayList<String>> words = new ArrayList<>();

        System.out.println("Give me the file name");
        //String file1 = myObj.nextLine();
        InputData file1 = new InputData("Test.txt");

        System.out.println("Give me the second file name");
        //String file2 = myObj.nextLine();
        InputData file2 = new InputData("test2.txt");


        System.out.println("Give me the name of the exported file");
        System.out.println("");
        //String name = myObj.nextLine();
        String name = "OutPut.txt";

        System.out.println("Give me the name of the Algorithm");
        System.out.println("");
        //String name = myObj.nextLine();
        String nameOfAlgorithm = "AES";


        // του δίνω τα δύο ονόματα των αρχείων για να τα διαβάσει
        input.readFromAnywhere(file1, file2);

        //παίρνω πίσω σε μορφή πίνακα τα δύο αρχεία που διάβασα
        words = input.getWords();
        config = input.getConfig();

        //δίνω τα δύο αρχεία μου για κατακερματισμό και μου επιστρέφει το κατακερματισμένο αρχείο
        words = CompressData.compressData(words,config,nameOfAlgorithm);

        //δίνω το όνομα του εξαγόμενου αρχείου που θέλω να μου δημιουργήσει και το κατακερματισμένο αρχείο με τα οποίο θα το γεμίσει
        OutPutData.OutPut(name,words);


    }

}
