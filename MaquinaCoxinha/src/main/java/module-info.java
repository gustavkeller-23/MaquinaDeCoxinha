module com.mycompany.maquinacoxinha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.maquinacoxinha to javafx.fxml;
    exports com.mycompany.maquinacoxinha;
}
