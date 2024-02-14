module hi.verkefni.vidmot.kubbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.vidmot.kubbar to javafx.fxml;
    exports hi.verkefni.vidmot.kubbar;
}