package test.actions;

import test.clocks.GameClock;
import test.gui.Gui;

public class Main {

    public static void main(String[] args) {
        Gui g = new Gui();
        GameClock gc = new GameClock();

        g.create();
        gc.start();

    }
}
