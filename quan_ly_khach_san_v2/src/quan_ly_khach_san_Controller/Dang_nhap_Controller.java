/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;

import quan_ly_khach_san_view.Quan_ly_khach_san;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author thaibinh
 */
public class Dang_nhap_Controller implements Initializable{
    
    @FXML
    private Label label;
    private Stage stage;
    
   
    
    
    
    @FXML
    private void dangNhap_Click(ActionEvent event) throws IOException, Exception {
        
       /*StackPane root= new StackPane();
       root = FXMLLoader.load(getClass().getResource("Quan_ly_nhan_vien.fxml"));
       //Parent root = FXMLLoader.load(getClass().getResource("Quan_ly_nhan_vien.fxml"));
       Scene scene = new Scene(root);
       
        Stage stage=new Stage();
       stage.setTitle("Hệ thống quản lý khách sạn Pari Deli");
        
        stage.setScene(scene);
       
        //newWindow.show();
        //stage.setScene(scene);
        stage.show();*/
        /*Quan_ly_nhan_vien_Controller a=new Quan_ly_nhan_vien_Controller();
        AnchorPane begin=new AnchorPane();
        begin=a.Quan_ly_nhan_vien;
        StackPane root=new StackPane();
        root.getChildren().add(begin);
        Scene scene=new Scene(root);
        Stage stage=new Stage();*/
        //stage.show();
       // stage = (Stage) (a.Quan_ly_nhan_vien).getScene().getWindow();
        Quan_ly_khach_san.setPane(1);

    }
    @FXML
    private void thoat_Click(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    
    
    
}
