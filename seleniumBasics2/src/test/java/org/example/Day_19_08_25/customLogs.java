package org.example.Day_19_08_25;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(customTestListeners.class)
public class customLogs {
    @Test
    public static void method1(){
        System.out.println("Method 1 is being executed");
    }
}
