package advanced.oop_test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController implements Initializable {
    
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;   
    
    @FXML private RadioButton phpRadioButton;    
    @FXML private RadioButton javaRadioButton;    
    @FXML private RadioButton cSharpRadioButton; 
    @FXML private RadioButton cPlusPlusRadioButton; 
    @FXML private Label radioButtonLabel;
    private ToggleGroup favLangToggleGroup;
    
    /**
     * This will update the label for the CheckBox
     */
    public void pizzaOrderButtonPushed() {
    
    String order = "Topping(s) is(are):";
    
        if(pepperoniCheckBox.isSelected())
            order += "\npepperoni";

        if(pineappleCheckBox.isSelected())
            order += "\npineapple";

        if(baconCheckBox.isSelected())
            order += "\nbacon";  

        this.pizzaOrderLabel.setText(order);
    }   
    
    /**
     * This method will update the radioButtonLabel whenever a different radio button is pushed
     */
    public void radioButtonChanged() {
    
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.javaRadioButton))
            radioButtonLabel.setText("The selected language is: Java");

        if(this.favLangToggleGroup.getSelectedToggle().equals(this.phpRadioButton))
            radioButtonLabel.setText("The selected language is: PHP");

        if(this.favLangToggleGroup.getSelectedToggle().equals(this.cSharpRadioButton))
            radioButtonLabel.setText("The selected language is: C#"); 
        
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.cPlusPlusRadioButton))
            radioButtonLabel.setText("The selected language is: C++");  
    }
    
    /**
     * This will update the label for the ChoiceBox
     */
    public void choiceBoxButtonPushed() {
        choiceBoxLabel.setText("My favourite fruit is:\n" + choiceBox.getValue().toString());
    }
    
    /**
     * This will update the comboBoxLabel when the comboBox is changed
     * @param url
     * @param rb 
     */
    public void comboBoxUpdated() {
        this.comboBoxLabel.setText("Course selected:\n" + comboBox.getValue().toString());
    }
                
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pizzaOrderLabel.setText("");
        
        //This items are for configuring the ChoiceBox example
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges", "pears", "strawberries");
        
        choiceBox.setValue("apples");
        
        //This items are for configuring the ComboBox example
        comboBox.getItems().add("COMP1030");
        comboBox.getItems().addAll("COMP1008", "COMP2003", "MGMT2010");
        comboBoxLabel.setText("");
        
        //These  items are for configuring the RadioButtons
        radioButtonLabel.setText(""); 
        favLangToggleGroup = new ToggleGroup();       
        this.cPlusPlusRadioButton.setToggleGroup(favLangToggleGroup);
        this.cSharpRadioButton.setToggleGroup(favLangToggleGroup);
        this.phpRadioButton.setToggleGroup(favLangToggleGroup);
        this.javaRadioButton.setToggleGroup(favLangToggleGroup);              
    }
}
