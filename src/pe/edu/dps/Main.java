package pe.edu.dps;

import pe.edu.dps.common.Showcase;
import pe.edu.dps.patterns.creational.builder3.BuilderShowcase;
import pe.edu.dps.patterns.structural.adapter.AdapterShowcase;
import pe.edu.dps.patterns.structural.decorator.DecoratorShowcase;
import pe.edu.dps.patterns.structural.facade.FacadeShowcase;
import pe.edu.dps.patterns.structural.proxy.ProxyShowcase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Showcase> gallery;
    public static void main(String[] args) {
          setup();
          showcase();
    }

    private static void setup() {
        gallery = new ArrayList<Showcase>();
        // Builder Pattern Showcase
        gallery.add(new BuilderShowcase());
        // Facade Pattern Showcase
        gallery.add(new FacadeShowcase());
        // Adapter Pattern Showcase
        gallery.add(new AdapterShowcase());
        // Decorator Pattern Showcase
        gallery.add(new DecoratorShowcase());
        // Proxy Pattern Showcase
        gallery.add(new ProxyShowcase());

    }
    private static void showcase() {
        for (Showcase showcase : gallery) {
            showcase.show();
        }
    }
}
