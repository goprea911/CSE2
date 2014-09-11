//Gregory Oprea
//9-9-2014
//CSE2
//hw02
//Arithmetic

//  first compile the program
//      javac Arithmetic
//  run the program
//      java Arithmetic

//  define a class
public class Arithmetic{

  //  add main method
  public static void main(String[] args) {
      
  //  list assumptions (variables)
  int nSocks=3; // No. of sock pairs
  int nGlasses=6; // No. of glasses
  int nEnvelopes=1; // No. of envelope boxes
  
  //  assign costs to each variable
  double sockCost$=2.58; // sock Px
  double glassCost$=2.29; // glass Px
  double envelopeCost$=3.25; // envelope Px
  double taxPercent=.06; // PA tax rate
  
  //  declare variables to be computed
  double totalSockCost$=sockCost$*nSocks;
  double totalGlassCost$=glassCost$*nGlasses;
  double totalEnvelopeCost$=envelopeCost$*nEnvelopes;
  double totalPurchaseCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    //  taxes on each total
  double taxSocks$=totalSockCost$*taxPercent;
  double taxGlasses$=totalGlassCost$*taxPercent;
  double taxEnvelopes$=totalEnvelopeCost$*taxPercent;
  double taxTotal$=totalPurchaseCost$*taxPercent;
  double afterTaxTotal$=totalPurchaseCost$+taxTotal$;
      //taxes on a single item
  double singleSockTax$=sockCost$*taxPercent;
  double singleGlassTax$=glassCost$*taxPercent;
  double singleEnvelopeTax$=envelopeCost$*taxPercent;

  //  limit values to pennies (this is for formatting/display)
  int totalSockCostDis=(int)(totalSockCost$*100);
  int totalGlassCostDis=(int)(totalGlassCost$*100);
  int totalEnvelopeCostDis=(int)(totalEnvelopeCost$*100);
  int totalPurchaseCostDis=(int)(totalPurchaseCost$*100);
  int afterTaxTotalDis=(int)(afterTaxTotal$*100);
    //  do the same for tax totals
  int taxSocksDis=(int)(taxSocks$*100);
  int taxGlassesDis=(int)(taxGlasses$*100);
  int taxEnvelopesDis=(int)(taxEnvelopes$*100);
  int taxTotalDis=(int)(taxTotal$*100);
      //  do the same for taxes on a single item
  int singleSockTaxDis=(int)(singleSockTax$*100);
  int singleGlassTaxDis=(int)(singleGlassTax$*100);
  int singleEnvelopeTaxDis=(int)(singleEnvelopeTax$*100);
  
  //  display values for Socks
  System.out.println("Pair of Socks");
  System.out.println(nSocks);
  System.out.println("Unit Cost "+sockCost$);
  System.out.println("Tax/unit "+singleSockTaxDis/100.0);
  System.out.println("___________________");
  //  display values for Glasses
  System.out.println("Glasses");
  System.out.println(nGlasses);
  System.out.println("Unit Cost: "+glassCost$);
  System.out.println("Tax/unit: "+singleGlassTaxDis/100.0);
  System.out.println("___________________");
  //  display values for Envelopes
  System.out.println("Boxes of Envelopes");
  System.out.println(nEnvelopes);
  System.out.println("Unit Cost: "+envelopeCost$);
  System.out.println("Tax/unit: "+singleEnvelopeTaxDis/100.0);
  System.out.println("___________________");
  //  Socks
  System.out.println("Sock Purchase: "+totalSockCostDis/100.0);
  System.out.println("Tax: "+taxSocksDis/100.0);
  System.out.println("___________________");
  //  Glasses
  System.out.println("Glasses Purchase: "+totalGlassCostDis/100.0);
  System.out.println("Tax: "+taxGlassesDis/100.0);
  System.out.println("___________________");
  //  Envelopes
  System.out.println("Envelope Purchase: "+totalEnvelopeCostDis/100.0); 
  System.out.println("Tax: "+taxEnvelopesDis/100.0); 
  System.out.println("___________________"); 
  //  Totals
  System.out.println("Pre-tax Cost: "+totalPurchaseCostDis/100.0);
  System.out.println("Total Tax: "+taxTotalDis/100.0);
  System.out.println("___________________"); 
  System.out.println("Total including Tax: "+afterTaxTotalDis/100.0);
    
    
  } //  method end
}  //  class end