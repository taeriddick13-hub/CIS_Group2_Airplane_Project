module org.example.group2_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.group2_project to javafx.fxml;
    exports org.example.group2_project;
}