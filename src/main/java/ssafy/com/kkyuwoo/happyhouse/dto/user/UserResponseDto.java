package ssafy.com.kkyuwoo.happyhouse.dto.user;

import lombok.Getter;
import ssafy.com.kkyuwoo.happyhouse.domain.user.Role;
import ssafy.com.kkyuwoo.happyhouse.domain.user.SocialType;

@Getter
public class UserResponseDto {

    private Long id;
    private String name;
    private String email;
    private String picture;
    private SocialType socialType;
    private Role role;


}
