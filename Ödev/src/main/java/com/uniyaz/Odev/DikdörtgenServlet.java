package com.uniyaz.Odev;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "hServletd", value = "/HesapD")
public class DikdörtgenServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Odev\\dikdörtgen.txt", true);

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");


        int i = Integer.parseInt(req.getParameter("d1"));
        int j = Integer.parseInt(req.getParameter("d2"));//tip dönüşümü
        int alan = i * j;
        int cevre = 2 * (i + j);

        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h3>Dikdörtenin alani :" + alan);
        pw.println("</h3></br>");
        pw.println("<h3>Dikdörtgenin çevresi :" + cevre);
        pw.println("</h3></body>");
        pw.println("</html>");//güzel gözüksün html içinde yazdım

        try {
            String s = "<--Dikdörtgen--";
            String s1 = "Alan:";
            String s2 = ", Çevre:";
            String s3 = "---->";//Dosyaya yazdırırken ayırmak kolay olsun

            String alan1 = String.valueOf(alan);
            String cevre1 = String.valueOf(cevre);
            byte[] s1_array = alan1.getBytes();
            byte[] s2_array = cevre1.getBytes();//tip dönşümü

            byte[] s1_array1 = s1.getBytes();
            byte[] s1_array2 = s2.getBytes();
            byte[] s_array = s.getBytes();
            byte[] s1_array3 = s3.getBytes();//Tip dönüşümü

            fos.write(s_array);
            fos.write(s1_array1);
            fos.write(s1_array);
            fos.write(s1_array2);
            fos.write(s2_array);
            fos.write(s1_array3);//dosyaya yaz


        } catch (Exception ex) {
            System.out.println("File  exception oluştu....");
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Odev\\dikdörtgen.txt");
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        try {
            int deger;
            String s = "";
            int say = 0;
            while ((deger = fis.read()) != -1) {
                s += (byte) deger;
                say++;
                pw.write(deger);//dosyadaki her şeyi listele
            }

        } catch (FileNotFoundException ex) {
            pw.write("Dosya bulunamadı.");
        }
    }
}


