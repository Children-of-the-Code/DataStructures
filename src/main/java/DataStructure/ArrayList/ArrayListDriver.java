package DataStructure.ArrayList;

import Model.Plate;

public class ArrayListDriver {
    public static void main(String[] args) {

        TedsArrayList<Plate> plateList = new TedsArrayList<Plate>();
        plateList.add(new Plate(Plate.Color.RED, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.BLUE, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.WHITE, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.RED, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.BLUE, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.WHITE, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.RED, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.BLUE, Plate.Size.LARGE));
        plateList.add(new Plate(Plate.Color.WHITE, Plate.Size.LARGE));

        System.out.println(plateList.get(0));
        System.out.println(plateList.get(1));
        System.out.println(plateList.get(8));

//        plateList.things = new Plate[2];
//        we lose our data, fine, but the internal logic of the arraylist would be totally
//        broken, because we rely on matching the array size to the int size variable
//        we don't want the developer to be able to do this, even on accident!
//
//        this is 2 things: we abstract away complicated behavior
//        we encapsulate information that we feel the developer doesn't need to know
//        (especially with regards to internal behavior)
    }
}
