/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import quan_ly_khach_san_Model.Bill;

/**
 * FXML Controller class
 *
 * @author HaiDo
 */
public class Tao_hoa_donController implements Initializable {

@FXML
    private Button view_Btn;

    @FXML
    private Button print_Btn;

    @FXML
    private CheckBox vip_CheckBox;
    @FXML
    private TextField name_txt;
    @FXML
    private TextField hBegin_txt;
    @FXML
    private TextField room_txt;
    @FXML
    private TextField mBegin_txt;
    @FXML
    private TextField dayBegin_txt;
    @FXML
    private TextField monthBegin_txt;
    @FXML
    private TextField yearBegin_txt;
    @FXML
    private TextField hEnd_txt;
    @FXML
    private TextField mEnd_txt;
    @FXML
    private TextField dayEnd_txt;
    @FXML
    private TextField monthEnd_txt;
    @FXML
    private TextField yearEnd_txt;
    
    private Graphics2D g2d;
    @FXML
    private Canvas billCanvas;
    @FXML
    private TextField phuPhi_txt;
    
    private Bill bill = new Bill();;

    @FXML
    private void onClickBtnView(ActionEvent event) throws Exception {
        System.out.println("click view");
        GraphicsContext gc = billCanvas.getGraphicsContext2D();

    }

    @FXML
    private void onClickBtnPrint(ActionEvent event) throws Exception {
        
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrint(), getPageFormat(pj));
        try {
            pj.print();

        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
    
    private void createQRCode(String s, Graphics2D gr,int marginLeft, int marginTop){
        int size = 150;
        int minY = marginTop;
        int maxY = size + marginTop;
        int minX = marginLeft;
        int maxX = size + marginLeft;
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
//            BitMatrix bitmt = qrCodeWriter.encode(s, BarcodeFormat.QR_CODE, size, size);

//            gr.setColor(Color.BLACK);
//            
//            for(int i = minX; i<maxX;i++){
//                for(int j = minY; j < maxY; j++){
//                    if(i == minX || j == minY || i == maxX -1 || j == maxY -1 ){
//                        gr.fillRect(i, j, 1, 1);
//                    }
//                    if(bitmt.get(i-minX, j-minY)){
//                        gr.fillRect(i, j, 1, 1);
//                    }
//                }
//            }

        } catch (Exception e) {
            System.out.println("get ERROR");
        }
    }

    public PageFormat getPageFormat(PrinterJob pj) {
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double middleHeight = 12.0;
        double headerHeight = 1.0;
        double footerHeight = 1.0;
        double width = CM_To_PPI(8);
        double height = CM_To_PPI((int) (headerHeight + middleHeight + footerHeight));
        paper.setSize(width, height);
        paper.setImageableArea(
                0,
                12,
                width,
                height - CM_To_PPI(1)
        );

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }

    private static double CM_To_PPI(int cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }

    public class BillPrint implements Printable {

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {
            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {
                g2d = (Graphics2D) graphics;
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                
                try {
                    int x = 30;
                    int y = 10;
                    int yShift = 10;
                    int headerRectHeight = 15;
                    
                    //tạo các giá trị trong Hóa đơn
                    String cusName = name_txt.getText();
                    String room = room_txt.getText();
                    String timeBegin = hBegin_txt.getText() + ":"
                            + mBegin_txt.getText() + " Ngày "
                            + dayBegin_txt.getText() + "/"
                            + monthBegin_txt.getText() + "/"
                            + yearBegin_txt.getText() + "";
                    
                    String timeEnd = hEnd_txt.getText() + ":"
                            + mEnd_txt.getText() + " Ngày "
                            + dayEnd_txt.getText() + "/"
                            + monthEnd_txt.getText() + "/"
                            + yearEnd_txt.getText() + "";
                    
                    int time = getTime();
                    
                    String vip = vip_CheckBox.isSelected() ? "VIP" : "Thường";
                    int fee = vip_CheckBox.isSelected() ? 80 : 50;
                    
                    int phuPhi = ("".equals(phuPhi_txt.getText())) ? 0 : Integer.valueOf(phuPhi_txt.getText());
                    int Tong = getSum(vip_CheckBox.isSelected(), time/60, phuPhi);
                    
                    //tạo String QR code ===> Start:
                    //      % = id bill
                    //      * = Tên
                    //      ! = ngày thuê
                    //      ^ = ngày trả
                    //      @ = giờ thuê
                    //      $ = Tổng giá
                    
                    String StrQrCode = "*" + cusName + "\n@" + getTime() +"\n$"+Tong;

                    //Tạo hóa đơn ===> Start:
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    
                    g2d.drawString("      Hóa đơn thuê phòng       ", 12, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString(" ID: " + bill.getId(), 12, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 12, y);
                    y += headerRectHeight;
                    g2d.drawString(" Khách hàng : " + cusName, 10, y);
                    y += yShift;
                    g2d.drawString(" Phòng      : " + room + "\t Loại: " + vip, 10, y);
                    y += yShift;
                    g2d.drawString(" Phí mỗi giờ: " + fee, 10, y);
                    y += yShift;
                    g2d.drawString(" Ngày thuê  : " + timeBegin, 10, y);
                    y += yShift;
                    g2d.drawString(" Ngày trả   : " + timeEnd, 10, y);
                    y += yShift;
                    g2d.drawString(" Số giờ thuê: " + time/60 + "giờ" + time%60 + "phút", 10, y);
                    y += yShift;
                    g2d.drawString(" Phí thuê   : " + (time/60)*fee, 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Phụ phí    : " + phuPhi + "Nghìn VNĐ", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Tổng phí   : " + Tong + "Nghìn VNĐ", 10, y);
                    y += yShift;
                    g2d.drawString("*************************************", 10, y);
                    y += yShift;
                    
                    createQRCode(StrQrCode, g2d, x, y);
                    //===> End

                } catch (NumberFormatException r) {
                }

                result = PAGE_EXISTS;
            }
            return result;
        }
        
        private int getTime(){
            int time = 0;
            
            try {
                Date beginDate,endDate;
                String strDateBegin,strDateEnd;
                strDateBegin = dayBegin_txt.getText() + "/"
                        + monthBegin_txt.getText() + "/"
                        + yearBegin_txt.getText() + "";
                strDateEnd = dayEnd_txt.getText() + "/"
                        + monthEnd_txt.getText() + "/"
                        + yearEnd_txt.getText() + "";
                //tính lệch giờ
                int t = Integer.valueOf(hBegin_txt.getText())
                        -Integer.valueOf(hEnd_txt.getText());
                time += (t < 0) ? (24 - t)*60 : t*60;
                //tính lệch phút
                t = Integer.valueOf(mBegin_txt.getText())
                        -Integer.valueOf(mEnd_txt.getText());
                time += t;
                beginDate = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(strDateBegin);
                endDate = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(strDateEnd);
                
                long diff = - beginDate.getTime() + endDate.getTime();
                time += (int) (diff / (1000*60));
            } catch (ParseException ex) {
                Logger.getLogger(Tao_hoa_donController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return time;
        }

        private int getSum(boolean isVip, int time, int phuPhi) {
            int giaVip = 30;
            int giaThuong = 50;
            return isVip ? giaVip*time + phuPhi : giaThuong*time + phuPhi;
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }
    
}
