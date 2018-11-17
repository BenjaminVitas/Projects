package UtilitySuite;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class DiceController {

    public Button d20;
    public Button d12;
    public Button d10;
    public Button d8;
    public Button d6;
    public Button d4;
    public Button swap;
    public Label labelOut;
    public Font numFont = new Font(100);

    private static int getNum(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random ranNum = new Random();
        return ranNum.nextInt((max - min) + 1) + min;
    }
    //Test changing of scenes
    @FXML
    private void swapClick() throws IOException {
        Stage stage;
        Parent root;
        stage=(Stage) swap.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //Dice interactions
    public void d20Click()
    {
        labelOut.setText(Integer.toString(getNum(1,20)));
        labelOut.setFont(numFont);
    }
    public void d12Click()
    {
        labelOut.setText(Integer.toString(getNum(1,12)));
        labelOut.setFont(numFont);
    }
    public void d10Click()
    {
        labelOut.setText(Integer.toString(getNum(1,10)));
        labelOut.setFont(numFont);
    }
    public void d8Click()
    {
        labelOut.setText(Integer.toString(getNum(1,8)));
        labelOut.setFont(numFont);
    }
    public void d6Click()
    {
        labelOut.setText(Integer.toString(getNum(1,6)));
        labelOut.setFont(numFont);
    }
    public void d4Click()
    {
        labelOut.setText(Integer.toString(getNum(1,4)));
        labelOut.setFont(numFont);
    }
}
