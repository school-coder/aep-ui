package com.aep.prototype;

import com.aep.prototype.config.oauth2.OAuth2JwtAccessTokenConverter;
import com.aep.prototype.security.oauth2.OAuth2AuthenticationService;
import com.aep.prototype.security.oauth2.OAuth2CookieHelper;
import com.aep.prototype.security.oauth2.OAuth2SignatureVerifierClient;
import com.aep.prototype.security.oauth2.OAuth2TokenEndpointClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfiguration extends ResourceServerConfigurerAdapter {

    private final OAuth2TokenEndpointClient tokenEndpointClient;

    public SecurityConfiguration(OAuth2TokenEndpointClient tokenEndpointClient) {

        this.tokenEndpointClient = tokenEndpointClient;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
//            .csrf()
//            .ignoringAntMatchers("/h2-console/**")
//            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//        .and()
//            .addFilterBefore(corsFilter(), CsrfFilter.class)
                .headers()
                .frameOptions()
                .disable()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers("/api/users").permitAll()
                .antMatchers("/api/**").authenticated()
                .antMatchers("/management/health").permitAll()
                .antMatchers("/management/info").permitAll()
                .antMatchers("/management/**").hasAuthority("");
    }

    @Bean
    public TokenStore tokenStore(JwtAccessTokenConverter jwtAccessTokenConverter) {
        return new JwtTokenStore(jwtAccessTokenConverter);
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(OAuth2SignatureVerifierClient signatureVerifierClient) {
        return new OAuth2JwtAccessTokenConverter(signatureVerifierClient);
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*");
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        config.addExposedHeader("Authorization,Link,X-Total-Count");
        config.setAllowCredentials(true);
        if (config.getAllowedOrigins() != null && !config.getAllowedOrigins().isEmpty()) {
//            log.debug("Registering CORS filter");
            source.registerCorsConfiguration("/api/**", config);
            source.registerCorsConfiguration("/management/**", config);
            source.registerCorsConfiguration("/v2/api-docs", config);
            source.registerCorsConfiguration("/auth/**", config);
            source.registerCorsConfiguration("/*/api/**", config);
            source.registerCorsConfiguration("/*/management/**", config);
            source.registerCorsConfiguration("/*/oauth/**", config);
        }
        return new CorsFilter(source);
    }


}
