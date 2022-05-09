package Model;

import Service.PlateService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Plate {

    public Color plateColor;
    public Size plateSize;
//    let's say that we are manufacturing plates that can be of several different colors
    public enum Color{
        @JsonProperty("RED")
        RED,
        @JsonProperty("WHITE")
        WHITE,
        @JsonProperty("ORANGE")
        ORANGE,
        @JsonProperty("BLUE")
        BLUE
    }
    public enum Size{
        @JsonProperty("LARGE")
        LARGE,
        @JsonProperty("SMALL")
        SMALL,
        @JsonProperty("EXTRA_LARGE")
        EXTRA_LARGE
    }

    public Plate(){

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
