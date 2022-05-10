import DataStructure.ArrayList.TedsArrayList;
import Model.Plate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayListTest {


    TedsArrayList<Plate> testList;

//    A unit test tests the isolated behavior of an object
    @BeforeEach
    public void setUp(){
        testList = new TedsArrayList<>();
        Plate testPlate1 = new Plate(Plate.Color.RED, Plate.Size.LARGE);
        Plate testPlate2 = new Plate(Plate.Color.BLUE, Plate.Size.LARGE);
        Plate testPlate3 = new Plate(Plate.Color.WHITE, Plate.Size.LARGE);
        Plate testPlate4 = new Plate(Plate.Color.RED, Plate.Size.LARGE);
        testList.add(testPlate1);
        testList.add(testPlate2);
        testList.add(testPlate3);
        testList.add(testPlate4);
    }

    @Test
    public void getTest(){
//        what we're doing here is verifying that expected behavior matches actual behavior
//        what SHOULD happen is we should insert our first plat at position 0, and we should
//        be able to retrieve position 0, and what is retrieved from position 0 should match what was
//        originally inserted
        Plate testPlate1 = new Plate(Plate.Color.RED, Plate.Size.LARGE);
        Assertions.assertTrue(testList.get(0).equals(testPlate1));
    }
    @Test
    public void addNewPlateTest(){
        Plate testPlate4 = new Plate(Plate.Color.BLUE, Plate.Size.SMALL);
        testList.add(testPlate4);
        Assertions.assertTrue(testList.get(3).equals(testPlate4));
    }
    @Test
    public void numberOfRedPlatesTest(){
//        we anticipate counting 2 red plates in our testlist data
        int numRedPlates = 0;
        for(int i = 0; i < testList.size(); i++){
//            System.out.println(testList.get(i));
            if(testList.get(i).plateColor== Plate.Color.RED){
                numRedPlates++;
            }
        }
        Assertions.assertTrue(numRedPlates == 2);
    }
/*
there are a couple reasons why we care about this
1. communication on a large team, between departments, is difficult:
we don't want to be in a situation where a developer just sends code off and says
"oh well it works on my machine"
we want to be able to say "i have proven that this code works"

2. devops: in the future, we're going to gain the ability to automatically
deploy our applications to the cloud
but, this automatic process needs to be safeguarded so that way people don't
publish broken applications to the production environment
so,.. we need to automatically test the code before we do this

3. Test-Driven-Develpment is considered a good, if expensive, practice:
meaning, we write tests for our objects before we actually implement them
the idea is that we have a very clear trajectory / planning for how our application
should be developed (more tests pass as we get further in implementation)
 */
}
