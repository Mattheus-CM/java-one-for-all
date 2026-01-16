package martins.mattheus.javaoneforall.javacore.Ycollection.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    private Long id;
    private String name;

    public Customer(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0, 1000000);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
