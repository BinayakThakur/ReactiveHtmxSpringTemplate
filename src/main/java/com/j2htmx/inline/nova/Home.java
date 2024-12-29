package com.j2htmx.inline.nova;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.form.Div;
import com.j2htmx.inline.nodes.standard.link.Image;
import com.j2htmx.inline.nodes.standard.table.Table;
import com.j2htmx.inline.nodes.standard.text.Heading;
import com.j2htmx.inline.nodes.standard.text.Paragraph;
import com.j2htmx.inline.repository.ThemeRepository;

import java.util.List;
import java.util.UUID;

public class Home extends NodeCreator {

    ThemeRepository themeRepository = new ThemeRepository();

    public Home() {
        setTag("div");
        setId("parent-div");
        setClass(themeRepository.getTheme());
        // Main Heading and Subheading
        String introContent = createIntroSection();

        // Navigation Buttons
        String navigationButtons = getNavigationButtons();

        // Dynamic Event Highlights Section
        String eventHighlights = createEventHighlights();

        // Featured Photo Gallery
        String photoGallery = createPhotoGallery();

        // Dashboard and Cart Containers
        String dashboard = dashboardContainer();
        String cart = cartContainer();

        // Combine all components
        setContent(
                introContent
                        .concat(navigationButtons)
                        .concat(eventHighlights)
                        .concat(dashboard)
                        .concat(photoGallery)
                        .concat(cart)
        );
    }

    // Intro Section
    private String createIntroSection() {
        Heading heading = new Heading("h2");
        heading.setContent("");

        return heading.createPairNode();
    }

    // Navigation Buttons
    private String getNavigationButtons() {
        Button touristAttractions = new Button("Themes", UUID.randomUUID().toString());
        touristAttractions.setHxPost("/themes");
        touristAttractions.setHxTarget("#dashboard-div");

        Button whatToEat = new Button("Interesting cases", UUID.randomUUID().toString());
        whatToEat.setHxPost("/cases");
        whatToEat.setHxTarget("#dashboard-div");

        Button culturalExperiences = new Button("Debunked board", UUID.randomUUID().toString());
        culturalExperiences.setHxPost("/debunked");
        culturalExperiences.setHxTarget("#dashboard-div");

        Table buttonTable = new Table();
        buttonTable.addData(List.of(
                whatToEat.createPairNode(),
                culturalExperiences.createPairNode(),
                touristAttractions.createPairNode()
        ));

        return buttonTable.createPairNode();
    }

    // Event Highlights Section
    private String createEventHighlights() {
        Image heading = new Image();
        heading.setImage("https://www.history.navy.mil/content/history/nhhc/browse-by-topic/disasters-and-phenomena/u2s-ufos-and-operation-blue-book/_jcr_content/body/media_asset_421922878/image.img.jpg/1706113388884.jpg");

        Paragraph event1 = new Paragraph();
        event1.setContent("Unidentified Flying Object (UFO) captured by astronauts from Apollo 16 near the moon, April 27, 1972. After an analysis was conducted, “All of the evidence in this analysis is consistent with the conclusion that the object in the Apollo 16 film was the EVA (spacewalk) floodlight/boom. There is no evidence in the photographic record to suggest otherwise.” NASA photograph taken from video footage.");

        Table eventsTable = new Table();
        eventsTable.addData(List.of(heading.createPairNode(), event1.createPairNode()));

        return eventsTable.createPairNode();
    }

    // Photo Gallery Section
    private String createPhotoGallery() {
        Heading heading = new Heading("h3");
        heading.setContent("Sightings reported");

        Image image1 = new Image();
        image1.setStyle("image");
        image1.setImage("https://www.history.navy.mil/content/history/nhhc/browse-by-topic/disasters-and-phenomena/u2s-ufos-and-operation-blue-book/_jcr_content/body/media_asset_415020802/image.img.jpg/1706113005675.jpg");

        Image image2 = new Image();
        image2.setStyle("image");
        image2.setImage("https://www.history.navy.mil/content/history/nhhc/browse-by-topic/disasters-and-phenomena/u2s-ufos-and-operation-blue-book/_jcr_content/body/media_asset_1647918394/image.img.jpg/1706112958147.jpg");

        Image image3 = new Image();
        image3.setStyle("image");
        image3.setImage("https://www.history.navy.mil/content/history/nhhc/browse-by-topic/disasters-and-phenomena/u2s-ufos-and-operation-blue-book/_jcr_content/body/media_asset_1247088720/image.img.jpg/1706113348179.jpg");


        Table galleryTable = new Table();
        galleryTable.setStyle("table");
        galleryTable.addData(List.of(heading.createPairNode()));
        galleryTable.addData(List.of(image1.createPairNode(), image2.createPairNode(), image3.createPairNode()));

        return galleryTable.createPairNode();
    }


    // Dashboard Container
    private String dashboardContainer() {
        Div div = new Div();
        div.setId("dashboard-div");
        return div.createPairNode();
    }

    // Cart Container
    private String cartContainer() {
        Div div = new Div();
        div.setId("cart-div");
        return div.createPairNode();
    }
}
