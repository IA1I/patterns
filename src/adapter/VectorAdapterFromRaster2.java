package adapter;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void drawline() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}