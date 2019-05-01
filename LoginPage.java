import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;


public class LoginPage extends Application {
    @Override
    public void start(Stage stage) {


        //Creating Buttons
        Button deliverables = new Button("Deliverables");
        Button tasks = new Button("Tasks");
        Button resources = new Button("Resources");
        Button actionitems = new Button("Action Items");
        Button issues = new Button("Issues");
        Button num6 = new Button("Decisions");


        //button sizes

        deliverables.setMinSize(140, 50);
        tasks.setMinSize(140, 50);
        resources.setMinSize(140, 50);
        actionitems.setMinSize(140, 50);
        issues.setMinSize(140, 50);
        num6.setMinSize(140, 50);


        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(1820, 920);
        gridPane.setMaxSize(1820, 920);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 50, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.TOP_LEFT);

        //Arranging all the nodes in the grid
        gridPane.add(deliverables, 0, 0);
        gridPane.add(tasks, 0, 1);
        gridPane.add(resources, 0, 2);
        gridPane.add(actionitems, 0, 3);
        gridPane.add(issues, 0, 4);
        gridPane.add(num6, 0, 5)
        ;

        //Styling nodes
        deliverables.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        tasks.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        resources.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        actionitems.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        issues.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        num6.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        deliverables.setStyle("-fx-font: normal bold 20px 'serif' ");
        tasks.setStyle("-fx-font: normal bold 20px 'serif' ");
        resources.setStyle("-fx-font: normal bold 20px 'serif' ");
        actionitems.setStyle("-fx-font: normal bold 20px 'serif' ");
        issues.setStyle("-fx-font: normal bold 20px 'serif' ");
        num6.setStyle("-fx-font: normal bold 20px 'serif' ");

        gridPane.setStyle("-fx-background-color: SILVER;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Project Management System");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

        deliverables.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                try {
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("deliverables.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 1820, 920);
                    Stage stage = new Stage();
                    stage.setTitle("Deliverables");
                    stage.setScene(scene);
                    stage.show();

                 Button button = (Button) scene.lookup("#button");
                 button.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                         start(stage);
                     }
                 });

                }
                catch(IOException f) {
                    System.out.println("failure");
                }



                // open new page for deliverables
            }
        });

        tasks.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                // open new page for tasks
            }
        });

        resources.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                // open new page for resources
            }
        });

        //Code for Action Items Page
        actionitems.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    try {
                        stage.close();
                        FXMLLoader fxmlLoader = new FXMLLoader();
                        fxmlLoader.setLocation(getClass().getResource("actionItems.fxml"));
                        Scene scene = new Scene(fxmlLoader.load(), 1820, 920);
                        Stage stage = new Stage();
                        stage.setTitle("Action Items");
                        stage.setScene(scene);
                        stage.show();


                        Button homeButton = (Button) scene.lookup("#home_button");
                        homeButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                start(stage);
                            }
                        });


                        Button submitButton = (Button) scene.lookup("#submit_button");
                        submitButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                //enter submit form here

                            }
                        });

                        TableView headTable = (TableView) scene.lookup("#infoTable");


                    }
                    catch(IOException f) {
                        System.out.println("failure");
                    }



                    // open new page for Action Items
                }
            });



        issues.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                try {
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Issues.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 1820, 920);
                    Stage stage = new Stage();
                    stage.setTitle("Issues");
                    stage.setScene(scene);
                    stage.show();


                    Button homeButton = (Button) scene.lookup("#home_button");
                    homeButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            start(stage);
                        }
                    });
                }
                catch(IOException f) {
                    System.out.println("failure");
                }
            }
        });


        num6.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                // open new page for Decisions
            }
        });

    }
    public static void main(String args[])
    {
        launch(args);
    }
}