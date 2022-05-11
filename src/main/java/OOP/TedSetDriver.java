package OOP;


import java.util.*;

public class TedSetDriver {
    public static void main(String[] args) {
        TedSetInterface ts1 = new TedSet();
        TedSetInterface ts2 = new ImprovedTedSet();
        TedSetInterface ts3 = new OtherTedSet();

        TedSet ts4 = new ImprovedTedSet();

//        improvedtedset overrides tedset's dosomething
        ts1.doSomething();
        ts4.doSomething();
//        inherting tedset method
        ts1.doOtherThing();
        ts4.doOtherThing();

//        This is exactly what TreeSet in collections is doing!
//        wherin Set is an interface
        Set<String> set = new TreeSet<>();
        List<String> list = new ArrayList<>();
        list.add("A thing");
//        returns "A thing"
        list.get(0);
//        AbstractSet should be an abstract class - ie a class that has methods with no implementations
//        and must be extended and overriden to get anything to work
        AbstractSet<String> set2 = new TreeSet();

    }
}
