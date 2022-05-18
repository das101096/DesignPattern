package StructuralPatterns.Composite.apply;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{
    List<Component> components;

    public Directory(String name) {
        super(name);
        components = new ArrayList<>();
    }

    public void addComponent(Component component){
        components.add(component);
    }
}
