package pckg_class_param;

import java.util.ArrayList;

public class Package <T> {

    private final ArrayList<T> pckgContent;
    private Class<T> classType;

    public Package(Class<T> type){
        this.classType = type;
        this.pckgContent = new ArrayList<>();
        System.out.println("Package created: " + classType);
    }

    // Ne moze, jer je pckgContent final!!!
//    public void setPckgContent(ArrayList<T> contentNew){
//        this.pckgContent = contentNew;
//    }

    public void addNewElementToPckg(T pckgElement){
        if(pckgContent.contains(pckgElement)){
            System.out.println("Already in the package!");
        }else{
            pckgContent.add(pckgElement);
            System.out.println("Added new element to package!");
        }
    }
    public void listPackageContent(){
        if(pckgContent.isEmpty()){
            System.out.println("Package is empty!");
        } else {
            for(T item : pckgContent){
                System.out.println(item);
            }
        }
    }
}
