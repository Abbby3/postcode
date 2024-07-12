// package dev.abbby.postcode.Security;

// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {
//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//             .antMatchers(HttpMethod.POST, "/api/suburb").hasRole("ADMIN")
//             .anyRequest().permitAll()
//             .and()
//             .httpBasic()
//             .and()
//             .csrf().disable();
//     }

//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//         auth.inMemoryAuthentication()
//             .withUser("admin").password("{noop}password").roles("ADMIN");
//     }
// }

