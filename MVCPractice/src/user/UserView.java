/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author xwc981
 */
public class UserView extends GridPane{

    private Label idLabel= new Label("Id: ");
    private TextField idText = new TextField("") ;
    private Label nameLabel= new Label("Name: ");
    private TextField nameText = new TextField("") ;
    private Label phoneLabel= new Label("Phone: ");
    private TextField phoneText = new TextField("");
    
    private Button update = new Button("update");
    
    public UserView() 
    {
     this.setHgap(10);
     this.setVgap(10);
     this.setPadding(new Insets(0, 10, 0, 10)); 
     
     this.addRow(1, idLabel, idText);
     this.addRow(2, nameLabel, nameText);
     this.addRow(3, phoneLabel, phoneText);
     this.addRow(4, update);

    }
    
    public void updateUser(String id, String name, String phone)
    {
        getIdText().setText(id);
        getNameText().setText(name);
        getPhoneText().setText(phone);
    }
    
    public void updateUserView ()
    {
        this.getChildren().clear();
        this.addRow(1, getIdLabel(), getIdText());
        this.addRow(2, getNameLabel(), getNameText());
        this.addRow(3, getPhoneLabel(), getPhoneText()); 
        this.addRow(4, update);

    }

    /**
     * @return the idLabel
     */
    public Label getIdLabel() {
        return idLabel;
    }

    /**
     * @param idLabel the idLabel to set
     */
    public void setIdLabel(Label idLabel) {
        this.idLabel = idLabel;
    }

    /**
     * @return the idText
     */
    public TextField getIdText() {
        return idText;
    }

    /**
     * @param idText the idText to set
     */
    public void setIdText(TextField idText) {
        this.idText = idText;
    }

    /**
     * @return the nameLabel
     */
    public Label getNameLabel() {
        return nameLabel;
    }

    /**
     * @param nameLabel the nameLabel to set
     */
    public void setNameLabel(Label nameLabel) {
        this.nameLabel = nameLabel;
    }

    /**
     * @return the nameText
     */
    public TextField getNameText() {
        return nameText;
    }

    /**
     * @param nameText the nameText to set
     */
    public void setNameText(TextField nameText) {
        this.nameText = nameText;
    }

    /**
     * @return the phoneLabel
     */
    public Label getPhoneLabel() {
        return phoneLabel;
    }

    /**
     * @param phoneLabel the phoneLabel to set
     */
    public void setPhoneLabel(Label phoneLabel) {
        this.phoneLabel = phoneLabel;
    }

    /**
     * @return the phoneText
     */
    public TextField getPhoneText() {
        return phoneText;
    }

    /**
     * @param phoneText the phoneText to set
     */
    public void setPhoneText(TextField phoneText) {
        this.phoneText = phoneText;
    }

    /**
     * @return the update
     */
    public Button getUpdateButton() {
        return update;
    }

    /**
     * @param update the update to set
     */
    public void setUpdate(Button update) {
        this.update = update;
    }
    
    
    
    
}
