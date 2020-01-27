import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InputTXT implements Input {

    ArrayList<ArrayList<String>> words = new ArrayList<>();
    ArrayList<String> config = new ArrayList<>();


    public InputTXT() {

//        Input input = new InputTXT();
//        CompressAES compress = new CompressAES();
//        Output output = new OutPutTxt();
//        Scanner myObj = new Scanner(System.in);
//        ArrayList<String> config = new ArrayList<>();
//        ArrayList<ArrayList<String>> words = new ArrayList<>();
//
//        System.out.println("Give me the file name");
//        //String file1 = myObj.nextLine();
//        String file1 = "Test.txt";
//
//        System.out.println("Give me the second file name");
//        //String file2 = myObj.nextLine();
//        String file2 = "test2.txt";
//
//        System.out.println("Give me the name of the exported file");
//        System.out.println("");
//        //String name = myObj.nextLine();
//        String name = "OutPut.txt";

    }

    public   void readFromAnywhere (InputData firstFileName, InputData secondFileName) {

        //CompressAES compress = new CompressAES();
        String lineJustFetched ;
        String[] wordsArray;

        try
        {
            BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\dchatzimichail\\Desktop\\" + firstFileName.getNameOfFile() ));
            System.out.println("The file " + firstFileName.getNameOfFile()+" was found");

            BufferedReader buf2 = new BufferedReader(new FileReader("C:\\Users\\dchatzimichail\\Desktop\\" + secondFileName.getNameOfFile() ));
            System.out.println("The file "+secondFileName.getNameOfFile()+" was found");


            // Parse from first File
            int i =0;
            while(true) {

                lineJustFetched = buf.readLine();

                if (lineJustFetched == null) {
                    break;
                } else {
                    words.add(new ArrayList<String>());
                    wordsArray = lineJustFetched.split("\t");


                    for (String each : wordsArray) {

                        if (!"".equals(each)) {
                            words.get(i).add(each);
                        }

                    }
                    i++;
                }

            }



            // Parse from second File
            while(true) {

                lineJustFetched = buf2.readLine();

                if (lineJustFetched == null) {
                    break;
                } else {
                     config.add(lineJustFetched);
                }

            }

            buf.close();
            buf2.close();



        }catch (Exception e){
            System.out.println("File was not Found");
            e.printStackTrace();
        }


//        words = compress.compressData(words,config);
//
//        return words;

    }

    public ArrayList<ArrayList<String>> getWords() {
        return words;
    }

    public ArrayList<String> getConfig() {
        return config;
    }

}
