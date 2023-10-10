package CompositePatterm.Composite;

import CompositePatterm.People.People;

public interface Org {
    void addOrg(CafeOrg cafeOrg);

    void removeOrg(Integer id);

    void addPeople(People people);

    void removePeople(Integer id);

    void show();
}
