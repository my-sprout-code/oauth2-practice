package ssafy.com.kkyuwoo.happyhouse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy.com.kkyuwoo.happyhouse.domain.address.DongCode;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DongCodeResponseDto {

    private String dongCode;
    private String city;
    private String gugun;
    private String dong;

    public DongCodeResponseDto(DongCode dongCode) {
        this(dongCode.getDongCode(), dongCode.getCity(), dongCode.getGugun(), dongCode.getDong());
    }
}
