package com.example.gui_koenigreich_steuerwesen;

public class König extends Einwohner{

    public König(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        return 1;
    }
}
