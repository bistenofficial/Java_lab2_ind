public class Main_class
{
        public static void main(String[] args)
        {
            Employee employee = new Employee("Директор.","Киров",20000);
            employee.Report();
            Employee employee1 = new Employee("Толстой Л.Н.", "Война и мир", 1400);
            employee1.Report();
        }
}
