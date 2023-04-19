module com.example.gui_koenigreich_steuerwesen {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.gui_koenigreich_steuerwesen to javafx.fxml;
    exports com.example.gui_koenigreich_steuerwesen;
}