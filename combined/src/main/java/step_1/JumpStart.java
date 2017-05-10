package step_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFieldBuilder;
import javafx.scene.layout.Pane;
import javafx.scene.layout.PaneBuilder;
import javafx.scene.layout.VBoxBuilder;
import javafx.stage.Stage;

public class JumpStart extends Application {

    private TextField field;
    private Button    button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = PaneBuilder.create().children(
                VBoxBuilder.create().children(
                        field = TextFieldBuilder.create().build(),
                        button= ButtonBuilder.create()
                                     .text("click me")
                                     .build()).build()
        ).build();

        addActions();


        primaryStage.setScene(new Scene(root, 300, 100));
        primaryStage.setTitle(getClass().getName());
        primaryStage.show();
    }

    private void addActions() {
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("text field contains: "+field.getText());
            }
        });
    }

    public static void main(String[] args) {
        launch(JumpStart.class);
    }
}
