package alexey_efimenko.Module3.Task1;

/**
 * Created by Linkin on 16.02.2017.
 */
public class Bird {
    public static void main(String[] args) {
        Bird sing = new Bird();
        sing.walking();
        sing.flying();
        sing.singing();
        sing.bird();
    }

    void walking ()

    {
        System.out.println(" I am walking");
    }

    void flying ()

    {
        System.out.println(" I am flying");
    }

    void singing ()

    {
        System.out.println(" I anm singing");
    }

    void bird ()

    {
        System.out.println(" I am Bird");
    }
}
