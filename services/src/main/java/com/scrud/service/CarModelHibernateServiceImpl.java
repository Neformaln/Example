package com.scrud.service;

/**
 * Created by Dibox on 21.02.2017.
 */
import dao.CarModelDAO;
import model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("carModelHibernateService")
@Transactional(readOnly=false, value = "hibernateTransactionManager")
public class CarModelHibernateServiceImpl implements CarModelService {
    @Autowired
    @Qualifier("getCarModelHibernateDAO")
    private CarModelDAO carModelDAO;

    public void saveOrUpdate(CarModel item) {
        carModelDAO.saveOrUpdate(item);
    }

    public void delete(int itemId) {
        carModelDAO.delete(itemId);
    }

    public CarModel get(int itemId) {
        return carModelDAO.get(itemId);
    }

    public List<CarModel> list() {
        return carModelDAO.list();
    }
}