
import com.hch.model.Student;
import com.hch.service.BankService;
import com.hch.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class T {
    ApplicationContext ac;

    @Before
    public void setUp (){
        ac=new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void test(){
//        People people= (People) ac.getBean("people");
        //People people2= (People) ac.getBean("people2");
//        System.out.println(people.toString());
//        System.out.println(people2.getDog()==ac.getBean("dog"));
       // People son=(People) ac.getBean("peopleChild");
       // System.out.println(son.toString());

        //spring AOP
      //  StudentService sts= (StudentService) ac.getBean("studentService2");
       // sts.studentAdd("hch");

        // jdbc
        StudentService studentService= (StudentService) ac.getBean("studentService");

        //studentService.addStudent(new Student("黄长合",44));
        List<Student> students=studentService.findStudents();
        for ( Student stu:students) {
            System.out.println(stu.toString());
        }

        //事务test
        BankService bankService= (BankService) ac.getBean("bankService");
        bankService.transferAccounts(50,1,2);
    }
}
