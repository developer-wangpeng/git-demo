package learn.git.repository;

import java.util.List;

import learn.git.pojo.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

	@Insert("insert into user(user_id,user_name)values(#{user_id},#{user_name})")
	void addUser(User user);
	
	@Delete("delete from user where user_id = #{user_id}")
	void deleteUser(User user);
	
	@Update("update user set user_name = #{user_name} where user_id = #{user_id}")
	void editUser(User user);
	
	@Select("select user_id,user_name from user where user_id = #{user_id}")
	User getUser(User user);
	
	List<User> getAllUser();
}
