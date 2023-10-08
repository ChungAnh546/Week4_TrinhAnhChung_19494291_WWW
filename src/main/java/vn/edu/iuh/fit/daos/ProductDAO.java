package vn.edu.iuh.fit.daos;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import vn.edu.iuh.fit.model.Manufacturer;
import vn.edu.iuh.fit.model.Product;

import javax.sql.DataSource;
import java.util.List;

public class ProductDAO extends abstractDAO<Product,Long> {
    public ProductDAO(DataSource dataSource){
        super(dataSource);
    }
    @Override
    public void insert(Product entity) {
        String sql = "insert into product(name,manufacturer_manu_id) value (?,?)";
        jdbcTemplate.update(sql, entity.getName(), entity.getManufacturer());

    }

    @Override
    public Product update(Long aLong) {
        return null;
    }

    @Override
    public Product findById(Long aLong) {
        String sql = "select * from manufacturer where id = ?";

        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),aLong);

    }

    @Override
    public List<Product> findAll() {
        String sql = "select * from manufacturer";

        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Product.class));

    }
}
