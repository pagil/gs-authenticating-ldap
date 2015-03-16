package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ldap.core.DirContextOperations
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController

import javax.naming.ldap.LdapName;

@RestController
class HomeController {

    @RequestMapping("/")
    def index() {
        "Welcome to the home page!"
    }
}
