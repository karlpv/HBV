package hi.verkefni.vidmot.kubbar;

import hi.verkefni.vinnsla.Kubbur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class KubburController {
    @FXML
    private TextField fxTala;

    @FXML
    private Label stigLabel;
    @FXML
    private GridPane gridPane;
    private Kubbur kubbur = new Kubbur();

    @FXML
    private void initialize() {
        stillaleikBord();
    }
    @FXML
    private void onNyTala(ActionEvent event) {
        System.out.println("Input: " + fxTala.getText());
        int tala = Integer.parseInt(fxTala.getText());
        kubbur.setValinTala(tala);
    }

    @FXML
    private void onSetjaStykki(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        Integer rowIndex = GridPane.getRowIndex(clickedButton);
        Integer columnIndex = GridPane.getColumnIndex(clickedButton);
        int row = (rowIndex != null) ? rowIndex : 0;
        int column = (columnIndex != null) ? columnIndex : 0;

        if (kubbur.athugaGisk(row, column)) {
            clickedButton.setDisable(true);
            clickedButton.setText("");
        }
        uppfaeraStig();

        System.out.println("Row" + rowIndex + " column " + columnIndex);
    }

    private void stillaleikBord() {
        kubbur.setupBoard();
        uppfaeraStig();
    }

    private void uppfaeraStig() {
        stigLabel.setText(" " + kubbur.getStig());
    }
}