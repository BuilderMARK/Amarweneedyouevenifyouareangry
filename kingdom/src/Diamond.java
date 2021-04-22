import kingdom.Gem;

public class Diamond implements Gem {

    @Override
    public String getName() {
        return "Diamond found";
    }

    @Override
    public int getValue() {
        return 10;
    }

}
