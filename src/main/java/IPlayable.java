@FunctionalInterface
public interface IPlayable {

    void shout();

    static void shoutFromInterface(){
        System.out.println("I am shouting from interface");
    }

}
