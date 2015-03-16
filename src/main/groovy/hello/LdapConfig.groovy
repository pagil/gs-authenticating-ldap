package hello

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.ldap.core.LdapTemplate
import org.springframework.ldap.core.support.LdapContextSource

@Configuration
class LdapConfig {

    @Bean
    LdapContextSource ldapCtxSrc() {
        LdapContextSource ctxSrc = new LdapContextSource()
        ctxSrc.url = "ldap://127.0.0.1:18880"
        ctxSrc.base = "dc=jayway,dc=se"
        ctxSrc.userDn = "uid=admin,ou=system"
        ctxSrc.password = "secret"
        ctxSrc
    }

    @Bean
    LdapTemplate ldapTemplate() {
        new LdapTemplate(ldapCtxSrc())
    }
}
