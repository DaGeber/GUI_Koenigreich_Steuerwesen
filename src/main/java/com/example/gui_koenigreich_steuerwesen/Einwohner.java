package com.example.gui_koenigreich_steuerwesen;

public abstract class Einwohner {
    private String name;
    private int einkommen;
    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int zuVersteuern() {
        return this.einkommen;
    }

    public int steuer() {
        if (zuVersteuern() > 1){
            int aktuelleSteuer = (int)(zuVersteuern() * 0.1);
            return aktuelleSteuer;
        } else if (zuVersteuern() == 0)
            return 0;

        return 1;
    }


}
