package pojo;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("ObjA")
public class ObjectA {
    private int prop1;
    private String prop2;
    private List<String> prop3;

    public ObjectA(int prop1, String prop2, List<String> prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    public ObjectA() {
    }

    @Override
    public String toString() {
        return "ObjectA{" +
                "prop1=" + prop1 +
                ", prop2='" + prop2 + '\'' +
                ", prop3=" + prop3 +
                '}';
    }

    public int getProp1() {
        return prop1;
    }

    public void setProp1(int prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public List<String> getProp3() {
        return prop3;
    }

    public void setProp3(List<String> prop3) {
        this.prop3 = prop3;
    }
}
