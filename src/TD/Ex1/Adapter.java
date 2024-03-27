package TD.Ex1;

public class Adapter implements TelecommandeI {
    private LL1 ll1;

    public Adapter(LL1 ll1) {
        this.ll1 = ll1;
    }

    @Override
    public void marche(boolean b) {
        if (b) {
            ll1.on();
        } else {
            ll1.off();
        }
    }

    @Override
    public void xxx(String s, int i) {
        if ("setProg".equals(s)) {
            ll1.setProgNumber(i);
        } else if ("setLength".equals(s)) {
            ll1.setLength(i);
        }
    }
}
