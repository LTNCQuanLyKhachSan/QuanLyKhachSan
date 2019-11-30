package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class khachHang_005fView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <form >\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hệ Thống Khách sạn Deli</title>\n");
      out.write("        <div>\n");
      out.write("        <table border=\"0\" width=\"50%\" align=\"center\" >\n");
      out.write("        <tr>\n");
      out.write("            <th width=\"30%\" ><img  width=\"120px\"  src=\"image/LOGO_KHACH_SAN.png\"> </img></th>\n");
      out.write("            <th style=\"font-size: 30px; color: #00ccff\" align=\"left\">KHÁCH SẠN PARIS DELI</th>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("       <table border=\"0\" width=\"100%\"  >\n");
      out.write("        <tr>\n");
      out.write("            <th width=\"5%\">&nbsp;</th>\n");
      out.write("            <th width=\"70%\" align=\"center\" ><img id=\"anhPhong\" height=\"77%\" width=90% src=\"image/phong1.jpg\"/></th>\n");
      out.write("            <th width=\"20%\" align=\"top\">\n");
      out.write("                <table border=\"0\" width=\"100%\" align=\"top\" align=\"left\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"font-size: 15px; color: #660033\" colspan=\"2\" width=\"100%\" align=\"left\">Tham Khảo Phòng</th>\n");
      out.write("                    </tr>\n");
      out.write("                     \n");
      out.write("                    <tr>\n");
      out.write("                        <th width=\"35%\" style=\"font-size: 13px\" align=\"left\">Tầng</th>\n");
      out.write("                        <th width=\"65%\" align=\"left\">\n");
      out.write("                            <select id=\"tang\" style=\"font-size: 13px\" >\n");
      out.write("                                <option value=\"1\">Tầng 01 </option>\n");
      out.write("                                <option value=\"2\">Tầng 02</option>\n");
      out.write("                                <option value=\"3\">Tầng 03</option>\n");
      out.write("                                <option value=\"4\">Tầng 04</option>\n");
      out.write("                                <option value=\"5\">Tầng 05</option>\n");
      out.write("                                <option value=\"6\">Tầng 06</option>\n");
      out.write("                                <option value=\"7\">Tầng 07</option>\n");
      out.write("                                <option value=\"8\">Tầng 08</option>\n");
      out.write("                                <option value=\"9\">Tầng 09</option>\n");
      out.write("                                <option value=\"10\">Tầng 10 &nbsp;</option>\n");
      out.write("                            </select>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                       <th width=\"35%\" style=\"font-size: 13px\" align=\"left\">Phòng</th>\n");
      out.write("                        <th width=\"65%\" id=\"phong\" align=\"left\">\n");
      out.write("                            <select style=\"font-size: 13px\" >\n");
      out.write("                                <option value=\"1\">Phòng 01</option>\n");
      out.write("                                <option value=\"2\">Phòng 02</option>\n");
      out.write("                                <option value=\"3\">Phòng 03</option>\n");
      out.write("                                <option value=\"4\">Phòng 04</option>\n");
      out.write("                                <option value=\"5\">Phòng 05</option>\n");
      out.write("                                <option value=\"6\">Phòng 06</option>\n");
      out.write("                                <option value=\"7\">Phòng 07</option>\n");
      out.write("                                <option value=\"8\">Phòng 08</option>\n");
      out.write("                                <option value=\"9\">Phòng 09</option>\n");
      out.write("                                <option value=\"10\">Phòng 10</option>\n");
      out.write("                            </select>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr align=\"left\">\n");
      out.write("                        <th  width=\"35%\"   style=\"font-size: 13px\">Trạng thái</th>\n");
      out.write("                        <th width=\"65%\"><output name=\"trangThai\" >&nbsp;</output></th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                     <tr align=\"left\">\n");
      out.write("                         <th  width=\"35%\"  style=\"font-size: 13px\">\n");
      out.write("                             <button style=\"font-size: 13px;background-color: #99ffcc\" >Xem &nbsp;&nbsp;&nbsp;&nbsp;</button>\n");
      out.write("                         </th>\n");
      out.write("                         <th width=\"65%\" style=\"font-size: 13px\">Giá:<output  id=\"gia\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VNĐ</output></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"font-size: 15px; color: #660033\" align=\"left\">Đặt phòng</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr align=\"left\">\n");
      out.write("                        <th  width=\"35%\"  style=\"font-size: 13px\">Họ và Tên</th>\n");
      out.write("                        <th width=\"65%\"><input name=\"hoTen\" /></th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    <tr  align=\"left\">\n");
      out.write("                        <th width=\"35%\"  style=\"font-size: 13px\">Số Điện Thoại</th>\n");
      out.write("                        <th width=\"65%\"><input name=\"SDT\" /></th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    <tr  align=\"left\">\n");
      out.write("                        <th width=\"35%\"  style=\"font-size: 13px\">Số CMND</th>\n");
      out.write("                        <th width=\"65%\"><input name=\"CMND\" /></th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    <tr  align=\"left\">\n");
      out.write("                        <th width=\"35%\" style=\"font-size: 13px\">Số Lượng Phòng</th>\n");
      out.write("                        <th width=\"65%\"><input name=\"soLuongPhong\" /></th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    <tr align=\"left\">\n");
      out.write("                        <th width=\"35%\" style=\"font-size: 13px\">Thời gian Thuê</th>\n");
      out.write("                        <th width=\"65%\"><input name=\"thoiGianThue\" /></th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    <tr align=\"left\">\n");
      out.write("                        <th width=\"35%\" style=\"font-size: 13px\" >Loại Phòng</th>\n");
      out.write("                        <th width=\"65%\" id=\"loaiPhong\">\n");
      out.write("                            <select style=\"font-size: 13px\">\n");
      out.write("                                <option value=\"phongDoi\">Phòng Đôi</option>\n");
      out.write("                                <option value=\"phongDon\">Phòng Đơn</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                        </th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr align=\"left\">\n");
      out.write("                        <th width=\"35%\" id=\"hinhThucThanhToan\" style=\"font-size: 13px\">Hình Thức Thanh Toán</th>\n");
      out.write("                        <th width=\"65%\">\n");
      out.write("                            <select style=\"font-size: 13px\">\n");
      out.write("                                <option value=\"tienMat\">Tiền Mặt&nbsp;&nbsp;&nbsp;</option>\n");
      out.write("                                <option value=\"theATM\">Thẻ ATM&nbsp;&nbsp;&nbsp;</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                        </th>\n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th>&nbsp;</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("            </th>\n");
      out.write("             <th width=\"5%\">&nbsp;</th>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("         </div>\n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("        <table border=\"0\" width=\"100%\" align=\"left\" >\n");
      out.write("        <tr>\n");
      out.write("            <th width=\"75%\" ></th>\n");
      out.write("            <th style=\"font-size: 30px\" >\n");
      out.write("                \n");
      out.write("                <button style=\"background-color: #99ffcc \" name=\"DanhGia\" value=\"danhGia\">Đánh Giá&nbsp;&nbsp;&nbsp;</button>\n");
      out.write("                <button style=\"background-color: #99ffcc\" name=\"guiYKien\" value=\"guiYKien\">Gửi Ý Kiến&nbsp;</button>\n");
      out.write("                <button style=\"background-color: #99ffcc\" name=\"taoHoaDon\" value=\"taoHoaDon\">Tạo Hóa Đơn</button>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
