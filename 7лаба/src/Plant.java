public class Plant implements Comparable<Plant>
{

    private String name;
    private String family;
    private String genus;
    private String species;
    private String age;

    public Plant(String name, String family, String species, String genus, String age) throws MyException
    {
        if(name.isEmpty()) throw new MyException("Ошибка ввода!");
        this.name = name;

        if(family.isEmpty()) throw new MyException ("Ошибка ввода!");
        this.family = family;

        if(species.isEmpty()) throw new MyException("Ошибка ввода!");
        this.species = species;

        if(genus.isEmpty()) throw new MyException ("Ошибка ввода!");
        this.genus = genus;

        if(age.isEmpty()) throw new MyException ("Ошибка ввода!");
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getFamily()
    {
        return family;
    }

    public String getGenus()
    {
        return genus;
    }

    public String getSpecies()
    {
        return species;
    }

    public String getAge() {
        return age;
    }



    @Override
    public int compareTo(Plant o) {
        return this.name.compareTo(o.name);
    }
}


