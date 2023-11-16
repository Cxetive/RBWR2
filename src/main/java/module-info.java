module com.example.rbwr_multi_tool {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.rbwr_multi_tool to javafx.fxml;
    exports com.example.rbwr_multi_tool;
}