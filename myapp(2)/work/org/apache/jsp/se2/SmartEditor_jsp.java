/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-03-31 05:30:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.se2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SmartEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"ko\" xml:lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>네이버 :: Smart Editor 2 &#8482;</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/service/HuskyEZCreator.js\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"#\" method=\"post\">\r\n");
      out.write("	<textarea name=\"ir1\" id=\"ir1\" rows=\"10\" cols=\"100\" style=\"width:766px; height:412px; display:none;\"></textarea>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var oEditors = [];\r\n");
      out.write("\r\n");
      out.write("var sLang = \"ko_KR\";	// 언어 (ko_KR/ en_US/ ja_JP/ zh_CN/ zh_TW), default = ko_KR\r\n");
      out.write("\r\n");
      out.write("// 추가 글꼴 목록\r\n");
      out.write("//var aAdditionalFontSet = [[\"MS UI Gothic\", \"MS UI Gothic\"], [\"Comic Sans MS\", \"Comic Sans MS\"],[\"TEST\",\"TEST\"]];\r\n");
      out.write("\r\n");
      out.write("nhn.husky.EZCreator.createInIFrame({\r\n");
      out.write("	oAppRef: oEditors,\r\n");
      out.write("	elPlaceHolder: \"ir1\",\r\n");
      out.write("	sSkinURI: \"SmartEditor2Skin.html\",	\r\n");
      out.write("	htParams : {\r\n");
      out.write("		bUseToolbar : true,				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("		bUseVerticalResizer : true,		// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("		bUseModeChanger : true,			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("		//bSkipXssFilter : true,		// client-side xss filter 무시 여부 (true:사용하지 않음 / 그외:사용)\r\n");
      out.write("		//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록\r\n");
      out.write("		fOnBeforeUnload : function(){\r\n");
      out.write("			//alert(\"완료!\");\r\n");
      out.write("		},\r\n");
      out.write("		I18N_LOCALE : sLang\r\n");
      out.write("	}, //boolean\r\n");
      out.write("	fOnAppLoad : function(){\r\n");
      out.write("		//예제 코드\r\n");
      out.write("		//oEditors.getById[\"ir1\"].exec(\"PASTE_HTML\", [\"로딩이 완료된 후에 본문에 삽입되는 text입니다.\"]);\r\n");
      out.write("	},\r\n");
      out.write("	fCreator: \"createSEditor2\"\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function pasteHTML(filepath) {\r\n");
      out.write("	 //var sHTML = \"<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\\/span>\";\r\n");
      out.write("	 var sHTML = '<img src=\"./upload/'+filepath+'\">';\r\n");
      out.write("	oEditors.getById[\"ir1\"].exec(\"PASTE_HTML\", [sHTML]);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showHTML() {\r\n");
      out.write("	var sHTML = oEditors.getById[\"ir1\"].getIR();\r\n");
      out.write("	alert(sHTML);\r\n");
      out.write("}\r\n");
      out.write("	\r\n");
      out.write("function submitContents(elClickedObj) {\r\n");
      out.write("	oEditors.getById[\"ir1\"].exec(\"UPDATE_CONTENTS_FIELD\", []);	// 에디터의 내용이 textarea에 적용됩니다.\r\n");
      out.write("	\r\n");
      out.write("	// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById(\"ir1\").value를 이용해서 처리하면 됩니다.\r\n");
      out.write("	\r\n");
      out.write("	try {\r\n");
      out.write("		elClickedObj.form.submit();\r\n");
      out.write("	} catch(e) {}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setDefaultFont() {\r\n");
      out.write("	var sDefaultFont = '궁서';\r\n");
      out.write("	var nFontSize = 24;\r\n");
      out.write("	oEditors.getById[\"ir1\"].setDefaultFont(sDefaultFont, nFontSize);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
