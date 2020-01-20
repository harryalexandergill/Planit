package seleniumProject;

public class ToyPrices {
	
    private float cowPrice;
    private float smileyPrice;

    public ToyPrices(float funnyCowPrice, float smileyFacePrice) {
        this.cowPrice = funnyCowPrice;
        this.smileyPrice = smileyFacePrice;
    }
    
	public float getCowPrice() {
		return cowPrice;
	}
	public void setCowPrice(float cowPrice) {
		this.cowPrice = cowPrice;
	}
	public float getSmileyPrice() {
		return smileyPrice;
	}
	public void setSmileyPrice(float smileyPrice) {
		this.smileyPrice = smileyPrice;
	}
}