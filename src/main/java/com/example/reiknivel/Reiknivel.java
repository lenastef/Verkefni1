package com.example.reiknivel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Reiknivel {

    @FXML
    private TextField lausnargluggi;

    @FXML
    private Text geymatolur;
    private String nr1 = "";
    private String nuverandi = "";
    private String reikniadferd;


    public void vasareiknir(String reikniadferd) {
        this.reikniadferd = reikniadferd;
        nr1 = nuverandi;
        nuverandi = "";
        geymatolur.setText(nr1 + " " + reikniadferd);
    }

    @FXML
    void reikna(ActionEvent event) {
        int tala1 = Integer.parseInt(nr1);
        int tala2 = Integer.parseInt(nuverandi);


        switch (reikniadferd) {
            case "+" -> {
                int utkoma1 = tala1 + tala2;
                geymatolur.setText(nr1 + " + " + nuverandi + " = " + utkoma1);
                lausnargluggi.setText(String.valueOf(utkoma1));
            }
            case "-" -> {
                int utkoma2 = tala1 - tala2;
                geymatolur.setText(nr1 + " - " + nuverandi + " = " + utkoma2);
                lausnargluggi.setText(String.valueOf(utkoma2));
            }
            case "/" -> {
                //int utkoma3 = tala1 / tala2;
                double utkoma3 = tala1 / (double) tala2;

                geymatolur.setText(nr1 + " / " + nuverandi + " = " + utkoma3);
                lausnargluggi.setText(String.valueOf(utkoma3));
            }
            case "*" -> {
                int utkoma4 = tala1 * tala2;
                geymatolur.setText(nr1 + " * " + nuverandi + " = " + utkoma4);
                lausnargluggi.setText(String.valueOf(utkoma4));
            }
        }
    }

    @FXML
    void plus(ActionEvent event) {
        int tala1 = Integer.parseInt(nr1);
        int tala2 = Integer.parseInt(nuverandi);

        int utkoma1 = tala1 + tala2;
        geymatolur.setText(nr1 + " + " + nuverandi + " = " + utkoma1);
        lausnargluggi.setText(String.valueOf(utkoma1));
        
    }

    @FXML
    void minus(ActionEvent event) {
        int tala1 = Integer.parseInt(nr1);
        int tala2 = Integer.parseInt(nuverandi);

        int utkoma1 = tala1 - tala2;
        geymatolur.setText(nr1 + " - " + nuverandi + " = " + utkoma1);
        lausnargluggi.setText(String.valueOf(utkoma1));

    }

    //multiplication
    @FXML
    void multiplication(ActionEvent event) {
        int tala1 = Integer.parseInt(nr1);
        int tala2 = Integer.parseInt(nuverandi);

        int utkoma1 = tala1 * tala2;
        geymatolur.setText(nr1 + " * " + nuverandi + " = " + utkoma1);
        lausnargluggi.setText(String.valueOf(utkoma1));

    }

    @FXML
    void divide(ActionEvent event) {
        int tala1 = Integer.parseInt(nr1);
        int tala2 = Integer.parseInt(nuverandi);
        if (tala2 == 0) {
            lausnargluggi.setText("Division by zero!");
        } else {
            int utkoma1 = tala1 / tala2;
            geymatolur.setText(nr1 + " / " + nuverandi + " = " + utkoma1);
            lausnargluggi.setText(String.valueOf(utkoma1));
        }
    }


    public void lausn() {
        lausnargluggi.setText(nuverandi);
    }

    public void setjainntolu(String tala) {
        nuverandi += tala;
        lausn();
    }

    @FXML
    void hreinsa(ActionEvent event) {
        nuverandi = "";
        lausnargluggi.setText("");
        geymatolur.setText("");
    }


}
