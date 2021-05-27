package ssafy.com.kkyuwoo.happyhouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssafy.com.kkyuwoo.happyhouse.auth.LoginUser;
import ssafy.com.kkyuwoo.happyhouse.auth.session.SessionUser;
import ssafy.com.kkyuwoo.happyhouse.domain.board.Comment;
import ssafy.com.kkyuwoo.happyhouse.dto.CommentSaveRequestDto;
import ssafy.com.kkyuwoo.happyhouse.dto.CommentUpdateRequestDto;
import ssafy.com.kkyuwoo.happyhouse.service.CommentServiceImpl;

import java.util.Objects;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class CommentRestController {

    private final CommentServiceImpl commentService;

    @GetMapping("/api/v1/boards/{boardId}/comments")
    public ResponseEntity<?> findAll(@PathVariable("boardId") Long boardId, Pageable pageable) {
        Page<Comment> comments = commentService.findAll(boardId, pageable);
        if (Objects.isNull(comments)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(comments);
    }

    @PostMapping("/api/v1/boards/{boardId}/comments")
    public ResponseEntity<?> save(CommentSaveRequestDto dto, @PathVariable("boardId") Long boardId, @LoginUser SessionUser user) {
        commentService.save(dto, boardId, user);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/api/v1/boards/{boardId}/comments/{commentId}")
    public ResponseEntity<?> update(@PathVariable("boardId") Long boardId, @PathVariable("commentId") Long commentId, CommentUpdateRequestDto dto) {
        commentService.update(dto, commentId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/v1/boards/{boardId}/comments/{commentId}")
    public ResponseEntity<?> update(@PathVariable("boardId") Long boardId, @PathVariable("commentId") Long commentId) {
        commentService.delete(commentId);
        return ResponseEntity.ok().build();
    }

}
