module ru.malygina.malygina_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.malygina.malygina_task5 to javafx.fxml;
    exports ru.malygina.malygina_task5;
}