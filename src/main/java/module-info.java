module org.example.group2_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.group2_project to javafx.fxml;
    exports org.example.group2_project;
}