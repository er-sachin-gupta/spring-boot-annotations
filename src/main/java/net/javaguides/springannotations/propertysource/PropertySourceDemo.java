package net.javaguides.springannotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    @Autowired
    private Environment environment;

//    @Value("${gmail.host}")
    private String host;

//    @Value("${gmail.email}")
    private String email;

//    @Value("${gmail.password}")
    private String password;


//    @Value("${app.name}")
    private String appName;

//    @Value("${app.description}")
    private String appDescription;

    public String getHost() {
//        return host;
        return environment.getProperty("gmail.host");
    }

    public String getEmail() {
//        return email;
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
//        return password;
        return environment.getProperty("gmail.password");
    }

    public String getAppName() {
//        return appName;
        return environment.getProperty("app.name");
    }

    public String getAppDescription() {
//        return appDescription;
        return environment.getProperty("app.description");
    }

}
