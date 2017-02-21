package dao;

/**
 * Created by Dibox on 21.02.2017.
 */
import model.CarModel;

import java.util.List;

public interface CarModelDAO {

    void saveOrUpdate(CarModel item);

    void delete(int itemId);

    CarModel get(int itemId);

    List<CarModel> list();

}
