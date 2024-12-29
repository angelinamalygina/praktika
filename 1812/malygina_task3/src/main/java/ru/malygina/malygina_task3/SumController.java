package ru.malygina.malygina_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField num1Input;

    @FXML
    private TextField num2Input;

    @FXML
    private TextField num3Input;

    @FXML
    private TextField num4Input;

    @FXML
    private Label resultLabel;

    @FXML
    void checkButton(ActionEvent event) {
        try{
            int num1 = Integer.parseInt(num1Input.getText());
            int num2 = Integer.parseInt(num2Input.getText());
            int num3 = Integer.parseInt(num3Input.getText());
            int num4 = Integer.parseInt(num4Input.getText());

            if (num1 == num2 && num1 == num3){
                if(num1 != num4){
                    resultLabel.setText("Номер 4");
                } else{
                    resultLabel.setText("Некорректный ввод");
                }
            } else if(num1 == num2 && num1 == num4){
                if(num1 != num3){
                    resultLabel.setText("Номер 3");
                } else{
                    resultLabel.setText("Некорректный ввод");
                }
            } else if(num1 == num3 && num1 == num4){
                if(num1 != num2){
                    resultLabel.setText("Номер 2");
                } else{
                    resultLabel.setText("Некорректный ввод");
                }
            } else if (num2 == num3 && num2 == num4){
                if(num2 != num1){
                    resultLabel.setText("Номер 1");
                } else{
                    resultLabel.setText("Некорректный ввод");
                }
            }else{
                resultLabel.setText("Некорректный ввод");
            }


        } catch(NumberFormatException e){
            resultLabel.setText("Некорректный ввод");
        }
    }

}
