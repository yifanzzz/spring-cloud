package cn.yifan.cloud.entity;

/**
 * Created by hopezzz on 2016/11/29.
 */
public class TestEntity implements  java.io.Serializable{

    private static final long serialVersionUID = -1068971468847566960L;

    private Integer id;
    private String name;

    public TestEntity(){

    }

    public TestEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
