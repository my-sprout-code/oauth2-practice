package ssafy.com.kkyuwoo.happyhouse.dto;

import ssafy.com.kkyuwoo.happyhouse.domain.board.Board;
import ssafy.com.kkyuwoo.happyhouse.domain.user.User;

public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private User user;

    public BoardResponseDto(Board entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.user = entity.getUser();
    }
}
