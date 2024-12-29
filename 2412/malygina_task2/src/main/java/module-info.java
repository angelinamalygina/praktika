module ru.malygina.malygina_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.malygina.malygina_task2 to javafx.fxml;
    exports ru.malygina.malygina_task2;
    exports ru.malygina.malygina_task2.controller;
    opens ru.malygina.malygina_task2.controller to javafx.fxml;
}