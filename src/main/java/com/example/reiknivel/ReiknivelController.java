package com.example.reiknivel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ReiknivelController extends Reiknivel {

    @FXML
    private TextField lausnargluggi;

    @FXML
    private Text geymatolur;

    @FXML
    void plusa(ActionEvent event) {
        vasareiknir("+");
    }

    @FXML
    void minusa(ActionEvent event) {
        vasareiknir("-");
    }

    @FXML
    void deiling(ActionEvent event) {
        vasareiknir("/");
    }

    @FXML
    void margfoldun(ActionEvent event) {
        vasareiknir("*");
    }

    @FXML
    void ytaa0(ActionEvent event) {
        setjainntolu("0");
    }

    @FXML
    void ytaa1(ActionEvent event) {
        setjainntolu("1");
    }

    @FXML
    void ytaa2(ActionEvent event) {
        setjainntolu("2");
    }

    @FXML
    void ytaa3(ActionEvent event) {
        setjainntolu("3");
    }

    @FXML
    void ytaa4(ActionEvent event) {
        setjainntolu("4");
    }

    @FXML
    void ytaa5(ActionEvent event) {
        setjainntolu("5");
    }

    @FXML
    void ytaa6(ActionEvent event) {
        setjainntolu("6");
    }

    @FXML
    void ytaa7(ActionEvent event) {
        setjainntolu("7");
    }

    @FXML
    void ytaa8(ActionEvent event) {
        setjainntolu("8");
    }

    @FXML
    void ytaa9(ActionEvent event) {
        setjainntolu("9");
    }

}
