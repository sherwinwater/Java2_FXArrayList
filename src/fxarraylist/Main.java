package fxarraylist;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private String[] names = {"Fred", "Barney", "Bob"};
    private ArrayList<String> nameList = new ArrayList<>();
    private TextArea txtDisplay = new TextArea();
    private TextField txtName = new TextField();
    private Button btnAdd = new Button("Add");
    private HBox pNames = new HBox(btnAdd, txtName);
    private BorderPane pane = new BorderPane();

    @Override
    public void start(Stage primaryStage) {
        fillNameList();
        setTextArea();

        pane.setCenter(txtDisplay);
        pane.setBottom(pNames);
        Scene scene = new Scene(pane, 300, 250);

        btnAdd.setOnAction((e) -> {
            addName();
        });

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fillNameList() {
        //take data from sequential file to fill the arrayList
        for (String sub : names) {
            nameList.add(sub);
        }
    }

    private void setTextArea() {
        //placing the ArrayList data from one object
        // nameList.get(counter)
        // above start method, set counter to 0;
        String data = new String();
        for (String s : nameList) {
            data += s + "\n";
        }
        txtDisplay.setText(data);
    }

    private void addName() {
        nameList.add(txtName.getText());
        setTextArea();
        txtName.clear();
        txtName.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*
FXArrayList
1.	JavaFX project FXArrayList
2.	Above the start method add a private
a.	String array called names with 3 different names
b.	ArrayList called nameList that holds Strings
3.	Below start, add a private method called fillNameList that 
a.	Does not take any para
b.	Does not return anything
c.	Fills nameList with the data found in names
d.	Is called in the first line of the start method.
4.	Above the start method, add a private TextArea called txtDisplay
5.	Below the start method, add a private method called setTextArea that
a.	No para
b.	No return
c.	Fills a string with all of the data found in the nameList
d.	Places that String in txtDisplay
e.	Is called in the second line of the start method
i.	(will place the ArrayList data into the appropriate textfields)
6.	Above the start method, add a private
a.	TextField called txtName
b.	Button called btnAdd with the caption “Add”
c.	HBox pName that contains btnAdd and txtName
d.	BorderPane called pane.
7.	Inside of the start method
a.	Place txtDisplay in the center of BorderPane
b.	Place pNames in the bottom
c.	Have the Scene use pane
d.	Have primaryStage use the scene object
8.	Below the start, add a private method called addName that
a.	Return none;
b.	No para
c.	Adds the name found in txtName to nameList
d.	Calls setTextArea method
e.	Clears txtName
f.	Gives txtName focus
g.	Is called when btnAdd is clicked

*/