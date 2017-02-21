package com.scrud.service;

/**
 * Created by Dibox on 21.02.2017.
 */
import model.CarBrand;
import java.util.List;

public interface CarBrandService {

    void saveOrUpdate(CarBrand item);

    void delete(int itemId);

    CarBrand get(int itemId);

    List<CarBrand> list();
}
