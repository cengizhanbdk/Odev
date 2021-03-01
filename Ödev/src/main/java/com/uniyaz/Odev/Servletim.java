package com.uniyaz.Odev;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hServletim", value = "/Hesapim")
public class Servletim extends HesapServlet{






    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");

        String user=req.getParameter("kare");



            int i = Integer.parseInt(req.getParameter("kare"));

            Kare kare =new Kare(i);
            kare.alan_hesapla();
            kare.cevre_hesapla();
            kare.cevre_hesapla();
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h3>Kareninin alani :" + "alan");
            pw.println("</h3></br>");
            pw.println("<h3>Kareninin çevresi :" + "cevre");
            pw.println("</h3></body>");
            pw.println("</html>");
            pw.write("sealm");





        pw.write("aselam");







    }
}
