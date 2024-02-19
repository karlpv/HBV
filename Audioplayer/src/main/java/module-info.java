module gyat.is.audioplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens gyat.is.audioplayer to javafx.fxml;
    exports gyat.is.audioplayer;
}