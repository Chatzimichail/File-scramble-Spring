import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutPutTxt implements Output {

    String name;

    public void CreateFile(String name){

        this.name = name;
        try {
            File myObj = new File("C:\\Users\\dchatzimichail\\Desktop\\"+name);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean filePopulate( ArrayList<ArrayList<String>> words){
                try {
                    FileWriter myWriter = new FileWriter("C:\\Users\\dchatzimichail\\Desktop\\" + name);
                    for(int r=0; r < words.size(); r++) {
                        for (int c = 0; c < words.get(r).size(); c++) {
                            myWriter.write(words.get(r).get(c)+" ");
                        }
                        myWriter.write("\n");
                    }

                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }



        return true;

    }

}
