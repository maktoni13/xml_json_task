package lab.model.xml.entity;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    List<Person> personList;

    public Notebook() {
        personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "personList=" + personList +
                '}';
    }
}
