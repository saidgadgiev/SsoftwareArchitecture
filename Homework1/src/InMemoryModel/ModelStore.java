package InMemoryModel;

import ModelElements.*;
import ModelElements.Utils.Angle3D;
import ModelElements.Utils.Color;
import ModelElements.Utils.Point3D;

public class ModelStore implements IModelChanger{
    static float power = 0;
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    public ModelStore(IModelChangeObserver changeObserver) {
        this.models = new PoligonalModel(new Poligon(new Point3D()), new Texture());
        this.cameras = new Camera(new Point3D(), new Angle3D());
        this.flashes = new Flash(new Point3D(), new Angle3D(), new Color(),power);
        this.scenes = new Scene(this.models, this.flashes, this.cameras);
    }

    public Scene getScena(int n){
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
