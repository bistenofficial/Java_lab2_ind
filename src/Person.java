abstract public class Person
{
    private String name;

    public abstract void Report();
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public Person(String name)
    {
        this.name=name;
    }
}
