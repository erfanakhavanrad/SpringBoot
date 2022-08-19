package session1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.Normalizer;
import java.util.Date;

//@Component
public abstract class Processor {

//    @Autowired
//    Formatter formatter;
    @Autowired
    Date date;

    // Constructor injection
//    @Autowired
//    public Processor(Formatter formatter) {
//        this.formatter = formatter;
//    }

    public void process(String input) {
//        String formattedValue = formatter.format(input);
        String formattedValue = getFormatter().format(input);
        System.out.println(input + "received");
        System.out.println("After format is it: " + formattedValue);
    }

    // Setter injection
//    @Autowired
//    public void setFormatter(Formatter formatter){
//        this.formatter = formatter;
//    }

    // Setter injection
//    public abstract Formatter getFormatter();

    public abstract Formatter getFormatter();

}
