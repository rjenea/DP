import java.math.BigDecimal;

/*
 * Data Object for Stock
 */
public class StockDataObject implements DataObject {

	private static final long serialVersionUID = 1L;
	private String name;
	private BigDecimal openValue;
	private BigDecimal highValue;
	private BigDecimal lowValue;
	private BigDecimal closeValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOpenValue() {
		return openValue;
	}

	public void setOpenValue(BigDecimal openValue) {
		this.openValue = openValue;
	}

	public BigDecimal getHighValue() {
		return highValue;
	}

	public void setHighValue(BigDecimal highValue) {
		this.highValue = highValue;
	}

	public BigDecimal getCloseValue() {
		return closeValue;
	}

	public void setCloseValue(BigDecimal closeValue) {
		this.closeValue = closeValue;
	}

	public BigDecimal getLowValue() {
		return lowValue;
	}

	public void setLowValue(BigDecimal lowValue) {
		this.lowValue = lowValue;
	}
}