package TestMVC;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import TestMVC.Student;  
import TestMVC.StudentDao;  
@Controller  
public class StudentController {  
    @Autowired  
    StudentDao dao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/Studentform")  
    public ModelAndView showform(){  
        return new ModelAndView("Studentform","command",new Student());  
    }  
    
    @RequestMapping("/homepage")  
    public ModelAndView showhome(){  
        return new ModelAndView("homepage","command",new Student());  
    }  
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("std")Student std){  
        dao.save(std);  
        return new ModelAndView("redirect:/viewStudent");//will redirect to viewemp request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/viewStudent")  
    public ModelAndView viewstd(){  
        List<Student> list=dao.getStudents();  
        return new ModelAndView("viewStudent","list",list);  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editStudent/{id}")  
    public ModelAndView edit(@PathVariable int id){  
        Student std=dao.getStudentById(id);  
        return new ModelAndView("Studenteditform","command",std);  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("std") Student std){  
        dao.update(std);  
        return new ModelAndView("redirect:/viewStudent");  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteStudent/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        dao.delete(id);  
        return new ModelAndView("redirect:/viewStudent");  
    }  
  
}  
