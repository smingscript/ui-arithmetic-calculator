package com.sming.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;

public class Back implements ActionListener {
    JTextField valueField;
    LinkedList<String> equation;

    public Back(JTextField valueField, LinkedList<String> equation){
        this.valueField=valueField;
        this.equation = equation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String temp = valueField.getText();
        if(temp.length() <= 1){
            valueField.setText("0");
            equation.removeLast();
            NumBttnAction.isLongNum = false;
        }else{
            valueField.setText(temp.substring(0, temp.length()-1));
            equation.removeLast();
        }
    }
}
