package why.mongo.domain;

public class Size {

  private Integer h;
  private Integer w;
  private String uom;

  public Size() {
  }

  public Size(Integer h, Integer w, String uom) {
    this.h = h;
    this.w = w;
    this.uom = uom;
  }

  public Integer getH() {
    return h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getW() {
    return w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }
}
