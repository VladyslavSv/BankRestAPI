package model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="transactionType")
public class TransactionType
{
    public TransactionType(){}

    public TransactionType(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
