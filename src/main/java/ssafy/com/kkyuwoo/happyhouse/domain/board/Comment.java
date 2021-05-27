package ssafy.com.kkyuwoo.happyhouse.domain.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy.com.kkyuwoo.happyhouse.domain.BaseTimeEntity;
import ssafy.com.kkyuwoo.happyhouse.domain.user.User;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "comment")
@Entity
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMENT_ID")
    private Long id;

    @Column(name = "COMMENT_CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    public Comment update(String content) {
        this.content = content;
        return this;
    }

    @Builder
    public Comment(String content, User user, Board board) {
        this.content = content;
        this.user = user;
        this.board = board;
    }
}
