package ssafy.com.kkyuwoo.happyhouse.domain.address;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Table(name = "sidocode")
@Entity
public class SidoCode {

    @Id
    @Column(name = "sido_code")
    private String sidoCode;

    @Column(name = "sido_name")
    private String sidoName;

    @Builder
    public SidoCode(String sidoCode, String sidoName) {
        this.sidoCode = sidoCode;
        this.sidoName = sidoName;
    }
}
