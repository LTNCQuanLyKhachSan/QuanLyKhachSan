<%-- 
    Document   : khachHang_View
    Created on : Nov 27, 2019, 1:07:50 PM
    Author     : thaibinh
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <form >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hệ Thống Khách sạn Deli</title>
        <div>
        <table border="0" width="50%" align="center" >
        <tr>
            <th width="30%" ><img  width="120px"  src="image/LOGO_KHACH_SAN.png"> </img></th>
            <th style="font-size: 30px; color: #00ccff" align="left">KHÁCH SẠN PARIS DELI</th>
        </tr>
        </table>
        </div>
    </head>
    <body>
        <div>
       <table border="0" width="100%"  >
        <tr align="left">
            <th width="5%">&nbsp;</th>
            <th width="70%" align="center" ><img id="anhPhong" width="90%" height="77%" src="image/phong1.jpg"/></th>
            <th width="20%" align="top">
                <table border="0" width="100%" align="top" >
                    <tr>
                        <th style="font-size: 15px; color: #660033" colspan="2" width="100%" align="left">Tham Khảo Phòng</th>
                    </tr>
                     
                    <tr>
                        <th width="35%" style="font-size: 13px" align="left">Loại Phòng</th>
                        <th width="65%" align="left">
                            <select id="tang" style="font-size: 13px" >
                                <option value="1">Phòng 1 giường đơn </option>
                                <option value="2">Phòng 2 giường đơn</option>
                                <option value="3">Phòng 1 giường đôi</option>
                                <option value="4">phòng 2 giường đôi</option>
                                <option value="5">phòng gia đình</option>
                                
                            </select>
                        </th>
                    </tr>
                   
                     <tr align="left">
                        <th  width="35%"   style="font-size: 13px">Trạng thái</th>
                        <th width="65%"><output name="trangThai" >&nbsp;</output></th>
                          
                    </tr>
                     <tr align="left">
                         <th  width="35%"  style="font-size: 13px">
                             <button style="font-size: 13px;background-color: #99ffcc" >Xem &nbsp;&nbsp;&nbsp;&nbsp;</button>
                         </th>
                         <th width="65%" style="font-size: 13px">Giá:<output  id="gia">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VNĐ</output></th>
                    </tr>
                    <tr>
                        <th style="font-size: 15px; color: #660033" align="left">Đặt phòng</th>
                    </tr>
                    <tr align="left">
                        <th  width="35%"  style="font-size: 13px">Họ và Tên</th>
                        <th width="65%"><input name="hoTen" /></th>
                          
                    </tr>
                    <tr  align="left">
                        <th width="35%"  style="font-size: 13px">Số Điện Thoại</th>
                        <th width="65%"><input name="SDT" /></th>
                          
                    </tr>
                    <tr  align="left">
                        <th width="35%"  style="font-size: 13px">Số CMND</th>
                        <th width="65%"><input name="CMND" /></th>
                          
                    </tr>
                    <tr  align="left">
                        <th width="35%" style="font-size: 13px">Số Lượng Phòng</th>
                        <th width="65%"><input name="soLuongPhong" /></th>
                          
                    </tr>
                    <tr align="left">
                        <th width="35%" style="font-size: 13px">Thời gian Thuê</th>
                        <th width="65%"><input name="thoiGianThue" /></th>
                          
                    </tr>
                    <tr align="left">
                        <th width="35%" style="font-size: 13px" >Loại Phòng</th>
                        <th width="65%" id="loaiPhong">
                            <select style="font-size: 13px">
                                <option value="1">Phòng 1 giường đơn </option>
                                <option value="2">Phòng 2 giường đơn</option>
                                <option value="3">Phòng 1 giường đôi</option>
                                <option value="4">phòng 2 giường đôi</option>
                                <option value="5">phòng gia đình</option>
                                
                            </select>
                        </th>
                          
                    </tr>
                    
                    
                    <tr align="left">
                        <th width="35%" id="hinhThucThanhToan" style="font-size: 13px">Hình Thức Thanh Toán</th>
                        <th width="65%">
                            <select style="font-size: 13px">
                                <option value="tienMat">Tiền Mặt&nbsp;&nbsp;&nbsp;</option>
                                <option value="theATM">Thẻ ATM&nbsp;&nbsp;&nbsp;</option>
                                
                            </select>
                        </th>
                          
                    </tr>
                    
                    <tr>
                        <th>&nbsp;</th>
                    </tr>
                    
                   
                </table>
            </th>
             <th width="5%">&nbsp;</th>
        </tr>
        </table>
         </div>
        <div>
        
        <table border="0" width="100%" align="left" >
        <tr>
            <th width="75%" ></th>
            <th style="font-size: 30px" >
                
                <button style="background-color: #99ffcc " name="DanhGia" value="danhGia">Đánh Giá&nbsp;&nbsp;&nbsp;</button>
                <button style="background-color: #99ffcc" name="guiYKien" value="guiYKien">Gửi Ý Kiến&nbsp;</button>
                <button style="background-color: #99ffcc" name="taoHoaDon" value="taoHoaDon">Tạo Hóa Đơn</button>
            </th>
        </tr>
        </table>
        
        </div>
</form>
    </body>
</html>
