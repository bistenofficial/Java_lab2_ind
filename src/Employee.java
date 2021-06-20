public class Employee extends Person
{
    public String position;
    public int sallary;
    public Employee(String position,String name,int sallary)
    {
        super(name);
        this.position = position;
        this.sallary = sallary;
    }
    public void Report()
    {
        System.out.print("Имя - "+getName()+" Название должности - "+getPosition()+" Зарплата - "+getSallary()+"\n");
    }
    public void setPosition(String position)
    {
        this.position=position;
    }
    public void setSallary(int pages_count)
    {
        this.sallary=sallary;
    }
    public String getPosition()
    {
        return position;
    }
    public int getSallary()
    {
        return sallary;
    }
}
