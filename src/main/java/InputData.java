public class InputData {

    String nameOfFile;

    public InputData(String name){

        this.nameOfFile = name;

        if(nameOfFile.contains("{")){
            // Parse data from API
        }
    }

    public String getNameOfFile() {
        return nameOfFile;
    }
}
