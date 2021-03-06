package cn.hellyuestc.caiyuan.dao;

import org.apache.ibatis.annotations.Param;

import cn.hellyuestc.caiyuan.entity.User;

public interface UserDao {
	
	String selectNameById(long id);
	
	int selectEmailCount(String email);
	
	int selectPhoneCount(String phone);
	
	void insertUser(User user);
	
	long insertUserTypePhone(User user);
	
	int selectStatusByEmail(String email);
	
	String selectActivationCodeByEmail(String email);
	
	void updateUser(@Param("email") String email, @Param("status") int status);
	
	long selectIdByPhone(String phone);
	
	long selectIdByEmail(String email);
	
	byte selectStatusById(long id);
	
	String selectPasswordById(long id);
	
	User selectUserById(long id);
	
	void updateAvatarUrl(@Param("id") long id, @Param("avatar_url") String avatarUrl);
	
	void updatePassword(@Param("phone") String phone, @Param("password") String password);
	
}
