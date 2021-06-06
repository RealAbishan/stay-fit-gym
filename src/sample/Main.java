package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.*;

public class Main extends Application {


    Scene sceneNavigationView ,sceneSearchView,sceneTableView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Stay Fit GYM");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();


//---------------------Initial Window ---------------------------------

        Label lblTitleMain = new Label("Stay Fit GYM");
        lblTitleMain.setLayoutY(50);
        lblTitleMain.setLayoutX(50);
        lblTitleMain.setStyle(
                        "-fx-font-family: 'Arial Narrow';" +
                        "-fx-font-size: 96px;"+
                        "-fx-text-fill: white;"

        );

        Label lblMotto = new Label("~Don't Stop Till You Drop!~");
        lblMotto.setLayoutX(100);
        lblMotto.setLayoutY(175);
        lblMotto.setWrapText(true);
        lblMotto.setMaxWidth(500);
        lblMotto.setStyle(
                        "-fx-font-family: Papyrus;" +
                        "-fx-font-size: 30px;"+
                        "-fx-text-fill: white;"

        );


        Button btnStart = new Button("Get Start");
        btnStart.setLayoutX(400);
        btnStart.setLayoutY(400);
        btnStart.setStyle(
                        " -fx-pref-width: 150px;"+
                        "-fx-background-radius: 100px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus"
        );



        Pane mainLayout = new Pane();
        mainLayout.setStyle("-fx-background-color: linear-gradient(to right bottom, #091327, #012330, #113132, #2b3d34, #44483b);");
        Scene sceneMainLayout = new Scene(mainLayout, 600, 450);
        mainLayout.getChildren().addAll(lblTitleMain,lblMotto,btnStart);
        btnStart.setOnAction(e -> primaryStage.setScene(sceneNavigationView));
        primaryStage.setScene(sceneMainLayout);




        // -----------Navigation Stage of the GYM Manager --------------------------




        //Label for header

        Label lblSearch = new Label("Panel For Gym Manger!");
        lblSearch.setLayoutY(50);
        lblSearch.setLayoutX(150);
        lblSearch.setStyle(
                        "-fx-font-family: Papyrus;" +
                        "-fx-font-size: 30px;"+
                        "-fx-text-fill: white;"

        );

        //Button for Search window

        Button btnSearchNav = new Button("Search Window");
        btnSearchNav.setLayoutY(200);
        btnSearchNav.setLayoutX(125);
        btnSearchNav.setStyle(
                        " -fx-pref-width: 150px;"+
                        "-fx-background-radius: 100px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus"
        );
        btnSearchNav.setOnAction(e ->primaryStage.setScene(sceneSearchView));




        //Button for list View window

        Button btnListView = new Button("Table View Window");
        btnListView.setLayoutX(300);
        btnListView.setLayoutY(200);
        btnListView.setStyle(
                        " -fx-pref-width: 150px;"+
                        "-fx-background-radius: 100px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus"
        );
        btnListView.setOnAction(e ->primaryStage.setScene(sceneTableView));


        //Close Button of Navigation Window

        Button btnCloseNav = new Button("Exit");
        btnCloseNav.setLayoutX(400);
        btnCloseNav.setLayoutY(400);
        btnCloseNav.setStyle(
                " -fx-pref-width: 150px;"+
                        "-fx-background-radius: 100px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus"
        );
        btnCloseNav.setOnAction(e ->primaryStage.close());



        Pane navigationLayout = new Pane();
        navigationLayout.setStyle("-fx-background-color: linear-gradient(to right bottom, #091327, #012330, #113132, #2b3d34, #44483b);");
        sceneNavigationView = new Scene(navigationLayout,600,450);
        navigationLayout.getChildren().addAll(btnListView,btnSearchNav,lblSearch,btnCloseNav);




        //-----------------Search View Stage of the GYM Manager-------------------------------

        Button btnBack = new Button("<- Go Back");
        btnBack.setLayoutX(400);
        btnBack.setLayoutY(400);
        btnBack.setStyle(
                        " -fx-pref-width: 150px;"+
                        "-fx-background-radius: 100px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus"
        );
        btnBack.setOnAction(e ->primaryStage.setScene(sceneNavigationView));


