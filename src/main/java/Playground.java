public class Playground {

    public static void main(String[] args) {

        // pre-java 8
        IPlayable p1 = new IPlayable() {
            @Override
            public void shout() {
                System.out.println("I am shouting as pre-java 8 object");
            }
        };
        p1.shout();

        // lambda expression
        IPlayable p2 = () -> System.out.println("I am shouting from lambda expression");
        p2.shout();

        // method reference from IPlayable
        IPlayable p3 = IPlayable::shoutFromInterface;
        p3.shout();
    }
}
