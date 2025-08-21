package org.example.Day_20_08_25;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggerHelper {
    public static Logger getLogger(Class<?> cls) {
        return LogManager.getLogger(cls);
    }
}
