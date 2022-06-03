public class items  {
    double cost, selling_price;
    String barcode_no, production_date;
    private String feedback_status;
    int amount,PAO;
    String expiring_date;
    ArrayList<items> list= new ArrayList<>();
    public items(double cost,double selprice,int amount ,String barcode,String production,int PAO)
    {
        this.amount=amount;
        this.barcode_no=barcode;
        this.cost=cost;
        this.selling_price=selprice;
        this.production_date=production;
        this.PAO=PAO;
        this.expiring_date= cal_expire_date();
    }
    public items(double cost,int amount ,String barcode,String production,int PAO)
    {
        this.amount=amount;
        this.barcode_no=barcode;
        this.cost=cost;
        this.production_date=production;
        this.PAO=PAO;
        this.expiring_date= cal_expire_date();
    }
   public items(items t)
    {
        list.add(t);
    }
    public void remove_item(items t){
        list.remove(t);
    }
    
    public String cal_expire_date()
    {
         LocalDate production = LocalDate.parse(this.production_date);
		LocalDate expiring = production.plusMonths(this.PAO); 
                String e=expiring.toString();
                return e;
    }

    public String getFeedback_status() {
        return feedback_status;
    }

    public void setFeedback_status(String feedback_status) {
        this.feedback_status = feedback_status;
    }
  
    
}
