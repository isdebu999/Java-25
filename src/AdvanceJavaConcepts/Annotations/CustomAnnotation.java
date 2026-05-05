//LET'S Think bout it - u can apply annotation on "CLASS", "VARIABLES" , "METHODS"

//interface that doesn't have any value in it called - " Marker Annotation "
//this has single value so it's called "OsName" so it's called - " SingleValue Annotation "
//if it's does multiple value it called - " Multivalue Annotation "





package AdvanceJavaConcepts.Annotations;
import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //this above two are called as Meta Annotation...
@interface SmartPhone {
    String OsName() default "JellyBean";
    double OsVersion() default 1;
}

@SmartPhone(OsName = "ColorOS",  OsVersion = 7.1)
class RealMeSeries {

    String model;
    int size;

    public RealMeSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}


@SmartPhone(OsName = "ColorOS",   OsVersion = 8.1)
class RealMeXnarzoSeries extends RealMeSeries {

    public RealMeXnarzoSeries(String model, int size) {
        super(model, size);
    }
}





public class CustomAnnotation {
    public static void main(String[] args) {
        RealMeSeries obj = new RealMeSeries("RealMe5", 5);
        System.out.println(obj.model);

        Class c = obj.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println(smartPhone.OsName());
    }
}
