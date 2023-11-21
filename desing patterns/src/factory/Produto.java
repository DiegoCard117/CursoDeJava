package factory;

import java.math.BigDecimal;

public class Produto {
    private String description;

    private BigDecimal price;

    private Boolean isTouchable;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getIsTouchable() {
        return isTouchable;
    }

    public void setIsTouchable(Boolean isTouchable) {
        this.isTouchable = isTouchable;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", isTouchable=" + isTouchable +
                '}';
    }
}
