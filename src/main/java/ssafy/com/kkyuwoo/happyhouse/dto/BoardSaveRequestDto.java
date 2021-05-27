package ssafy.com.kkyuwoo.happyhouse.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy.com.kkyuwoo.happyhouse.domain.address.GugunCode;
import ssafy.com.kkyuwoo.happyhouse.domain.board.Board;
import ssafy.com.kkyuwoo.happyhouse.service.BoardServiceImpl;


@NoArgsConstructor
@Getter
public class BoardSaveRequestDto {
    BoardServiceImpl boardService;

    private String board_content;
    private String board_title;

    @Builder
    public BoardSaveRequestDto (String board_title, String board_content) {
        this.board_content = board_content;
        this.board_title = board_title;
    }

    public Board toEntity(){
        return Board.builder()
                .title(board_title)
                .content(board_content)
                .build();
    }


}
