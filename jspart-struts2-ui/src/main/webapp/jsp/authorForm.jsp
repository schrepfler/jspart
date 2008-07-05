<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="HelloWorld.message"/></title>
    <s:head theme="ajax" calendarcss="calendar-green"/>
</head>

<body>
    <s:if test="author == null || author.id == null">
        <s:set name="title" value="%{'Add a new author}"/>
    </s:if>
    <s:else>
        <s:set name="title" value="%{'Update author}"/>
    </s:else>
    <s:form action="authors!save.action" method="post" enctype="multipart/form-data">
        <s:hidden name="author.id" value="%{author.id}"/>
        <s:textfield name="author.username" value="%{author.username}" label="%{'Username'}" size="30" required="true"/>
        <s:password name="author.password" value="%{author.password}" label="%{'Password'}" size="30" required="true"/>
        <s:textfield name="author.name" value="%{author.name}" label="%{'Name'}" size="30" required="true"/>
        <s:textfield name="author.surname" value="%{author.surname}" label="%{'Surname'}" size="30" required="true"/>
        <s:textfield name="author.streetName1" value="%{author.streetName1}" label="%{'Street Name 1'}" size="30"/>
        <s:textfield name="author.streetName2" value="%{author.streetName2}" label="%{'Street Name 2'}" size="30"/>
        <s:textfield name="author.city" value="%{author.city}" label="%{'City'}" size="30"/>
        <s:textfield name="author.postalCode" value="%{author.postalCode}" label="%{'ZIP'}" size="30"/>
        <s:textfield name="author.state" value="%{author.state}" label="%{'State'}" size="30"/>
        <s:textfield name="author.country" value="%{author.country}" label="%{'Country'}" size="30"/>
        <s:datetimepicker name="author.birthDay" value="%{birthDay}" label="%{'Birthday'}"/>
        <s:file name="avatarFile" label="%{'Avatar'}"/>
        <s:submit value="Submit"/>
    </s:form>
</body>
</html>
