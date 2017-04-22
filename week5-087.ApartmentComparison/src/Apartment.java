
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }else{
            return false;
        }
    }
    public int priceDifference(Apartment otherApartment){
    int pricePrimary = this.pricePerSquareMeter * this.squareMeters;
    int priceOther = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
    int priceDiff = pricePrimary - priceOther;
    
        if(priceDiff < 0){
            priceDiff *=  -1;
            return priceDiff;
        }else{
        return priceDiff;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
    int pricePrimary = this.pricePerSquareMeter * this.squareMeters;
    int priceOther = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        if (pricePrimary > priceOther){
            return true;
        }else{
            return false;
        }
    }
}
