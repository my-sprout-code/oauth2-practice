package ssafy.com.kkyuwoo.happyhouse.domain.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy.com.kkyuwoo.happyhouse.domain.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "board")
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Board_ID")
    private Long id;

    @Column(name = "Board_TITLE")
    private String title;

    @Column(name = "Board_CONTENT")
    private String content;

    @Column(name = "Board_COUNT")
    private int count;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments = new ArrayList<>();

    public Board countUpdate() {
        this.count++;
        return this;
    }

    public Board update(String title, String content) {
        this.title = title;
        this.content = content;
        return this;
    }

}
