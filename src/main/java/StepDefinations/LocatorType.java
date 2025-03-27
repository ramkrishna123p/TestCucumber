package StepDefinations;

public enum LocatorType {
    
    ID("id"),
    CSSSELECTOR("cssselector"),
    XPATH("xpath"),
    CLASSNAME("classname"),
    NAME("name"),
    TAGNAME("tagname"),
    LINKTEXT("linktext"),
    PARTIALLINKTEXT("partiallinktext");
	//public static final LocatorType ID=new LocatorType("id");
    
    private String type;
    private LocatorType(String type){
       this.type = type;
    }
    public String get(){
        return type;
    }

}