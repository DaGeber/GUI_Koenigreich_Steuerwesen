package com.example.gui_koenigreich_steuerwesen;

public class Leibeigen extends Bauer{
    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        if (super.zuVersteuern() < 12) {
            return 0;
        }else {
            return  super.zuVersteuern() - 12;
        }
    }
}
