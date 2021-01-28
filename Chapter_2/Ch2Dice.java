import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Ch2Dice extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		String d1 = Integer.toString((int) ((Math.random()*6)+1));
		String d2 = Integer.toString((int) ((Math.random()*6)+1));
		
		out.println("<html> <body>" + 
		"<h1 align=center>HF\'s Chap 2 Dice Roller</h1>" +
		"<p>" + d1 + " and " + d2 + " were rolled" + 
		"</body> </html>");		
	}
}


// Deployment Descriptor ----------------------------

<web-app ...>

	<servlet>
		<servlet-name>C2dice</servlet-name>
		<servlet-class>Ch2Dice</servlet-class>
	</servlet>

	<servlet-mapping>
		<servlet-name> C2dice </sevlet-name>
		<url-pattern> /Dice </url-pattern>
	</servlet-mapping>

</web-app>

/* Not used items


public void service(



C2dice

ServletRequest request,

ServletResponse response,



/Dice
PrintWriter out = request.getWriter();

Ch2Dice

*/