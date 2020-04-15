package pe.edu.dps.patterns.structural.adapter;

public class CustomerView extends RenderableView {
    @Override
    protected void renderInfo() {
        System.out.println(String.format("Customer Info: %s %s", getInfo().getTitle(), getInfo().getSubtitle()));
    }
}
