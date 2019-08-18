package core.data;

public class Money
{
  private int moneyId;
  private Crop crop;
  private LevelOfIntensification levelOfIntensification;
  private float aexpenses;
  private float price;

  public Money() { }

  public float getAexpenses()
  {
    return aexpenses;
  }

  public Crop getCrop()
  {
    return crop;
  }

  public LevelOfIntensification getLevelOfIntensification()
  {
    return levelOfIntensification;
  }

  public void setAexpenses(float aexpenses)
  {
    this.aexpenses = aexpenses;
  }

  public void setCrop(Crop crop)
  {
    this.crop = crop;
  }

  public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) { this.levelOfIntensification = levelOfIntensification; }

  public int getMoneyId() {
    return moneyId;
  }

  public void setMoneyId(int moneyId) {
    this.moneyId = moneyId;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
