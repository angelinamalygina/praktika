module ru.malygina.malygina_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.malygina.malygina_task4 to javafx.fxml;
    exports ru.malygina.malygina_task4;
}