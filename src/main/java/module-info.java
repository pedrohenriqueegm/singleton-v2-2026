module com.senai.singletonn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.singletonn to javafx.fxml;
    exports com.senai.singletonn;
}