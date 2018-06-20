package cn.et.sb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity表示当前的实体类是用于操作数据库的
 * Table注解用于关联到操作的表，不添加该注解默认类名就是表名。
 */
@Entity //实体类
@Table(name="t_user")  //指定数据库的表名，默认类名和表名是一样的
public class User {

	@Id //@Id表示是主键
//	@GeneratedValue(strategy=GenerationType.IDENTITY) //数据库表自定义了主键用这个
//	@GeneratedValue //表示主键的生成策略
	private String id; //编号
	
	//名字与数据库属性名不同的要指定一下，相同的就不用加注解了
	@Column(nullable = false,name="n_name")
	private String name; //姓名
	
	private int age; //年龄
	private String gender; //性别
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
