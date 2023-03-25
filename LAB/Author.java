
public class Author {
    private String name;
    private int id;
    private String DOB;

    public Author(String aName,int aId, String aDOB)
    {
        setName(aName);
        setId(aId);
        setDOB(aDOB);
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDOB(String dOB) {
        DOB = dOB;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDOB() {
        return DOB;
    }
    
}
