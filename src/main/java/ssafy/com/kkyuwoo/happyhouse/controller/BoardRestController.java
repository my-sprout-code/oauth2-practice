package ssafy.com.kkyuwoo.happyhouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import ssafy.com.kkyuwoo.happyhouse.service.BoardServiceImpl;

@RequiredArgsConstructor
@RestController
public class BoardRestController {

    private final BoardServiceImpl boardService;

    @GetMapping("api/v1/boards")
    public ResponseEntity<?> boards(Pageable pageable) {
        return ResponseEntity.ok(boardService.findAll(pageable));
    }

}
