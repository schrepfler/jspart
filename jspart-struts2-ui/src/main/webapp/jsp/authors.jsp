<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>
    
    <body>
        <s:url id="url" action="authors!input"/>
        <a href="<s:property value="#url"/>">Add New Employee</a>
        <br/>
        <table>
            <tr>
                <th><s:text name="Avatar"/></th>
                <th><s:text name="Name"/></th>
                <th><s:text name="Surname"/></th>
                <th><s:text name="Birthday"/></th>
                <th><s:text name="Actions"/></th>
            </tr>
            <s:iterator value="authors" status="status">
                <tr class="<s:if test='#status.even'>even</s:if><s:else>odd</s:else>">
                    <td class="nowrap"><img src="images/avatars/<s:property value="avatar.uri"/>" width="50" height="50" alt="<s:property value="avatar.name"/>"/></td>
                    <td class="nowrap"><s:property value="name"/></td>
                    <td class="nowrap"><s:property value="surname"/></td>
                    <td class="nowrap"><s:property value="birthDay"/></td>
                    <td class="nowrap">
                        <s:url action="authors!input" id="url">
                            <s:param name="author.id" value="id"/>
                        </s:url>
                        <a href="<s:property value="#url"/>">Edit</a>
                        &nbsp;&nbsp;&nbsp;
                        <s:url action="authors!delete" id="url">
                            <s:param name="author.id" value="id"/>
                        </s:url>
                        <a href="<s:property value="#url"/>">Delete</a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
