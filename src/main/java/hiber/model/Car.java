package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
