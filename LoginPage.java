import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;


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
                    Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                    Stage stage = new Stage();
                    stage.setTitle("Deliverables");
                    stage.setScene(scene);
                    Screen screen = Screen.getPrimary();
                    Rectangle2D bounds = screen.getVisualBounds();
                    stage.setX(bounds.getMinX());
                    stage.setY(bounds.getMinY());
                    stage.setWidth(bounds.getWidth());
                    stage.setHeight(bounds.getHeight());
                    stage.show();

                    //adding deliverable table headers
                    TableView de1iverableTable = (TableView)scene.lookup("#DeliverablesTable");
                    de1iverableTable.setEditable(true);
                    TableColumn<deliverableObject, String> id = new TableColumn<deliverableObject, String>("Title");
                    id.setMinWidth(350);
                    id.setCellValueFactory(new PropertyValueFactory<deliverableObject, String>("id"));
                    TableColumn<deliverableObject, String> name = new TableColumn<deliverableObject, String>("Requirements");
                    name.setMinWidth(350);
                    name.setCellValueFactory(new PropertyValueFactory<deliverableObject, String>("name"));
                    TableColumn<deliverableObject, String> duedate = new TableColumn<deliverableObject, String>("Due Date");
                    duedate.setMinWidth(350);
                    duedate.setCellValueFactory(new PropertyValueFactory<deliverableObject, String>("duedate"));
                    TableColumn<deliverableObject, String> description = new TableColumn<deliverableObject, String>("Description");
                    description.setMinWidth(350);
                    description.setCellValueFactory(new PropertyValueFactory<deliverableObject, String>("description"));
                    de1iverableTable.getColumns().addAll(id, name, duedate, description);

                    //Perform Actions for each xml element
                    Button button1 = (Button) scene.lookup("#home_button");
                    button1.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent f) {
                            start(stage);
                        }
                    });
                    Button button2 = (Button) scene.lookup("#submit_button");
                    button2.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent g) {
                            //submit data to table
                            TextField dID = (TextField) scene.lookup("#Title_field");
                            String deliverableID = dID.getText();
                            dID.clear();

                            TextArea dName = (TextArea) scene.lookup("#Requirements_input");
                            String deliverableName = dName.getText();
                            dName.clear();

                            DatePicker dDD = (DatePicker) scene.lookup("#date_Assigned");
                            LocalDate deliverableDD = dDD.getValue();

                            TextArea dDescript = (TextArea) scene.lookup("#Description_input");
                            String deliverableDescription = dDescript.getText();
                            dDescript.clear();


                            // gather data from fields
                            de1iverableTable.getItems().add(new deliverableObject(deliverableID, deliverableName, deliverableDD, deliverableDescription));
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
                try {
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Tasks.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 1820, 920);
                    Stage stage = new Stage();
                    stage.setTitle("Tasks");
                    stage.setScene(scene);
                    stage.show();

                    TableView tasksTable = (TableView) scene.lookup("#TasksTable");
                    tasksTable.setEditable(true);

                    TableColumn<tasksObject, String> ttitle = new TableColumn<tasksObject, String>("Title");
                    ttitle.setMinWidth(200);
                    ttitle.setCellValueFactory(new PropertyValueFactory<tasksObject, String>("ttitle"));

                    TableColumn<tasksObject, LocalDate> tdueDate = new TableColumn<tasksObject, LocalDate>("Due Date");
                    tdueDate.setMinWidth(200);
                    tdueDate.setCellValueFactory(new PropertyValueFactory<tasksObject, LocalDate>("tdueDate"));

                    TableColumn<tasksObject, LocalDate> tcompletionDate = new TableColumn<tasksObject, LocalDate>("Completion Date");
                    tcompletionDate.setMinWidth(200);
                    tcompletionDate.setCellValueFactory(new PropertyValueFactory<tasksObject, LocalDate>("tcompletionDate"));

                    TableColumn<tasksObject, String> tassignedResource = new TableColumn<tasksObject, String>("Assigned Resource");
                    tassignedResource.setMinWidth(200);
                    tassignedResource.setCellValueFactory(new PropertyValueFactory<tasksObject, String>("tassignedResource"));

                    TableColumn<tasksObject, String> tdescription= new TableColumn<tasksObject, String>("Description");
                    tdescription.setMinWidth(200);
                    tdescription.setCellValueFactory(new PropertyValueFactory<tasksObject, String>("tdescription"));

                    TableColumn<tasksObject, String> tpriority = new TableColumn<tasksObject, String>("Priority");
                    tpriority.setMinWidth(200);
                    tpriority.setCellValueFactory(new PropertyValueFactory<tasksObject, String>("tpriority"));

                    tasksTable.getColumns().addAll(ttitle, tdueDate, tcompletionDate, tassignedResource, tdescription, tpriority);



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
                            TextField ttitle = (TextField) scene.lookup("#Title_field");
                            String ttitlestr = ttitle.getText();
                            ttitle.clear();

                            DatePicker tdateAssigned = (DatePicker) scene.lookup("#dateAssigned");
                            LocalDate tdateAssignedstr = tdateAssigned.getValue();

                            DatePicker tdateCompleted= (DatePicker) scene.lookup("#dateCompleted");
                            LocalDate tdateCompletedstr = tdateCompleted.getValue();

                            TextArea tdescription = (TextArea) scene.lookup("#Description_input");
                            String tdescriptionstr = tdescription.getText();
                            tdescription.clear();

                            ComboBox tpriority = (ComboBox) scene.lookup("#PriorityBar");
                            String tprioritystr = (String)tpriority.getValue();

                            TextField tresource = (TextField) scene.lookup("#Resources_field");
                            String tresourcestr = tresource.getText();
                            tresource.clear();



                            tasksTable.getItems().add(new tasksObject(ttitlestr, tdateAssignedstr, tdateCompletedstr, tresourcestr, tprioritystr, tdescriptionstr));

                        }
                    });

                }
                catch(IOException f) {
                    System.out.println("failure");
                }
            }
        });

        resources.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                try {
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Resources.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 1820, 920);
                    Stage stage = new Stage();
                    stage.setTitle("Resources");
                    stage.setScene(scene);
                    stage.show();

                    TableView rTable = (TableView) scene.lookup("#ResourcesTable");
                    rTable.setEditable(true);

                    TableColumn<resourceObject, String> rtitle = new TableColumn<resourceObject, String>("Title");
                    rtitle.setMinWidth(250);
                    rtitle.setCellValueFactory(new PropertyValueFactory<resourceObject, String>("rtitle"));

                    TableColumn<resourceObject, LocalDate> rdateRaised = new TableColumn<resourceObject, LocalDate>("Date Raised");
                    rdateRaised.setMinWidth(250);
                    rdateRaised.setCellValueFactory(new PropertyValueFactory<resourceObject, LocalDate>("rdateRaised"));

                    TableColumn<resourceObject, LocalDate> rdateAssigned = new TableColumn<resourceObject, LocalDate>("Date Assigned");
                    rdateAssigned.setMinWidth(250);
                    rdateAssigned.setCellValueFactory(new PropertyValueFactory<resourceObject, LocalDate>("rdateAssigned"));

                    TableColumn<resourceObject, String> rpriority = new TableColumn<resourceObject, String>("Priority");
                    rpriority.setMinWidth(250);
                    rpriority.setCellValueFactory(new PropertyValueFactory<resourceObject, String>("rpriority"));

                    TableColumn<resourceObject, String> rseverity = new TableColumn<resourceObject, String>("Severity");
                    rseverity.setMinWidth(250);
                    rseverity.setCellValueFactory(new PropertyValueFactory<resourceObject, String>("rseverity"));

                    TableColumn<resourceObject, String> rpay = new TableColumn<resourceObject, String>("Pay Rate");
                    rpay.setMinWidth(250);
                    rpay.setCellValueFactory(new PropertyValueFactory<resourceObject, String>("rpay"));


                    TableColumn<resourceObject, String> rskill = new TableColumn<resourceObject, String>("Skillset");
                    rskill.setMinWidth(250);
                    rskill.setCellValueFactory(new PropertyValueFactory<resourceObject, String>("rskill"));

                    rTable.getColumns().addAll(rtitle, rdateRaised, rdateAssigned, rpriority, rseverity, rpay, rskill);



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

                            TextField rtitle = (TextField) scene.lookup("#Title_field");
                            String rtitlestr = rtitle.getText();
                            rtitle.clear();

                            DatePicker rdateRaised = (DatePicker) scene.lookup("#date_Raised");
                            LocalDate rdateRaisesdstr = rdateRaised.getValue();

                            DatePicker rdateAssigned = (DatePicker) scene.lookup("#date_Assigned");
                            LocalDate rdateAssignedstr = rdateAssigned.getValue();

                            ComboBox rpriority = (ComboBox) scene.lookup("#PriorityBar");
                            String rprioritystr = (String)rpriority.getValue();

                            ComboBox rseverity = (ComboBox) scene.lookup("#SeverityBar");
                            String rseveritystr = (String)rseverity.getValue();

                            TextField rpay = (TextField) scene.lookup("#PayRate_input");
                            String rpaystr = rpay.getText();
                            rpay.clear();

                            TextArea rskill = (TextArea) scene.lookup("#SkillSet_input");
                            String rskillstr = rskill.getText();
                            rskill.clear();

                            rTable.getItems().add(new resourceObject(rtitlestr, rdateAssignedstr, rdateAssignedstr, rprioritystr,
                                    rseveritystr, rpaystr, rskillstr));



                        }
                    });

                }
                catch(IOException f) {
                    System.out.println("failure");
                }
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


                        TableView headTable = (TableView) scene.lookup("#infoTable");
                        headTable.setEditable(true);

                        TableColumn<actionItemObject, String> aititle = new TableColumn<actionItemObject, String>("Name");
                        aititle.setMinWidth(200);
                        aititle.setCellValueFactory(new PropertyValueFactory<actionItemObject, String>("aititle"));

                        TableColumn<actionItemObject, LocalDate> aidateCreated = new TableColumn<actionItemObject, LocalDate>("Date Created");
                        aidateCreated.setMinWidth(200);
                        aidateCreated.setCellValueFactory(new PropertyValueFactory<actionItemObject, LocalDate>("aidateCreated"));

                        TableColumn<actionItemObject, LocalDate> aidueDate = new TableColumn<actionItemObject, LocalDate>("Due Date");
                        aidueDate.setMinWidth(200);
                        aidueDate.setCellValueFactory(new PropertyValueFactory<actionItemObject, LocalDate>("aidueDate"));

                        TableColumn<actionItemObject, String> aidescription = new TableColumn<actionItemObject, String>("Resources");
                        aidescription.setMinWidth(200);
                        aidescription.setCellValueFactory(new PropertyValueFactory<actionItemObject, String>("airesources"));

                        TableColumn<actionItemObject, String> aiId = new TableColumn<actionItemObject, String>("ID");
                        aiId.setMinWidth(200);
                        aiId.setCellValueFactory(new PropertyValueFactory<actionItemObject, String>("aidescription"));

                        TableColumn<actionItemObject, LocalDate> aidateFinished = new TableColumn<actionItemObject, LocalDate>("Date Finished");
                        aidateFinished.setMinWidth(200);
                        aidateFinished.setCellValueFactory(new PropertyValueFactory<actionItemObject, LocalDate>("aidateFinished"));

                        headTable.getColumns().addAll(aititle, aidateCreated, aidueDate, aidescription, aiId, aidateFinished);

                        Button submitButton = (Button) scene.lookup("#submit_button");
                        submitButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                //enter submit form here
                                TextField aiName = (TextField) scene.lookup("#Name_field");
                                String aiNamestr = aiName.getText();
                                aiName.clear();

                                DatePicker aidueDate = (DatePicker) scene.lookup("#Due_date");
                                LocalDate aiduedatestr = aidueDate.getValue();

                                TextField aiId = (TextField) scene.lookup("#ID_input");
                                String aiIdstr = aiId.getText();
                                aiId.clear();

                                TextField airesources = (TextField) scene.lookup("#Resources");
                                String airesourcesstr = airesources.getText();
                                airesources.clear();

                                DatePicker aidatecreated = (DatePicker) scene.lookup("#Date_created");
                                LocalDate aidatecreatedstr = aidatecreated.getValue();


                                DatePicker aidatefinished = (DatePicker) scene.lookup("#Date_finished");
                                LocalDate aidatefinishedstr = aidatefinished.getValue();




                                headTable.getItems().add(new actionItemObject(aiNamestr, aidatecreatedstr, aiduedatestr, airesourcesstr, aiIdstr, aidatefinishedstr));



                            }
                        });


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



                    TableView issuesTable = (TableView) scene.lookup("#issueTable");
                    issuesTable.setEditable(true);

                    TableColumn<issuesObject, String> ititle = new TableColumn<issuesObject, String>("Title");
                    ititle.setMinWidth(200);
                    ititle.setCellValueFactory(new PropertyValueFactory<issuesObject, String>("ititle"));

                    TableColumn<issuesObject, LocalDate> idateRaised = new TableColumn<issuesObject, LocalDate>("Date Raised");
                    idateRaised.setMinWidth(200);
                    idateRaised.setCellValueFactory(new PropertyValueFactory<issuesObject, LocalDate>("idateRaised"));

                    TableColumn<issuesObject, LocalDate> idateAssigned = new TableColumn<issuesObject, LocalDate>("Due Assigned");
                    idateAssigned.setMinWidth(200);
                    idateAssigned.setCellValueFactory(new PropertyValueFactory<issuesObject, LocalDate>("idateAssigned"));

                    TableColumn<issuesObject, MenuItem> iseverity = new TableColumn<issuesObject, MenuItem>("Severity");
                    iseverity.setMinWidth(200);
                    iseverity.setCellValueFactory(new PropertyValueFactory<issuesObject, MenuItem>("iseverity"));

                    TableColumn<issuesObject, MenuItem> ipriority = new TableColumn<issuesObject, MenuItem>("Priority");
                    ipriority.setMinWidth(200);
                    ipriority.setCellValueFactory(new PropertyValueFactory<issuesObject, MenuItem>("ipriority"));

                    TableColumn<issuesObject, String> idescription = new TableColumn<issuesObject, String>("Description");
                    idescription.setMinWidth(200);
                    idescription.setCellValueFactory(new PropertyValueFactory<issuesObject, String>("idescription"));

                    TableColumn<issuesObject, String> iraisedBy = new TableColumn<issuesObject, String>("Description");
                    iraisedBy.setMinWidth(200);
                    iraisedBy.setCellValueFactory(new PropertyValueFactory<issuesObject, String>("iraisedBy"));

                   issuesTable.getColumns().addAll(ititle, idateRaised, idateAssigned, iseverity, ipriority, idescription,
                           iraisedBy);





                    Button submitButton = (Button) scene.lookup("#submit_button");
                    submitButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {

                            //enter submit form here
                            TextField iTitle = (TextField) scene.lookup("#Title_field");
                            String iTitleStr = iTitle.getText();
                            iTitle.clear();

                            DatePicker idateRaised = (DatePicker) scene.lookup("#date_Raised");
                            LocalDate idateRaisedStr = idateRaised.getValue();

                            DatePicker idateAssigned = (DatePicker) scene.lookup("#dateAssigned");
                            LocalDate idateAssignedStr = idateAssigned.getValue();

                            ComboBox ipriority = (ComboBox) scene.lookup("#PriorityBar");
                            String iprioritystr = (String)ipriority.getValue();

                            ComboBox iseverity = (ComboBox) scene.lookup("#SeverityBar");
                            String iseveritystr = (String) iseverity.getValue();

                            TextArea idescription = (TextArea) scene.lookup("#Description_input");
                            String idescriptionStr =  idescription.getText();
                            idescription.clear();


                            TextField iraisedBy = (TextField) scene.lookup("#RaisedBy_field");
                            String iraisedBystr = iraisedBy.getText();
                            iraisedBy.clear();



                            issuesTable.getItems().add(new issuesObject(iTitleStr, idateRaisedStr, idateAssignedStr, iseveritystr, iprioritystr,
                                    idescriptionStr, iraisedBystr));



                        }});




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
                try {
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Decisions.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 1820, 920);
                    Stage stage = new Stage();
                    stage.setTitle("Decisions");
                    stage.setScene(scene);
                    stage.show();

                    TableView decisionsTable = (TableView) scene.lookup("#decisionsTable");
                    decisionsTable.setEditable(true);

                    TableColumn<decisionsObject, String> dtitle = new TableColumn<decisionsObject, String>("Title");
                    dtitle.setMinWidth(200);
                    dtitle.setCellValueFactory(new PropertyValueFactory<decisionsObject, String>("dtitle"));

                    TableColumn<decisionsObject, LocalDate> ddateraised = new TableColumn<decisionsObject, LocalDate>("Date Raised");
                    ddateraised.setMinWidth(200);
                    ddateraised.setCellValueFactory(new PropertyValueFactory<decisionsObject, LocalDate>("ddateraised"));

                    TableColumn<decisionsObject, LocalDate> ddateassigned = new TableColumn<decisionsObject, LocalDate>("Date Assigned");
                    ddateassigned.setMinWidth(200);
                    ddateassigned.setCellValueFactory(new PropertyValueFactory<decisionsObject, LocalDate>("ddateassigned"));

                    TableColumn<decisionsObject, String> dseverity = new TableColumn<decisionsObject, String>("Severity");
                    dseverity.setMinWidth(200);
                    dseverity.setCellValueFactory(new PropertyValueFactory<decisionsObject, String>("dseverity"));

                    TableColumn<decisionsObject, String> dpriority = new TableColumn<decisionsObject, String>("Priority");
                    dpriority.setMinWidth(200);
                    dpriority.setCellValueFactory(new PropertyValueFactory<decisionsObject, String>("dpriority"));

                    TableColumn<decisionsObject, String> ddescription = new TableColumn<decisionsObject, String>("Description");
                    ddescription.setMinWidth(200);
                    ddescription.setCellValueFactory(new PropertyValueFactory<decisionsObject, String>("dpriority"));

                    decisionsTable.getColumns().addAll(dtitle, ddateraised, ddateassigned, dseverity, dpriority, ddescription);


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
                            TextField dTitle = (TextField) scene.lookup("#Title_field");
                            String dTitleStr = dTitle.getText();
                            dTitle.clear();

                            DatePicker ddateRaised = (DatePicker) scene.lookup("#dateRaised");
                            LocalDate ddateRaisedStr = ddateRaised.getValue();

                            DatePicker ddateAssigned = (DatePicker) scene.lookup("#dateAssigned");
                            LocalDate ddateAssignedStr = ddateAssigned.getValue();

                            ComboBox dseverity = (ComboBox) scene.lookup("#SeverityBar");
                            String dseveritystr = (String)dseverity.getValue();

                            ComboBox dpriority = (ComboBox) scene.lookup("#PriorityBar");
                            String dprioritystr = (String)dpriority.getValue();

                            TextArea ddescription = (TextArea) scene.lookup("#Description_input");
                            String ddescriptionstr = ddescription.getText();
                            ddescription.clear();

                            decisionsTable.getItems().add(new decisionsObject(dTitleStr, ddateRaisedStr, ddateAssignedStr, dseveritystr, dprioritystr, ddescriptionstr));

                        }
                    });



                }
                catch(IOException f) {
                    System.out.println("failure");
                }
            }
        });

    }
    public static void main(String args[])
    {
        launch(args);
    }
}