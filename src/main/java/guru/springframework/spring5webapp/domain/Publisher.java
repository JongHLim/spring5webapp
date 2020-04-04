package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String street;
  private String city;
  private String state;
  private String zip;

  public Publisher() {
  }

  public Publisher(String name, String street, String city, String state, String zip) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    zip = zip;
  }


  @Override
  public String toString() {
    return "Publisher{" +
      "id=" + id +
      ", street='" + street + '\'' +
      ", city='" + city + '\'' +
      ", state='" + state + '\'' +
      ", zip='" + zip + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Publisher publisher = (Publisher) o;

    if (id != null ? !id.equals(publisher.id) : publisher.id != null) return false;
    if (name != null ? !name.equals(publisher.name) : publisher.name != null) return false;
    if (street != null ? !street.equals(publisher.street) : publisher.street != null) return false;
    if (city != null ? !city.equals(publisher.city) : publisher.city != null) return false;
    if (state != null ? !state.equals(publisher.state) : publisher.state != null) return false;
    return zip != null ? zip.equals(publisher.zip) : publisher.zip == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (street != null ? street.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (state != null ? state.hashCode() : 0);
    result = 31 * result + (zip != null ? zip.hashCode() : 0);
    return result;
  }
}
