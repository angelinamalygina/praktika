module ru.ugnenko.wadqrq {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.wadqrq to javafx.fxml;
    exports ru.ugnenko.wadqrq;
}