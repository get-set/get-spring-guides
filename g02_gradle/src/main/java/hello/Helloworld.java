package hello;

import org.joda.time.LocalTime;

public class Helloworld {
    public static void main(String[] args) {

        LocalTime time = new LocalTime();
        System.out.println(time);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
