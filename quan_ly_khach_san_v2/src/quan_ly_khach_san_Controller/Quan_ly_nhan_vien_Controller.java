/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;


//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.image.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author thaibinh
 */
public class Quan_ly_nhan_vien_Controller implements Initializable{
   
    @FXML
    private Pane trangChu_pane;
    @FXML
    private Pane thongTinNhanVien_pane;
    @FXML
    private Pane luongThuong_pane;
    @FXML
    private Pane lichLamViec_pane;
    @FXML
    private Stage stage;
    @FXML
    private Button trangThietBi_btn;
    @FXML
    private Button taoHoaDon_btn;
    @FXML
    private Label gioLam_lbl;
    
    @FXML 
    private ImageView anhPhong_ImageView;
    @FXML private ChoiceBox loaiPhong_ChoiceBox;
    @FXML private ChoiceBox trangThai_ChoiceBox;
    @FXML private ChoiceBox tang_ChoiceBox;
    @FXML private ChoiceBox phong_ChoiceBox;
    @FXML private Label soPhongTrong_Label;
    @FXML private Pane chon_Pane;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       // label.setText("Hello World!");
    }
    @FXML
    private void trangChu_Click(ActionEvent event) {
        luongThuong_pane.setVisible(false);
        thongTinNhanVien_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        trangChu_pane.setVisible(true);
       
        
    }
    @FXML
    private void thongTinNhanVien_Click(ActionEvent event) {
        trangChu_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        lichLamViec_pane.setVisible(false);
        thongTinNhanVien_pane.setVisible(true);
    }
    @FXML
    private void luongThuong_Click(ActionEvent event) {
       
        thongTinNhanVien_pane.setVisible(false);
        trangChu_pane.setVisible(false);
        luongThuong_pane.setVisible(true);
        lichLamViec_pane.setVisible(false);
    }
    @FXML
    private void lichLamViec_Click(ActionEvent event) {
       
        thongTinNhanVien_pane.setVisible(false);
        trangChu_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        lichLamViec_pane.setVisible(true);
    }
    @FXML
    private void dangXuat_Click(ActionEvent event) throws Exception {
       
      /*  File file = new File("image/phong3.jpg");
       trangChu_pane.setVisible(true);
       System.out.println(file.toURI().toString());
        Image image=new Image(file.toURI().toString());
        System.out.println(image.getWidth());
        anhPhong_ImageView.setImage(image);
        anhPhong_ImageView.setVisible(true);*/
        quan_ly_khach_san_view.Quan_ly_khach_san.setPane(0);
    }
    @FXML
    private void loaiPhong_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void trangThai_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void tang_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void phong_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void trangThietBi_Click(ActionEvent event) throws Exception {
       
//               StackPane secondaryLayout = new StackPane();
//                AnchorPane a=new AnchorPane();
//                a.getChildren().add((Pane)FXMLLoader.load(getClass().getResource("Trang_thiet_bi.fxml")));
//                secondaryLayout.getChildren().add(a);
//              //  secondaryLayout.getChildren().add(a);
//                Scene secondScene = new Scene(secondaryLayout,590,400);
//                
// 
//                // Một cửa sổ mới (Stage)
//                Stage newWindow = new Stage();
//               
//              //  newWindow.setTitle("Trang Thiết Bị");
//                newWindow.setScene(secondScene);
//                
//                
//                
//                // Sét đặt vị trí cho cửa sổ thứ 2.
//                // Có vị trí tương đối đối với cửa sổ chính.
//                newWindow.setX(200);
//                newWindow.setY(50);
// 
//                newWindow.show();
//                
                // root = FXMLLoader.load(getClass().getResource("Home_View.fxml"));
               /* StackPane secondaryLayout = new StackPane();
                //Scene secondScene = new Scene(secondaryLayout,900,600);
                secondaryLayout=(StackPane)FXMLLoader.load(getClass().getResource("Dang_nhap.fxml"));
                Scene secondScene = new Scene(secondaryLayout,900,600);
 
                // Một cửa sổ mới (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Trang Thiết Bị");
                newWindow.setScene(secondScene);
 
                // Sét đặt vị trí cho cửa sổ thứ 2.
                // Có vị trí tương đối đối với cửa sổ chính.
                newWindow.setX(200);
                newWindow.setY(50);
 
                newWindow.show();*/
        
       AnchorPane root;
        root = (AnchorPane)FXMLLoader.load(getClass().getClassLoader().getResource("quan_ly_khach_san_view/Trang_thiet_bi.fxml"));
        Stage st = new Stage();
        st.setTitle("Hóa Đơn");
        st.setScene(new Scene(root));
        st.show();
    }
    @FXML
    private void taoHoaDon_Click(ActionEvent event) throws Exception {
        System.out.println("click");
        AnchorPane root;
        root = (AnchorPane)FXMLLoader.load(getClass().getClassLoader().getResource("quan_ly_khach_san_view/Tao_hoa_don.fxml"));
        Stage st = new Stage();
        st.setTitle("Hóa Đơn");
        st.setScene(new Scene(root));
        st.show();
     
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        luongThuong_pane.setVisible(false);
        thongTinNhanVien_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        trangChu_pane.setVisible(true);
    }    
    

   
}
