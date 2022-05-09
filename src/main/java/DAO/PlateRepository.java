package DAO;

import Model.Plate;

import java.util.LinkedList;

public class PlateRepository {
//    I'm just using this linkedlist of plates as a mock database, because
//    I just want to use this repository for testing purposes
//    No files or databases for this example
    LinkedList<Plate> plates;
    public PlateRepository(){
        plates = new LinkedList<>();
    }
    public Plate getPlate(int plateNum){
        return plates.get(plateNum);
    }
    public int getNumberOfRedPlates(){
        int count = 0;
        for(int i = 0; i < plates.size(); i++){
            if(plates.get(i).getPlateColor()== Plate.Color.RED){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfWhitePlates(){
        int count = 0;
        for(int i = 0; i < plates.size(); i++){
            if(plates.get(i).getPlateColor()== Plate.Color.WHITE){
                count++;
            }
        }
        return count;
    }
    public void addPlate(Plate p){
        plates.add(p);
    }


}
