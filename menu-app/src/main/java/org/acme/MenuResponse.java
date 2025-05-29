package org.acme;

import java.util.List;

public class MenuResponse {
    public List<MenuItem> menuitems;

    public MenuResponse(List<MenuItem> menuitems) {
        this.menuitems = menuitems;
    }

    public List<MenuItem> getMenuitems() {
        return menuitems;
    }

    public void setMenuitems(List<MenuItem> menuitems) {
        this.menuitems = menuitems;
    }
}
