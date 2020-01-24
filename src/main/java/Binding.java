import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Scanner;


@Configuration
public class Binding {

    @Bean
    public Input inputTxt() {
        InputTXT inputTXT = new InputTXT();

        return inputTXT;
    }


    @Bean
    public Output output() {
        OutPutTxt outPutTxt = new OutPutTxt();

        return outPutTxt;
    }

    @Bean
    public Compress compress() {
        CompressAES compressAES = new CompressAES();

        return compressAES;
    }

}

























