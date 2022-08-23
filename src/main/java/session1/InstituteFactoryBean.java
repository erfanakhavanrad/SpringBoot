package session1;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/session1/config.properties")
public class InstituteFactoryBean implements FactoryBean<InstituteDescription> {

    @Value("${name}")
    String name;
    @Value("${address}")
    String address;
    @Value("${activity}")
    String activity;

    @Override
    public InstituteDescription getObject() throws Exception {
        return new InstituteDescription(name, address, activity);
    }

    @Override
    public Class<?> getObjectType() {
        return InstituteDescription.class;
    }
}
