module com.example.project_chatshowroom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project_chatshowroom to javafx.fxml;
    exports com.project_chatshowroom;
    exports com.project_chatshowroom.chattools.ui;
    opens com.project_chatshowroom.chattools.ui to javafx.fxml;
}