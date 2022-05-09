package Model;

import java.util.Objects;

public class Plate {

    private Color plateColor;
    private Size plateSize;
//    let's say that we are manufacturing plates that can be of several different colors
    public enum Color{
        RED,
        WHITE,
        ORANGE,
        BLUE
    }
    public enum Size{
        LARGE,
        SMALL,
        EXTRA_LARGE
    }
    public Plate(Color color, Size size){
        this.plateColor = color;
        this.plateSize = size;
    }

    public Color getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(Color plateColor) {
        this.plateColor = plateColor;
    }
    public String toString(){
        return plateColor.toString() + " " + plateSize.toString();
    }
    /*
    TODO: fix this
     */
    public static String[] getPlateCatalog(){
        String[] allPlates = new String[100];
        for(int i = 0; i < Color.values().length; i++){
            for(int j = 0; j < Size.values().length; j++){
                System.out.println(Color.values()[i] + " " + Size.values()[j]);
                allPlates[(i*Color.values().length)+j] = Color.values()[i] + " " + Size.values()[j];
            }
        }
        return allPlates;
    }
    public boolean equals(Plate other) {
        if(other.getPlateColor() == this.plateColor){
            return true;
        }else{
            return false;
        }
    }


}
