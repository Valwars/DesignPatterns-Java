package TD.Ex1;

import java.util.ArrayList;
import java.util.List;

public class MultiAdapter implements TelecommandeI {
    private List<LL1> ll1s;

    public MultiAdapter(List<LL1> listes) {
        this.ll1s = listes;
    }

    @Override
    public void marche(boolean b) {
        for (LL1 laveLinge : ll1s) {
            if (b) {
                laveLinge.on();
            } else {
                laveLinge.off();
            }
        }
    }

    @Override
    public void xxx(String s, int i) {
        for (LL1 laveLinge : ll1s) {
            if ("setProg".equals(s)) {
                laveLinge.setProgNumber(i);
            } else if ("setLength".equals(s)) {
                laveLinge.setLength(i);
            }
        }
    }
}
