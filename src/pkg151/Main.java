/*
 * Project: Java 2 Programming exercise 15.1
 * Name: Lauren Smith
 * Date: 1/6/2021 
 * Description: Displays 4 cards with a refresh button to draw 4 new random cards 
 * and display them 
 */


package pkg151;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //makes a button for refresh and sets the text 
        Button btn = new Button();
        btn.setText("Refresh"); 
        //makes a pane with an HBox (4 os each card has a spot)
        HBox hbox=new HBox(4); 
        //makes a vbox
        VBox vbox=new VBox(); 
       //adds the hbox and button to the vbox
        vbox.getChildren().add(btn); 
        vbox.getChildren().add(hbox); 
        //sets button to handler which is the draw method below  
        btn.setOnAction(e -> draw(hbox)); 
        //makes a scene and sets the title 
        Scene scene = new Scene(vbox, 225, 150);
        primaryStage.setTitle("Card deck");
        //sets the scene and displays it 
        primaryStage.setScene(scene);
        primaryStage.show();  
    } 
    
    public static void main(String[] args) {
        launch(args);
    } 
    
    //draw method that takes an HBox pane to place the cards in 
    private void draw(HBox pane) 
    {
        //clears the pane of any old cards 
        pane.getChildren().clear();
        //makes a string string array to store the file names of the cards
        String[] cards=new String[4]; 
        //array of imageviews for the imageviews of cards 
        ImageView[] images=new ImageView[4];  
        //loops through the length of the card name array to randomly draw cards
        for(int i=0; i<cards.length; i++) 
        { 
            //makes a random int from 1-52 for a card number using Math.random
            int num=(int)((int) 1+(Math.random()*52)); 
            //makes the file name by adding a / before the num followed by.png after the num
            String name=("/"+num+".png");
            //stores the name in the array
            cards[i]=name; 
        }
        //loops through the length of the images array
        for(int i=0; i<cards.length; i++) 
        {
            //makes an imageview set to the image of the corresponding file name 
            //in cards array
            images[i]=new ImageView(cards[i]); 
            //sets width and height of the images so you can see them all at once
            images[i].setFitHeight(100); 
            images[i].setFitWidth(50); 
            //adds imageview to the pane 
            pane.getChildren().add(images[i]); 
        } 
    }
}


            


 


            

