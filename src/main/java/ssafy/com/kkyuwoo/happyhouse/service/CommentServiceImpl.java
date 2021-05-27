package ssafy.com.kkyuwoo.happyhouse.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssafy.com.kkyuwoo.happyhouse.auth.session.SessionUser;
import ssafy.com.kkyuwoo.happyhouse.domain.board.Board;
import ssafy.com.kkyuwoo.happyhouse.domain.board.BoardRepository;
import ssafy.com.kkyuwoo.happyhouse.domain.board.Comment;
import ssafy.com.kkyuwoo.happyhouse.domain.board.CommentRepository;
import ssafy.com.kkyuwoo.happyhouse.domain.user.User;
import ssafy.com.kkyuwoo.happyhouse.domain.user.UserRepository;
import ssafy.com.kkyuwoo.happyhouse.dto.CommentSaveRequestDto;
import ssafy.com.kkyuwoo.happyhouse.dto.CommentUpdateRequestDto;

@RequiredArgsConstructor
@Service
public class CommentServiceImpl implements CommentService{

    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public Page<Comment> findAll(Long boardId, Pageable pageable) {
        Board board = boardRepository.findById(boardId).orElseThrow(() ->
                new IllegalArgumentException("해당하는 게시글이 없습니다."));
        return commentRepository.findAllByBoard(board, pageable);
    }

    @Transactional(readOnly = true)
    public Comment findById(Long id) {
        return commentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당하는 댓글이 없습니다."));
    }

    @Transactional
    public void save(CommentSaveRequestDto dto, Long boardId, SessionUser sessionUser) {
        Board board = boardRepository.findById(boardId).orElseThrow(() ->
                new IllegalArgumentException("해당하는 게시글이 없습니다."));

        User user = userRepository.findByEmail(sessionUser.getEmail()).orElseThrow(() ->
                new IllegalArgumentException("해당하는 사용자가 없습니다."));

        Comment comment = Comment.builder()
                .content(dto.getContent())
                .board(board)
                .user(user)
                .build();

        commentRepository.save(comment);
    }

    @Transactional
    public void delete(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당하는 댓글이 없습니다."));
        commentRepository.delete(comment);
    }

    @Transactional
    public void update(CommentUpdateRequestDto dto, Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당하는 댓글이 없습니다."));
        comment.update(dto.getContent());
    }

}
