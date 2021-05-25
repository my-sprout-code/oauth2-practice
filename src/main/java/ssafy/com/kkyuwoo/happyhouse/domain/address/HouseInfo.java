package ssafy.com.kkyuwoo.happyhouse.domain.address;

import javax.persistence.*;

@Table(name = "houseinfo")
@Entity
public class HouseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Integer no;

    @Column(name = "dong")
    private String dong;

    @Column(name = "apt_name", length = 50, nullable = false)
    private String aptName;

    @Column(name = "code", length = 30, nullable = false)
    private String code;

    @Column(name = "build_year", length = 30)
    private String buildYear;

    @Column(name = "jibun", length = 30)
    private String jibun;

    @Column(name = "lat", length = 30)
    private String lat;

    @Column(name = "lng", length = 30)
    private String lng;

    @Column(name = "img", length = 50)
    private String img;

}
