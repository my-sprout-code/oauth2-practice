package ssafy.com.kkyuwoo.happyhouse.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardUpdateRequestDto {
    private String board_content;
    private String board_title;

    @Builder
    public BoardUpdateRequestDto (String board_title, String board_content) {
        this.board_content = board_content;
        this.board_title = board_title;
    }
}
