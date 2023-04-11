module com.example.reiknivel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reiknivel to javafx.fxml;
    exports com.example.reiknivel;
}
