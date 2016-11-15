package com.vaadin.demo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.icons.VaadinIcons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("demo")
@Title("Vaadin Icons Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = false)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        setContent(layout);

        String allIcons = "";
        for (VaadinIcons ic : VaadinIcons.values()) {
            allIcons += ic.getHtml() + "&nbsp;";
        }
        layout.addComponent(new Label(allIcons, ContentMode.HTML));
    }

}
