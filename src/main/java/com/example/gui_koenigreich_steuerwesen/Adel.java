package com.example.gui_koenigreich_steuerwesen;

public class Adel extends Einwohner{
    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer() {
        int aktuelleSteuer;
        if (super.steuer() < 20) {
            return 20;
        }else {
            aktuelleSteuer = (int)(super.zuVersteuern() * 0.1);
        }
        return aktuelleSteuer;
    }
}
