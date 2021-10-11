package com.yash.DI.by.Constructor;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeApp 
{
	
	public static void main(String[] args) {  
        
       /* Resource r=new ClassPathResource("Constructor.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Employee s=(Employee)factory.getBean("e");  
        s.show(); */
		
		 ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"Constructor.xml"});
		    BeanFactory factory=context;
		    Employee e=( Employee)factory.getBean("i");
		    e.show();
		  
          
    }

	

}
