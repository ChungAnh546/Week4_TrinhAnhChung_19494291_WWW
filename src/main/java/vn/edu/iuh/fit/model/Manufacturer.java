package vn.edu.iuh.fit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.swing.*;
import java.util.List;

@Entity
@Table(name = "manufacturer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manu_id")
    private long id;
    @Column(name = "name")
    private String Name;
    @Column(name = "email")
    private String Email;
    @OneToMany(mappedBy = "manufacturer")
    private List<Product> lsp;
    public Manufacturer(String name,String email){
        this.Name = name;
        this.Email = email;
    }
}
