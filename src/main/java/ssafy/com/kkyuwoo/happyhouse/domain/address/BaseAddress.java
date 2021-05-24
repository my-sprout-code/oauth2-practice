package ssafy.com.kkyuwoo.happyhouse.domain.address;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "baseaddress")
@Entity
public class BaseAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Integer no;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "code")
    private String code;

    @Column(name = "dongcode")
    private String dongCode;

    @Column(name = "gugun")
    private String gugun;

    @Column(name = "dong", nullable = false)
    private String dong;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lng")
    private String lng;

    @Builder
    public BaseAddress(Integer no, String city, String code, String dongCode, String gugun, String dong, String lat, String lng) {
        this.no = no;
        this.city = city;
        this.code = code;
        this.dongCode = dongCode;
        this.gugun = gugun;
        this.dong = dong;
        this.lat = lat;
        this.lng = lng;
    }
}
