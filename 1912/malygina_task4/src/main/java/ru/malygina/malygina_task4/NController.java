package ru.malygina.malygina_task4;

import com.sun.javafx.charts.Legend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.BreakIterator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class NController {

    @FXML
    private Label Label;

    @FXML
    private TextField NtxtField;
    private BreakIterator LTxtField;
    private BreakIterator STxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int N = Integer.parseInt(NtxtField.getText().toString());
        int k = 0;
        while ((k+1)*(k+1)<=N){
            k++;
        }
        Label.setText("Наибольшее число K= " +k);
    }
    }
