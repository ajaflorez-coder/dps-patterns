package pe.edu.dps.patterns.structural.adapter;

public class CategoryView extends RenderableView {
    @Override
    protected void renderInfo() {
        System.out.print("Category Info: ");
        super.renderInfo();
    }
}
