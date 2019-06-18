import com.hch.entity.Person;
import com.hch.service.impl.Say;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*控制反转 start*/
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Say s= (Say) ac.getBean("say");
        //s.setSayer(new Person());
        s.doSay();
        /*控制反转 end*/

        /*依赖注入 start*/
        // 1 属性注入
        Person person1= (Person) ac.getBean("person1");
        System.out.println(person1.toString());
        // 2 构造器注入：必须要有带参构造器
        Person person2= (Person) ac.getBean("person2");
        System.out.println(person2.toString());
        Person person3= (Person) ac.getBean("person3");
        System.out.println(person3.toString());
        Person person4= (Person) ac.getBean("person4");
        System.out.println(person4.toString());
        // 3 工厂方法注入
//        非静态
        Person person5= (Person) ac.getBean("person5");
        System.out.println(person5.toString());
//        静态工厂
        Person person6= (Person) ac.getBean("person6");
        System.out.println(person6.toString());

        // 泛型注入

        /*依赖注入 end*/

        /*注入参数 start*/

        /*注入参数 end*/
    }
}
