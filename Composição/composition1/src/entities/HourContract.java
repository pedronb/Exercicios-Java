package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valorPerHour;
    private Integer hour;

    public HourContract() {
    }

    public HourContract(Date date, Double valorPerHour, Integer hour) {
        this.date = date;
        this.valorPerHour = valorPerHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPerHour() {
        return valorPerHour;
    }

    public void setValorPerHour(Double valorPerHour) {
        this.valorPerHour = valorPerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue() {
        return valorPerHour * hour;
    }
}
