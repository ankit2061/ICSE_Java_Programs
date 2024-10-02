public class Salecom /*page_406_AVC_PANDEY*/ {
    private double sale,com;
    public Salecom(double s,double c){
        sale=s;
        com=c;
    }
    void commission(){
        if(sale<=1000)
            com=(5/100)*sale;
        if(sale>1000 && sale <=2000)
            com=(10/100)*sale;
        if(sale>2000)
            com=(15/100)*sale;
    }
    void  display(){
        System.out.println("Commission on sale of "+sale+"is :\t"+com);
    }
}
