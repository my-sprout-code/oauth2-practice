package ssafy.com.kkyuwoo.happyhouse.auth.oauth2;

import ssafy.com.kkyuwoo.happyhouse.domain.user.User;

import java.util.Map;

public interface OAuthAttribute {

    Map<String, Object> getAttributes();

    String getNameAttributeKey();

    String getName();

    String getEmail();

    String getPicture();

    User toEntity();

}
