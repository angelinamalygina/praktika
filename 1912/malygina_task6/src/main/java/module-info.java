module ru.malygina.malygina_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.malygina.malygina_task6 to javafx.fxml;
    exports ru.malygina.malygina_task6;
}