package com.j2htmx.inline.controllers;

import com.j2htmx.inline.WebpageController;
import com.j2htmx.inline.repository.ThemeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ThemeControllers {

    ThemeRepository themeRepository = new ThemeRepository();
    WebpageController webpageController = new WebpageController();

    // Apple theme route
    @GetMapping("/btn1-apple")
    public Flux<String> themeApple() {
        themeRepository.setTheme("theme-apple");
        return webpageController.home();
    }

    // Cyberpunk theme route
    @GetMapping("/btn1-cyberpunk")
    public Flux<String> themeCyberpunk() {
        themeRepository.setTheme("theme-cyberpunk");
        return webpageController.home();
    }

    // Vintage theme route
    @GetMapping("/btn1-vintage")
    public Flux<String> themeVintage() {
        themeRepository.setTheme("theme-vintage");
        return webpageController.home();
    }

    // Modern theme route
    @GetMapping("/btn1-modern")
    public Flux<String> themeModern() {
        themeRepository.setTheme("theme-modern");
        return webpageController.home();
    }

    // Windows 98 theme route
    @GetMapping("/btn1-windows-98")
    public Flux<String> themeWin98() {
        themeRepository.setTheme("theme-windows-98");
        return webpageController.home();
    }

    // Nokia theme route
    @GetMapping("/btn1-nokia")
    public Flux<String> themeNokia() {
        themeRepository.setTheme("theme-nokia");
        return webpageController.home();
    }

    // Neon theme route
    @GetMapping("/btn1-neon")
    public Flux<String> themeNeon() {
        themeRepository.setTheme("theme-neon");
        return webpageController.home();
    }

    // Pop Rock theme route
    @GetMapping("/btn1-pop-rock")
    public Flux<String> themePopRock() {
        themeRepository.setTheme("theme-pop-rock");
        return webpageController.home();
    }
}

