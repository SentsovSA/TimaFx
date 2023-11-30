module com.example.timafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.timafx to javafx.fxml;
    exports com.example.timafx;
}