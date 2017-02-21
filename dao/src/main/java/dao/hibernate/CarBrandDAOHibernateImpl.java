package dao.hibernate;

/**
 * Created by Dibox on 21.02.2017.
 */
import dao.CarBrandDAO;
import model.CarBrand;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CarBrandDAOHibernateImpl implements CarBrandDAO{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void saveOrUpdate(CarBrand item) {
        if (item.getIdBrand() > 0) {
            //update
            getCurrentSession().merge(item);
        } else {
            //insert
            getCurrentSession().save(item);
        }

    }

    public void delete(int itemId) {
        CarBrand carBrand = get(itemId);
        if (carBrand != null)
            getCurrentSession().delete(carBrand);
    }

    public CarBrand get(int itemId) {
        CarBrand carBrand = (CarBrand) getCurrentSession().get(CarBrand.class, itemId);

        return carBrand;
    }

    public List<CarBrand> list() {
        Criteria criteria = getCurrentSession().createCriteria(CarBrand.class);

        return criteria.list();
    }
}
