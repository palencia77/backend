package com.palencia77.backend.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by palencia77 on 8/12/17.
 */
@Component("exampleComponent")
public class ExampleComponent {

    private static final Log LOGGER = LogFactory.getLog(ExampleComponent.class);

    public void sayHello(){
        LOGGER.info("Hello from exampleComponent");
    }
}
