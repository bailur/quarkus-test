package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
// Response import is no longer needed as we return MenuResponse directly
// import jakarta.ws.rs.core.Response; 

import java.util.ArrayList;
import java.util.List;

@Path("/menu")
public class MenuResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MenuResponse getMenuItems() {
        List<MenuItem> menuItems = new ArrayList<>();

        // Create and add "Home" MenuItem
        MenuItem homeItem = new MenuItem("home", "Home");
        menuItems.add(homeItem);

        // Create and add "Logout" MenuItem
        MenuItem logoutItem = new MenuItem("logout", "Logout");
        menuItems.add(logoutItem);

        // Create MenuResponse
        MenuResponse menuResponse = new MenuResponse(menuItems);

        return menuResponse;
    }
}
