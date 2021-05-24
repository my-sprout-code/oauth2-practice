package ssafy.com.kkyuwoo.happyhouse.domain.address;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "housedeal")
@Entity
public class HouseDeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Integer no;

    @Column(name = "dong")
    private String dong;

    @Column(name = "AptName", length = 50)
    private String aptName;

    @Column(name = "code")
    private String code;

    @Column(name = "dealAmount")
    private String dealAmount;

    @Column(name = "buildYear")
    private String buildYear;

    @Column(name = "dealYear")
    private String dealYear;

    @Column(name = "dealMonth")
    private String dealMonth;

    @Column(name = "dealDay")
    private String dealDay;

    @Column(name = "area")
    private String area;

    @Column(name = "floor")
    private String floor;

    @Column(name = "jibun")
    private String jibun;

    @Column(name = "type")
    private String type;

    @Column(name = "rentMoney")
    private String rentMoney;

    @Builder
    public HouseDeal(Integer no, String dong, String aptName, String code, String dealAmount, String buildYear, String dealYear, String dealMonth, String dealDay, String area, String floor, String jibun, String type, String rentMoney) {
        this.no = no;
        this.dong = dong;
        this.aptName = aptName;
        this.code = code;
        this.dealAmount = dealAmount;
        this.buildYear = buildYear;
        this.dealYear = dealYear;
        this.dealMonth = dealMonth;
        this.dealDay = dealDay;
        this.area = area;
        this.floor = floor;
        this.jibun = jibun;
        this.type = type;
        this.rentMoney = rentMoney;
    }
}
