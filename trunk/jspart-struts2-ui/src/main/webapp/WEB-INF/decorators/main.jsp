<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
    <title>Welcome to jspArt</title>
    <link href="styles/default.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.3.0/build/reset/reset-min.css"> 
    <decorator:head/>
    </head>
    <body>
        <table width="100%"  border="0" cellspacing="0" cellpadding="0"> 
            <tr> 
                <th width="276" height="60" valign="top" class="logocell" scope="col"><a href="index.jsp"><img src="images/logo.png" width="102" border="0" height="59" alt='jspArt logo, link to homepage'></a></th> 
                <th class="logobar" scope="col">
                    ja:logoutbox
                </th> 
            </tr>
            <tr>
                <td colspan="2" class="menubar">
                    ja:menubar
                </td> 
            </tr> 
            <tr> 
                <td valign="top" class="toolbar">
                    ja:loginbox
                    <div class="bar2">
                        ja:categoriesnavigator
                    </div>
                    <div class="bar1">
                        ja:userdetails
                    </div>
                    <div class="bar2">
                        ja:debuginfo
                    </div>
                </td> 
                <td valign="top" class="contentcell">
                    <div class="content">
                        <a href="${pageContext.request.requestURI}">Refresh</a><br/>
                        ja:itemsnavigator<br/>
                        <decorator:body/>
                    </div>
                </td> 
            </tr> 
        </table>
        <div class="copyright">ja:copyright</div>
    </body>
</html>
