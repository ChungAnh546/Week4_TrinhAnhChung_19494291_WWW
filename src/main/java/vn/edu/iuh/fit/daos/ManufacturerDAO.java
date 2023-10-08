package vn.edu.iuh.fit.daos;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.model.Manufacturer;

import javax.sql.DataSource;
import java.util.List;
@Component
public class ManufacturerDAO extends abstractDAO<Manufacturer, Long> {
    public ManufacturerDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Manufacturer entity) {
        String sql = "insert into manufacturer(name,email) value (?,?)";
        jdbcTemplate.update(sql, entity.getName(), entity.getEmail());
    }

    @Override
    public Manufacturer update(Long aLong) {
        return null;
    }

    @Override
    public Manufacturer findById(Long aLong) {
        String sql = "select * from manufacturer where id = ?";

        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Manufacturer.class),aLong);
    }


    @Override
    public List<Manufacturer> findAll() {
        String sql = "select * from manufacturer";

        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Manufacturer.class));
    }
}
