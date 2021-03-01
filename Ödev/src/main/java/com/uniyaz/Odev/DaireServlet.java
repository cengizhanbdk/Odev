package com.uniyaz.Odev;

import jdk.internal.org.objectweb.asm.util.Printer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "hServletDaire", value = "/HesapDaire")
public class DaireServlet extends HesapServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Odev\\daire.txt", true);

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        int i = Integer.parseInt(req.getParameter("daire"));
        int alan = i * i * 3;
        int cevre = 6 * i;
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h3>Daireni alani :" + alan);
        pw.println("</h3></br>");
        pw.println("<h3>Dairenin çevresi :" + cevre);
        pw.println("</h3></body>");
        pw.println("</html>");

        try {
            String s = "--Daire--";
            String s1 = "Alan:";
            String s2 = ", Çevre:";
            String s3 = "---->";

            String alan1 = String.valueOf(alan);
            String cevre1 = String.valueOf(cevre);
            byte[] s1_array = alan1.getBytes();
            byte[] s2_array = cevre1.getBytes();

            byte[] s1_array1 = s1.getBytes();
            byte[] s1_array2 = s2.getBytes();
            byte[] s_array = s.getBytes();
            byte[] s1_array3 = s3.getBytes();

            fos.write(s_array);
            fos.write(s1_array1);
            fos.write(s1_array);
            fos.write(s1_array2);
            fos.write(s2_array);
            fos.write(s1_array3);


        } catch (Exception ex) {
            System.out.println("File  exception oluştu....");
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FileInputStream fis = new FileInputStream("C:\\Odev\\daire.txt");
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        try {
            int deger;
            String s = "";
            int say = 0;
            while ((deger = fis.read()) != -1) {
                s += (byte) deger;
                say++;
                pw.write(deger);
            }

        } catch (FileNotFoundException ex) {

            pw.write("Dosya bulunamadı.");
        }


    }
}

