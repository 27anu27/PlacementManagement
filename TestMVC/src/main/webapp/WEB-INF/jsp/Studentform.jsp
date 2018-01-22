<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Student</h1>  
       <form:form method="post" action="save">    
        <table >  
        <tr>    
          <td>id : </td>   
          <td><form:input path="id"  /></td>  
         </tr>  
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>CGPA :</td>    
          <td><form:input path="CGPA" /></td>  
         </tr>   
            
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
