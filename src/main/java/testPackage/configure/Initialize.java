package testPackage.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import testPackage.repository.RoleRepository;
import testPackage.service.UserService;
import testPackage.vo.Role;
import testPackage.vo.User;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class Initialize {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        /*Role role = new Role();
        role.setRole("admin");
        Role save = roleRepository.save(role);
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        User user = new User();
        user.setActive(0);
        user.setEmail("asdf@asdf.com");
        user.setLastName("lastName");
        user.setPassword("asdfasdf");
        user.setName("admin");
        user.setRoles(roles);
        userService.saveUser(user);*/
    }
}
