package ssafy.com.kkyuwoo.happyhouse.domain.qna;

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
@Table(name = "qna")
@Entity
public class QnA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QNA_ID")
    private Long id;

    @Column(name = "QNA_TITLE")
    private String title;

    @Column(name = "QNA_CONTENT")
    private String content;

    @Column(name = "QNA_COUNT")
    private int count;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy = "qnA")
    private List<Comment> comments = new ArrayList<>();

    public QnA countUpdate() {
        this.count++;
        return this;
    }

    public QnA update(String title, String content) {
        this.title = title;
        this.content = content;
        return this;
    }

}
