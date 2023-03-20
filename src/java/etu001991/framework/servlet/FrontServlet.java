package etu001991.framework.servlet;

import etu001991.framework.Mapping;
import etu001991.framework.MethodAnnote;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sabi
 */
public class FrontServlet extends HttpServlet {
    HashMap<String, Mapping> mappingUrl;

    @Override  
    public void init() {
        mappingUrl = new HashMap<>();
        try {
            Vector<MethodAnnote> list = MethodAnnote.getAnnotedMethods("etu001991/framework/modele");
            for ( MethodAnnote m : list) {
                Mapping mp = new Mapping(m.getMethod().getDeclaringClass().getSimpleName(), m.getMethod().getName());
                mappingUrl.put(m.getAnnotation().name(),mp);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
            PrintWriter out = response.getWriter();
                    out.println("Servlet : Front Servlet");
        out.println("");
        out.println("Context Path :"+request.getContextPath());
        out.println("");
        out.println("URL :"+request.getRequestURL());
        out.println("");
        out.println("Parametre :");
        Enumeration<String> liste = request.getParameterNames();
        while(liste.hasMoreElements()){
            String element = liste.nextElement();
            String[] elementValues = request.getParameterValues(element);
            for(int i=0 ; i<elementValues.length ; i++){
                out.println(element+" ["+(i+1)+"]  => "+elementValues[i]);
            }
        }
            
            
        for (Map.Entry<String, Mapping> map : mappingUrl.entrySet()) {
            String str = map.getKey();
            Mapping val = map.getValue();
            out.print( "[Url :" +str);
            out.print("] [Methode name :" +val.getMethodName());            
            out.println("] [class :" +val.getClassName()+"]");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    

}

