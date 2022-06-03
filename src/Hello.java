///usr/bin/env jbang "$0" "$@" ; exit $?


import enums.Color;
import model.Person;

import static java.lang.System.*;


public class Hello {

    public static void main(String... args) {
        out.println("Hello World");
        var me = new Person("John", Color.RED);
        out.println(me.name + " likes " + me.favoriteColor);
    }
}
