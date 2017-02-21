package dao;

/**
 * Created by Dibox on 21.02.2017.
 */
import model.CarBrand;
import java.util.List;

public interface CarBrandDAO{

    void saveOrUpdate(CarBrand item);

    void delete(int itemId);

    CarBrand get(int itemId);

    List<CarBrand> list();

}
