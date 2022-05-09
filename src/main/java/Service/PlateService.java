package Service;

import DAO.PlateRepository;
import Model.Plate;

public class PlateService {
    PlateRepository repository;
    public PlateService(){
        repository = new PlateRepository();
    }
    public void add(Plate p){
        repository.addPlate(p);
    }
    public int getRedPlateCount(){
        return repository.getNumberOfRedPlates();
    }
    public int getWhitePlateCount(){
        return repository.getNumberOfWhitePlates();
    }
    public Plate getPlate(int n){
        return repository.getPlate(n);
    }
}
