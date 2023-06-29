package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    private StringBuilder outPutExpression;

    public TextField expression;


    public void insertNumber(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        outPutExpression = new StringBuilder(expression.getText());
        outPutExpression.append(button.getText());
        expression.setText(outPutExpression.toString());
    }

    public void calculate(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        outPutExpression.append(button.getText());
        expression.setText(outPutExpression.toString());

    }

    public void clear(ActionEvent actionEvent) {
        if (outPutExpression.length() > 0)
        {
            outPutExpression.delete(0, outPutExpression.length());
            expression.setText(" ");
        }
    }

    public void back(ActionEvent actionEvent) {
        if (outPutExpression.length() > 0)
        {
            outPutExpression.delete(outPutExpression.length() - 1, outPutExpression.length());
            expression.setText(outPutExpression.toString());
        }
    }
}