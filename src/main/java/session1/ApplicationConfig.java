package session1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
// By adding this, applicationContext.xml is no longer required
@ComponentScan(basePackages = {"session1"})
public class ApplicationConfig {

    @Bean
    public Date getDate() {
        return new Date();
    }

    @Bean
    public Processor createProcessor() {
        return new Processor() {
            @Override
            public Formatter getFormatter() {
                return new Formatter() {
                    @Override
                    public String format(String message) {
                        return "# " + message.toUpperCase() + " #";
                    }
                };
            }
        };
    }

    @Bean
    public Formatter createFormatter() {
        return new Formatter() {
            @Override
            public String format(String message) {
                return "# " + message.toUpperCase() + " #";
            }
        };
    }

}
