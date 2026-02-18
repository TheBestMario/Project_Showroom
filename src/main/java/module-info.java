module com.example.project_chatshowroom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_chatshowroom to javafx.fxml;
    exports com.example.project_chatshowroom;
}