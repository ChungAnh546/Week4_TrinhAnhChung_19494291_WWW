package vn.edu.iuh.fit.daos;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public abstract class abstractDAO<T, ID> {
    private final DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public abstractDAO(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public abstract void insert(T entity);

    public abstract T update(ID id);
    public abstract T findById(ID id);
    public abstract List<T> findAll();
}