        TextField txtSearch = new TextField();
        txtSearch.setPromptText("Enter Here.....");
        txtSearch.setLayoutY(50);
        txtSearch.setLayoutX(50);
        txtSearch.setStyle(
                        "-fx-pref-width: 350px;"+
                        "-fx-pref-height: 20px;"

        );

        Button btnSearch  = new Button("Search");
        btnSearch.setLayoutY(50);
        btnSearch.setLayoutX(420);
        btnSearch.setStyle(
                        " -fx-pref-width: 125px;"+
                        "-fx-background-radius: 10px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus;"+
                        "-fx-pref-height: 10px;"
        );



        TableView searchWin =  new TableView();
        searchWin.setMinWidth(500);
        searchWin.setMaxHeight(260);
        searchWin.setLayoutX(50);
        searchWin.setLayoutY(100);


        TableColumn<String, defaultMember> noSearch = new TableColumn<>("M No");
        noSearch.setMinWidth(100);

        TableColumn<String, defaultMember> nameSearch = new TableColumn<>("Name");
        nameSearch.setMinWidth(100);

        TableColumn<String, defaultMember> dateSearch = new TableColumn<>("Date");
        dateSearch.setMinWidth(100);

        TableColumn<String, defaultMember> nicSearch = new TableColumn<>("NIC");
        nicSearch.setMinWidth(100);

        TableColumn<String, defaultMember> numberSearch = new TableColumn<>("P NO");
        numberSearch.setMinWidth(100);

        searchWin.getColumns().addAll(noSearch,nameSearch,dateSearch,nicSearch,numberSearch);





        Pane searchLayout = new Pane();
        searchLayout.setStyle("-fx-background-color: linear-gradient(to right bottom, #091327, #012330, #113132, #2b3d34, #44483b);");
        sceneSearchView = new Scene(searchLayout,600,450);
        searchLayout.getChildren().addAll(btnBack,btnSearch,txtSearch,searchWin);




        //-------------------------------Table View -----------------------------------

        Button btnBackTable = new Button("<- Go Back");
        btnBackTable.setLayoutX(400);
        btnBackTable.setLayoutY(400);
        btnBackTable.setStyle(
                        " -fx-pref-width: 150px;"+
                        "-fx-background-radius: 100px;" +
                        "-fx-text-fill:black;"+
                        "-fx-background-color: white;"+
                        "-fx-font-family: Papyrus"
        );
        btnBackTable.setOnAction(e ->primaryStage.setScene(sceneNavigationView));

// Table View

        TableView defaultMember =  new TableView();
        defaultMember.setMinWidth(500);
        defaultMember.setMaxHeight(300);
        defaultMember.setLayoutX(50);
        defaultMember.setLayoutY(50);





        TableColumn<String, defaultMember> memberNoCol = new TableColumn<>("M No");
        memberNoCol.setMinWidth(100);

        TableColumn<String, defaultMember> memberNameCol = new TableColumn<>("Name");
        memberNameCol.setMinWidth(100);

        TableColumn<String, defaultMember> memberDateCol = new TableColumn<>("Date");
        memberDateCol.setMinWidth(100);

        TableColumn<String, defaultMember> memberNicCol = new TableColumn<>("NIC");
        memberNicCol.setMinWidth(100);

        TableColumn<String, defaultMember> memberMobileCol = new TableColumn<>("P NO");
        memberMobileCol.setMinWidth(100);

        defaultMember.getColumns().addAll(memberNoCol,memberNameCol,memberDateCol,memberNicCol,memberMobileCol);




        Pane tableViewLayout = new Pane();
        tableViewLayout.getChildren().addAll(btnBackTable,defaultMember);
        tableViewLayout.setStyle("-fx-background-color: linear-gradient(to right bottom, #091327, #012330, #113132, #2b3d34, #44483b);");
        sceneTableView = new Scene(tableViewLayout, 600, 450);






    }


    public static void main(String[] args)
    {
        launch(args);
    }
}








