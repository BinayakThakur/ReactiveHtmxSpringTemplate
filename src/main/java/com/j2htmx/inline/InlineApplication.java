package com.j2htmx.inline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;
/*
Use htmx
create something we can load client side code
prevent abuse from client
Redis supported caching, to prevent user from abusing
HTMX should verify if it is loaded don't load again
should look okay
should have theme support
compressed caching?
 */

@EnableWebFlux
@SpringBootApplication
public class InlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(InlineApplication.class, args);
	}

}
