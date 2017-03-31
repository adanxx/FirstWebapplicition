<%--
  Created by IntelliJ IDEA.
  User: A.A
  Date: 9/29/2016
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="CONTENT-TYPE"content="text/html: Charset=UTF=8">
<title>User Form</title>>
 </head>
    <body>
<form method="POST" action="DisplayDataServlet" >
     <table border="0">

              <tbody>
            <tr>
                         <td>First Name : </td>
                         <td><input type="text"name="first" value="" size="50"/> </td>
             </tr>
             <tr>
                         <td>Last Name :</td>
                         <td><input type="text"name="last" value="" size="50"/> </td>
             </tr>
             <tr>
                         <td> Address : </td>
                         <td><input type="text"name="Address" value="" size="50"/></td>
              </tr>
              <tr>
                         <td> Gender :</td>
                         <td><select name="gender">
                            <option>Male</option>
                             <option>Female</option>
                         </select> </td>
              </tr>
              <tr>
                           <td>Email Adress: </td>
                           <td><input type="text"name="email" value="" size="30"/></td>
              </tr>
              <tr>
                                    <td> <%--@declare id="comments"--%><label form="comments">Comments </label></td>
                                     <td><textarea name="comments" maxlength="100" cols="50" rows="6"></textarea>
                                     </td>
              </tr>

         </tbody>
     </table>
      <input type ="reset" value="Clear" name="clear"/>
      <input type="Submit" value="Submit" name="Submit">

        </form>
    </body>
</html>
