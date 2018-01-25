package com.websystique.springmvc;





import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.websystique.springmvc.model.User; 



public class UserDao {  
JdbcTemplate template;  
  
public JdbcTemplate getTemplate() {
	return template;
}
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(User u){  
    String sql="insert into User(id,username,address,email) values("+u.getId()+",'"+u.getUsername()+"','"+u.getAddress()+"','"+u.getEmail()+"')";  
    return template.update(sql);  
}  
public int update(User u){  
    String sql="update Student set name='"+u.getUsername()+"', address='"+u.getAddress()+"', email='"+u.getEmail()+"', where id="+u.getId()+" ";  
    return template.update(sql);  
}  

//public int delete(int id){  
//    String sql="delete from Student where id="+id+"";  
//    return template.update(sql);  
//}  
//public 	Student getStudentById(int id){  
//    String sql="select * from Student where id=?";  
//    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));  
//}  
//public List<Student> getStudents(){  
//    return template.query("select * from Student",new RowMapper<Student>(){  
//        public Student mapRow(ResultSet rs, int row) throws SQLException {  
//            Student e=new Student();  
//            e.setId(rs.getInt(1));  
//            e.setName(rs.getString(2));  
//            e.setPassword(rs.getString(3));
//            e.setCgpa(rs.getFloat(4));  
//            e.setBranch(rs.getString(5));
//            e.setEmail(rs.getString(6));
//            
//            return e;  
//        }  
//    });  
//}  
}  

