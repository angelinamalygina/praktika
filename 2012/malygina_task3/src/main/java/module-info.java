module ru.malygina.malygina_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.malygina.malygina_task3 to javafx.fxml;
    exports ru.malygina.malygina_task3;
}