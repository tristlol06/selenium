package sprawdzian;

import java.util.ArrayList;

public class Worker{
    public static void main(String[] args) {
        Tool hammer = new Tool ("Hammer");
        Tool screwdriver = new Tool ("Screwdriver");
        Tool wrench = new Tool ("Wrench");
        Tool pliers = new Tool ("Pliers");

        Tool[] tools = {hammer, screwdriver, wrench, pliers};

        for (Tool t : tools) {
            t.useTool();
        }

    }
}
