<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>
    
    <body>
        <div>
            <form name="galleryparamsform" id="galleryparamsform" method="post" action="{$endpoint}">
                [ <a href="{$endpoint}?action=galleryview&amp;reset=yes">Latest Items</a> ] Navigation: 
                <xsl:if test="@hasnext='true'">
                    [ <a href="{$endpoint}?action=galleryview&amp;direction=next">Next page</a> ]
                </xsl:if>
                <xsl:if test="@hasnext='false'">
                    [ Next page ]
                </xsl:if>
                <xsl:if test="@hasprevious='true'">
                    [ <a href="{$endpoint}?action=galleryview&amp;direction=previous">Previous page</a> ]
                </xsl:if>
                <xsl:if test="@hasprevious='false'">
                    [ Previous page ]
                </xsl:if>
                <div style="text-align:right"><br/>Items on page:
                    <select name="resultlimit">
                        <option value="5">5 Items</option>
                        <option value="10" selected="selected">10 Items</option>
                        <option value="15">15 Items</option>
                        <option value="20">20 Items</option>
                    </select>
                    View:
                    <select name="xsl">
                        <option value="xsl1" selected="selected">Default</option>
                        <option value="xsl2">Alternative 1</option>
                    </select>
                    <!--Order:
                         <select name="isdescending">
                             <option value="true" selected="selected">Descending</option>
                             <option value="false">Ascending</option>
                         </select>-->
                    <input type="hidden" name="action" value="galleryview"/>
                <input type="submit" name="Submit" value="Update"/></div>
            </form>
            <!-- ITEM -->
            <s:iterator value="artifacts">
                <div class="contentbox1">
                <div class="title">
                    <span class="title">
                        <xsl:value-of select="@title"/>
                    </span>
                    <br/>
                    <span class="subtitle">
                        <!--da cambiare con xsl 2.0 in get date from dateTime-->
                        <xsl:value-of select="@date"/>
                        <!--<xsl:value-of select="substring(@date,9,2)"/>-<xsl:value-of select="substring(@date,6,2)"/>-<xsl:value-of select="substring(@date,1,4)"/>@<xsl:value-of select="substring(@date,12,5)"/>-->  -  <a href="{$endpoint}?action=viewuserpage&amp;iduser={@poster}">
                            <xsl:value-of select="@poster"/>
                        </a>
                        <xsl:text> </xsl:text>
                        <!--<a href="comment">comments(<xsl:value-of select="@postnumber"/>)</a>-->
                        <xsl:if test="($viewer=@poster) or $ismoderator or $isadmin">
                            <a href="{$endpoint}?action=deleteitem&amp;item={@id}">Delete</a>
                        </xsl:if>
                    </span>
                </div>
                <div class="postbody">
                    <table border="0">
                        <tbody>
                            <tr>
                                <td valign="top">
                                    <img src="{$endpoint}?action=getavatar&amp;id={@poster}" alt="{@poster}'s avatar"/>
                                    <br/>Item no. <xsl:value-of select="@id"/>
                                </td>
                                <td valign="top" class="postboxcell" width="100%">
                                    <div style="text-align:center;">
                                        <a href="{$endpoint}?action=viewitem&amp;id={@id}"><img src="{@thumbnail}" border="0"/></a><br/>
                                        [<a href='{$endpoint}?action=downloaditem&amp;id={@id}'>Download</a>]
                                    </div>
                                    <div class="posttext">
                                        <xsl:value-of select="."/>
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="postpostscript">[ <a href="{$endpoint}?action=galleryview&amp;gallery={@categoryid}">
                        <xsl:value-of select="@category"/>
                </a> ]</div>
            </div>
            </s:iterator>
            <!-- END ITEM -->
            
        </div>
    </body>
</html>
