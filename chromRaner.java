package Utils;

import org.testng.annotations.BeforeTest;

import static jdk.internal.misc.ThreadFlock.open;

public class chromRaner {
    @BeforeTest
    public static void setUp(){
        open("https://www.facebook.com/");
    }
}

