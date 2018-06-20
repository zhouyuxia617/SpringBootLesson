package cn.et.sb.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.et.sb.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Serializable>{

	/*
	 * 自定义根据性别查询
	 * 这不是sql语句，是hsql(面向对象的sql语句)
	 */
	@Query("from User where gender=:genders ")
	public List<User> queryByGender(@Param("genders")String gender);

	/*
	 * nativeQuery=true表示原生态的sql语句
	 */
/** @Query(value="select * from t_user where gender=:genders",nativeQuery=true)
	public List<User> queryByGender2(@Param("genders") String gender);
*/
	
}
 