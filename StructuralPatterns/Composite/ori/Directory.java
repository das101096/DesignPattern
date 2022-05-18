package StructuralPatterns.Composite.ori;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String name;
    List<File> files;
    List<Directory> directories;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
        directories = new ArrayList<>();
    }

    public void addFile(File file){
        files.add(file);
    }

    public void addDirectory(Directory directory){
        directories.add(directory);
    }
}
