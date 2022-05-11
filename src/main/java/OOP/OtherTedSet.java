package OOP;

public class OtherTedSet implements TedSetInterface{

    @Override
    public void doSomething() {
        System.out.println("Other ted set it doing something");
    }

    @Override
    public void doOtherThing() {
        System.out.println("GoodbyeWorld");
    }
}
