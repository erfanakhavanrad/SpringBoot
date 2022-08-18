package session1;

import org.springframework.stereotype.Component;

@Component
public class Processor {
public void process(String input){
    System.out.println(input + "received");
}
}
