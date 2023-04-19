package com.example.gui_koenigreich_steuerwesen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Label ausgabe;

    @FXML
    private TextField einkommen;

    @FXML
    private Label fehlerAusgabe;

    @FXML
    private TextField name;

    @FXML
    private TextField richtigeGruppe;

    @FXML
    void eingabePrüfen(KeyEvent event) {
        try {
            Integer.parseInt(einkommen.getText());
        } catch (NumberFormatException e) {
            einkommen.clear();
        }
    }

    @FXML
    void beenden(ActionEvent event) {
        System.exit(-1);
    }

    @FXML
    void berechnen(ActionEvent event) {
        Einwohner einwohner;
        if (name.getText().equals("") || einkommen.getText().equals("")) {
            fehlerAusgabe.setText("Bitte füllen Sie alles aus!");
        } else {
            switch (richtigeGruppe.getText()) {
                case "König":
                    einwohner = new König(name.getText(), Integer.parseInt(einkommen.getText()));
                    ausgabe.setText(richtigeGruppe.getText() + " " + name.getText() + " zahlt " + einwohner.steuer() + " Taler.");
                    name.clear();
                    einkommen.clear();
                    richtigeGruppe.clear();
                    break;
                case "Adel":
                    einwohner = new Adel(name.getText(), Integer.parseInt(einkommen.getText()));
                    ausgabe.setText(richtigeGruppe.getText() + " " + name.getText() + " zahlt " + einwohner.steuer() + " Taler.");
                    name.clear();
                    einkommen.clear();
                    richtigeGruppe.clear();
                    break;
                case "Bauer":
                    einwohner = new Bauer(name.getText(), Integer.parseInt(einkommen.getText()));
                    ausgabe.setText(richtigeGruppe.getText() + " " + name.getText() + " zahlt " + einwohner.steuer() + " Taler.");
                    name.clear();
                    einkommen.clear();
                    richtigeGruppe.clear();
                    break;
                case "Leibeigen":
                    einwohner = new Leibeigen(name.getText(), Integer.parseInt(einkommen.getText()));
                    ausgabe.setText(richtigeGruppe.getText() + " " + name.getText() + " zahlt " + einwohner.steuer() + " Taler.");
                    name.clear();
                    einkommen.clear();
                    richtigeGruppe.clear();
                    fehlerAusgabe.setText("");
                    richtigeGruppe.setBorder(Border.stroke(Color.GRAY));
                    break;
                default:
                    richtigeGruppe.clear();
                    ausgabe.setText("");
                    fehlerAusgabe.setText("König, Adel, Bauer oder Leibeigen");
                    richtigeGruppe.setBorder(Border.stroke(Color.ORANGE));
                    break;
            }

        }
    }

}
