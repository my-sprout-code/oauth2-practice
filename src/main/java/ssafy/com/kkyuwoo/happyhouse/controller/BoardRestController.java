package ssafy.com.kkyuwoo.happyhouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssafy.com.kkyuwoo.happyhouse.dto.BoardSaveRequestDto;
import ssafy.com.kkyuwoo.happyhouse.dto.BoardUpdateRequestDto;
import ssafy.com.kkyuwoo.happyhouse.service.BoardServiceImpl;

@RequiredArgsConstructor
@RestController
public class BoardRestController {

    private final BoardServiceImpl boardService;

    @GetMapping("api/v1/boards")
    public ResponseEntity<?> boards(Pageable pageable) {
        return ResponseEntity.ok(boardService.findAll(pageable));
    }

    @PostMapping("/api/v1/boards")
    public Long save(@RequestBody BoardSaveRequestDto requestDto){
        return boardService.save(requestDto);
    }

    @PutMapping("/api/v1/boards/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardUpdateRequestDto requestDto){
        return boardService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/boards/{id}")
    public Long delete(@PathVariable Long id){
        boardService.delete(id);
        return id;
    }

}
