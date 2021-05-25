package ssafy.com.kkyuwoo.happyhouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ssafy.com.kkyuwoo.happyhouse.domain.address.BaseAddress;
import ssafy.com.kkyuwoo.happyhouse.domain.address.DongCode;
import ssafy.com.kkyuwoo.happyhouse.domain.address.GugunCode;
import ssafy.com.kkyuwoo.happyhouse.domain.address.HouseDeal;
import ssafy.com.kkyuwoo.happyhouse.dto.GugunCodeResponseDto;
import ssafy.com.kkyuwoo.happyhouse.dto.SidoCodeResponseDto;
import ssafy.com.kkyuwoo.happyhouse.service.AddressServiceImpl;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AddressRestController {

    private final AddressServiceImpl addressService;

    @GetMapping("api/v1/baseaddress")
    public List<BaseAddress> baseAddress(){
        return addressService.baseAddressList();
    }

    @GetMapping("api/v1/dongcode")
    public List<DongCode> dongcode(){
        return addressService.dongCodeList();
    }

    @GetMapping("api/v1/guguncode")
    public List<GugunCode> guguncode(){
        return addressService.gugunCodeList();
    }

    @GetMapping("api/v1/housedeal")
    public List<HouseDeal> housedeal(){
        return addressService.houseDealList();
    }


    @GetMapping("api/v1/sido")
    public ResponseEntity<?> sido() {
        List<SidoCodeResponseDto> sidoGugunCodes = addressService.getSidoCode();
        if (sidoGugunCodes == null || sidoGugunCodes.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(sidoGugunCodes, HttpStatus.OK);
    }

    @GetMapping("api/v1/gungun/{sido}")
    public ResponseEntity<?> gungunSido(@PathVariable(name = "sido") String sido) {
        List<GugunCodeResponseDto> sidoGugunCodes = addressService.getGugunCodeBySido(sido);
        if (sidoGugunCodes == null || sidoGugunCodes.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(sidoGugunCodes, HttpStatus.OK);
    }

//    @GetMapping("api/v1/dong/{gugun}")
//    public ResponseEntity<?> dongGungun(@PathVariable(name = "gugun") String gugun) {
//        List<HouseInfoDto> HouseInfoDtos = addressService.getDongByGugun(gugun);
//        if (HouseInfoDtos == null || HouseInfoDtos.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity(HouseInfoDtos, HttpStatus.OK);
//    }
//
//    @GetMapping("map/apt/{dong}")
//    public ResponseEntity<?> aptDong(@PathVariable(name = "dong") String dong) {
//        List<HouseInfoDto> HouseInfoDtos = service.getAptInDong(dong);
//        if (HouseInfoDtos == null || HouseInfoDtos.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity(HouseInfoDtos, HttpStatus.OK);
//    }


}
