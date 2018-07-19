package testPackage.service;


import testPackage.vo.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
