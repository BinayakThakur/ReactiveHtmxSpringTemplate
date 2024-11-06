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
                    "<style>body { font-family: 'Inter', sans-serif; font-weight: 400; line-height: 1.7; color: #333; background-color: #f9f9f9; margin: 0; padding: 0; } h1, h2, h3, h4, h5, h6 { font-family: 'Inter', sans-serif; font-weight: 600; letter-spacing: 0.5px; text-transform: uppercase; color: #333; margin-bottom: 15px; transition: color 0.3s ease; } h1 { font-size: 48px; } h2 { font-size: 36px; } h3 { font-size: 30px; } h4 { font-size: 24px; } h5 { font-size: 18px; } h6 { font-size: 16px; } h1:hover, h2:hover, h3:hover, h4:hover, h5:hover, h6:hover { color: #c2185b; } p { font-size: 16px; line-height: 1.7; margin-bottom: 20px; color: #666; max-width: 750px; text-align: left; } a { color: #333; text-decoration: none; border-bottom: 1px solid #333; transition: color 0.3s, border-bottom-color 0.3s; } a:hover { color: #c2185b; border-bottom-color: #c2185b; } button { font-family: 'Inter', sans-serif; font-weight: 600; padding: 12px 24px; font-size: 16px; color: #fff; background-color: #c2185b; border: none; border-radius: 5px; text-transform: uppercase; cursor: pointer; transition: background-color 0.3s, transform 0.2s ease; } button:hover { background-color: #a11548; transform: translateY(-3px) scale(1.05); } .input-field { width: 100%; padding: 12px; font-size: 16px; font-family: 'Inter', sans-serif; border: 1px solid #ddd; border-radius: 5px; margin-bottom: 15px; transition: border-color 0.3s, box-shadow 0.3s; } .input-field:focus { border-color: #c2185b; box-shadow: 0 0 5px rgba(194, 24, 91, 0.5); outline: none; } table { width: 100%; border-collapse: collapse; background-color: #ffffff; box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1); margin-bottom: 30px; transition: all 0.3s ease; } th { padding: 12px; font-weight: 700; background-color: #c2185b; color: #fff; text-align: left; } td { padding: 12px; border-top: 1px solid #ddd; color: #333; font-weight: 400; transition: background-color 0.3s ease; } td:hover { background-color: #f1f1f1; } .navbar { display: flex; justify-content: flex-start; align-items: center; padding: 15px 30px; background-color: #c2185b; color: #fff; transition: background-color 0.3s ease; } .navbar a { color: #fff; text-decoration: none; font-size: 18px; margin-left: 20px; transition: color 0.3s ease; } .navbar a:hover { color: #ffcccb; } .navbar-scroll { box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.2); } .footer { background-color: #333; color: #fff; padding: 20px 0; text-align: center; transition: background-color 0.3s ease; } .footer a { color: #fff; text-decoration: none; transition: color 0.3s; } .footer a:hover { color: #c2185b; } .bottombar { position: fixed; bottom: 0; left: 0; width: 100%; background-color: #333; color: #fff; text-align: center; padding: 10px; transition: background-color 0.3s ease; } .bottombar:hover { background-color: #555; } .box { background-color: #fff; width: 300px; border: 1px solid #f0f0f0; border-radius: 5px; padding: 20px; margin: 15px; box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1); transition: transform 0.2s ease, box-shadow 0.3s ease; } .box:hover { transform: translateY(-5px); box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2); } @media (max-width: 768px) { .navbar { flex-direction: column; align-items: flex-start; } .box { width: 100%; } }\n</style>" +
            "<link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;700&display=swap\" rel=\"stylesheet\">\n" +
            "</head>";
    public Mono<String> init(NodeCreator nodeCreator) {
      page = Mono.just(registry.getOrDefault(nodeCreator.getClientId(), head.concat(nodeCreator.createPairNode())));
      return page;
    }

}
