package ssafy.com.kkyuwoo.happyhouse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentSaveRequestDto {

    private Long boardId;
    private String content;

    public Long getBoardId() {
        return boardId;
    }

    public String getContent() {
        return content;
    }

}
