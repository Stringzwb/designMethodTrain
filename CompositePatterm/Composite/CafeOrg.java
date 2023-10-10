package CompositePatterm.Composite;

import CompositePatterm.People.People;

import java.util.HashSet;
import java.util.Set;

public class CafeOrg implements Org{

    private final Integer id;
    private final String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CafeOrg(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    Set<People> peopleSet = new HashSet<>();

    Set<CafeOrg> cafeOrgSet = new HashSet<>();

    @Override
    public void addOrg(CafeOrg cafeOrg) {
        cafeOrgSet.add(cafeOrg);
    }

    @Override
    public void removeOrg(Integer id) {
        cafeOrgSet.removeIf(org -> org.getId().equals(id));
    }

    @Override
    public void addPeople(People people) {
        peopleSet.add(people);
    }

    @Override
    public void removePeople(Integer id) {
        peopleSet.removeIf(people -> people.getId().equals(id));
    }

    private String generateIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level * 2; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public void show() {
        show(0);
    }

    private void show(int indentationLevel) {
        //生成缩进
        String indent = generateIndent(indentationLevel);

        System.out.println(indent + "- " + getName());

        // 打印当前组织的人员
        for (People person : peopleSet) {
            System.out.println(indent + "  * " + person);
        }

        // 递归打印子组织
        for (CafeOrg co : cafeOrgSet) {
            co.show(indentationLevel + 1);
        }
    }

}
