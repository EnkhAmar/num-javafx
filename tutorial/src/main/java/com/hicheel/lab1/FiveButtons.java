package com.hicheel.lab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class FiveButtons extends Application {
    public FiveButtons() {}

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();

        root.setSpacing(10);
        root.setPadding(new Insets(10, 15, 10, 15));

        HBox row1 = new HBox();
        row1.setSpacing(10);
        Button button1 = new Button("Button one");
        Button button2 = new Button("Button two");
        buttonStyler(button1);
        buttonStyler(button2);
        row1.getChildren().addAll(button1, button2);

        HBox row2 = new HBox();
        row2.setSpacing(10);
        Button button3 = new Button("Button three");
        Button button4 = new Button("Button four");
        buttonStyler(button3);
        buttonStyler(button4);
        row2.getChildren().addAll(button3, button4);

        HBox row3 = new HBox();
        Button button5 = new Button("Button five");
        buttonStyler(button5);
        row3.getChildren().add(button5);

        root.getChildren().add(row1);
        root.getChildren().add(row2);
        root.getChildren().add(row3);

        Scene scene = new Scene(root, 240, 120);

        stage.setTitle("pythonw");
        stage.setScene(scene);
        stage.show();
    }

    public void buttonStyler(Button btn) {
        HBox.setHgrow(btn, Priority.ALWAYS);
        btn.setMaxWidth(Double.MAX_VALUE);
    }

    public static void main(String[] args) {
        launch();
    }
}
