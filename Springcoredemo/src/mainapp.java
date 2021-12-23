
public class mainapp {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Laptop l = new Laptop();  
        // IOC container is responsible to manage life cycle of OBject
        // Inversion of Control
        // Creating/Initializing IOC container
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("NewFile.xml");
        // Requesting a bean from IOC container as an raw Object class
        Laptop l=(Laptop) context.getBean("mylaptop");
        Employee e=(Employee) context.getBean("emp");
        e.setName("pranay");
        System.out.println(l);
        System.out.println(e);

    }
}
