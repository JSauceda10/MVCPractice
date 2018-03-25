/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author xwc981
 */
public class UserController {
    UserModel userModel; 
    UserView userView;

    public UserController(UserModel userModel, UserView userView) 
    {
        this.userModel = userModel;
        this.userView = userView;
        setupHandlers();
    }
    
    public void setupHandlers()
    {
       userView.getUpdateButton().setOnAction(new EventHandler<ActionEvent> ()
       {
           @Override
           public void handle(ActionEvent event) {
           //
           //view gave me id
           String id = getstudentId();
           
           //id gave me data
           String name  = getstudentname();
           String phone = getstudentphone();
           
           //data updates the view
            userView.getNameText().setText(name);
            userView.getPhoneText().setText(phone);
            //
            userView.updateUserView();
           }
       });
        
    }
    
    public String getstudentId()
    {
        
       String id = userView.getIdText().getText();
       return id;
    }
    
    public String getstudentname()
    {
       String name = userModel.getFullName();
       return name;
    }
    
    public String getstudentphone()
    {
       String phone = userModel.getPhone();
       return phone;
    }
    
    
    
}
