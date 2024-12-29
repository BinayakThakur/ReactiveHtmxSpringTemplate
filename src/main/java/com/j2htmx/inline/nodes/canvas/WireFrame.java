package com.j2htmx.inline.nodes.canvas;


import com.j2htmx.inline.nodes.nodes.NodeCreator;
import reactor.core.publisher.Mono;

import java.util.HashMap;

public abstract class WireFrame {
    protected Mono<String> page = Mono.empty();
    protected static String title;
    protected HashMap<Object, String> registry = new HashMap<>();
    protected String head =
            "<head><script src=\"https://unpkg.com/htmx.org@2.0.3\"></script>" +
                    """
                            <style>
                              /* General body styling */
                              body {
                                font-family: 'Inter', sans-serif; /* Main font for the page */
                                font-weight: 400; /* Normal text weight */
                                line-height: 1.8; /* Improved readability */
                                color: #444; /* Main text color */
                                background-color: #f9f9f9; /* Page background */
                                margin: 0;
                                padding: 0;
                              }
                                            
                              /* Headings styling */
                              h1, h2, h3, h4, h5, h6 {
                                font-family: 'Inter', sans-serif;
                                font-weight: 600; /* Bold for headings */
                                letter-spacing: 0.5px; /* Slightly spaced out text */
                                text-transform: uppercase; /* Consistent uppercase styling */
                                color: #444;
                                margin-bottom: 15px; /* Space below headings */
                                transition: color 0.5s ease, transform 0.3s ease; /* Smooth hover effects */
                              }
                              h1:hover, h2:hover, h3:hover, h4:hover, h5:hover, h6:hover {
                                color: #d81b60; /* Highlight color on hover */
                                transform: translateY(-2px); /* Slight lift effect */
                              }
                              /* Font sizes for headings */
                              h1 { font-size: 48px; }
                              h2 { font-size: 36px; }
                              h3 { font-size: 30px; }
                              h4 { font-size: 24px; }
                              h5 { font-size: 18px; }
                              h6 { font-size: 16px; }
                                            
                              /* Paragraph styling */
                              p {
                                font-size: 16px;
                                line-height: 1.8; /* Comfortable spacing */
                                margin-bottom: 20px;
                                color: #777; /* Softer text color */
                                max-width: 750px; /* Limit text width */
                                text-align: left;
                              }
                                            
                              /* Link styling */
                              a {
                                color: #444; /* Neutral link color */
                                text-decoration: none; /* Remove underline */
                                border-bottom: 1px solid #444; /* Subtle underline */
                                transition: color 0.3s ease, border-bottom-color 0.3s ease; /* Smooth hover */
                              }
                              a:hover {
                                color: #d81b60; /* Highlight color */
                                border-bottom-color: #d81b60; /* Highlight underline */
                              }
                                            
                              /* Button styling */
                              button {
                                font-family: 'Inter', sans-serif;
                                font-weight: 600; /* Bold for emphasis */
                                padding: 12px 24px; /* Comfortable padding */
                                font-size: 16px;
                                color: #fff;
                                background-color: #d81b60; /* Primary button color */
                                border: none;
                                border-radius: 5px; /* Rounded edges */
                                text-transform: uppercase; /* Uniform styling */
                                cursor: pointer;
                                transition: background-color 0.3s, transform 0.2s ease; /* Hover effects */
                              }
                              button:hover {
                                background-color: #b2164b; /* Darker shade */
                                transform: translateY(-3px) scale(1.05); /* Lift effect */
                              }
                                            
                              /* Input field styling */
                              .input-field {
                                width: 100%;
                                padding: 12px;
                                font-size: 16px;
                                font-family: 'Inter', sans-serif;
                                border: 1px solid #ddd; /* Subtle border */
                                border-radius: 5px;
                                margin-bottom: 15px; /* Spacing below inputs */
                                transition: border-color 0.3s, box-shadow 0.3s; /* Focus effects */
                              }
                              .input-field:focus {
                                border-color: #d81b60; /* Highlight border */
                                box-shadow: 0 0 5px rgba(216, 27, 96, 0.5); /* Glow effect */
                                outline: none;
                              }
                                            
                              /* Table styling */
                              table {
                                width: 100%;
                                border-collapse: collapse;
                                background-color: #fff;
                                box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow */
                                margin-bottom: 30px;
                                transition: all 0.3s ease;
                              }
                              th {
                                padding: 12px;
                                font-weight: 700;
                                background-color: #d81b60; /* Header color */
                                color: #fff; /* Text color */
                                text-align: left;
                              }
                              td {
                                padding: 12px;
                                border-top: 1px solid #ddd; /* Row separator */
                                color: #444;
                                font-weight: 400;
                                transition: background-color 0.3s ease;
                              }
                              td:hover {
                                background-color: #f1f1f1; /* Highlight row */
                              }
                                            
                              /* Navbar styling */
                              .navbar {
                                display: flex;
                                justify-content: flex-start;
                                align-items: center;
                                padding: 15px 30px;
                                background-color: #d81b60; /* Navbar background */
                                color: #fff; /* Text color */
                                transition: background-color 0.3s ease;
                              }
                              .navbar a {
                                color: #fff;
                                text-decoration: none;
                                font-size: 18px;
                                margin-left: 20px;
                                transition: color 0.3s ease; /* Smooth hover */
                              }
                              .navbar a:hover {
                                color: #ffcccb; /* Highlight color */
                              }
                              .navbar-scroll {
                                box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2); /* Sticky navbar effect */
                              }
                                            
                              /* Footer styling */
                              .footer {
                                background-color: #444;
                                color: #fff;
                                padding: 20px 0;
                                text-align: center;
                                transition: background-color 0.3s ease;
                              }
                              .footer a {
                                color: #fff;
                                text-decoration: none;
                                transition: color 0.3s;
                              }
                              .footer a:hover {
                                color: #d81b60; /* Highlight color */
                              }
                                            
                              /* Box component styling */
                              .box {
                                background-color: #fff;
                                width: 300px;
                                border: 1px solid #f0f0f0; /* Subtle border */
                                border-radius: 5px;
                                padding: 20px;
                                margin: 15px;
                                box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow */
                                transition: transform 0.2s ease, box-shadow 0.3s ease;
                              }
                              .box:hover {
                                transform: translateY(-5px); /* Lift effect */
                                box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2); /* Enhanced shadow */
                              }
                                            
                              /* Responsive design for smaller screens */
                              @media (max-width: 768px) {
                                .navbar {
                                  flex-direction: column; /* Stack navbar items */
                                  align-items: flex-start;
                                }
                                .box {
                                  width: 100%; /* Full-width boxes */
                                }
                                body {
                                  font-size: 14px; /* Adjust base font size */
                                }
                                /* Adjust heading sizes for smaller screens */
                                h1 { font-size: 36px; }
                                h2 { font-size: 30px; }
                                h3 { font-size: 24px; }
                                h4 { font-size: 20px; }
                              }
                                            
                              /* Theme-specific styles */
                              [class*="theme-"] {
                                background-color: var(--background);
                                color: var(--text);
                              }
                              [class*="theme-"] h1, [class*="theme-"] h2, [class*="theme-"] h3,
                              [class*="theme-"] h4, [class*="theme-"] h5, [class*="theme-"] h6 {
                                color: var(--text);
                              }
                              [class*="theme-"] h1:hover, [class*="theme-"] h2:hover, [class*="theme-"] h3:hover,
                              [class*="theme-"] h4:hover, [class*="theme-"] h5:hover, [class*="theme-"] h6:hover {
                                color: var(--primary);
                              }
                              [class*="theme-"] p {
                                color: var(--text-secondary);
                              }
                              [class*="theme-"] .navbar, [class*="theme-"] th {
                                background-color: var(--primary);
                              }
                              [class*="theme-"] button:hover {
                                background-color: var(--hover);
                              }
                              [class*="theme-"] .input-field:focus {
                                border-color: var(--primary);
                                box-shadow: 0 0 5px var(--primary);
                              }
                                            
                              /* Apple theme */
                              .theme-apple {
                                --primary: #007aff;
                                --background: #f4f4f4;
                                --text: #000000;
                                --text-secondary: #7b7b7b;
                                --border: #007aff;
                                --hover: #0051a8;
                                font-family: 'San Francisco', sans-serif;
                              }
                              .theme-apple body {
                                background-color: var(--background);
                                border: 5px solid #e5e5e5; /* Soft light border */
                              }
                              .theme-apple button {
                                border: 2px solid #007aff;
                              }
                                            
                              /* Cyberpunk theme */
                              .theme-cyberpunk {
                                --primary: #00ffcc;
                                --background: #141414;
                                --text: #ffffff;
                                --text-secondary: #ff00ff;
                                --border: #00ffcc;
                                --hover: #ff005e;
                                font-family: 'Orbitron', sans-serif;
                              }
                              .theme-cyberpunk body {
                                background-color: var(--background);
                                border: 5px solid #00ffcc; /* Neon border */
                              }
                              .theme-cyberpunk button {
                                border: 3px solid #00ffcc;
                              }
                                            
                              /* Vintage theme */
                              .theme-vintage {
                                --primary: #6a5acd;
                                --background: #f5f5dc;
                                --text: #2f4f4f;
                                --text-secondary: #8b4513;
                                --border: #6a5acd;
                                --hover: #836fff;
                                font-family: 'Times New Roman', serif;
                              }
                              .theme-vintage body {
                                background-color: var(--background);
                                border: 5px solid #d2b48c; /* Rustic brown border */
                              }
                              .theme-vintage button {
                                border: 2px solid #6a5acd;
                              }
                                            
                              /* Modern theme */
                              .theme-modern {
                                --primary: #00bcd4;
                                --background: #f4f4f9;
                                --text: #212121;
                                --text-secondary: #757575;
                                --border: #00bcd4;
                                --hover: #0097a7;
                                font-family: 'Arial', sans-serif;
                              }
                              .theme-modern body {
                                background-color: var(--background);
                                border: 5px solid #e0e0e0; /* Soft gray border */
                              }
                              .theme-modern button {
                                border: 2px solid #00bcd4;
                              }
                                            
                              /* Windows 98 theme */
                              .theme-windows-98 {
                                --primary: #000080;
                                --background: #c0c0c0;
                                --text: #000000;
                                --text-secondary: #333333;
                                --border: #808080;
                                --hover: #0000ff;
                                font-family: 'MS Sans Serif', sans-serif;
                              }
                              .theme-windows-98 body {
                                background-color: var(--background);
                                border: 5px solid #808080; /* Classic Windows 98 border */
                              }
                              .theme-windows-98 button {
                                border: 2px solid #808080;
                              }
                                            
                              /* Nokia theme */
                              .theme-nokia {
                                --primary: #002f6c;
                                --background: #e5e5e5;
                                --text: #000000;
                                --text-secondary: #444444;
                                --border: #8fa1b2;
                                --hover: #0047ab;
                              }
                              .theme-nokia body {
                                background-color: var(--background);
                                border: 5px solid #8fa1b2; /* Light bluish border */
                              }
                              .theme-nokia button {
                                border: 2px solid #8fa1b2;
                              }
                                            
                              /* Apple Retro theme */
                              .theme-apple-retro {
                                --primary: #ff6f61;
                                --background: #f0f0f0;
                                --text: #000000;
                                --text-secondary: #ff5733;
                                --border: #ff6f61;
                                --hover: #ff5733;
                                font-family: 'Courier New', monospace;
                              }
                              .theme-apple-retro body {
                                background-color: var(--background);
                                border: 5px solid #ff6f61; /* Retro coral border */
                              }
                              .theme-apple-retro button {
                                border: 2px solid #ff6f61;
                              }
                                            
                              /* Industrial theme */
                              .theme-industrial {
                                --primary: #444444;
                                --background: #d3d3d3;
                                --text: #333333;
                                --text-secondary: #555555;
                                --border: #444444;
                                --hover: #2e2e2e;
                                font-family: 'Roboto', sans-serif;
                              }
                              .theme-industrial body {
                                background-color: var(--background);
                                border: 5px solid #444444; /* Industrial dark gray border */
                              }
                              .theme-industrial button {
                                border: 3px solid #444444;
                              }
                                            
                              /* Nature theme */
                              .theme-nature {
                                --primary: #388e3c;
                                --background: #e8f5e9;
                                --text: #2c6b2f;
                                --text-secondary: #8b4513;
                                --border: #388e3c;
                                --hover: #2e7d32;
                                font-family: 'Georgia', serif;
                              }
                              .theme-nature body {
                                background-color: var(--background);
                                border: 5px solid #388e3c; /* Fresh green border */
                              }
                              .theme-nature button {
                                border: 2px solid #388e3c;
                              }
                                            
                              /* Retro theme */
                              .theme-retro {
                                --primary: #ff6347;
                                --background: #fffaf0;
                                --text: #000000;
                                --text-secondary: #ff4500;
                                --border: #ff6347;
                                --hover: #ff4500;
                                font-family: 'Courier New', monospace;
                              }
                              .theme-retro body {
                                background-color: var(--background);
                                border: 5px solid #ff6347; /* Retro red-orange border */
                              }
                              .theme-retro button {
                                border: 2px solid #ff6347;
                              }
                                            
                              /* Gothic theme */
                              .theme-gothic {
                                --primary: #660000;
                                --background: #2f2f2f;
                                --text: #ffffff;
                                --text-secondary: #800000;
                                --border: #660000;
                                --hover: #ff0000;
                                font-family: 'Garamond', serif;
                              }
                              .theme-gothic body {
                                background-color: var(--background);
                                border: 5px solid #660000; /* Dark red border */
                              }
                              .theme-gothic button {
                                border: 2px solid #660000;
                              }
                                            
                              /* Pastel theme */
                              .theme-pastel {
                                --primary: #ffb6c1;
                                --background: #fff0f5;
                                --text: #000000;
                                --text-secondary: #f1a7d7;
                                --border: #ffb6c1;
                                --hover: #f1a7d7;
                                font-family: 'Lato', sans-serif;
                              }
                              .theme-pastel body {
                                background-color: var(--background);
                                border: 5px solid #ffb6c1; /* Light pink border */
                              }
                              .theme-pastel button {
                                border: 2px solid #ffb6c1;
                              }
                                            
                              /* Neon theme */
                              .theme-neon {
                                --primary: #39ff14;
                                --background: #141414;
                                --text: #ffffff;
                                --text-secondary: #ff073a;
                                --border: #39ff14;
                                --hover: #ff073a;
                                font-family: 'Press Start 2P', cursive;
                              }
                              .theme-neon body {
                                background-color: var(--background);
                                border: 5px solid #39ff14; /* Neon green border */
                              }
                              .theme-neon button {
                                border: 3px solid #39ff14;
                              }
                                            
                            </style>            
                            """ +
             "<link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;700&display=swap\" rel=\"stylesheet\">\n" +
            "</head>";
    public Mono<String> init(NodeCreator nodeCreator) {
      page = Mono.just(registry.getOrDefault(nodeCreator.getClientId(), head.concat(nodeCreator.createPairNode())));
      return page;
    }

}
