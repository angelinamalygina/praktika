module ru.malygina.malygina_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.malygina.malygina_task1 to javafx.fxml;
    exports ru.malygina.malygina_task1;
    exports ru.malygina.malygina_task1.controller;
    opens ru.malygina.malygina_task1.controller to javafx.fxml;
}