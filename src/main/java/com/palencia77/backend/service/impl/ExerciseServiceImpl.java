package com.palencia77.backend.service.impl;

import com.palencia77.backend.service.ExerciseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * Created by palencia77 on 8/12/17.
 */
@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
    private final static Log LOGGER = LogFactory.getLog(ExerciseServiceImpl.class);

    @Override
    public void logMessage() {
        LOGGER.info("LOG FROM EXERCISE SERVICE");
    }
}
