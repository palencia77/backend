package com.palencia77.backend.service.impl;

import com.palencia77.backend.model.Person;
import com.palencia77.backend.service.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by palencia77 on 8/12/17.
 */
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    private static final Log LOGGER = LogFactory.getLog(ExampleServiceImpl.class);

    @Override
    public List<Person> getListPeople() {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Jesus", 27));
        people.add(new Person("Enrique", 26));
        people.add(new Person("Palencia", 25));
        people.add(new Person("Montes", 24));

        LOGGER.info("HELLO FROM SERVICE");
        return people;
    }
}
